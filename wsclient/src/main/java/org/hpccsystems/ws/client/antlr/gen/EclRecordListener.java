// Generated from EclRecord.g4 by ANTLR 4.10.1
package org.hpccsystems.ws.client.antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EclRecordParser}.
 */
public interface EclRecordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EclRecordParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EclRecordParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EclRecordParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EclRecordParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(EclRecordParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(EclRecordParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#token_list}.
	 * @param ctx the parse tree
	 */
	void enterToken_list(EclRecordParser.Token_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#token_list}.
	 * @param ctx the parse tree
	 */
	void exitToken_list(EclRecordParser.Token_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(EclRecordParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(EclRecordParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#assign_list}.
	 * @param ctx the parse tree
	 */
	void enterAssign_list(EclRecordParser.Assign_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#assign_list}.
	 * @param ctx the parse tree
	 */
	void exitAssign_list(EclRecordParser.Assign_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#eclfield_decl}.
	 * @param ctx the parse tree
	 */
	void enterEclfield_decl(EclRecordParser.Eclfield_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#eclfield_decl}.
	 * @param ctx the parse tree
	 */
	void exitEclfield_decl(EclRecordParser.Eclfield_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#eclfield_type}.
	 * @param ctx the parse tree
	 */
	void enterEclfield_type(EclRecordParser.Eclfield_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#eclfield_type}.
	 * @param ctx the parse tree
	 */
	void exitEclfield_type(EclRecordParser.Eclfield_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#eclfield_name}.
	 * @param ctx the parse tree
	 */
	void enterEclfield_name(EclRecordParser.Eclfield_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#eclfield_name}.
	 * @param ctx the parse tree
	 */
	void exitEclfield_name(EclRecordParser.Eclfield_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#eclfield_recref}.
	 * @param ctx the parse tree
	 */
	void enterEclfield_recref(EclRecordParser.Eclfield_recrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#eclfield_recref}.
	 * @param ctx the parse tree
	 */
	void exitEclfield_recref(EclRecordParser.Eclfield_recrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#payload_sep}.
	 * @param ctx the parse tree
	 */
	void enterPayload_sep(EclRecordParser.Payload_sepContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#payload_sep}.
	 * @param ctx the parse tree
	 */
	void exitPayload_sep(EclRecordParser.Payload_sepContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#record_def_inline}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def_inline(EclRecordParser.Record_def_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#record_def_inline}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def_inline(EclRecordParser.Record_def_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(EclRecordParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(EclRecordParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#defined_record_def}.
	 * @param ctx the parse tree
	 */
	void enterDefined_record_def(EclRecordParser.Defined_record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#defined_record_def}.
	 * @param ctx the parse tree
	 */
	void exitDefined_record_def(EclRecordParser.Defined_record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#exploded_dataset_record_def}.
	 * @param ctx the parse tree
	 */
	void enterExploded_dataset_record_def(EclRecordParser.Exploded_dataset_record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#exploded_dataset_record_def}.
	 * @param ctx the parse tree
	 */
	void exitExploded_dataset_record_def(EclRecordParser.Exploded_dataset_record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#inline_dataset_record_def}.
	 * @param ctx the parse tree
	 */
	void enterInline_dataset_record_def(EclRecordParser.Inline_dataset_record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#inline_dataset_record_def}.
	 * @param ctx the parse tree
	 */
	void exitInline_dataset_record_def(EclRecordParser.Inline_dataset_record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#record_defs}.
	 * @param ctx the parse tree
	 */
	void enterRecord_defs(EclRecordParser.Record_defsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#record_defs}.
	 * @param ctx the parse tree
	 */
	void exitRecord_defs(EclRecordParser.Record_defsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#nested_dataset_decl}.
	 * @param ctx the parse tree
	 */
	void enterNested_dataset_decl(EclRecordParser.Nested_dataset_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#nested_dataset_decl}.
	 * @param ctx the parse tree
	 */
	void exitNested_dataset_decl(EclRecordParser.Nested_dataset_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#nested_inline_dataset_decl}.
	 * @param ctx the parse tree
	 */
	void enterNested_inline_dataset_decl(EclRecordParser.Nested_inline_dataset_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#nested_inline_dataset_decl}.
	 * @param ctx the parse tree
	 */
	void exitNested_inline_dataset_decl(EclRecordParser.Nested_inline_dataset_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#opts}.
	 * @param ctx the parse tree
	 */
	void enterOpts(EclRecordParser.OptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#opts}.
	 * @param ctx the parse tree
	 */
	void exitOpts(EclRecordParser.OptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#opt}.
	 * @param ctx the parse tree
	 */
	void enterOpt(EclRecordParser.OptContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#opt}.
	 * @param ctx the parse tree
	 */
	void exitOpt(EclRecordParser.OptContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#maxlength}.
	 * @param ctx the parse tree
	 */
	void enterMaxlength(EclRecordParser.MaxlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#maxlength}.
	 * @param ctx the parse tree
	 */
	void exitMaxlength(EclRecordParser.MaxlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#blob}.
	 * @param ctx the parse tree
	 */
	void enterBlob(EclRecordParser.BlobContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#blob}.
	 * @param ctx the parse tree
	 */
	void exitBlob(EclRecordParser.BlobContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#maxcount}.
	 * @param ctx the parse tree
	 */
	void enterMaxcount(EclRecordParser.MaxcountContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#maxcount}.
	 * @param ctx the parse tree
	 */
	void exitMaxcount(EclRecordParser.MaxcountContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#defaultval}.
	 * @param ctx the parse tree
	 */
	void enterDefaultval(EclRecordParser.DefaultvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#defaultval}.
	 * @param ctx the parse tree
	 */
	void exitDefaultval(EclRecordParser.DefaultvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterXpath(EclRecordParser.XpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitXpath(EclRecordParser.XpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#xmldefaultval}.
	 * @param ctx the parse tree
	 */
	void enterXmldefaultval(EclRecordParser.XmldefaultvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#xmldefaultval}.
	 * @param ctx the parse tree
	 */
	void exitXmldefaultval(EclRecordParser.XmldefaultvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#setdefaultval}.
	 * @param ctx the parse tree
	 */
	void enterSetdefaultval(EclRecordParser.SetdefaultvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#setdefaultval}.
	 * @param ctx the parse tree
	 */
	void exitSetdefaultval(EclRecordParser.SetdefaultvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#setdefaultvalall}.
	 * @param ctx the parse tree
	 */
	void enterSetdefaultvalall(EclRecordParser.SetdefaultvalallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#setdefaultvalall}.
	 * @param ctx the parse tree
	 */
	void exitSetdefaultvalall(EclRecordParser.SetdefaultvalallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#annotation_name}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_name(EclRecordParser.Annotation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#annotation_name}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_name(EclRecordParser.Annotation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#annotation_param}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_param(EclRecordParser.Annotation_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#annotation_param}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_param(EclRecordParser.Annotation_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#annotation_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_arguments(EclRecordParser.Annotation_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#annotation_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_arguments(EclRecordParser.Annotation_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(EclRecordParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(EclRecordParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclRecordParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(EclRecordParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclRecordParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(EclRecordParser.CommentContext ctx);
}