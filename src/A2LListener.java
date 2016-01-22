// Generated from A2L.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2LParser}.
 */
public interface A2LListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void enterAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2LParser#axis_pts}.
	 * @param ctx the parse tree
	 */
	void exitAxis_pts(@NotNull A2LParser.Axis_ptsContext ctx);
}