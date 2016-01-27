// Generated from A2L.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link A2LParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface A2LVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link A2LParser#aml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAml(@NotNull A2LParser.AmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull A2LParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull A2LParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#predefined_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type_name(@NotNull A2LParser.Predefined_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(@NotNull A2LParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#compu_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompu_method(@NotNull A2LParser.Compu_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#measurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(@NotNull A2LParser.MeasurementContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalibration_method(@NotNull A2LParser.Calibration_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(@NotNull A2LParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#struct_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type_name(@NotNull A2LParser.Struct_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2l(@NotNull A2LParser.A2lContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory_segment(@NotNull A2LParser.Memory_segmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(@NotNull A2LParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#taggedstruct_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedstruct_definition(@NotNull A2LParser.Taggedstruct_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#mod_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_common(@NotNull A2LParser.Mod_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#block_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_definition(@NotNull A2LParser.Block_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(@NotNull A2LParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#enum_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_type_name(@NotNull A2LParser.Enum_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#taggedunion_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedunion_type_name(@NotNull A2LParser.Taggedunion_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull A2LParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(@NotNull A2LParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(@NotNull A2LParser.Enumerator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(@NotNull A2LParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_data(@NotNull A2LParser.If_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(@NotNull A2LParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull A2LParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#struct_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member(@NotNull A2LParser.Struct_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#taggedstruct_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedstruct_type_name(@NotNull A2LParser.Taggedstruct_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#taggedstruct_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedstruct_member(@NotNull A2LParser.Taggedstruct_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#tagged_union_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagged_union_member(@NotNull A2LParser.Tagged_union_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(@NotNull A2LParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_par(@NotNull A2LParser.Mod_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2ml(@NotNull A2LParser.A2mlContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(@NotNull A2LParser.Array_specifierContext ctx);
}