// $ANTLR 3.5.2 org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g 2019-10-07 21:48:17

	package org.apache.nifi.attribute.expression.language.antlr;
	import org.apache.nifi.attribute.expression.language.exception.AttributeExpressionLanguageParsingException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AttributeExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL_ATTRIBUTES", "ALL_DELINEATED_VALUES", 
		"ALL_MATCHING_ATTRIBUTES", "AND", "ANY_ATTRIBUTE", "ANY_DELINEATED_VALUE", 
		"ANY_MATCHING_ATTRIBUTE", "APPEND", "ATTRIBUTE_NAME", "COLON", "COMMA", 
		"COMMENT", "CONTAINS", "COUNT", "DIVIDE", "DOLLAR", "DOT", "ENDS_WITH", 
		"EQUALS", "EQUALS_IGNORE_CASE", "ESC", "FALSE", "FIND", "FORMAT", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "HOSTNAME", "INDEX_OF", "IP", "IS_EMPTY", "IS_NULL", 
		"JOIN", "LAST_INDEX_OF", "LBRACE", "LENGTH", "LESS_THAN", "LESS_THAN_OR_EQUAL", 
		"LPAREN", "MATCHES", "MINUS", "MOD", "MULTIPLY", "NEXT_INT", "NOT", "NOT_NULL", 
		"NOW", "NUMBER", "OR", "PLUS", "PREPEND", "RBRACE", "REPLACE", "REPLACE_ALL", 
		"REPLACE_EMPTY", "REPLACE_NULL", "RPAREN", "SEMICOLON", "STARTS_WITH", 
		"STRING_LITERAL", "SUBSTRING", "SUBSTRING_AFTER", "SUBSTRING_AFTER_LAST", 
		"SUBSTRING_BEFORE", "SUBSTRING_BEFORE_LAST", "TO_DATE", "TO_LITERAL", 
		"TO_LOWER", "TO_NUMBER", "TO_RADIX", "TO_STRING", "TO_UPPER", "TRIM", 
		"TRUE", "URL_DECODE", "URL_ENCODE", "UUID", "WHITESPACE", "ATTRIBUTE_REFERENCE", 
		"ATTR_NAME", "EXPRESSION", "FUNCTION_CALL", "MULTI_ATTRIBUTE_REFERENCE", 
		"QUERY", "QUOTED_ATTR_NAME"
	};
	public static final int EOF=-1;
	public static final int ALL_ATTRIBUTES=4;
	public static final int ALL_DELINEATED_VALUES=5;
	public static final int ALL_MATCHING_ATTRIBUTES=6;
	public static final int AND=7;
	public static final int ANY_ATTRIBUTE=8;
	public static final int ANY_DELINEATED_VALUE=9;
	public static final int ANY_MATCHING_ATTRIBUTE=10;
	public static final int APPEND=11;
	public static final int ATTRIBUTE_NAME=12;
	public static final int COLON=13;
	public static final int COMMA=14;
	public static final int COMMENT=15;
	public static final int CONTAINS=16;
	public static final int COUNT=17;
	public static final int DIVIDE=18;
	public static final int DOLLAR=19;
	public static final int DOT=20;
	public static final int ENDS_WITH=21;
	public static final int EQUALS=22;
	public static final int EQUALS_IGNORE_CASE=23;
	public static final int ESC=24;
	public static final int FALSE=25;
	public static final int FIND=26;
	public static final int FORMAT=27;
	public static final int GREATER_THAN=28;
	public static final int GREATER_THAN_OR_EQUAL=29;
	public static final int HOSTNAME=30;
	public static final int INDEX_OF=31;
	public static final int IP=32;
	public static final int IS_EMPTY=33;
	public static final int IS_NULL=34;
	public static final int JOIN=35;
	public static final int LAST_INDEX_OF=36;
	public static final int LBRACE=37;
	public static final int LENGTH=38;
	public static final int LESS_THAN=39;
	public static final int LESS_THAN_OR_EQUAL=40;
	public static final int LPAREN=41;
	public static final int MATCHES=42;
	public static final int MINUS=43;
	public static final int MOD=44;
	public static final int MULTIPLY=45;
	public static final int NEXT_INT=46;
	public static final int NOT=47;
	public static final int NOT_NULL=48;
	public static final int NOW=49;
	public static final int NUMBER=50;
	public static final int OR=51;
	public static final int PLUS=52;
	public static final int PREPEND=53;
	public static final int RBRACE=54;
	public static final int REPLACE=55;
	public static final int REPLACE_ALL=56;
	public static final int REPLACE_EMPTY=57;
	public static final int REPLACE_NULL=58;
	public static final int RPAREN=59;
	public static final int SEMICOLON=60;
	public static final int STARTS_WITH=61;
	public static final int STRING_LITERAL=62;
	public static final int SUBSTRING=63;
	public static final int SUBSTRING_AFTER=64;
	public static final int SUBSTRING_AFTER_LAST=65;
	public static final int SUBSTRING_BEFORE=66;
	public static final int SUBSTRING_BEFORE_LAST=67;
	public static final int TO_DATE=68;
	public static final int TO_LITERAL=69;
	public static final int TO_LOWER=70;
	public static final int TO_NUMBER=71;
	public static final int TO_RADIX=72;
	public static final int TO_STRING=73;
	public static final int TO_UPPER=74;
	public static final int TRIM=75;
	public static final int TRUE=76;
	public static final int URL_DECODE=77;
	public static final int URL_ENCODE=78;
	public static final int UUID=79;
	public static final int WHITESPACE=80;
	public static final int ATTRIBUTE_REFERENCE=81;
	public static final int ATTR_NAME=82;
	public static final int EXPRESSION=83;
	public static final int FUNCTION_CALL=84;
	public static final int MULTI_ATTRIBUTE_REFERENCE=85;
	public static final int QUERY=86;
	public static final int QUOTED_ATTR_NAME=87;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AttributeExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AttributeExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AttributeExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g"; }


	  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());
	    
	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  }

	  public void recover(final RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());
	    
	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  } 


	public static class zeroArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:1: zeroArgString : ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgString_return zeroArgString() throws RecognitionException {
		AttributeExpressionParser.zeroArgString_return retval = new AttributeExpressionParser.zeroArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;
		Token LPAREN2=null;
		Token RPAREN3=null;

		Object set1_tree=null;
		Object LPAREN2_tree=null;
		Object RPAREN3_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:15: ( ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:17: ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set1=input.LT(1);
			if ( input.LA(1)==TO_LOWER||(input.LA(1) >= TO_STRING && input.LA(1) <= TRIM)||(input.LA(1) >= URL_DECODE && input.LA(1) <= URL_ENCODE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set1));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgString101); 
			RPAREN3=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgString104); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgString"


	public static class oneArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:1: oneArgString : ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | FORMAT | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.oneArgString_return oneArgString() throws RecognitionException {
		AttributeExpressionParser.oneArgString_return retval = new AttributeExpressionParser.oneArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set4=null;
		Token LPAREN5=null;
		Token RPAREN7=null;
		Token TO_RADIX8=null;
		Token LPAREN9=null;
		Token COMMA11=null;
		Token RPAREN13=null;
		ParserRuleReturnScope anyArg6 =null;
		ParserRuleReturnScope anyArg10 =null;
		ParserRuleReturnScope anyArg12 =null;

		Object set4_tree=null;
		Object LPAREN5_tree=null;
		Object RPAREN7_tree=null;
		Object TO_RADIX8_tree=null;
		Object LPAREN9_tree=null;
		Object COMMA11_tree=null;
		Object RPAREN13_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:14: ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | FORMAT | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==APPEND||LA2_0==CONTAINS||LA2_0==ENDS_WITH||LA2_0==FORMAT||LA2_0==JOIN||LA2_0==PREPEND||(LA2_0 >= REPLACE_EMPTY && LA2_0 <= REPLACE_NULL)||LA2_0==STARTS_WITH||(LA2_0 >= SUBSTRING_AFTER && LA2_0 <= SUBSTRING_BEFORE_LAST)) ) {
				alt2=1;
			}
			else if ( (LA2_0==TO_RADIX) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | FORMAT | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | FORMAT | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:17: ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | FORMAT | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN ) LPAREN ! anyArg RPAREN !
					{
					set4=input.LT(1);
					if ( input.LA(1)==APPEND||input.LA(1)==CONTAINS||input.LA(1)==ENDS_WITH||input.LA(1)==FORMAT||input.LA(1)==JOIN||input.LA(1)==PREPEND||(input.LA(1) >= REPLACE_EMPTY && input.LA(1) <= REPLACE_NULL)||input.LA(1)==STARTS_WITH||(input.LA(1) >= SUBSTRING_AFTER && input.LA(1) <= SUBSTRING_BEFORE_LAST) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set4));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN5=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString169); 
					pushFollow(FOLLOW_anyArg_in_oneArgString172);
					anyArg6=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg6.getTree());

					RPAREN7=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString174); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:8: TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					TO_RADIX8=(Token)match(input,TO_RADIX,FOLLOW_TO_RADIX_in_oneArgString187); 
					TO_RADIX8_tree = (Object)adaptor.create(TO_RADIX8);
					adaptor.addChild(root_0, TO_RADIX8_tree);

					LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString189); 
					pushFollow(FOLLOW_anyArg_in_oneArgString192);
					anyArg10=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg10.getTree());

					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:32: ( COMMA ! anyArg )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COMMA) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:33: COMMA ! anyArg
							{
							COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_oneArgString195); 
							pushFollow(FOLLOW_anyArg_in_oneArgString198);
							anyArg12=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg12.getTree());

							}
							break;

					}

					RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString202); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgString"


	public static class twoArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "twoArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:1: twoArgString : ( ( ( REPLACE | REPLACE_ALL ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( SUBSTRING LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.twoArgString_return twoArgString() throws RecognitionException {
		AttributeExpressionParser.twoArgString_return retval = new AttributeExpressionParser.twoArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;
		Token LPAREN15=null;
		Token COMMA17=null;
		Token RPAREN19=null;
		Token SUBSTRING20=null;
		Token LPAREN21=null;
		Token COMMA23=null;
		Token RPAREN25=null;
		ParserRuleReturnScope anyArg16 =null;
		ParserRuleReturnScope anyArg18 =null;
		ParserRuleReturnScope anyArg22 =null;
		ParserRuleReturnScope anyArg24 =null;

		Object set14_tree=null;
		Object LPAREN15_tree=null;
		Object COMMA17_tree=null;
		Object RPAREN19_tree=null;
		Object SUBSTRING20_tree=null;
		Object LPAREN21_tree=null;
		Object COMMA23_tree=null;
		Object RPAREN25_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:14: ( ( ( REPLACE | REPLACE_ALL ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( SUBSTRING LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= REPLACE && LA4_0 <= REPLACE_ALL)) ) {
				alt4=1;
			}
			else if ( (LA4_0==SUBSTRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:16: ( ( REPLACE | REPLACE_ALL ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:16: ( ( REPLACE | REPLACE_ALL ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:17: ( REPLACE | REPLACE_ALL ) LPAREN ! anyArg COMMA ! anyArg RPAREN !
					{
					set14=input.LT(1);
					if ( (input.LA(1) >= REPLACE && input.LA(1) <= REPLACE_ALL) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set14));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString220); 
					pushFollow(FOLLOW_anyArg_in_twoArgString223);
					anyArg16=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg16.getTree());

					COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString225); 
					pushFollow(FOLLOW_anyArg_in_twoArgString228);
					anyArg18=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg18.getTree());

					RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString230); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:7: ( SUBSTRING LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:7: ( SUBSTRING LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:8: SUBSTRING LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					SUBSTRING20=(Token)match(input,SUBSTRING,FOLLOW_SUBSTRING_in_twoArgString243); 
					SUBSTRING20_tree = (Object)adaptor.create(SUBSTRING20);
					adaptor.addChild(root_0, SUBSTRING20_tree);

					LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString245); 
					pushFollow(FOLLOW_anyArg_in_twoArgString248);
					anyArg22=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg22.getTree());

					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:33: ( COMMA ! anyArg )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==COMMA) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:34: COMMA ! anyArg
							{
							COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString251); 
							pushFollow(FOLLOW_anyArg_in_twoArgString254);
							anyArg24=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg24.getTree());

							}
							break;

					}

					RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString258); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "twoArgString"


	public static class zeroArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgBool"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:1: zeroArgBool : ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgBool_return zeroArgBool() throws RecognitionException {
		AttributeExpressionParser.zeroArgBool_return retval = new AttributeExpressionParser.zeroArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set26=null;
		Token LPAREN27=null;
		Token RPAREN28=null;

		Object set26_tree=null;
		Object LPAREN27_tree=null;
		Object RPAREN28_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:13: ( ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:15: ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set26=input.LT(1);
			if ( (input.LA(1) >= IS_EMPTY && input.LA(1) <= IS_NULL)||(input.LA(1) >= NOT && input.LA(1) <= NOT_NULL) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set26));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgBool286); 
			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgBool289); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgBool"


	public static class oneArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgBool"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:1: oneArgBool : ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !);
	public final AttributeExpressionParser.oneArgBool_return oneArgBool() throws RecognitionException {
		AttributeExpressionParser.oneArgBool_return retval = new AttributeExpressionParser.oneArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set29=null;
		Token LPAREN30=null;
		Token RPAREN32=null;
		Token set33=null;
		Token LPAREN34=null;
		Token RPAREN36=null;
		Token EQUALS37=null;
		Token LPAREN38=null;
		Token RPAREN40=null;
		Token set41=null;
		Token LPAREN42=null;
		Token RPAREN44=null;
		ParserRuleReturnScope anyArg31 =null;
		ParserRuleReturnScope anyArg35 =null;
		ParserRuleReturnScope anyArg39 =null;
		ParserRuleReturnScope anyArg43 =null;

		Object set29_tree=null;
		Object LPAREN30_tree=null;
		Object RPAREN32_tree=null;
		Object set33_tree=null;
		Object LPAREN34_tree=null;
		Object RPAREN36_tree=null;
		Object EQUALS37_tree=null;
		Object LPAREN38_tree=null;
		Object RPAREN40_tree=null;
		Object set41_tree=null;
		Object LPAREN42_tree=null;
		Object RPAREN44_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:12: ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !)
			int alt5=4;
			switch ( input.LA(1) ) {
			case EQUALS_IGNORE_CASE:
			case FIND:
			case MATCHES:
				{
				alt5=1;
				}
				break;
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
				{
				alt5=2;
				}
				break;
			case EQUALS:
				{
				alt5=3;
				}
				break;
			case AND:
			case OR:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:15: ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !
					{
					set29=input.LT(1);
					if ( input.LA(1)==EQUALS_IGNORE_CASE||input.LA(1)==FIND||input.LA(1)==MATCHES ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set29));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN30=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool310); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool313);
					anyArg31=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg31.getTree());

					RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool315); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:87:6: ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set33=input.LT(1);
					if ( (input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_OR_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LESS_THAN_OR_EQUAL) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set33));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool342); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool345);
					anyArg35=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg35.getTree());

					RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool347); 
					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:6: ( EQUALS ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:6: ( EQUALS )
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:7: EQUALS
					{
					EQUALS37=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_oneArgBool358); 
					EQUALS37_tree = (Object)adaptor.create(EQUALS37);
					adaptor.addChild(root_0, EQUALS37_tree);

					}

					LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool361); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool364);
					anyArg39=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg39.getTree());

					RPAREN40=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool366); 
					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:89:6: ( AND | OR ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set41=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set41));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool384); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool387);
					anyArg43=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg43.getTree());

					RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool389); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgBool"


	public static class zeroArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:93:1: zeroArgNum : ( LENGTH | TO_NUMBER | COUNT ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgNum_return zeroArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroArgNum_return retval = new AttributeExpressionParser.zeroArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set45=null;
		Token LPAREN46=null;
		Token RPAREN47=null;

		Object set45_tree=null;
		Object LPAREN46_tree=null;
		Object RPAREN47_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:93:12: ( ( LENGTH | TO_NUMBER | COUNT ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:93:14: ( LENGTH | TO_NUMBER | COUNT ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set45=input.LT(1);
			if ( input.LA(1)==COUNT||input.LA(1)==LENGTH||input.LA(1)==TO_NUMBER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set45));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgNum412); 
			RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgNum415); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgNum"


	public static class oneArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:1: oneArgNum : ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( TO_DATE LPAREN ! ( anyArg )? RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) );
	public final AttributeExpressionParser.oneArgNum_return oneArgNum() throws RecognitionException {
		AttributeExpressionParser.oneArgNum_return retval = new AttributeExpressionParser.oneArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set48=null;
		Token LPAREN49=null;
		Token RPAREN51=null;
		Token TO_DATE52=null;
		Token LPAREN53=null;
		Token RPAREN55=null;
		Token set56=null;
		Token LPAREN57=null;
		Token RPAREN59=null;
		ParserRuleReturnScope anyArg50 =null;
		ParserRuleReturnScope anyArg54 =null;
		ParserRuleReturnScope anyArg58 =null;

		Object set48_tree=null;
		Object LPAREN49_tree=null;
		Object RPAREN51_tree=null;
		Object TO_DATE52_tree=null;
		Object LPAREN53_tree=null;
		Object RPAREN55_tree=null;
		Object set56_tree=null;
		Object LPAREN57_tree=null;
		Object RPAREN59_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:11: ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( TO_DATE LPAREN ! ( anyArg )? RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INDEX_OF:
			case LAST_INDEX_OF:
				{
				alt7=1;
				}
				break;
			case TO_DATE:
				{
				alt7=2;
				}
				break;
			case DIVIDE:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:14: ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !
					{
					set48=input.LT(1);
					if ( input.LA(1)==INDEX_OF||input.LA(1)==LAST_INDEX_OF ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set48));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN49=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum432); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum435);
					anyArg50=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg50.getTree());

					RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum437); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:6: ( TO_DATE LPAREN ! ( anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:6: ( TO_DATE LPAREN ! ( anyArg )? RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:7: TO_DATE LPAREN ! ( anyArg )? RPAREN !
					{
					TO_DATE52=(Token)match(input,TO_DATE,FOLLOW_TO_DATE_in_oneArgNum449); 
					TO_DATE52_tree = (Object)adaptor.create(TO_DATE52);
					adaptor.addChild(root_0, TO_DATE52_tree);

					LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum451); 
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:23: ( anyArg )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==AND||LA6_0==APPEND||(LA6_0 >= CONTAINS && LA6_0 <= DOLLAR)||(LA6_0 >= ENDS_WITH && LA6_0 <= EQUALS_IGNORE_CASE)||(LA6_0 >= FALSE && LA6_0 <= GREATER_THAN_OR_EQUAL)||LA6_0==INDEX_OF||(LA6_0 >= IS_EMPTY && LA6_0 <= LAST_INDEX_OF)||(LA6_0 >= LENGTH && LA6_0 <= LESS_THAN_OR_EQUAL)||(LA6_0 >= MATCHES && LA6_0 <= MULTIPLY)||(LA6_0 >= NOT && LA6_0 <= NOT_NULL)||(LA6_0 >= NUMBER && LA6_0 <= PREPEND)||(LA6_0 >= REPLACE && LA6_0 <= REPLACE_NULL)||(LA6_0 >= STARTS_WITH && LA6_0 <= TO_DATE)||(LA6_0 >= TO_LOWER && LA6_0 <= URL_ENCODE)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:23: anyArg
							{
							pushFollow(FOLLOW_anyArg_in_oneArgNum454);
							anyArg54=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg54.getTree());

							}
							break;

					}

					RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum457); 
					}

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:7: ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !
					{
					set56=input.LT(1);
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MINUS && input.LA(1) <= MULTIPLY)||input.LA(1)==PLUS ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set56));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum489); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum492);
					anyArg58=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg58.getTree());

					RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum494); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgNum"


	public static class stringFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:1: stringFunctionRef : ( zeroArgString | oneArgString | twoArgString );
	public final AttributeExpressionParser.stringFunctionRef_return stringFunctionRef() throws RecognitionException {
		AttributeExpressionParser.stringFunctionRef_return retval = new AttributeExpressionParser.stringFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgString60 =null;
		ParserRuleReturnScope oneArgString61 =null;
		ParserRuleReturnScope twoArgString62 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:19: ( zeroArgString | oneArgString | twoArgString )
			int alt8=3;
			switch ( input.LA(1) ) {
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt8=1;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FORMAT:
			case JOIN:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt8=2;
				}
				break;
			case REPLACE:
			case REPLACE_ALL:
			case SUBSTRING:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:21: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringFunctionRef504);
					zeroArgString60=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString60.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:37: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringFunctionRef508);
					oneArgString61=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString61.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:52: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringFunctionRef512);
					twoArgString62=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString62.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringFunctionRef"


	public static class booleanFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:99:1: booleanFunctionRef : ( zeroArgBool | oneArgBool );
	public final AttributeExpressionParser.booleanFunctionRef_return booleanFunctionRef() throws RecognitionException {
		AttributeExpressionParser.booleanFunctionRef_return retval = new AttributeExpressionParser.booleanFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgBool63 =null;
		ParserRuleReturnScope oneArgBool64 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:99:20: ( zeroArgBool | oneArgBool )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= IS_EMPTY && LA9_0 <= IS_NULL)||(LA9_0 >= NOT && LA9_0 <= NOT_NULL)) ) {
				alt9=1;
			}
			else if ( (LA9_0==AND||(LA9_0 >= EQUALS && LA9_0 <= EQUALS_IGNORE_CASE)||LA9_0==FIND||(LA9_0 >= GREATER_THAN && LA9_0 <= GREATER_THAN_OR_EQUAL)||(LA9_0 >= LESS_THAN && LA9_0 <= LESS_THAN_OR_EQUAL)||LA9_0==MATCHES||LA9_0==OR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:99:22: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_booleanFunctionRef519);
					zeroArgBool63=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool63.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:99:36: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_booleanFunctionRef523);
					oneArgBool64=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool64.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanFunctionRef"


	public static class numberFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numberFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:1: numberFunctionRef : ( zeroArgNum | oneArgNum );
	public final AttributeExpressionParser.numberFunctionRef_return numberFunctionRef() throws RecognitionException {
		AttributeExpressionParser.numberFunctionRef_return retval = new AttributeExpressionParser.numberFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgNum65 =null;
		ParserRuleReturnScope oneArgNum66 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:19: ( zeroArgNum | oneArgNum )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==COUNT||LA10_0==LENGTH||LA10_0==TO_NUMBER) ) {
				alt10=1;
			}
			else if ( (LA10_0==DIVIDE||LA10_0==INDEX_OF||LA10_0==LAST_INDEX_OF||(LA10_0 >= MINUS && LA10_0 <= MULTIPLY)||LA10_0==PLUS||LA10_0==TO_DATE) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:21: zeroArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgNum_in_numberFunctionRef530);
					zeroArgNum65=zeroArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgNum65.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:34: oneArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgNum_in_numberFunctionRef534);
					oneArgNum66=oneArgNum();
					state._fsp--;

					adaptor.addChild(root_0, oneArgNum66.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numberFunctionRef"


	public static class anyArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "anyArg"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:1: anyArg : ( NUMBER | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | booleanLiteral | zeroArgBool | oneArgBool | expression );
	public final AttributeExpressionParser.anyArg_return anyArg() throws RecognitionException {
		AttributeExpressionParser.anyArg_return retval = new AttributeExpressionParser.anyArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER67=null;
		Token STRING_LITERAL69=null;
		ParserRuleReturnScope numberFunctionRef68 =null;
		ParserRuleReturnScope zeroArgString70 =null;
		ParserRuleReturnScope oneArgString71 =null;
		ParserRuleReturnScope twoArgString72 =null;
		ParserRuleReturnScope booleanLiteral73 =null;
		ParserRuleReturnScope zeroArgBool74 =null;
		ParserRuleReturnScope oneArgBool75 =null;
		ParserRuleReturnScope expression76 =null;

		Object NUMBER67_tree=null;
		Object STRING_LITERAL69_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:8: ( NUMBER | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | booleanLiteral | zeroArgBool | oneArgBool | expression )
			int alt11=10;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt11=1;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_NUMBER:
				{
				alt11=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt11=3;
				}
				break;
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt11=4;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FORMAT:
			case JOIN:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt11=5;
				}
				break;
			case REPLACE:
			case REPLACE_ALL:
			case SUBSTRING:
				{
				alt11=6;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt11=7;
				}
				break;
			case IS_EMPTY:
			case IS_NULL:
			case NOT:
			case NOT_NULL:
				{
				alt11=8;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case OR:
				{
				alt11=9;
				}
				break;
			case DOLLAR:
				{
				alt11=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:10: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER67=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_anyArg542); 
					NUMBER67_tree = (Object)adaptor.create(NUMBER67);
					adaptor.addChild(root_0, NUMBER67_tree);

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:19: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_anyArg546);
					numberFunctionRef68=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef68.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:39: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL69=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_anyArg550); 
					STRING_LITERAL69_tree = (Object)adaptor.create(STRING_LITERAL69);
					adaptor.addChild(root_0, STRING_LITERAL69_tree);

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:56: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_anyArg554);
					zeroArgString70=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString70.getTree());

					}
					break;
				case 5 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:72: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_anyArg558);
					oneArgString71=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString71.getTree());

					}
					break;
				case 6 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:87: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_anyArg562);
					twoArgString72=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString72.getTree());

					}
					break;
				case 7 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:102: booleanLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_anyArg566);
					booleanLiteral73=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral73.getTree());

					}
					break;
				case 8 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:119: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_anyArg570);
					zeroArgBool74=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool74.getTree());

					}
					break;
				case 9 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:133: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_anyArg574);
					oneArgBool75=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool75.getTree());

					}
					break;
				case 10 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:146: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_anyArg578);
					expression76=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression76.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "anyArg"


	public static class stringArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringArg"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:1: stringArg : ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression );
	public final AttributeExpressionParser.stringArg_return stringArg() throws RecognitionException {
		AttributeExpressionParser.stringArg_return retval = new AttributeExpressionParser.stringArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL77=null;
		ParserRuleReturnScope zeroArgString78 =null;
		ParserRuleReturnScope oneArgString79 =null;
		ParserRuleReturnScope twoArgString80 =null;
		ParserRuleReturnScope expression81 =null;

		Object STRING_LITERAL77_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:11: ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression )
			int alt12=5;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt12=1;
				}
				break;
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt12=2;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FORMAT:
			case JOIN:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt12=3;
				}
				break;
			case REPLACE:
			case REPLACE_ALL:
			case SUBSTRING:
				{
				alt12=4;
				}
				break;
			case DOLLAR:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:13: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL77=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringArg585); 
					STRING_LITERAL77_tree = (Object)adaptor.create(STRING_LITERAL77);
					adaptor.addChild(root_0, STRING_LITERAL77_tree);

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:30: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringArg589);
					zeroArgString78=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString78.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:46: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringArg593);
					oneArgString79=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString79.getTree());

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:61: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringArg597);
					twoArgString80=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString80.getTree());

					}
					break;
				case 5 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:103:76: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_stringArg601);
					expression81=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression81.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringArg"


	public static class functionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:1: functionRef : ( stringFunctionRef | booleanFunctionRef | numberFunctionRef );
	public final AttributeExpressionParser.functionRef_return functionRef() throws RecognitionException {
		AttributeExpressionParser.functionRef_return retval = new AttributeExpressionParser.functionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stringFunctionRef82 =null;
		ParserRuleReturnScope booleanFunctionRef83 =null;
		ParserRuleReturnScope numberFunctionRef84 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:13: ( stringFunctionRef | booleanFunctionRef | numberFunctionRef )
			int alt13=3;
			switch ( input.LA(1) ) {
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FORMAT:
			case JOIN:
			case PREPEND:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_LOWER:
			case TO_RADIX:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt13=1;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case IS_EMPTY:
			case IS_NULL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case NOT:
			case NOT_NULL:
			case OR:
				{
				alt13=2;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_NUMBER:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:15: stringFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_stringFunctionRef_in_functionRef608);
					stringFunctionRef82=stringFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, stringFunctionRef82.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:35: booleanFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanFunctionRef_in_functionRef612);
					booleanFunctionRef83=booleanFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, booleanFunctionRef83.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:56: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_functionRef616);
					numberFunctionRef84=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef84.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionRef"


	public static class subject_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subject"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:109:1: subject : ( attrName | expression );
	public final AttributeExpressionParser.subject_return subject() throws RecognitionException {
		AttributeExpressionParser.subject_return retval = new AttributeExpressionParser.subject_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attrName85 =null;
		ParserRuleReturnScope expression86 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:109:9: ( attrName | expression )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ALL_ATTRIBUTES && LA14_0 <= ALL_MATCHING_ATTRIBUTES)||(LA14_0 >= ANY_ATTRIBUTE && LA14_0 <= ANY_MATCHING_ATTRIBUTE)||LA14_0==ATTRIBUTE_NAME||LA14_0==STRING_LITERAL) ) {
				alt14=1;
			}
			else if ( (LA14_0==DOLLAR) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:109:11: attrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attrName_in_subject627);
					attrName85=attrName();
					state._fsp--;

					adaptor.addChild(root_0, attrName85.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:109:22: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_subject631);
					expression86=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression86.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subject"


	public static class attrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:110:1: attrName : ( singleAttrName | multiAttrName );
	public final AttributeExpressionParser.attrName_return attrName() throws RecognitionException {
		AttributeExpressionParser.attrName_return retval = new AttributeExpressionParser.attrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrName87 =null;
		ParserRuleReturnScope multiAttrName88 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:110:10: ( singleAttrName | multiAttrName )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ATTRIBUTE_NAME||LA15_0==STRING_LITERAL) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ALL_ATTRIBUTES && LA15_0 <= ALL_MATCHING_ATTRIBUTES)||(LA15_0 >= ANY_ATTRIBUTE && LA15_0 <= ANY_MATCHING_ATTRIBUTE)) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:110:12: singleAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_singleAttrName_in_attrName638);
					singleAttrName87=singleAttrName();
					state._fsp--;

					adaptor.addChild(root_0, singleAttrName87.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:110:29: multiAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiAttrName_in_attrName642);
					multiAttrName88=multiAttrName();
					state._fsp--;

					adaptor.addChild(root_0, multiAttrName88.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrName"


	public static class singleAttrRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:1: singleAttrRef : ( ATTRIBUTE_NAME | STRING_LITERAL );
	public final AttributeExpressionParser.singleAttrRef_return singleAttrRef() throws RecognitionException {
		AttributeExpressionParser.singleAttrRef_return retval = new AttributeExpressionParser.singleAttrRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set89=null;

		Object set89_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:15: ( ATTRIBUTE_NAME | STRING_LITERAL )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set89=input.LT(1);
			if ( input.LA(1)==ATTRIBUTE_NAME||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set89));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrRef"


	public static class singleAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:113:1: singleAttrName : singleAttrRef -> ^( ATTR_NAME singleAttrRef ) ;
	public final AttributeExpressionParser.singleAttrName_return singleAttrName() throws RecognitionException {
		AttributeExpressionParser.singleAttrName_return retval = new AttributeExpressionParser.singleAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrRef90 =null;

		RewriteRuleSubtreeStream stream_singleAttrRef=new RewriteRuleSubtreeStream(adaptor,"rule singleAttrRef");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:113:16: ( singleAttrRef -> ^( ATTR_NAME singleAttrRef ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:113:18: singleAttrRef
			{
			pushFollow(FOLLOW_singleAttrRef_in_singleAttrName661);
			singleAttrRef90=singleAttrRef();
			state._fsp--;

			stream_singleAttrRef.add(singleAttrRef90.getTree());
			// AST REWRITE
			// elements: singleAttrRef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 113:32: -> ^( ATTR_NAME singleAttrRef )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:114:2: ^( ATTR_NAME singleAttrRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTR_NAME, "ATTR_NAME"), root_1);
				adaptor.addChild(root_1, stream_singleAttrRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrName"


	public static class multiAttrFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:117:1: multiAttrFunction : ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES );
	public final AttributeExpressionParser.multiAttrFunction_return multiAttrFunction() throws RecognitionException {
		AttributeExpressionParser.multiAttrFunction_return retval = new AttributeExpressionParser.multiAttrFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set91=null;

		Object set91_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:117:19: ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set91=input.LT(1);
			if ( (input.LA(1) >= ALL_ATTRIBUTES && input.LA(1) <= ALL_MATCHING_ATTRIBUTES)||(input.LA(1) >= ANY_ATTRIBUTE && input.LA(1) <= ANY_MATCHING_ATTRIBUTE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set91));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrFunction"


	public static class multiAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:118:1: multiAttrName : multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) ;
	public final AttributeExpressionParser.multiAttrName_return multiAttrName() throws RecognitionException {
		AttributeExpressionParser.multiAttrName_return retval = new AttributeExpressionParser.multiAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN93=null;
		Token COMMA95=null;
		Token RPAREN97=null;
		ParserRuleReturnScope multiAttrFunction92 =null;
		ParserRuleReturnScope stringArg94 =null;
		ParserRuleReturnScope stringArg96 =null;

		Object LPAREN93_tree=null;
		Object COMMA95_tree=null;
		Object RPAREN97_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_multiAttrFunction=new RewriteRuleSubtreeStream(adaptor,"rule multiAttrFunction");
		RewriteRuleSubtreeStream stream_stringArg=new RewriteRuleSubtreeStream(adaptor,"rule stringArg");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:118:15: ( multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:118:17: multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN
			{
			pushFollow(FOLLOW_multiAttrFunction_in_multiAttrName707);
			multiAttrFunction92=multiAttrFunction();
			state._fsp--;

			stream_multiAttrFunction.add(multiAttrFunction92.getTree());
			LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_multiAttrName709);  
			stream_LPAREN.add(LPAREN93);

			pushFollow(FOLLOW_stringArg_in_multiAttrName711);
			stringArg94=stringArg();
			state._fsp--;

			stream_stringArg.add(stringArg94.getTree());
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:118:52: ( COMMA stringArg )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:118:53: COMMA stringArg
					{
					COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiAttrName714);  
					stream_COMMA.add(COMMA95);

					pushFollow(FOLLOW_stringArg_in_multiAttrName716);
					stringArg96=stringArg();
					state._fsp--;

					stream_stringArg.add(stringArg96.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_multiAttrName720);  
			stream_RPAREN.add(RPAREN97);

			// AST REWRITE
			// elements: stringArg, multiAttrFunction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:78: -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:119:2: ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTI_ATTRIBUTE_REFERENCE, "MULTI_ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_multiAttrFunction.nextTree());
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:119:48: ( stringArg )*
				while ( stream_stringArg.hasNext() ) {
					adaptor.addChild(root_1, stream_stringArg.nextTree());
				}
				stream_stringArg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrName"


	public static class attributeRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:121:1: attributeRef : subject -> ^( ATTRIBUTE_REFERENCE subject ) ;
	public final AttributeExpressionParser.attributeRef_return attributeRef() throws RecognitionException {
		AttributeExpressionParser.attributeRef_return retval = new AttributeExpressionParser.attributeRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope subject98 =null;

		RewriteRuleSubtreeStream stream_subject=new RewriteRuleSubtreeStream(adaptor,"rule subject");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:121:14: ( subject -> ^( ATTRIBUTE_REFERENCE subject ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:121:16: subject
			{
			pushFollow(FOLLOW_subject_in_attributeRef740);
			subject98=subject();
			state._fsp--;

			stream_subject.add(subject98.getTree());
			// AST REWRITE
			// elements: subject
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:24: -> ^( ATTRIBUTE_REFERENCE subject )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:122:2: ^( ATTRIBUTE_REFERENCE subject )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_REFERENCE, "ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_subject.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRef"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:125:1: functionCall : functionRef -> ^( FUNCTION_CALL functionRef ) ;
	public final AttributeExpressionParser.functionCall_return functionCall() throws RecognitionException {
		AttributeExpressionParser.functionCall_return retval = new AttributeExpressionParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope functionRef99 =null;

		RewriteRuleSubtreeStream stream_functionRef=new RewriteRuleSubtreeStream(adaptor,"rule functionRef");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:125:14: ( functionRef -> ^( FUNCTION_CALL functionRef ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:125:16: functionRef
			{
			pushFollow(FOLLOW_functionRef_in_functionCall759);
			functionRef99=functionRef();
			state._fsp--;

			stream_functionRef.add(functionRef99.getTree());
			// AST REWRITE
			// elements: functionRef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:28: -> ^( FUNCTION_CALL functionRef )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:126:2: ^( FUNCTION_CALL functionRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);
				adaptor.addChild(root_1, stream_functionRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:128:1: booleanLiteral : ( TRUE | FALSE );
	public final AttributeExpressionParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		AttributeExpressionParser.booleanLiteral_return retval = new AttributeExpressionParser.booleanLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set100=null;

		Object set100_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:128:16: ( TRUE | FALSE )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set100=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set100));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class zeroArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgStandaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:129:1: zeroArgStandaloneFunction : ( IP | UUID | NOW | NEXT_INT | HOSTNAME ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgStandaloneFunction_return zeroArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.zeroArgStandaloneFunction_return retval = new AttributeExpressionParser.zeroArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set101=null;
		Token LPAREN102=null;
		Token RPAREN103=null;

		Object set101_tree=null;
		Object LPAREN102_tree=null;
		Object RPAREN103_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:129:27: ( ( IP | UUID | NOW | NEXT_INT | HOSTNAME ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:129:29: ( IP | UUID | NOW | NEXT_INT | HOSTNAME ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set101=input.LT(1);
			if ( input.LA(1)==HOSTNAME||input.LA(1)==IP||input.LA(1)==NEXT_INT||input.LA(1)==NOW||input.LA(1)==UUID ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set101));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgStandaloneFunction807); 
			RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgStandaloneFunction810); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgStandaloneFunction"


	public static class oneArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgStandaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:1: oneArgStandaloneFunction : ( ( TO_LITERAL ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) );
	public final AttributeExpressionParser.oneArgStandaloneFunction_return oneArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.oneArgStandaloneFunction_return retval = new AttributeExpressionParser.oneArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO_LITERAL104=null;
		Token LPAREN105=null;
		Token RPAREN107=null;
		Token HOSTNAME108=null;
		Token LPAREN109=null;
		Token RPAREN111=null;
		ParserRuleReturnScope anyArg106 =null;
		ParserRuleReturnScope booleanLiteral110 =null;

		Object TO_LITERAL104_tree=null;
		Object LPAREN105_tree=null;
		Object RPAREN107_tree=null;
		Object HOSTNAME108_tree=null;
		Object LPAREN109_tree=null;
		Object RPAREN111_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:26: ( ( TO_LITERAL ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TO_LITERAL) ) {
				alt17=1;
			}
			else if ( (LA17_0==HOSTNAME) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:28: ( TO_LITERAL ^ LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:28: ( TO_LITERAL ^ LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:29: TO_LITERAL ^ LPAREN ! anyArg RPAREN !
					{
					TO_LITERAL104=(Token)match(input,TO_LITERAL,FOLLOW_TO_LITERAL_in_oneArgStandaloneFunction819); 
					TO_LITERAL104_tree = (Object)adaptor.create(TO_LITERAL104);
					root_0 = (Object)adaptor.becomeRoot(TO_LITERAL104_tree, root_0);

					LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction822); 
					pushFollow(FOLLOW_anyArg_in_oneArgStandaloneFunction825);
					anyArg106=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg106.getTree());

					RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction827); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:29: HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !
					{
					HOSTNAME108=(Token)match(input,HOSTNAME,FOLLOW_HOSTNAME_in_oneArgStandaloneFunction862); 
					HOSTNAME108_tree = (Object)adaptor.create(HOSTNAME108);
					root_0 = (Object)adaptor.becomeRoot(HOSTNAME108_tree, root_0);

					LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction865); 
					pushFollow(FOLLOW_booleanLiteral_in_oneArgStandaloneFunction868);
					booleanLiteral110=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral110.getTree());

					RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction870); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgStandaloneFunction"


	public static class standaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "standaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:1: standaloneFunction : ( zeroArgStandaloneFunction | oneArgStandaloneFunction );
	public final AttributeExpressionParser.standaloneFunction_return standaloneFunction() throws RecognitionException {
		AttributeExpressionParser.standaloneFunction_return retval = new AttributeExpressionParser.standaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgStandaloneFunction112 =null;
		ParserRuleReturnScope oneArgStandaloneFunction113 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:20: ( zeroArgStandaloneFunction | oneArgStandaloneFunction )
			int alt18=2;
			switch ( input.LA(1) ) {
			case HOSTNAME:
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1==LPAREN) ) {
					int LA18_4 = input.LA(3);
					if ( (LA18_4==RPAREN) ) {
						alt18=1;
					}
					else if ( (LA18_4==FALSE||LA18_4==TRUE) ) {
						alt18=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TO_LITERAL:
				{
				alt18=2;
				}
				break;
			case IP:
			case NEXT_INT:
			case NOW:
			case UUID:
				{
				alt18=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:22: zeroArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction879);
					zeroArgStandaloneFunction112=zeroArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgStandaloneFunction112.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:50: oneArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgStandaloneFunction_in_standaloneFunction883);
					oneArgStandaloneFunction113=oneArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, oneArgStandaloneFunction113.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "standaloneFunction"


	public static class attributeRefOrFunctionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRefOrFunctionCall"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:1: attributeRefOrFunctionCall : ( attributeRef | standaloneFunction ) ;
	public final AttributeExpressionParser.attributeRefOrFunctionCall_return attributeRefOrFunctionCall() throws RecognitionException {
		AttributeExpressionParser.attributeRefOrFunctionCall_return retval = new AttributeExpressionParser.attributeRefOrFunctionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attributeRef114 =null;
		ParserRuleReturnScope standaloneFunction115 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:28: ( ( attributeRef | standaloneFunction ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:30: ( attributeRef | standaloneFunction )
			{
			root_0 = (Object)adaptor.nil();


			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:30: ( attributeRef | standaloneFunction )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= ALL_ATTRIBUTES && LA19_0 <= ALL_MATCHING_ATTRIBUTES)||(LA19_0 >= ANY_ATTRIBUTE && LA19_0 <= ANY_MATCHING_ATTRIBUTE)||LA19_0==ATTRIBUTE_NAME||LA19_0==DOLLAR||LA19_0==STRING_LITERAL) ) {
				alt19=1;
			}
			else if ( (LA19_0==HOSTNAME||LA19_0==IP||LA19_0==NEXT_INT||LA19_0==NOW||LA19_0==TO_LITERAL||LA19_0==UUID) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:31: attributeRef
					{
					pushFollow(FOLLOW_attributeRef_in_attributeRefOrFunctionCall892);
					attributeRef114=attributeRef();
					state._fsp--;

					adaptor.addChild(root_0, attributeRef114.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:46: standaloneFunction
					{
					pushFollow(FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall896);
					standaloneFunction115=standaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, standaloneFunction115.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRefOrFunctionCall"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:1: expression : DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) ;
	public final AttributeExpressionParser.expression_return expression() throws RecognitionException {
		AttributeExpressionParser.expression_return retval = new AttributeExpressionParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOLLAR116=null;
		Token LBRACE117=null;
		Token COLON119=null;
		Token RBRACE121=null;
		ParserRuleReturnScope attributeRefOrFunctionCall118 =null;
		ParserRuleReturnScope functionCall120 =null;

		Object DOLLAR116_tree=null;
		Object LBRACE117_tree=null;
		Object COLON119_tree=null;
		Object RBRACE121_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_attributeRefOrFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule attributeRefOrFunctionCall");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:12: ( DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:14: DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE
			{
			DOLLAR116=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_expression905);  
			stream_DOLLAR.add(DOLLAR116);

			LBRACE117=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_expression907);  
			stream_LBRACE.add(LBRACE117);

			pushFollow(FOLLOW_attributeRefOrFunctionCall_in_expression909);
			attributeRefOrFunctionCall118=attributeRefOrFunctionCall();
			state._fsp--;

			stream_attributeRefOrFunctionCall.add(attributeRefOrFunctionCall118.getTree());
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:55: ( COLON functionCall )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COLON) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:56: COLON functionCall
					{
					COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_expression912);  
					stream_COLON.add(COLON119);

					pushFollow(FOLLOW_functionCall_in_expression914);
					functionCall120=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall120.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			RBRACE121=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_expression918);  
			stream_RBRACE.add(RBRACE121);

			// AST REWRITE
			// elements: attributeRefOrFunctionCall, functionCall
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 136:84: -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:137:2: ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_attributeRefOrFunctionCall.nextTree());
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:137:42: ( functionCall )*
				while ( stream_functionCall.hasNext() ) {
					adaptor.addChild(root_1, stream_functionCall.nextTree());
				}
				stream_functionCall.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:139:1: query : expression EOF -> ^( QUERY expression ) ;
	public final AttributeExpressionParser.query_return query() throws RecognitionException {
		AttributeExpressionParser.query_return retval = new AttributeExpressionParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF123=null;
		ParserRuleReturnScope expression122 =null;

		Object EOF123_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:139:7: ( expression EOF -> ^( QUERY expression ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:139:9: expression EOF
			{
			pushFollow(FOLLOW_expression_in_query938);
			expression122=expression();
			state._fsp--;

			stream_expression.add(expression122.getTree());
			EOF123=(Token)match(input,EOF,FOLLOW_EOF_in_query940);  
			stream_EOF.add(EOF123);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:24: -> ^( QUERY expression )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:140:2: ^( QUERY expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_zeroArgString77 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgString101 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgString104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgString113 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString169 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString172 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_RADIX_in_oneArgString187 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString189 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString192 = new BitSet(new long[]{0x0800000000004000L});
	public static final BitSet FOLLOW_COMMA_in_oneArgString195 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString198 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_twoArgString212 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString220 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString223 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString225 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString228 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBSTRING_in_twoArgString243 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString245 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString248 = new BitSet(new long[]{0x0800000000004000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString251 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString254 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgBool270 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgBool286 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgBool289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool298 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool310 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool313 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool326 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool342 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool345 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_oneArgBool358 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool361 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool364 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool376 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool384 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool387 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgNum400 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgNum412 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgNum415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum424 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum432 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum435 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_DATE_in_oneArgNum449 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum451 = new BitSet(new long[]{0xEFBDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum454 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum469 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum489 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum492 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringFunctionRef504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringFunctionRef508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringFunctionRef512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_booleanFunctionRef519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_booleanFunctionRef523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgNum_in_numberFunctionRef530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgNum_in_numberFunctionRef534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_anyArg542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_anyArg546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_anyArg550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_anyArg554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_anyArg558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_anyArg562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_anyArg566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_anyArg570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_anyArg574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_anyArg578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_stringArg585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringArg589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringArg593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringArg597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stringArg601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringFunctionRef_in_functionRef608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanFunctionRef_in_functionRef612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_functionRef616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrName_in_subject627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_subject631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrName_in_attrName638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrName_in_attrName642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrRef_in_singleAttrName661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrFunction_in_multiAttrName707 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_multiAttrName709 = new BitSet(new long[]{0xE7A0000808290800L,0x0000000000006F4FL});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName711 = new BitSet(new long[]{0x0800000000004000L});
	public static final BitSet FOLLOW_COMMA_in_multiAttrName714 = new BitSet(new long[]{0xE7A0000808290800L,0x0000000000006F4FL});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName716 = new BitSet(new long[]{0x0800000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_multiAttrName720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subject_in_attributeRef740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionRef_in_functionCall759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgStandaloneFunction787 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgStandaloneFunction807 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgStandaloneFunction810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_LITERAL_in_oneArgStandaloneFunction819 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction822 = new BitSet(new long[]{0xE7BDBDDEBEEF0880L,0x0000000000007FDFL});
	public static final BitSet FOLLOW_anyArg_in_oneArgStandaloneFunction825 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOSTNAME_in_oneArgStandaloneFunction862 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction865 = new BitSet(new long[]{0x0000000002000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_booleanLiteral_in_oneArgStandaloneFunction868 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgStandaloneFunction_in_standaloneFunction883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeRef_in_attributeRefOrFunctionCall892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_in_expression905 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LBRACE_in_expression907 = new BitSet(new long[]{0x4002400140081770L,0x0000000000008020L});
	public static final BitSet FOLLOW_attributeRefOrFunctionCall_in_expression909 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_COLON_in_expression912 = new BitSet(new long[]{0xA7B9BDDEBCE70880L,0x0000000000006FDFL});
	public static final BitSet FOLLOW_functionCall_in_expression914 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_RBRACE_in_expression918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_query938 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_query940 = new BitSet(new long[]{0x0000000000000002L});
}
