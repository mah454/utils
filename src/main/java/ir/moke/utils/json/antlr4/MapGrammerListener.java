// Generated from MapGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapGrammerParser}.
 */
public interface MapGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MapGrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MapGrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(MapGrammerParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(MapGrammerParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MapGrammerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MapGrammerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(MapGrammerParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(MapGrammerParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(MapGrammerParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(MapGrammerParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(MapGrammerParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(MapGrammerParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPathExpr(MapGrammerParser.PathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPathExpr(MapGrammerParser.PathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(MapGrammerParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(MapGrammerParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MapGrammerParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MapGrammerParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(MapGrammerParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(MapGrammerParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MapGrammerParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MapGrammerParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 */
	void enterPathSegment(MapGrammerParser.PathSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 */
	void exitPathSegment(MapGrammerParser.PathSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#arraySelector}.
	 * @param ctx the parse tree
	 */
	void enterArraySelector(MapGrammerParser.ArraySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#arraySelector}.
	 * @param ctx the parse tree
	 */
	void exitArraySelector(MapGrammerParser.ArraySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MapGrammerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MapGrammerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 */
	void enterStmtValue(MapGrammerParser.StmtValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 */
	void exitStmtValue(MapGrammerParser.StmtValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(MapGrammerParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(MapGrammerParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapGrammerParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(MapGrammerParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapGrammerParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(MapGrammerParser.MathOperationContext ctx);
}