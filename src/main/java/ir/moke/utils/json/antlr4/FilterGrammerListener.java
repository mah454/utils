// Generated from FilterGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FilterGrammerParser}.
 */
public interface FilterGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FilterGrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FilterGrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(FilterGrammerParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(FilterGrammerParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(FilterGrammerParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(FilterGrammerParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#arrayFilter}.
	 * @param ctx the parse tree
	 */
	void enterArrayFilter(FilterGrammerParser.ArrayFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#arrayFilter}.
	 * @param ctx the parse tree
	 */
	void exitArrayFilter(FilterGrammerParser.ArrayFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FilterGrammerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FilterGrammerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 */
	void enterStmtValue(FilterGrammerParser.StmtValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#stmtValue}.
	 * @param ctx the parse tree
	 */
	void exitStmtValue(FilterGrammerParser.StmtValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(FilterGrammerParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(FilterGrammerParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 */
	void enterPathSegment(FilterGrammerParser.PathSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#pathSegment}.
	 * @param ctx the parse tree
	 */
	void exitPathSegment(FilterGrammerParser.PathSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterGrammerParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(FilterGrammerParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterGrammerParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(FilterGrammerParser.ComparatorContext ctx);
}