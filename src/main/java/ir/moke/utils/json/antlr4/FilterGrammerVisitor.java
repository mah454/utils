// Generated from FilterGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FilterGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FilterGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FilterGrammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauses(FilterGrammerParser.ClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(FilterGrammerParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#arrayFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFilter(FilterGrammerParser.ArrayFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FilterGrammerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtValue(FilterGrammerParser.StmtValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(FilterGrammerParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSegment(FilterGrammerParser.PathSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterGrammerParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(FilterGrammerParser.ComparatorContext ctx);
}