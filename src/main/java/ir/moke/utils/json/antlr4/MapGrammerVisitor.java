// Generated from MapGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MapGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MapGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MapGrammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauses(MapGrammerParser.ClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MapGrammerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(MapGrammerParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(MapGrammerParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(MapGrammerParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathExpr(MapGrammerParser.PathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(MapGrammerParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MapGrammerParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link MapGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpr(MapGrammerParser.ConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(MapGrammerParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSegment(MapGrammerParser.PathSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#arraySelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySelector(MapGrammerParser.ArraySelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MapGrammerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtValue(MapGrammerParser.StmtValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(MapGrammerParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MapGrammerParser#mathOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperation(MapGrammerParser.MathOperationContext ctx);
}