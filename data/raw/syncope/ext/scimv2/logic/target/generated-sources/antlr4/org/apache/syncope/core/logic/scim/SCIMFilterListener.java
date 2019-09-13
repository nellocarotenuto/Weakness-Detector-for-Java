// Generated from org/apache/syncope/core/logic/scim/SCIMFilter.g4 by ANTLR 4.7.2
package org.apache.syncope.core.logic.scim;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCIMFilterParser}.
 */
public interface SCIMFilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCIMFilterParser#scimFilter}.
	 * @param ctx the parse tree
	 */
	void enterScimFilter(SCIMFilterParser.ScimFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCIMFilterParser#scimFilter}.
	 * @param ctx the parse tree
	 */
	void exitScimFilter(SCIMFilterParser.ScimFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATTR_PR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterATTR_PR(SCIMFilterParser.ATTR_PRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATTR_PR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitATTR_PR(SCIMFilterParser.ATTR_PRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LBRAC_EXPR_RBRAC}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLBRAC_EXPR_RBRAC(SCIMFilterParser.LBRAC_EXPR_RBRACContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LBRAC_EXPR_RBRAC}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLBRAC_EXPR_RBRAC(SCIMFilterParser.LBRAC_EXPR_RBRACContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATTR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterATTR_OPER_EXPR(SCIMFilterParser.ATTR_OPER_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATTR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitATTR_OPER_EXPR(SCIMFilterParser.ATTR_OPER_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR_OR_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPR_OR_EXPR(SCIMFilterParser.EXPR_OR_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR_OR_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPR_OR_EXPR(SCIMFilterParser.EXPR_OR_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPR_OPER_EXPR(SCIMFilterParser.EXPR_OPER_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPR_OPER_EXPR(SCIMFilterParser.EXPR_OPER_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNOT_EXPR(SCIMFilterParser.NOT_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNOT_EXPR(SCIMFilterParser.NOT_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR_AND_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPR_AND_EXPR(SCIMFilterParser.EXPR_AND_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR_AND_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPR_AND_EXPR(SCIMFilterParser.EXPR_AND_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATTR_OPER_CRITERIA}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterATTR_OPER_CRITERIA(SCIMFilterParser.ATTR_OPER_CRITERIAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATTR_OPER_CRITERIA}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitATTR_OPER_CRITERIA(SCIMFilterParser.ATTR_OPER_CRITERIAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LPAREN_EXPR_RPAREN}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLPAREN_EXPR_RPAREN(SCIMFilterParser.LPAREN_EXPR_RPARENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LPAREN_EXPR_RPAREN}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLPAREN_EXPR_RPAREN(SCIMFilterParser.LPAREN_EXPR_RPARENContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCIMFilterParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(SCIMFilterParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCIMFilterParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(SCIMFilterParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCIMFilterParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SCIMFilterParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCIMFilterParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SCIMFilterParser.OperatorContext ctx);
}