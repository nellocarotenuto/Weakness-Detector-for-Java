// $ANTLR 3.5.2 org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g 2019-10-07 21:49:10

	package org.apache.nifi.hl7.query.antlr;
	import org.apache.nifi.hl7.query.exception.HL7QueryParsingException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HL7QueryParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA_NUMERIC", "AND", "AS", 
		"COLON", "COMMA", "COMMENT", "DECLARE", "DOT", "EQUALS", "ESC", "FALSE", 
		"GE", "GT", "IDENTIFIER", "IS_NULL", "LBRACE", "LE", "LETTER", "LIKE", 
		"LPAREN", "LT", "MESSAGE", "NOT", "NOT_EQUALS", "NOT_NULL", "NUMBER", 
		"OPTIONAL", "OR", "RBRACE", "REGEX", "REQUIRED", "RPAREN", "SEGMENT", 
		"SEGMENT_NAME", "SELECT", "SEMICOLON", "STRING_LITERAL", "TRUE", "WHERE", 
		"WHITESPACE", "DECLARATION", "QUERY"
	};
	public static final int EOF=-1;
	public static final int ALPHA_NUMERIC=4;
	public static final int AND=5;
	public static final int AS=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int DECLARE=10;
	public static final int DOT=11;
	public static final int EQUALS=12;
	public static final int ESC=13;
	public static final int FALSE=14;
	public static final int GE=15;
	public static final int GT=16;
	public static final int IDENTIFIER=17;
	public static final int IS_NULL=18;
	public static final int LBRACE=19;
	public static final int LE=20;
	public static final int LETTER=21;
	public static final int LIKE=22;
	public static final int LPAREN=23;
	public static final int LT=24;
	public static final int MESSAGE=25;
	public static final int NOT=26;
	public static final int NOT_EQUALS=27;
	public static final int NOT_NULL=28;
	public static final int NUMBER=29;
	public static final int OPTIONAL=30;
	public static final int OR=31;
	public static final int RBRACE=32;
	public static final int REGEX=33;
	public static final int REQUIRED=34;
	public static final int RPAREN=35;
	public static final int SEGMENT=36;
	public static final int SEGMENT_NAME=37;
	public static final int SELECT=38;
	public static final int SEMICOLON=39;
	public static final int STRING_LITERAL=40;
	public static final int TRUE=41;
	public static final int WHERE=42;
	public static final int WHITESPACE=43;
	public static final int DECLARATION=44;
	public static final int QUERY=45;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HL7QueryParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HL7QueryParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HL7QueryParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g"; }


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
	    
	    throw new HL7QueryParsingException(sb.toString());
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
	    
	    throw new HL7QueryParsingException(sb.toString());
	  } 


	public static class declareClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declareClause"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:72:1: declareClause : DECLARE ^ declaration ( COMMA ! declaration )* ;
	public final HL7QueryParser.declareClause_return declareClause() throws RecognitionException {
		HL7QueryParser.declareClause_return retval = new HL7QueryParser.declareClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DECLARE1=null;
		Token COMMA3=null;
		ParserRuleReturnScope declaration2 =null;
		ParserRuleReturnScope declaration4 =null;

		Object DECLARE1_tree=null;
		Object COMMA3_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:72:15: ( DECLARE ^ declaration ( COMMA ! declaration )* )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:72:17: DECLARE ^ declaration ( COMMA ! declaration )*
			{
			root_0 = (Object)adaptor.nil();


			DECLARE1=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declareClause58); 
			DECLARE1_tree = (Object)adaptor.create(DECLARE1);
			root_0 = (Object)adaptor.becomeRoot(DECLARE1_tree, root_0);

			pushFollow(FOLLOW_declaration_in_declareClause61);
			declaration2=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration2.getTree());

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:72:38: ( COMMA ! declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==COMMA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:72:39: COMMA ! declaration
					{
					COMMA3=(Token)match(input,COMMA,FOLLOW_COMMA_in_declareClause64); 
					pushFollow(FOLLOW_declaration_in_declareClause67);
					declaration4=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration4.getTree());

					}
					break;

				default :
					break loop1;
				}
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
	// $ANTLR end "declareClause"


	public static class requiredOrOptional_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "requiredOrOptional"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:74:1: requiredOrOptional : ( REQUIRED | OPTIONAL );
	public final HL7QueryParser.requiredOrOptional_return requiredOrOptional() throws RecognitionException {
		HL7QueryParser.requiredOrOptional_return retval = new HL7QueryParser.requiredOrOptional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set5=null;

		Object set5_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:74:20: ( REQUIRED | OPTIONAL )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set5=input.LT(1);
			if ( input.LA(1)==OPTIONAL||input.LA(1)==REQUIRED ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set5));
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
	// $ANTLR end "requiredOrOptional"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:75:1: declaration : IDENTIFIER AS requiredOrOptional SEGMENT_NAME -> ^( DECLARATION IDENTIFIER requiredOrOptional SEGMENT_NAME ) ;
	public final HL7QueryParser.declaration_return declaration() throws RecognitionException {
		HL7QueryParser.declaration_return retval = new HL7QueryParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER6=null;
		Token AS7=null;
		Token SEGMENT_NAME9=null;
		ParserRuleReturnScope requiredOrOptional8 =null;

		Object IDENTIFIER6_tree=null;
		Object AS7_tree=null;
		Object SEGMENT_NAME9_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_SEGMENT_NAME=new RewriteRuleTokenStream(adaptor,"token SEGMENT_NAME");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_requiredOrOptional=new RewriteRuleSubtreeStream(adaptor,"rule requiredOrOptional");

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:75:13: ( IDENTIFIER AS requiredOrOptional SEGMENT_NAME -> ^( DECLARATION IDENTIFIER requiredOrOptional SEGMENT_NAME ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:75:15: IDENTIFIER AS requiredOrOptional SEGMENT_NAME
			{
			IDENTIFIER6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration88);  
			stream_IDENTIFIER.add(IDENTIFIER6);

			AS7=(Token)match(input,AS,FOLLOW_AS_in_declaration90);  
			stream_AS.add(AS7);

			pushFollow(FOLLOW_requiredOrOptional_in_declaration92);
			requiredOrOptional8=requiredOrOptional();
			state._fsp--;

			stream_requiredOrOptional.add(requiredOrOptional8.getTree());
			SEGMENT_NAME9=(Token)match(input,SEGMENT_NAME,FOLLOW_SEGMENT_NAME_in_declaration94);  
			stream_SEGMENT_NAME.add(SEGMENT_NAME9);

			// AST REWRITE
			// elements: IDENTIFIER, requiredOrOptional, SEGMENT_NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:61: -> ^( DECLARATION IDENTIFIER requiredOrOptional SEGMENT_NAME )
			{
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:76:2: ^( DECLARATION IDENTIFIER requiredOrOptional SEGMENT_NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_requiredOrOptional.nextTree());
				adaptor.addChild(root_1, stream_SEGMENT_NAME.nextNode());
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
	// $ANTLR end "declaration"


	public static class selectClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selectClause"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:79:1: selectClause : SELECT ^ selectableClause ;
	public final HL7QueryParser.selectClause_return selectClause() throws RecognitionException {
		HL7QueryParser.selectClause_return retval = new HL7QueryParser.selectClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SELECT10=null;
		ParserRuleReturnScope selectableClause11 =null;

		Object SELECT10_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:79:14: ( SELECT ^ selectableClause )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:79:16: SELECT ^ selectableClause
			{
			root_0 = (Object)adaptor.nil();


			SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause116); 
			SELECT10_tree = (Object)adaptor.create(SELECT10);
			root_0 = (Object)adaptor.becomeRoot(SELECT10_tree, root_0);

			pushFollow(FOLLOW_selectableClause_in_selectClause119);
			selectableClause11=selectableClause();
			state._fsp--;

			adaptor.addChild(root_0, selectableClause11.getTree());

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
	// $ANTLR end "selectClause"


	public static class selectableClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selectableClause"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:80:1: selectableClause : selectable ( COMMA ! selectable )* ;
	public final HL7QueryParser.selectableClause_return selectableClause() throws RecognitionException {
		HL7QueryParser.selectableClause_return retval = new HL7QueryParser.selectableClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA13=null;
		ParserRuleReturnScope selectable12 =null;
		ParserRuleReturnScope selectable14 =null;

		Object COMMA13_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:80:18: ( selectable ( COMMA ! selectable )* )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:80:20: selectable ( COMMA ! selectable )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_selectable_in_selectableClause126);
			selectable12=selectable();
			state._fsp--;

			adaptor.addChild(root_0, selectable12.getTree());

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:80:31: ( COMMA ! selectable )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:80:32: COMMA ! selectable
					{
					COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectableClause129); 
					pushFollow(FOLLOW_selectable_in_selectableClause132);
					selectable14=selectable();
					state._fsp--;

					adaptor.addChild(root_0, selectable14.getTree());

					}
					break;

				default :
					break loop2;
				}
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
	// $ANTLR end "selectableClause"


	public static class selectable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selectable"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:1: selectable : ( MESSAGE | ref | field ) ^ ( AS ! IDENTIFIER ^)? ;
	public final HL7QueryParser.selectable_return selectable() throws RecognitionException {
		HL7QueryParser.selectable_return retval = new HL7QueryParser.selectable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MESSAGE15=null;
		Token AS18=null;
		Token IDENTIFIER19=null;
		ParserRuleReturnScope ref16 =null;
		ParserRuleReturnScope field17 =null;

		Object MESSAGE15_tree=null;
		Object AS18_tree=null;
		Object IDENTIFIER19_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:12: ( ( MESSAGE | ref | field ) ^ ( AS ! IDENTIFIER ^)? )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:14: ( MESSAGE | ref | field ) ^ ( AS ! IDENTIFIER ^)?
			{
			root_0 = (Object)adaptor.nil();


			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:14: ( MESSAGE | ref | field )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MESSAGE) ) {
				alt3=1;
			}
			else if ( (LA3_0==IDENTIFIER||LA3_0==SEGMENT_NAME) ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2==EOF||LA3_2==AS||LA3_2==COMMA||LA3_2==WHERE) ) {
					alt3=2;
				}
				else if ( (LA3_2==DOT) ) {
					alt3=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:15: MESSAGE
					{
					MESSAGE15=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_selectable142); 
					MESSAGE15_tree = (Object)adaptor.create(MESSAGE15);
					adaptor.addChild(root_0, MESSAGE15_tree);

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:25: ref
					{
					pushFollow(FOLLOW_ref_in_selectable146);
					ref16=ref();
					state._fsp--;

					adaptor.addChild(root_0, ref16.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:31: field
					{
					pushFollow(FOLLOW_field_in_selectable150);
					field17=field();
					state._fsp--;

					adaptor.addChild(root_0, field17.getTree());

					}
					break;

			}

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:39: ( AS ! IDENTIFIER ^)?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==AS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:81:40: AS ! IDENTIFIER ^
					{
					AS18=(Token)match(input,AS,FOLLOW_AS_in_selectable155); 
					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selectable158); 
					IDENTIFIER19_tree = (Object)adaptor.create(IDENTIFIER19);
					root_0 = (Object)adaptor.becomeRoot(IDENTIFIER19_tree, root_0);

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
	// $ANTLR end "selectable"


	public static class whereClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whereClause"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:84:1: whereClause : WHERE ^ conditions ;
	public final HL7QueryParser.whereClause_return whereClause() throws RecognitionException {
		HL7QueryParser.whereClause_return retval = new HL7QueryParser.whereClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHERE20=null;
		ParserRuleReturnScope conditions21 =null;

		Object WHERE20_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:84:13: ( WHERE ^ conditions )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:84:15: WHERE ^ conditions
			{
			root_0 = (Object)adaptor.nil();


			WHERE20=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause170); 
			WHERE20_tree = (Object)adaptor.create(WHERE20);
			root_0 = (Object)adaptor.becomeRoot(WHERE20_tree, root_0);

			pushFollow(FOLLOW_conditions_in_whereClause173);
			conditions21=conditions();
			state._fsp--;

			adaptor.addChild(root_0, conditions21.getTree());

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
	// $ANTLR end "whereClause"


	public static class conditions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditions"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:1: conditions : condition ( ( AND ^| OR ^) condition )* ;
	public final HL7QueryParser.conditions_return conditions() throws RecognitionException {
		HL7QueryParser.conditions_return retval = new HL7QueryParser.conditions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND23=null;
		Token OR24=null;
		ParserRuleReturnScope condition22 =null;
		ParserRuleReturnScope condition25 =null;

		Object AND23_tree=null;
		Object OR24_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:12: ( condition ( ( AND ^| OR ^) condition )* )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:14: condition ( ( AND ^| OR ^) condition )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condition_in_conditions181);
			condition22=condition();
			state._fsp--;

			adaptor.addChild(root_0, condition22.getTree());

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:24: ( ( AND ^| OR ^) condition )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:25: ( AND ^| OR ^) condition
					{
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:25: ( AND ^| OR ^)
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND) ) {
						alt5=1;
					}
					else if ( (LA5_0==OR) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:26: AND ^
							{
							AND23=(Token)match(input,AND,FOLLOW_AND_in_conditions185); 
							AND23_tree = (Object)adaptor.create(AND23);
							root_0 = (Object)adaptor.becomeRoot(AND23_tree, root_0);

							}
							break;
						case 2 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:86:33: OR ^
							{
							OR24=(Token)match(input,OR,FOLLOW_OR_in_conditions190); 
							OR24_tree = (Object)adaptor.create(OR24);
							root_0 = (Object)adaptor.becomeRoot(OR24_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_condition_in_conditions194);
					condition25=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition25.getTree());

					}
					break;

				default :
					break loop6;
				}
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
	// $ANTLR end "conditions"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:88:1: condition : ( NOT ^ condition | LPAREN ! conditions RPAREN !| evaluation );
	public final HL7QueryParser.condition_return condition() throws RecognitionException {
		HL7QueryParser.condition_return retval = new HL7QueryParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT26=null;
		Token LPAREN28=null;
		Token RPAREN30=null;
		ParserRuleReturnScope condition27 =null;
		ParserRuleReturnScope conditions29 =null;
		ParserRuleReturnScope evaluation31 =null;

		Object NOT26_tree=null;
		Object LPAREN28_tree=null;
		Object RPAREN30_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:88:11: ( NOT ^ condition | LPAREN ! conditions RPAREN !| evaluation )
			int alt7=3;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt7=1;
				}
				break;
			case LPAREN:
				{
				switch ( input.LA(2) ) {
				case LPAREN:
				case NOT:
					{
					alt7=2;
					}
					break;
				case IDENTIFIER:
				case SEGMENT_NAME:
					{
					switch ( input.LA(3) ) {
					case EQUALS:
					case GE:
					case GT:
					case IS_NULL:
					case LE:
					case LT:
					case NOT_EQUALS:
					case NOT_NULL:
						{
						alt7=2;
						}
						break;
					case DOT:
						{
						int LA7_8 = input.LA(4);
						if ( (LA7_8==NUMBER) ) {
							switch ( input.LA(5) ) {
							case DOT:
								{
								int LA7_10 = input.LA(6);
								if ( (LA7_10==NUMBER) ) {
									switch ( input.LA(7) ) {
									case DOT:
										{
										int LA7_12 = input.LA(8);
										if ( (LA7_12==NUMBER) ) {
											switch ( input.LA(9) ) {
											case DOT:
												{
												int LA7_14 = input.LA(10);
												if ( (LA7_14==NUMBER) ) {
													int LA7_15 = input.LA(11);
													if ( (LA7_15==EQUALS||(LA7_15 >= GE && LA7_15 <= GT)||LA7_15==IS_NULL||LA7_15==LE||LA7_15==LT||(LA7_15 >= NOT_EQUALS && LA7_15 <= NOT_NULL)) ) {
														alt7=2;
													}
													else if ( (LA7_15==RPAREN) ) {
														alt7=3;
													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 7, 15, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 7, 14, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

												}
												break;
											case EQUALS:
											case GE:
											case GT:
											case IS_NULL:
											case LE:
											case LT:
											case NOT_EQUALS:
											case NOT_NULL:
												{
												alt7=2;
												}
												break;
											case RPAREN:
												{
												alt7=3;
												}
												break;
											default:
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 7, 13, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 7, 12, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									case EQUALS:
									case GE:
									case GT:
									case IS_NULL:
									case LE:
									case LT:
									case NOT_EQUALS:
									case NOT_NULL:
										{
										alt7=2;
										}
										break;
									case RPAREN:
										{
										alt7=3;
										}
										break;
									default:
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 7, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 7, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EQUALS:
							case GE:
							case GT:
							case IS_NULL:
							case LE:
							case LT:
							case NOT_EQUALS:
							case NOT_NULL:
								{
								alt7=2;
								}
								break;
							case RPAREN:
								{
								alt7=3;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case RPAREN:
						{
						alt7=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case STRING_LITERAL:
					{
					int LA7_6 = input.LA(3);
					if ( (LA7_6==EQUALS||(LA7_6 >= GE && LA7_6 <= GT)||LA7_6==IS_NULL||LA7_6==LE||LA7_6==LT||(LA7_6 >= NOT_EQUALS && LA7_6 <= NOT_NULL)) ) {
						alt7=2;
					}
					else if ( (LA7_6==RPAREN) ) {
						alt7=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case NUMBER:
					{
					int LA7_7 = input.LA(3);
					if ( (LA7_7==EQUALS||(LA7_7 >= GE && LA7_7 <= GT)||LA7_7==IS_NULL||LA7_7==LE||LA7_7==LT||(LA7_7 >= NOT_EQUALS && LA7_7 <= NOT_NULL)) ) {
						alt7=2;
					}
					else if ( (LA7_7==RPAREN) ) {
						alt7=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENTIFIER:
			case NUMBER:
			case SEGMENT_NAME:
			case STRING_LITERAL:
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
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:88:13: NOT ^ condition
					{
					root_0 = (Object)adaptor.nil();


					NOT26=(Token)match(input,NOT,FOLLOW_NOT_in_condition204); 
					NOT26_tree = (Object)adaptor.create(NOT26);
					root_0 = (Object)adaptor.becomeRoot(NOT26_tree, root_0);

					pushFollow(FOLLOW_condition_in_condition207);
					condition27=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition27.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:88:30: LPAREN ! conditions RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition211); 
					pushFollow(FOLLOW_conditions_in_condition214);
					conditions29=conditions();
					state._fsp--;

					adaptor.addChild(root_0, conditions29.getTree());

					RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition216); 
					}
					break;
				case 3 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:88:59: evaluation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_evaluation_in_condition221);
					evaluation31=evaluation();
					state._fsp--;

					adaptor.addChild(root_0, evaluation31.getTree());

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
	// $ANTLR end "condition"


	public static class evaluation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "evaluation"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:90:1: evaluation : expression ( unaryOperator ^| ( binaryOperator ^ expression ) ) ;
	public final HL7QueryParser.evaluation_return evaluation() throws RecognitionException {
		HL7QueryParser.evaluation_return retval = new HL7QueryParser.evaluation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression32 =null;
		ParserRuleReturnScope unaryOperator33 =null;
		ParserRuleReturnScope binaryOperator34 =null;
		ParserRuleReturnScope expression35 =null;


		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:90:12: ( expression ( unaryOperator ^| ( binaryOperator ^ expression ) ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:90:14: expression ( unaryOperator ^| ( binaryOperator ^ expression ) )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_evaluation229);
			expression32=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression32.getTree());

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:91:5: ( unaryOperator ^| ( binaryOperator ^ expression ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IS_NULL||LA8_0==NOT_NULL) ) {
				alt8=1;
			}
			else if ( (LA8_0==EQUALS||(LA8_0 >= GE && LA8_0 <= GT)||LA8_0==LE||LA8_0==LT||LA8_0==NOT_EQUALS) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:92:6: unaryOperator ^
					{
					pushFollow(FOLLOW_unaryOperator_in_evaluation242);
					unaryOperator33=unaryOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(unaryOperator33.getTree(), root_0);
					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:93:8: ( binaryOperator ^ expression )
					{
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:93:8: ( binaryOperator ^ expression )
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:93:9: binaryOperator ^ expression
					{
					pushFollow(FOLLOW_binaryOperator_in_evaluation253);
					binaryOperator34=binaryOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(binaryOperator34.getTree(), root_0);
					pushFollow(FOLLOW_expression_in_evaluation256);
					expression35=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression35.getTree());

					}

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
	// $ANTLR end "evaluation"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:1: expression : ( ( LPAREN ! expr RPAREN !) | expr );
	public final HL7QueryParser.expression_return expression() throws RecognitionException {
		HL7QueryParser.expression_return retval = new HL7QueryParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN36=null;
		Token RPAREN38=null;
		ParserRuleReturnScope expr37 =null;
		ParserRuleReturnScope expr39 =null;

		Object LPAREN36_tree=null;
		Object RPAREN38_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:12: ( ( LPAREN ! expr RPAREN !) | expr )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LPAREN) ) {
				alt9=1;
			}
			else if ( (LA9_0==IDENTIFIER||LA9_0==NUMBER||LA9_0==SEGMENT_NAME||LA9_0==STRING_LITERAL) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:14: ( LPAREN ! expr RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:14: ( LPAREN ! expr RPAREN !)
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:15: LPAREN ! expr RPAREN !
					{
					LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expression272); 
					pushFollow(FOLLOW_expr_in_expression275);
					expr37=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr37.getTree());

					RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expression277); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:96:39: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expression283);
					expr39=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr39.getTree());

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
	// $ANTLR end "expression"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:1: expr : ( ref | field | STRING_LITERAL | NUMBER );
	public final HL7QueryParser.expr_return expr() throws RecognitionException {
		HL7QueryParser.expr_return retval = new HL7QueryParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL42=null;
		Token NUMBER43=null;
		ParserRuleReturnScope ref40 =null;
		ParserRuleReturnScope field41 =null;

		Object STRING_LITERAL42_tree=null;
		Object NUMBER43_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:6: ( ref | field | STRING_LITERAL | NUMBER )
			int alt10=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case SEGMENT_NAME:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==EOF||LA10_1==AND||LA10_1==EQUALS||(LA10_1 >= GE && LA10_1 <= GT)||LA10_1==IS_NULL||LA10_1==LE||LA10_1==LT||(LA10_1 >= NOT_EQUALS && LA10_1 <= NOT_NULL)||LA10_1==OR||LA10_1==RPAREN) ) {
					alt10=1;
				}
				else if ( (LA10_1==DOT) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING_LITERAL:
				{
				alt10=3;
				}
				break;
			case NUMBER:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:8: ref
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ref_in_expr290);
					ref40=ref();
					state._fsp--;

					adaptor.addChild(root_0, ref40.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:14: field
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_field_in_expr294);
					field41=field();
					state._fsp--;

					adaptor.addChild(root_0, field41.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:22: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL42=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_expr298); 
					STRING_LITERAL42_tree = (Object)adaptor.create(STRING_LITERAL42);
					adaptor.addChild(root_0, STRING_LITERAL42_tree);

					}
					break;
				case 4 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:97:39: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER43=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr302); 
					NUMBER43_tree = (Object)adaptor.create(NUMBER43);
					adaptor.addChild(root_0, NUMBER43_tree);

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
	// $ANTLR end "expr"


	public static class unaryOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryOperator"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:99:1: unaryOperator : ( IS_NULL | NOT_NULL );
	public final HL7QueryParser.unaryOperator_return unaryOperator() throws RecognitionException {
		HL7QueryParser.unaryOperator_return retval = new HL7QueryParser.unaryOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set44=null;

		Object set44_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:99:15: ( IS_NULL | NOT_NULL )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set44=input.LT(1);
			if ( input.LA(1)==IS_NULL||input.LA(1)==NOT_NULL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set44));
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
	// $ANTLR end "unaryOperator"


	public static class binaryOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryOperator"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:100:1: binaryOperator : ( EQUALS | NOT_EQUALS | LT | GT | LE | GE );
	public final HL7QueryParser.binaryOperator_return binaryOperator() throws RecognitionException {
		HL7QueryParser.binaryOperator_return retval = new HL7QueryParser.binaryOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set45=null;

		Object set45_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:100:16: ( EQUALS | NOT_EQUALS | LT | GT | LE | GE )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set45=input.LT(1);
			if ( input.LA(1)==EQUALS||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NOT_EQUALS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set45));
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
	// $ANTLR end "binaryOperator"


	public static class ref_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ref"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:102:1: ref : ( SEGMENT_NAME | IDENTIFIER ) ;
	public final HL7QueryParser.ref_return ref() throws RecognitionException {
		HL7QueryParser.ref_return retval = new HL7QueryParser.ref_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set46=null;

		Object set46_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:102:5: ( ( SEGMENT_NAME | IDENTIFIER ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set46=input.LT(1);
			if ( input.LA(1)==IDENTIFIER||input.LA(1)==SEGMENT_NAME ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set46));
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
	// $ANTLR end "ref"


	public static class field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:103:1: field : ref DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER )? )? )? ;
	public final HL7QueryParser.field_return field() throws RecognitionException {
		HL7QueryParser.field_return retval = new HL7QueryParser.field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT48=null;
		Token NUMBER49=null;
		Token DOT50=null;
		Token NUMBER51=null;
		Token DOT52=null;
		Token NUMBER53=null;
		Token DOT54=null;
		Token NUMBER55=null;
		ParserRuleReturnScope ref47 =null;

		Object DOT48_tree=null;
		Object NUMBER49_tree=null;
		Object DOT50_tree=null;
		Object NUMBER51_tree=null;
		Object DOT52_tree=null;
		Object NUMBER53_tree=null;
		Object DOT54_tree=null;
		Object NUMBER55_tree=null;

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:103:7: ( ref DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER )? )? )? )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:103:9: ref DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER )? )? )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_ref_in_field362);
			ref47=ref();
			state._fsp--;

			adaptor.addChild(root_0, ref47.getTree());

			DOT48=(Token)match(input,DOT,FOLLOW_DOT_in_field364); 
			DOT48_tree = (Object)adaptor.create(DOT48);
			root_0 = (Object)adaptor.becomeRoot(DOT48_tree, root_0);

			NUMBER49=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field367); 
			NUMBER49_tree = (Object)adaptor.create(NUMBER49);
			adaptor.addChild(root_0, NUMBER49_tree);

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:2: ( DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER )? )? )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DOT) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:3: DOT ^ NUMBER ( DOT ^ NUMBER ( DOT ^ NUMBER )? )?
					{
					DOT50=(Token)match(input,DOT,FOLLOW_DOT_in_field372); 
					DOT50_tree = (Object)adaptor.create(DOT50);
					root_0 = (Object)adaptor.becomeRoot(DOT50_tree, root_0);

					NUMBER51=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field375); 
					NUMBER51_tree = (Object)adaptor.create(NUMBER51);
					adaptor.addChild(root_0, NUMBER51_tree);

					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:15: ( DOT ^ NUMBER ( DOT ^ NUMBER )? )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==DOT) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:16: DOT ^ NUMBER ( DOT ^ NUMBER )?
							{
							DOT52=(Token)match(input,DOT,FOLLOW_DOT_in_field378); 
							DOT52_tree = (Object)adaptor.create(DOT52);
							root_0 = (Object)adaptor.becomeRoot(DOT52_tree, root_0);

							NUMBER53=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field381); 
							NUMBER53_tree = (Object)adaptor.create(NUMBER53);
							adaptor.addChild(root_0, NUMBER53_tree);

							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:28: ( DOT ^ NUMBER )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==DOT) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:104:29: DOT ^ NUMBER
									{
									DOT54=(Token)match(input,DOT,FOLLOW_DOT_in_field384); 
									DOT54_tree = (Object)adaptor.create(DOT54);
									root_0 = (Object)adaptor.becomeRoot(DOT54_tree, root_0);

									NUMBER55=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field387); 
									NUMBER55_tree = (Object)adaptor.create(NUMBER55);
									adaptor.addChild(root_0, NUMBER55_tree);

									}
									break;

							}

							}
							break;

					}

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
	// $ANTLR end "field"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:1: query : ( declareClause )? selectClause ( whereClause )? EOF -> ^( QUERY ( declareClause )? selectClause ( whereClause )? ) ;
	public final HL7QueryParser.query_return query() throws RecognitionException {
		HL7QueryParser.query_return retval = new HL7QueryParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF59=null;
		ParserRuleReturnScope declareClause56 =null;
		ParserRuleReturnScope selectClause57 =null;
		ParserRuleReturnScope whereClause58 =null;

		Object EOF59_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
		RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
		RewriteRuleSubtreeStream stream_declareClause=new RewriteRuleSubtreeStream(adaptor,"rule declareClause");

		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:7: ( ( declareClause )? selectClause ( whereClause )? EOF -> ^( QUERY ( declareClause )? selectClause ( whereClause )? ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:9: ( declareClause )? selectClause ( whereClause )? EOF
			{
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:9: ( declareClause )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DECLARE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:9: declareClause
					{
					pushFollow(FOLLOW_declareClause_in_query402);
					declareClause56=declareClause();
					state._fsp--;

					stream_declareClause.add(declareClause56.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_query405);
			selectClause57=selectClause();
			state._fsp--;

			stream_selectClause.add(selectClause57.getTree());
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:37: ( whereClause )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WHERE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:107:37: whereClause
					{
					pushFollow(FOLLOW_whereClause_in_query407);
					whereClause58=whereClause();
					state._fsp--;

					stream_whereClause.add(whereClause58.getTree());
					}
					break;

			}

			EOF59=(Token)match(input,EOF,FOLLOW_EOF_in_query410);  
			stream_EOF.add(EOF59);

			// AST REWRITE
			// elements: selectClause, whereClause, declareClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 107:54: -> ^( QUERY ( declareClause )? selectClause ( whereClause )? )
			{
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:108:2: ^( QUERY ( declareClause )? selectClause ( whereClause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:108:10: ( declareClause )?
				if ( stream_declareClause.hasNext() ) {
					adaptor.addChild(root_1, stream_declareClause.nextTree());
				}
				stream_declareClause.reset();

				adaptor.addChild(root_1, stream_selectClause.nextTree());
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryParser.g:108:38: ( whereClause )?
				if ( stream_whereClause.hasNext() ) {
					adaptor.addChild(root_1, stream_whereClause.nextTree());
				}
				stream_whereClause.reset();

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



	public static final BitSet FOLLOW_DECLARE_in_declareClause58 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_declaration_in_declareClause61 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_declareClause64 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_declaration_in_declareClause67 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration88 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_declaration90 = new BitSet(new long[]{0x0000000440000000L});
	public static final BitSet FOLLOW_requiredOrOptional_in_declaration92 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEGMENT_NAME_in_declaration94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_selectClause116 = new BitSet(new long[]{0x0000002002020000L});
	public static final BitSet FOLLOW_selectableClause_in_selectClause119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectable_in_selectableClause126 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_selectableClause129 = new BitSet(new long[]{0x0000002002020000L});
	public static final BitSet FOLLOW_selectable_in_selectableClause132 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_MESSAGE_in_selectable142 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ref_in_selectable146 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_field_in_selectable150 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AS_in_selectable155 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_selectable158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_whereClause170 = new BitSet(new long[]{0x0000012024820000L});
	public static final BitSet FOLLOW_conditions_in_whereClause173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_conditions181 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_AND_in_conditions185 = new BitSet(new long[]{0x0000012024820000L});
	public static final BitSet FOLLOW_OR_in_conditions190 = new BitSet(new long[]{0x0000012024820000L});
	public static final BitSet FOLLOW_condition_in_conditions194 = new BitSet(new long[]{0x0000000080000022L});
	public static final BitSet FOLLOW_NOT_in_condition204 = new BitSet(new long[]{0x0000012024820000L});
	public static final BitSet FOLLOW_condition_in_condition207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_condition211 = new BitSet(new long[]{0x0000012024820000L});
	public static final BitSet FOLLOW_conditions_in_condition214 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_condition216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_evaluation_in_condition221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_evaluation229 = new BitSet(new long[]{0x0000000019159000L});
	public static final BitSet FOLLOW_unaryOperator_in_evaluation242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOperator_in_evaluation253 = new BitSet(new long[]{0x0000012020820000L});
	public static final BitSet FOLLOW_expression_in_evaluation256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expression272 = new BitSet(new long[]{0x0000012020020000L});
	public static final BitSet FOLLOW_expr_in_expression275 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_expression277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ref_in_expr290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_expr294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_expr298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ref_in_field362 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_field364 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NUMBER_in_field367 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_field372 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NUMBER_in_field375 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_field378 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NUMBER_in_field381 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_DOT_in_field384 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NUMBER_in_field387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareClause_in_query402 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_selectClause_in_query405 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_whereClause_in_query407 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_query410 = new BitSet(new long[]{0x0000000000000002L});
}
