// Generated from ecl.g4 by ANTLR 4.5
package org.hpccsystems.ws.client.antlr;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.hpccsystems.ws.client.platform.DFUDataColumnInfo;
import org.hpccsystems.ws.client.platform.DFURecordDefInfo;
import org.hpccsystems.ws.client.platform.EclInfo;

/**
 * This class provides an empty implementation of {@link eclListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class EclReader extends EclBaseListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
    
        private ParseTreeProperty<String> stringValues = new ParseTreeProperty<String>();
        private ErrorListener errorHandler = new ErrorListener();
        private EclInfo eclInfo=new EclInfo();
        private DFURecordDefInfo currentrec=null;
        private DFURecordDefInfo parentrec=null;
        private DFUDataColumnInfo currentfield=null;
        private DFUDataColumnInfo parentfield=null;
        private EclParser parser=null;
        public void setEclInfo(EclInfo eclInfo)
        {
            this.eclInfo = eclInfo;
        }
        @Override public void enterRecord_def_inline(EclParser.Record_def_inlineContext ctx) {
            currentrec=new DFURecordDefInfo();
            currentrec.setInline(true);
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitRecord_def_inline(EclParser.Record_def_inlineContext ctx) { 
            eclInfo.addRecordset(currentrec);
            currentrec=null;
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterRecord_def(EclParser.Record_defContext ctx) {
            if (currentrec==null) {
                currentrec=new DFURecordDefInfo();         
            }
            eclInfo.addRecordset(currentrec);           
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitRecord_def(EclParser.Record_defContext ctx) {
            
            currentrec=null;
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterDefined_record_def(EclParser.Defined_record_defContext ctx) { 
            currentrec=new DFURecordDefInfo();
            currentrec.setRecordName(ctx.getChild(0).getText());

        }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterEclfield_decl(EclParser.Eclfield_declContext ctx) {
            currentfield=new DFUDataColumnInfo();
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void exitEclfield_decl(EclParser.Eclfield_declContext ctx) { 
            
            if (ctx.getChildCount()==1 && ctx.getChild(0).getChildCount()==3) {
                //inline record fields referenced from another record def, e.g. "(addresslayout)"
                String recset=ctx.getChild(0).getChild(1).getText();
                if (!eclInfo.getRecordsets().containsKey(recset)) {
                    this.errorHandler.syntaxError(getParser(),recset,ctx.start.getLine(),ctx.start.getStartIndex(),
                            "Record definition " + recset + " reference in " + ctx.getParent().getText() + " not found ",null);
                }
                DFURecordDefInfo rec=eclInfo.getRecordsets().get(recset);
                currentrec.getChildColumns().addAll(rec.getChildColumns());
                return;
            }
            else if (!(currentfield instanceof DFURecordDefInfo)) {
                if (ctx.getChildCount() > 0){
                    if (currentfield.getColumnEclType()==null) {
                        currentfield.setColumnEclType(ctx.getChild(0).getText());
                        currentfield.setColumnType(ctx.getChild(0).getText());
                    }
                }
                if (ctx.getChildCount() > 1) {
                    currentfield.setColumnLabel(ctx.getChild(1).getText());
                }
            }
            currentrec.getChildColumns().add(currentfield);
            currentfield=null;
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterMaxcount(EclParser.MaxcountContext ctx) { 
            if (currentfield != null && currentfield instanceof DFURecordDefInfo) {
                ((DFURecordDefInfo)currentfield).setMaxcount(ctx.getChild(3).getText());
            } else {
                currentrec.setMaxcount(ctx.getChild(3).getText());
            }
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterNested_dataset_decl(EclParser.Nested_dataset_declContext ctx) {
            currentfield=new DFURecordDefInfo();
            DFURecordDefInfo rcurrent=(DFURecordDefInfo) currentfield;
            if (ctx.getChildCount()>=5) {
                rcurrent.setRecordLayoutName(ctx.getChild(2).getText());
                rcurrent.setRecordName(ctx.getChild(4).getText());
                
                if (this.eclInfo.getRecordsets().containsKey(rcurrent.getRecordLayoutName())) {
                        currentfield.getChildColumns().addAll(this.eclInfo.getRecordsets().get(rcurrent.getRecordLayoutName()).getChildColumns());
                } else {
                    System.err.println("Unknown record layout " + rcurrent.getRecordLayoutName());
                }
            } else {
                System.err.println("Unknown format " + ctx.getText());
            }
        }
        
        @Override public void enterNested_inline_dataset_decl(EclParser.Nested_inline_dataset_declContext ctx) {
            currentfield=new DFURecordDefInfo();
             currentfield.setColumnLabel(ctx.getChild(4).getText());    
             ((DFURecordDefInfo) currentfield).setInline(true);
        }
        
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterInline_dataset_record_def(EclParser.Inline_dataset_record_defContext ctx) {
            parentrec=currentrec;
            currentrec=new DFURecordDefInfo();  
            parentfield=currentfield;            
        }
        @Override public void exitInline_dataset_record_def(EclParser.Inline_dataset_record_defContext ctx) {
            if (parentfield != null) {
                    parentfield.getChildColumns().addAll(currentrec.getChildColumns());
                }
            currentrec=parentrec;
            currentfield=parentfield;
            parentfield=null;
            parentrec=null;           
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterMaxlength(EclParser.MaxlengthContext ctx) { 
            if (currentfield != null && currentfield instanceof DFURecordDefInfo) {
                ((DFURecordDefInfo)currentfield).setMaxlength(ctx.getChild(2).getText());
            } else if (currentrec != null) {
                currentrec.setMaxlength(ctx.getChild(2).getText());
            }
        }

        public ErrorListener getErrorHandler() {
            return errorHandler;
        }
        public EclInfo getEclInfo()
        {
            return this.eclInfo;
        }
        public EclParser getParser()
        {
            return parser;
        }
        public void setParser(EclParser parser)
        {
            this.parser = parser;
        }
        
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterDefaultval(EclParser.DefaultvalContext ctx) {
            if (currentfield != null && currentfield instanceof DFURecordDefInfo) {
                ((DFURecordDefInfo)currentfield).setColumnValue(ctx.getChild(2).getText());
            } else if (currentrec != null) {
                currentrec.setColumnValue(ctx.getChild(2).getText());
            }
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterXpath(EclParser.XpathContext ctx) {
            if (currentfield != null && currentfield instanceof DFURecordDefInfo) {
                ((DFURecordDefInfo)currentfield).setXpath(ctx.getChild(2).getText());
            } else if (currentrec != null) {
                currentrec.setXpath(ctx.getChild(2).getText());
            }
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
        @Override public void enterXmldefaultval(EclParser.XmldefaultvalContext ctx) {
            if (currentfield != null && currentfield instanceof DFURecordDefInfo) {
                ((DFURecordDefInfo)currentfield).setXmlDefaultVal(ctx.getChild(2).getText());
            } else if (currentrec != null) {
                currentrec.setXmlDefaultVal(ctx.getChild(2).getText());
            }
        }

}