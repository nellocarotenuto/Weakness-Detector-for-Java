// Generated from org/apache/syncope/core/logic/scim/SCIMFilter.g4 by ANTLR 4.7.2
package org.apache.syncope.core.logic.scim;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SCIMFilterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SCIMFilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SCIMFilterParser#scimFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScimFilter(SCIMFilterParser.ScimFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATTR_PR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATTR_PR(SCIMFilterParser.ATTR_PRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LBRAC_EXPR_RBRAC}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLBRAC_EXPR_RBRAC(SCIMFilterParser.LBRAC_EXPR_RBRACContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATTR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATTR_OPER_EXPR(SCIMFilterParser.ATTR_OPER_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR_OR_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR_OR_EXPR(SCIMFilterParser.EXPR_OR_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR_OPER_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR_OPER_EXPR(SCIMFilterParser.EXPR_OPER_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT_EXPR(SCIMFilterParser.NOT_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR_AND_EXPR}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR_AND_EXPR(SCIMFilterParser.EXPR_AND_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATTR_OPER_CRITERIA}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATTR_OPER_CRITERIA(SCIMFilterParser.ATTR_OPER_CRITERIAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LPAREN_EXPR_RPAREN}
	 * labeled alternative in {@link SCIMFilterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLPAREN_EXPR_RPAREN(SCIMFilterParser.LPAREN_EXPR_RPARENContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCIMFilterParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(SCIMFilterParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCIMFilterParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SCIMFilterParser.OperatorContext ctx);
}