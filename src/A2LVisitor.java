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
	 * Visit a parse tree produced by {@link A2LParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(@NotNull A2LParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#calibration_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalibration_method(@NotNull A2LParser.Calibration_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull A2LParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(@NotNull A2LParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(@NotNull A2LParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#a2l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2l(@NotNull A2LParser.A2lContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#if_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_data(@NotNull A2LParser.If_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#mod_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_par(@NotNull A2LParser.Mod_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#memory_segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory_segment(@NotNull A2LParser.Memory_segmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#a2ml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2ml(@NotNull A2LParser.A2mlContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(@NotNull A2LParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
}