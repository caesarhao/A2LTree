// Generated from A2L.g4 by ANTLR 4.5.1



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2LParser}.
 */
public interface A2LListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 */
	void enterA2l(A2LParser.A2lContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 */
	void exitA2l(A2LParser.A2lContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(A2LParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(A2LParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(A2LParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(A2LParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(A2LParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(A2LParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(A2LParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(A2LParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 */
	void enterA2ml(A2LParser.A2mlContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 */
	void exitA2ml(A2LParser.A2mlContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#mod_common}.
	 * @param ctx the parse tree
	 */
	void enterMod_common(A2LParser.Mod_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#mod_common}.
	 * @param ctx the parse tree
	 */
	void exitMod_common(A2LParser.Mod_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 */
	void enterMod_par(A2LParser.Mod_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 */
	void exitMod_par(A2LParser.Mod_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 */
	void enterMemory_segment(A2LParser.Memory_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 */
	void exitMemory_segment(A2LParser.Memory_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 */
	void enterIf_data(A2LParser.If_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 */
	void exitIf_data(A2LParser.If_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#compu_method}.
	 * @param ctx the parse tree
	 */
	void enterCompu_method(A2LParser.Compu_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#compu_method}.
	 * @param ctx the parse tree
	 */
	void exitCompu_method(A2LParser.Compu_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 */
	void enterCalibration_method(A2LParser.Calibration_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 */
	void exitCalibration_method(A2LParser.Calibration_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(A2LParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(A2LParser.MeasurementContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void enterAxis_pts(A2LParser.Axis_ptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void exitAxis_pts(A2LParser.Axis_ptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(A2LParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(A2LParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(A2LParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(A2LParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#aml}.
	 * @param ctx the parse tree
	 */
	void enterAml(A2LParser.AmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#aml}.
	 * @param ctx the parse tree
	 */
	void exitAml(A2LParser.AmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(A2LParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(A2LParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(A2LParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(A2LParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(A2LParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(A2LParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#predefined_type_name}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type_name(A2LParser.Predefined_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#predefined_type_name}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type_name(A2LParser.Predefined_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#block_definition}.
	 * @param ctx the parse tree
	 */
	void enterBlock_definition(A2LParser.Block_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#block_definition}.
	 * @param ctx the parse tree
	 */
	void exitBlock_definition(A2LParser.Block_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enum_type_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type_name(A2LParser.Enum_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enum_type_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type_name(A2LParser.Enum_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(A2LParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(A2LParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(A2LParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(A2LParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#struct_type_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type_name(A2LParser.Struct_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#struct_type_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type_name(A2LParser.Struct_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#struct_member}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member(A2LParser.Struct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#struct_member}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member(A2LParser.Struct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(A2LParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(A2LParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(A2LParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(A2LParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_type_name}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_type_name(A2LParser.Taggedstruct_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_type_name}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_type_name(A2LParser.Taggedstruct_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_member}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_member(A2LParser.Taggedstruct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_member}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_member(A2LParser.Taggedstruct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_definition}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_definition(A2LParser.Taggedstruct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_definition}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_definition(A2LParser.Taggedstruct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedunion_type_name}.
	 * @param ctx the parse tree
	 */
	void enterTaggedunion_type_name(A2LParser.Taggedunion_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedunion_type_name}.
	 * @param ctx the parse tree
	 */
	void exitTaggedunion_type_name(A2LParser.Taggedunion_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#tagged_union_member}.
	 * @param ctx the parse tree
	 */
	void enterTagged_union_member(A2LParser.Tagged_union_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#tagged_union_member}.
	 * @param ctx the parse tree
	 */
	void exitTagged_union_member(A2LParser.Tagged_union_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(A2LParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(A2LParser.ConstantContext ctx);
}