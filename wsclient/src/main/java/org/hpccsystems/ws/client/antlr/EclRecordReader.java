package org.hpccsystems.ws.client.antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.hpccsystems.ws.client.platform.*;

/**
 * This class reads ECL and converts it to an EclInfo object. Currently it processes RECORD definitions only.
 */
public class EclRecordReader extends EclRecordBaseListener
{
    private ErrorListener             errorHandler = new ErrorListener();
    private EclRecordInfo             eclInfo      = new EclRecordInfo();
    private DFURecordDefInfo          currentrec   = null;
    private List<DFURecordDefInfo>    parentrecs   = new ArrayList<DFURecordDefInfo>();
    private DFUDataColumnInfo         currentfield = null;
    private List<DFUDataColumnInfo>   parentfields = new ArrayList<DFUDataColumnInfo>();
    private EclRecordParser           parser       = null;
    private List<String>              annotationParams = new ArrayList<String>();
    private String                    annotationName = null;


    /**
     * @param eclInfo - the EclInfo object to set
     */
    public void setEclRecordInfo(EclRecordInfo eclInfo)
    {
        this.eclInfo = eclInfo;
    }

    @Override
    public void enterRecord_def_inline(EclRecordParser.Record_def_inlineContext ctx)
    {
        currentrec = new DFURecordDefInfo();
        currentrec.setInline(true);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When exiting a defined recordset (l_layout:=RECORD...), add the generated object 
     * to the EclInfo's recordset collection. 
     * </p>
     */
    @Override
    public void exitRecord_def_inline(EclRecordParser.Record_def_inlineContext ctx)
    {
        eclInfo.addRecordset(currentrec);
        currentrec = null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a RECORD ecl definition, create a RecordDef object and add it to the EclInfo container.
     * </p>
     */
    @Override
    public void enterRecord_def(EclRecordParser.Record_defContext ctx)
    {
        if (currentrec == null)
        {
            currentrec = new DFURecordDefInfo();
        }
        eclInfo.addRecordset(currentrec);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When exiting a RECORD definition, Set the current record object to null
     * </p>
     */
    @Override
    public void exitRecord_def(EclRecordParser.Record_defContext ctx)
    {
        currentrec = null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * when entering a defined record def (l_rec:=RECORD...), set the currentrec to a new
     * DFURecordDefInfo object and set the record name to l_rec, etc.
     * </p>
     */
    @Override
    public void enterDefined_record_def(EclRecordParser.Defined_record_defContext ctx)
    {
        currentrec = new DFURecordDefInfo();
        currentrec.setRecordName(ctx.getChild(0).getText());

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * when entering a field in a RECORD layout definition, set the currentfield object
     * to a new DFUDataColumnInfo object
     * </p>
     */
    @Override
    public void enterEclfield_decl(EclRecordParser.Eclfield_declContext ctx)
    {
        currentfield = new DFUDataColumnInfo();
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When exiting a field definition in a RECORD descriptor, set the field type and name and 
     * add the field to the current
     * record's collection of child DFUDataColumnInfo objects. Also handle child datasets, both with 
     * inline dataset references
     * ( field1:=DATASET({STRING field2,STRING field3}) and references to external datasets
     * ( field1:=DATASET(l_kidrec);
     * </p>
     */
    @Override
    public void exitEclfield_decl(EclRecordParser.Eclfield_declContext ctx)
    {

        if (ctx.getChildCount() == 1 && ctx.getChild(0).getChildCount() == 3)
        {
            // inline record fields referenced from another record def, e.g. "(addresslayout)"
            String recset = ctx.getChild(0).getChild(1).getText();
            if (!eclInfo.getRecordsets().containsKey(recset))
            {
                this.errorHandler.syntaxError(getParser(), recset, ctx.start.getLine(), ctx.start.getStartIndex(),
                        "Record definition " + recset + " reference in " + ctx.getParent().getText() + " not found ",
                        null);
            }

            DFURecordDefInfo recnew=new DFURecordDefInfo();
            if (eclInfo.getRecordsets().containsKey(recset)) {
                recnew.getChildColumns().addAll(eclInfo.getRecordsets().get(recset).getChildColumns());
            }
            recnew.setColumnLabel(currentfield.getColumnLabel());            
            recnew.setColumnEclType(currentfield.getColumnEclType());
            recnew.setColumnType(currentfield.getColumnType());
            recnew.setRecordLayoutName(recset);
            recnew.setSingleRow(true);
            currentrec.getChildColumns().add(recnew);
         
        }
        else if (!(currentfield instanceof DFURecordDefInfo))
        {
            if (ctx.getChildCount() > 0)
            {
                if (currentfield.getColumnEclType() == null)
                {
                    if (ctx.getChild(0).getChildCount() == 2)
                    {
                        currentfield.setColumnEclType(ctx.getChild(0).getChild(0).getText() + " "
                                + ctx.getChild(0).getChild(1).getText());
                        currentfield.setColumnType(currentfield.getColumnEclType());
                    }
                    else
                    {
                        currentfield.setColumnEclType(ctx.getChild(0).getText());
                        currentfield.setColumnType(currentfield.getColumnEclType());
                    }
                }
            }
            if (ctx.getChildCount() > 1)
            {
                currentfield.setColumnLabel(ctx.getChild(1).getText());
            }
        }
        if (eclInfo.getRecordsets().containsKey(currentfield.getColumnEclType())) {
            DFURecordDefInfo recnew=new DFURecordDefInfo();
            recnew.getChildColumns().addAll(eclInfo.getRecordsets().get(currentfield.getColumnEclType()).getChildColumns());
            recnew.setColumnLabel(currentfield.getColumnLabel());
            recnew.setColumnEclType(currentfield.getColumnEclType());
            recnew.setColumnType(currentfield.getColumnType());
            recnew.setRecordLayoutName(currentfield.getColumnEclType());
            recnew.setSingleRow(true);
            currentrec.getChildColumns().add(recnew);
            
        } else {
            currentrec.getChildColumns().add(currentfield);
        }
        currentfield = null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * if a MAXCOUNT option is encountered, add it to the current field/record being processed
     * </p>
     */
    @Override
    public void enterMaxcount(EclRecordParser.MaxcountContext ctx)
    {
        if (currentfield != null)
        {
            currentfield.setMaxcount(ctx.getChild(2).getText());
        }
        else
        {
            currentrec.setMaxcount(ctx.getChild(2).getText());
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * if a MAXCOUNT option is encountered, add it to the current field/record being processed
     * </p>
     */
    @Override
    public void enterBlob(EclRecordParser.BlobContext ctx)
    {
        if (currentfield != null)
        {
            currentfield.setBlob(true);
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a child dataset definition in a RECORD layout, (field1:=DATASET(l_rec);) 
     * look for an exiting record layout
     * matching the dataset type of the child dataset and add its fields as child fields of
     * the current dataset field.
     * </p>
     */
    @Override
    public void enterNested_dataset_decl(EclRecordParser.Nested_dataset_declContext ctx)
    {
        currentfield = new DFURecordDefInfo();
        DFURecordDefInfo rcurrent = (DFURecordDefInfo) currentfield;
        if (ctx.getChildCount() >= 5)
        {
            rcurrent.setRecordLayoutName(ctx.getChild(2).getText());
            rcurrent.setRecordName(ctx.getChild(4).getText());

            if (this.eclInfo.getRecordsets().containsKey(rcurrent.getRecordLayoutName()))
            {
                currentfield.getChildColumns().addAll(
                        this.eclInfo.getRecordsets().get(rcurrent.getRecordLayoutName()).getChildColumns());
            }
            else
            {
                System.err.println("Unknown record layout " + rcurrent.getRecordLayoutName());
            }
        }
        else
        {
            System.err.println("Unknown format " + ctx.getText());
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a child dataset definition in a RECORD layout with an inline record def,
     * set the current child dataset record's inline property to true</p>
     */
    public void enterNested_inline_dataset_decl(EclRecordParser.Nested_inline_dataset_declContext ctx)
    {
        currentfield = new DFURecordDefInfo();
        currentfield.setColumnLabel(ctx.getChild(4).getText());
        ((DFURecordDefInfo) currentfield).setInline(true);
    }

    
    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a child dataset's inline record def ( {string val, string val2} in a 
     * field defined like field1:=DATASET({string val,string val2}), set the current record
     * to the parent record and initialize a new record to hold the child record values
     * </p>
     */
    @Override
    public void enterInline_dataset_record_def(EclRecordParser.Inline_dataset_record_defContext ctx)
    {
        parentrecs.add(0,currentrec);
        currentrec = new DFURecordDefInfo();
        parentfields.add(0,currentfield);
    }
    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a child dataset's inline record def ( {string val, string val2} in a 
     * field defined like field1:=DATASET({string val,string val2}), set the current record
     * to the parent record and initialize a new record to hold the child record values
     * </p>
     */
    @Override
    public void enterExploded_dataset_record_def(EclRecordParser.Exploded_dataset_record_defContext ctx)
    {
        parentrecs.add(0,currentrec);
        currentrec = new DFURecordDefInfo();
        parentfields.add(0,currentfield);
    }
    @Override
    public void exitInline_dataset_record_def(EclRecordParser.Inline_dataset_record_defContext ctx)
    {
        if (parentfields.size()>0)
        {
            parentfields.get(0).getChildColumns().addAll(currentrec.getChildColumns());
        }
        currentrec = parentrecs.get(0);
        currentfield = parentfields.get(0);
        parentfields.remove(0);
        parentrecs.remove(0);
    }

    @Override
    public void exitExploded_dataset_record_def(EclRecordParser.Exploded_dataset_record_defContext ctx)
    {
        if (parentfields.size()>0)
        {
            parentfields.get(0).getChildColumns().addAll(currentrec.getChildColumns());
        }
        currentrec = parentrecs.get(0);
        currentfield = parentfields.get(0);
        parentfields.remove(0);
        parentrecs.remove(0);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a MAXLENGTH option, add its value to the current field or rec
     * </p>
     */
    @Override
    public void enterMaxlength(EclRecordParser.MaxlengthContext ctx)
    {
        if (currentfield != null)
        {
            currentfield.setMaxlength(ctx.getChild(2).getText());
        }
        else if (currentrec != null)
        {
            currentrec.setMaxRecLength(ctx.getChild(2).getText());
        }
    }

    
    public ErrorListener getErrorHandler()
    {
        return errorHandler;
    }

    public EclRecordInfo getEclRecordInfo()
    {
        return this.eclInfo;
    }

    public EclRecordParser getParser()
    {
        return parser;
    }

    public void setParser(EclRecordParser parser)
    {
        this.parser = parser;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering a DEFAULT option, set the columnvalue of the current field/rec to its value
     * </p>
     */
    @Override
    public void enterDefaultval(EclRecordParser.DefaultvalContext ctx)
    {
        String val = ctx.getChild(2).getText();
        val = val.replace("'", "");

        if (currentfield != null)
        {
            currentfield.setColumnValue(val);
        }
        else if (currentrec != null)
        {
            currentrec.setColumnValue(val);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering an xpath option, add it to the current field or record
     * </p>
     */
    @Override
    public void enterXpath(EclRecordParser.XpathContext ctx)
    {
        String val = ctx.getChild(2).getText();
        if (val.startsWith("'")) {
            val=val.substring(1);
        }
        if (val.endsWith("'")) {
            val=val.substring(0,val.length()-1);
        }
        if (currentfield != null)
        {
            currentfield.setXpath(val);
        }
        else if (currentrec != null)
        {
            currentrec.setXpath(val);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * When entering an xmldefault option, add it to the current field or record
     * </p>
     */
    @Override
    public void enterXmldefaultval(EclRecordParser.XmldefaultvalContext ctx)
    {

        String val = ctx.getChild(2).getText();
        val = val.replace("'", "");
        if (currentfield != null)
        {
            currentfield.setXmlDefaultVal(val);
        }
        else if (currentrec != null)
        {
            currentrec.setXmlDefaultVal(val);
        }
    }

    @Override
    public void enterComment(final EclRecordParser.CommentContext ctx) {
        super.enterComment(ctx);
    }

    @Override
    public void exitAnnotation(final EclRecordParser.AnnotationContext ctx) {
        super.exitAnnotation(ctx);
        if (currentrec.getChildColumns().size() > 0) {
            final DFUDataColumnInfo info = currentrec.getChildColumns().get(currentrec.getChildColumns().size() - 1);
            info.getAnnotations().add(new DFUDataColumnAnnotation(annotationName, annotationParams));
        } else {
        	currentrec.getAnnotations().add(new DFUDataColumnAnnotation(annotationName,annotationParams));
        }
    }

    @Override
    public void exitAnnotation_name(final EclRecordParser.Annotation_nameContext ctx) {
        annotationName = ctx.getChild(0).getText().substring(1);
        super.exitAnnotation_name(ctx);
    }

    @Override
    public void exitAnnotation_param(final EclRecordParser.Annotation_paramContext ctx) {
        super.exitAnnotation_param(ctx);
        annotationParams.add(ctx.getChild(0).getText());
    }

    @Override
    public void exitComment(final EclRecordParser.CommentContext ctx) {
        super.exitComment(ctx);
    }

    @Override
    public void enterAnnotation(final EclRecordParser.AnnotationContext ctx) {
        super.enterAnnotation(ctx);
        annotationName = null;
        annotationParams=new ArrayList<String>();
    }
}
