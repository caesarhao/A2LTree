// Generated from A2L.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2LParser}.
 */
public interface A2LListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A2LParser#aml}.
	 * @param ctx the parse tree
	 */
	void enterAml(@NotNull A2LParser.AmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#aml}.
	 * @param ctx the parse tree
	 */
	void exitAml(@NotNull A2LParser.AmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull A2LParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull A2LParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull A2LParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull A2LParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#predefined_type_name}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type_name(@NotNull A2LParser.Predefined_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#predefined_type_name}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type_name(@NotNull A2LParser.Predefined_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(@NotNull A2LParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(@NotNull A2LParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 */
	void enterCalibration_method(@NotNull A2LParser.Calibration_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 */
	void exitCalibration_method(@NotNull A2LParser.Calibration_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull A2LParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull A2LParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#struct_type_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type_name(@NotNull A2LParser.Struct_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#struct_type_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type_name(@NotNull A2LParser.Struct_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 */
	void enterA2l(@NotNull A2LParser.A2lContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 */
	void exitA2l(@NotNull A2LParser.A2lContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 */
	void enterMemory_segment(@NotNull A2LParser.Memory_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 */
	void exitMemory_segment(@NotNull A2LParser.Memory_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull A2LParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull A2LParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_definition}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_definition(@NotNull A2LParser.Taggedstruct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_definition}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_definition(@NotNull A2LParser.Taggedstruct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#block_definition}.
	 * @param ctx the parse tree
	 */
	void enterBlock_definition(@NotNull A2LParser.Block_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#block_definition}.
	 * @param ctx the parse tree
	 */
	void exitBlock_definition(@NotNull A2LParser.Block_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(@NotNull A2LParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(@NotNull A2LParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enum_type_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type_name(@NotNull A2LParser.Enum_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enum_type_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type_name(@NotNull A2LParser.Enum_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedunion_type_name}.
	 * @param ctx the parse tree
	 */
	void enterTaggedunion_type_name(@NotNull A2LParser.Taggedunion_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedunion_type_name}.
	 * @param ctx the parse tree
	 */
	void exitTaggedunion_type_name(@NotNull A2LParser.Taggedunion_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull A2LParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull A2LParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull A2LParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull A2LParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(@NotNull A2LParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(@NotNull A2LParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 */
	void enterIf_data(@NotNull A2LParser.If_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 */
	void exitIf_data(@NotNull A2LParser.If_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(@NotNull A2LParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(@NotNull A2LParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull A2LParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull A2LParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#struct_member}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member(@NotNull A2LParser.Struct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#struct_member}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member(@NotNull A2LParser.Struct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_type_name}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_type_name(@NotNull A2LParser.Taggedstruct_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_type_name}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_type_name(@NotNull A2LParser.Taggedstruct_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#taggedstruct_member}.
	 * @param ctx the parse tree
	 */
	void enterTaggedstruct_member(@NotNull A2LParser.Taggedstruct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#taggedstruct_member}.
	 * @param ctx the parse tree
	 */
	void exitTaggedstruct_member(@NotNull A2LParser.Taggedstruct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#tagged_union_member}.
	 * @param ctx the parse tree
	 */
	void enterTagged_union_member(@NotNull A2LParser.Tagged_union_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#tagged_union_member}.
	 * @param ctx the parse tree
	 */
	void exitTagged_union_member(@NotNull A2LParser.Tagged_union_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull A2LParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull A2LParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 */
	void enterMod_par(@NotNull A2LParser.Mod_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 */
	void exitMod_par(@NotNull A2LParser.Mod_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 */
	void enterA2ml(@NotNull A2LParser.A2mlContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 */
	void exitA2ml(@NotNull A2LParser.A2mlContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void enterAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void exitAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2LParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(@NotNull A2LParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(@NotNull A2LParser.Array_specifierContext ctx);
}