// $ANTLR 3.5.2 org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g 2019-10-07 21:49:10

	package org.apache.nifi.hl7.query.antlr;
	import org.apache.nifi.hl7.query.exception.HL7QueryParsingException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HL7QueryLexer extends Lexer {
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

	  public void recover(RecognitionException e) {
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


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HL7QueryLexer() {} 
	public HL7QueryLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HL7QueryLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g"; }

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:69:12: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:69:14: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:69:14: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:70:9: ( '#' (~ ( '\\n' ) )* '\\n' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:70:11: '#' (~ ( '\\n' ) )* '\\n'
			{
			match('#'); 
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:70:15: (~ ( '\\n' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\n'); 
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:72:8: ( '(' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:72:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:73:8: ( ')' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:73:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:74:9: ( '{' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:74:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:75:9: ( '}' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:75:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:76:7: ( ':' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:76:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:77:7: ( ',' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:77:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:78:6: ( '.' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:78:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:79:11: ( ';' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:79:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:84:9: ( '=' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:84:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "NOT_EQUALS"
	public final void mNOT_EQUALS() throws RecognitionException {
		try {
			int _type = NOT_EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:85:12: ( '!=' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:85:14: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUALS"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:86:6: ( '>' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:86:8: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:87:6: ( '>=' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:87:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:88:6: ( '<' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:88:8: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:89:6: ( '<=' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:89:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "REGEX"
	public final void mREGEX() throws RecognitionException {
		try {
			int _type = REGEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:90:8: ( 'MATCHES REGEX' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:90:10: 'MATCHES REGEX'
			{
			match("MATCHES REGEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGEX"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:91:7: ( 'LIKE' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:91:9: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIKE"

	// $ANTLR start "IS_NULL"
	public final void mIS_NULL() throws RecognitionException {
		try {
			int _type = IS_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:92:10: ( 'IS NULL' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:92:12: 'IS NULL'
			{
			match("IS NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_NULL"

	// $ANTLR start "NOT_NULL"
	public final void mNOT_NULL() throws RecognitionException {
		try {
			int _type = NOT_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:93:10: ( 'NOT NULL' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:93:12: 'NOT NULL'
			{
			match("NOT NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_NULL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:97:7: ( 'AND' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:97:9: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:98:6: ( 'OR' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:98:8: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:99:7: ( 'NOT' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:99:9: 'NOT'
			{
			match("NOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:101:6: ( 'true' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:101:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:102:7: ( 'false' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:102:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:104:9: ( 'select' | 'SELECT' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='s') ) {
				alt3=1;
			}
			else if ( (LA3_0=='S') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:104:11: 'select'
					{
					match("select"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:104:22: 'SELECT'
					{
					match("SELECT"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "DECLARE"
	public final void mDECLARE() throws RecognitionException {
		try {
			int _type = DECLARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:105:10: ( 'declare' | 'DECLARE' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='d') ) {
				alt4=1;
			}
			else if ( (LA4_0=='D') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:105:12: 'declare'
					{
					match("declare"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:105:24: 'DECLARE'
					{
					match("DECLARE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARE"

	// $ANTLR start "OPTIONAL"
	public final void mOPTIONAL() throws RecognitionException {
		try {
			int _type = OPTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:106:10: ( 'optional' | 'OPTIONAL' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='o') ) {
				alt5=1;
			}
			else if ( (LA5_0=='O') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:106:12: 'optional'
					{
					match("optional"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:106:25: 'OPTIONAL'
					{
					match("OPTIONAL"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPTIONAL"

	// $ANTLR start "REQUIRED"
	public final void mREQUIRED() throws RecognitionException {
		try {
			int _type = REQUIRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:107:10: ( 'required' | 'REQUIRED' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='r') ) {
				alt6=1;
			}
			else if ( (LA6_0=='R') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:107:12: 'required'
					{
					match("required"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:107:25: 'REQUIRED'
					{
					match("REQUIRED"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRED"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:108:6: ( 'as' | 'AS' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='A') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:108:8: 'as'
					{
					match("as"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:108:15: 'AS'
					{
					match("AS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:109:8: ( 'where' | 'WHERE' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='w') ) {
				alt8=1;
			}
			else if ( (LA8_0=='W') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:109:10: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:109:20: 'WHERE'
					{
					match("WHERE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "MESSAGE"
	public final void mMESSAGE() throws RecognitionException {
		try {
			int _type = MESSAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:111:10: ( 'MESSAGE' | 'message' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='M') ) {
				alt9=1;
			}
			else if ( (LA9_0=='m') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:111:12: 'MESSAGE'
					{
					match("MESSAGE"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:111:24: 'message'
					{
					match("message"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MESSAGE"

	// $ANTLR start "SEGMENT"
	public final void mSEGMENT() throws RecognitionException {
		try {
			int _type = SEGMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:112:10: ( 'SEGMENT' | 'segment' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='S') ) {
				alt10=1;
			}
			else if ( (LA10_0=='s') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:112:12: 'SEGMENT'
					{
					match("SEGMENT"); 

					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:112:24: 'segment'
					{
					match("segment"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEGMENT"

	// $ANTLR start "SEGMENT_NAME"
	public final void mSEGMENT_NAME() throws RecognitionException {
		try {
			int _type = SEGMENT_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:115:14: ( LETTER ALPHA_NUMERIC ALPHA_NUMERIC )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:115:16: LETTER ALPHA_NUMERIC ALPHA_NUMERIC
			{
			mLETTER(); 

			mALPHA_NUMERIC(); 

			mALPHA_NUMERIC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEGMENT_NAME"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:118:8: ( ( '0' .. '9' )+ )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:118:10: ( '0' .. '9' )+
			{
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:118:10: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:119:17: ( 'A' .. 'Z' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "ALPHA_NUMERIC"
	public final void mALPHA_NUMERIC() throws RecognitionException {
		try {
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:120:24: ( 'A' .. 'Z' | '0' .. '9' )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHA_NUMERIC"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken escaped=null;
			int normal;

			StringBuilder lBuf = new StringBuilder();
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:126:2: ( ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' ) | ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='\"') ) {
				alt14=1;
			}
			else if ( (LA14_0=='\'') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:127:3: ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' )
					{
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:127:3: ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' )
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:128:4: '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"'
					{
					match('\"'); 
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:129:5: (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )*
					loop12:
					while (true) {
						int alt12=3;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='\\') ) {
							alt12=1;
						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
							alt12=2;
						}

						switch (alt12) {
						case 1 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:130:6: escaped= ESC
							{
							int escapedStart447 = getCharIndex();
							int escapedStartLine447 = getLine();
							int escapedStartCharPos447 = getCharPositionInLine();
							mESC(); 
							escaped = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, escapedStart447, getCharIndex()-1);
							escaped.setLine(escapedStartLine447);
							escaped.setCharPositionInLine(escapedStartCharPos447);

							lBuf.append(getText());
							}
							break;
						case 2 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:131:8: normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' )
							{
							normal= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							 lBuf.appendCodePoint(normal);
							}
							break;

						default :
							break loop12;
						}
					}

					match('\"'); 
					}


								setText(lBuf.toString());
							
					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:139:3: ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' )
					{
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:139:3: ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' )
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:140:4: '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\''
					{
					match('\''); 
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:141:5: (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )*
					loop13:
					while (true) {
						int alt13=3;
						int LA13_0 = input.LA(1);
						if ( (LA13_0=='\\') ) {
							alt13=1;
						}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
							alt13=2;
						}

						switch (alt13) {
						case 1 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:142:6: escaped= ESC
							{
							int escapedStart536 = getCharIndex();
							int escapedStartLine536 = getLine();
							int escapedStartCharPos536 = getCharPositionInLine();
							mESC(); 
							escaped = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, escapedStart536, getCharIndex()-1);
							escaped.setLine(escapedStartLine536);
							escaped.setCharPositionInLine(escapedStartCharPos536);

							lBuf.append(getText());
							}
							break;
						case 2 :
							// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:143:8: normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' )
							{
							normal= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							 lBuf.appendCodePoint(normal);
							}
							break;

						default :
							break loop13;
						}
					}

					match('\''); 
					}


								setText(lBuf.toString());
							
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			int nextChar;

			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:155:2: ( '\\\\' ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:155:4: '\\\\' ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) )
			{
			match('\\'); 
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:156:3: ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) )
			int alt15=7;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\"') ) {
				alt15=1;
			}
			else if ( (LA15_0=='\'') ) {
				alt15=2;
			}
			else if ( (LA15_0=='r') ) {
				alt15=3;
			}
			else if ( (LA15_0=='n') ) {
				alt15=4;
			}
			else if ( (LA15_0=='t') ) {
				alt15=5;
			}
			else if ( (LA15_0=='\\') ) {
				alt15=6;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= 'm')||(LA15_0 >= 'o' && LA15_0 <= 'q')||LA15_0=='s'||(LA15_0 >= 'u' && LA15_0 <= '\uFFFF')) ) {
				alt15=7;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:157:5: '\"'
					{
					match('\"'); 
					 setText("\""); 
					}
					break;
				case 2 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:158:6: '\\''
					{
					match('\''); 
					 setText("\'"); 
					}
					break;
				case 3 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:159:6: 'r'
					{
					match('r'); 
					 setText("\r"); 
					}
					break;
				case 4 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:160:6: 'n'
					{
					match('n'); 
					 setText("\n"); 
					}
					break;
				case 5 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:161:6: 't'
					{
					match('t'); 
					 setText("\t"); 
					}
					break;
				case 6 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:162:6: '\\\\'
					{
					match('\\'); 
					 setText("\\\\"); 
					}
					break;
				case 7 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:163:6: nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' )
					{
					nextChar= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= 'm')||(input.LA(1) >= 'o' && input.LA(1) <= 'q')||input.LA(1)=='s'||(input.LA(1) >= 'u' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}

										StringBuilder lBuf = new StringBuilder(); lBuf.append("\\\\").appendCodePoint(nextChar); setText(lBuf.toString());
									
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:170:12: ( (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '0' .. '9' | '.' ) (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '.' ) )* ) )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:170:14: (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '0' .. '9' | '.' ) (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '.' ) )* )
			{
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:170:14: (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '0' .. '9' | '.' ) (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '.' ) )* )
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:171:7: ~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '0' .. '9' | '.' ) (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '.' ) )*
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '#')||(input.LA(1) >= '%' && input.LA(1) <= '&')||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '<' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:172:7: (~ ( '$' | '{' | '}' | '(' | ')' | '[' | ']' | ',' | ':' | ';' | '/' | '*' | '\\'' | ' ' | '\\t' | '\\r' | '\\n' | '.' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\b')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\u001F')||(LA16_0 >= '!' && LA16_0 <= '#')||(LA16_0 >= '%' && LA16_0 <= '&')||LA16_0=='+'||LA16_0=='-'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= '<' && LA16_0 <= 'Z')||LA16_0=='\\'||(LA16_0 >= '^' && LA16_0 <= 'z')||LA16_0=='|'||(LA16_0 >= '~' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '#')||(input.LA(1) >= '%' && input.LA(1) <= '&')||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	@Override
	public void mTokens() throws RecognitionException {
		// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:8: ( WHITESPACE | COMMENT | LPAREN | RPAREN | LBRACE | RBRACE | COLON | COMMA | DOT | SEMICOLON | EQUALS | NOT_EQUALS | GT | GE | LT | LE | REGEX | LIKE | IS_NULL | NOT_NULL | AND | OR | NOT | TRUE | FALSE | SELECT | DECLARE | OPTIONAL | REQUIRED | AS | WHERE | MESSAGE | SEGMENT | SEGMENT_NAME | NUMBER | STRING_LITERAL | IDENTIFIER )
		int alt17=37;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:10: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 2 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:21: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 3 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:29: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 4 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:36: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 5 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:43: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 6 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:50: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 7 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:57: COLON
				{
				mCOLON(); 

				}
				break;
			case 8 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:63: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 9 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:69: DOT
				{
				mDOT(); 

				}
				break;
			case 10 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:73: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 11 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:83: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 12 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:90: NOT_EQUALS
				{
				mNOT_EQUALS(); 

				}
				break;
			case 13 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:101: GT
				{
				mGT(); 

				}
				break;
			case 14 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:104: GE
				{
				mGE(); 

				}
				break;
			case 15 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:107: LT
				{
				mLT(); 

				}
				break;
			case 16 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:110: LE
				{
				mLE(); 

				}
				break;
			case 17 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:113: REGEX
				{
				mREGEX(); 

				}
				break;
			case 18 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:119: LIKE
				{
				mLIKE(); 

				}
				break;
			case 19 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:124: IS_NULL
				{
				mIS_NULL(); 

				}
				break;
			case 20 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:132: NOT_NULL
				{
				mNOT_NULL(); 

				}
				break;
			case 21 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:141: AND
				{
				mAND(); 

				}
				break;
			case 22 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:145: OR
				{
				mOR(); 

				}
				break;
			case 23 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:148: NOT
				{
				mNOT(); 

				}
				break;
			case 24 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:152: TRUE
				{
				mTRUE(); 

				}
				break;
			case 25 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:157: FALSE
				{
				mFALSE(); 

				}
				break;
			case 26 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:163: SELECT
				{
				mSELECT(); 

				}
				break;
			case 27 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:170: DECLARE
				{
				mDECLARE(); 

				}
				break;
			case 28 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:178: OPTIONAL
				{
				mOPTIONAL(); 

				}
				break;
			case 29 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:187: REQUIRED
				{
				mREQUIRED(); 

				}
				break;
			case 30 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:196: AS
				{
				mAS(); 

				}
				break;
			case 31 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:199: WHERE
				{
				mWHERE(); 

				}
				break;
			case 32 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:205: MESSAGE
				{
				mMESSAGE(); 

				}
				break;
			case 33 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:213: SEGMENT
				{
				mSEGMENT(); 

				}
				break;
			case 34 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:221: SEGMENT_NAME
				{
				mSEGMENT_NAME(); 

				}
				break;
			case 35 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:234: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 36 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:241: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 37 :
				// org\\apache\\nifi\\hl7\\query\\antlr\\HL7QueryLexer.g:1:256: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\2\uffff\1\46\10\uffff\1\51\1\46\1\54\1\56\24\46\1\uffff\1\46\2\uffff"+
		"\1\46\2\uffff\1\111\1\112\1\uffff\1\113\1\uffff\7\46\1\123\1\124\12\46"+
		"\1\123\5\46\1\45\3\uffff\4\153\1\uffff\1\157\1\160\2\uffff\1\153\4\46"+
		"\2\153\1\46\1\153\2\46\1\153\1\46\1\153\10\46\1\uffff\1\46\1\u0082\3\uffff"+
		"\1\46\1\u0084\17\46\1\uffff\1\46\1\uffff\1\u0095\11\46\2\u009f\4\46\1"+
		"\uffff\1\u00a4\1\46\1\u00a4\6\46\1\uffff\2\46\1\u00ae\1\46\1\uffff\2\u00b0"+
		"\2\u00b1\3\46\1\u00ae\2\uffff\1\u00b5\2\uffff\1\u00b5\2\u00b6\2\uffff";
	static final String DFA17_eofS =
		"\u00b7\uffff";
	static final String DFA17_minS =
		"\1\0\1\uffff\1\0\10\uffff\1\0\1\75\2\0\6\60\1\162\1\141\1\145\1\60\1\145"+
		"\1\60\1\160\1\145\1\60\1\163\1\150\1\60\1\145\1\60\1\uffff\1\0\2\uffff"+
		"\1\0\2\uffff\2\0\1\uffff\1\0\1\uffff\4\60\1\40\2\60\2\0\1\60\1\165\1\154"+
		"\1\147\1\60\1\143\1\60\1\164\1\161\1\60\1\0\1\145\1\60\1\163\3\0\3\uffff"+
		"\4\0\1\uffff\2\0\2\uffff\1\0\1\145\1\163\1\145\1\155\2\0\1\154\1\0\1\151"+
		"\1\165\1\0\1\162\1\0\1\163\6\0\1\110\1\uffff\1\101\1\0\3\uffff\1\117\1"+
		"\0\1\145\1\143\1\145\1\103\1\105\1\141\1\101\1\157\1\151\1\111\1\145\1"+
		"\105\1\141\1\105\1\107\1\uffff\1\116\1\uffff\1\0\1\164\1\156\1\124\1\116"+
		"\1\162\1\122\1\156\1\162\1\122\2\0\1\147\1\123\1\105\1\101\1\uffff\1\0"+
		"\1\164\1\0\1\124\1\145\1\105\1\141\1\145\1\105\1\uffff\1\145\1\40\1\0"+
		"\1\114\1\uffff\4\0\1\154\1\144\1\104\1\0\2\uffff\1\0\2\uffff\3\0\2\uffff";
	static final String DFA17_maxS =
		"\1\uffff\1\uffff\1\uffff\10\uffff\1\uffff\1\75\2\uffff\6\132\1\162\1\141"+
		"\1\145\1\132\1\145\1\132\1\160\1\145\1\132\1\163\1\150\1\132\1\145\1\132"+
		"\1\uffff\1\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff"+
		"\7\132\2\uffff\1\132\1\165\2\154\1\132\1\143\1\132\1\164\1\161\1\132\1"+
		"\uffff\1\145\1\132\1\163\3\uffff\3\uffff\4\uffff\1\uffff\2\uffff\2\uffff"+
		"\1\uffff\1\145\1\163\1\145\1\155\2\uffff\1\154\1\uffff\1\151\1\165\1\uffff"+
		"\1\162\1\uffff\1\163\6\uffff\1\110\1\uffff\1\101\1\uffff\3\uffff\1\117"+
		"\1\uffff\1\145\1\143\1\145\1\103\1\105\1\141\1\101\1\157\1\151\1\111\1"+
		"\145\1\105\1\141\1\105\1\107\1\uffff\1\116\1\uffff\1\uffff\1\164\1\156"+
		"\1\124\1\116\1\162\1\122\1\156\1\162\1\122\2\uffff\1\147\1\123\1\105\1"+
		"\101\1\uffff\1\uffff\1\164\1\uffff\1\124\1\145\1\105\1\141\1\145\1\105"+
		"\1\uffff\1\145\1\40\1\uffff\1\114\1\uffff\4\uffff\1\154\1\144\1\104\1"+
		"\uffff\2\uffff\1\uffff\2\uffff\3\uffff\2\uffff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\30\uffff\1\43"+
		"\1\uffff\1\44\1\45\1\uffff\1\2\1\13\2\uffff\1\15\1\uffff\1\17\32\uffff"+
		"\1\14\1\16\1\20\4\uffff\1\23\2\uffff\1\36\1\26\26\uffff\1\42\2\uffff\1"+
		"\24\1\27\1\25\21\uffff\1\22\1\uffff\1\30\20\uffff\1\31\11\uffff\1\37\4"+
		"\uffff\1\32\10\uffff\1\21\1\40\1\uffff\1\41\1\33\3\uffff\1\34\1\35";
	static final String DFA17_specialS =
		"\1\41\1\uffff\1\42\10\uffff\1\40\1\uffff\1\17\1\30\25\uffff\1\54\2\uffff"+
		"\1\3\2\uffff\1\43\1\52\1\uffff\1\0\10\uffff\1\24\1\27\12\uffff\1\16\3"+
		"\uffff\1\53\1\56\1\10\3\uffff\1\6\1\21\1\46\1\11\1\uffff\1\12\1\15\2\uffff"+
		"\1\32\4\uffff\1\20\1\60\1\uffff\1\26\2\uffff\1\36\1\uffff\1\44\1\uffff"+
		"\1\50\1\57\1\61\1\62\1\1\1\5\3\uffff\1\7\4\uffff\1\23\22\uffff\1\31\11"+
		"\uffff\1\22\1\25\5\uffff\1\33\1\uffff\1\34\11\uffff\1\35\2\uffff\1\55"+
		"\1\51\1\45\1\47\3\uffff\1\37\2\uffff\1\4\2\uffff\1\2\1\13\1\14\2\uffff}>";
	static final String[] DFA17_transitionS = {
			"\11\46\2\1\2\46\1\1\22\46\1\1\1\14\1\44\1\2\1\uffff\2\46\1\45\1\3\1\4"+
			"\1\uffff\1\46\1\10\1\46\1\11\1\uffff\12\43\1\7\1\12\1\16\1\13\1\15\2"+
			"\46\1\23\2\42\1\32\4\42\1\21\2\42\1\20\1\17\1\22\1\24\2\42\1\35\1\30"+
			"\3\42\1\40\3\42\1\uffff\1\46\1\uffff\3\46\1\36\2\46\1\31\1\46\1\26\6"+
			"\46\1\41\1\46\1\33\2\46\1\34\1\27\1\25\2\46\1\37\3\46\1\5\1\46\1\6\uff82"+
			"\46",
			"",
			"\11\47\2\50\2\47\1\50\22\47\1\50\3\47\1\50\2\47\4\50\1\47\1\50\1\47"+
			"\2\50\12\47\2\50\37\47\1\50\1\47\1\50\35\47\1\50\1\47\1\50\uff82\47",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\52",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\1\46\1\53\35\46\1\uffff\1\46"+
			"\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\1\46\1\55\35\46\1\uffff\1\46"+
			"\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\12\61\7\uffff\1\57\3\61\1\60\25\61",
			"\12\61\7\uffff\10\61\1\62\21\61",
			"\12\61\7\uffff\22\61\1\63\7\61",
			"\12\61\7\uffff\16\61\1\64\13\61",
			"\12\61\7\uffff\15\61\1\65\4\61\1\66\7\61",
			"\12\61\7\uffff\17\61\1\70\1\61\1\67\10\61",
			"\1\71",
			"\1\72",
			"\1\73",
			"\12\61\7\uffff\4\61\1\74\25\61",
			"\1\75",
			"\12\61\7\uffff\4\61\1\76\25\61",
			"\1\77",
			"\1\100",
			"\12\61\7\uffff\4\61\1\101\25\61",
			"\1\102",
			"\1\103",
			"\12\61\7\uffff\7\61\1\104\22\61",
			"\1\105",
			"\12\61\7\uffff\32\61",
			"",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"",
			"",
			"\11\47\2\50\2\47\1\50\22\47\1\50\3\47\1\50\2\47\4\50\1\47\1\50\1\47"+
			"\2\50\12\47\2\50\37\47\1\50\1\47\1\50\35\47\1\50\1\47\1\50\uff82\47",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"\12\115\7\uffff\23\115\1\114\6\115",
			"\12\115\7\uffff\22\115\1\116\7\115",
			"\12\115\7\uffff\32\115",
			"\12\115\7\uffff\12\115\1\117\17\115",
			"\1\120\17\uffff\12\115\7\uffff\32\115",
			"\12\115\7\uffff\23\115\1\121\6\115",
			"\12\115\7\uffff\3\115\1\122\26\115",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\115\2\uffff\5\46\32\115\1\uffff\1\46\1"+
			"\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\115\2\uffff\5\46\32\115\1\uffff\1\46\1"+
			"\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\12\115\7\uffff\23\115\1\125\6\115",
			"\1\126",
			"\1\127",
			"\1\131\4\uffff\1\130",
			"\12\115\7\uffff\6\115\1\133\4\115\1\132\16\115",
			"\1\134",
			"\12\115\7\uffff\2\115\1\135\27\115",
			"\1\136",
			"\1\137",
			"\12\115\7\uffff\20\115\1\140\11\115",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\141",
			"\12\115\7\uffff\4\115\1\142\25\115",
			"\1\143",
			"\11\151\2\45\2\151\1\45\22\151\1\45\1\151\1\144\1\151\1\45\2\151\4\45"+
			"\1\151\1\45\1\151\2\45\12\151\2\45\37\151\1\45\1\150\1\45\20\151\1\146"+
			"\3\151\1\145\1\151\1\147\6\151\1\45\1\151\1\45\uff82\151",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\7\46\1\152\27\46\1\uffff\1\46"+
			"\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\27\46\1\154\7\46\1\uffff\1\46"+
			"\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\11\46\1\155\25\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\156\3\46\1\uffff\2\46\4\uffff\1"+
			"\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\15\46\1\161\21\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\11\46\1\166\25\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\21\46\1\167\15\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\170",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\20\46\1\171\16\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\172",
			"\1\173",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\31\46\1\174\5\46\1\uffff\1\46"+
			"\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\175",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\26\46\1\176\10\46\1\uffff\1"+
			"\46\1\uffff\35\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\177",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\11\107\2\uffff\2\107\1\uffff\22\107\1\45\1\107\1\110\1\107\1\45\2\107"+
			"\4\45\1\107\1\45\1\107\2\45\12\107\2\45\37\107\1\45\1\106\1\45\35\107"+
			"\1\45\1\107\1\45\uff82\107",
			"\1\u0080",
			"",
			"\1\u0081",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"",
			"",
			"\1\u0083",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"",
			"\1\u0094",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u00a5",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"",
			"\1\u00ac",
			"\1\u00ad",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u00af",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			"",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"\11\46\2\uffff\2\46\1\uffff\22\46\1\uffff\3\46\1\uffff\2\46\4\uffff"+
			"\1\46\1\uffff\1\46\2\uffff\12\46\2\uffff\37\46\1\uffff\1\46\1\uffff\35"+
			"\46\1\uffff\1\46\1\uffff\uff82\46",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WHITESPACE | COMMENT | LPAREN | RPAREN | LBRACE | RBRACE | COLON | COMMA | DOT | SEMICOLON | EQUALS | NOT_EQUALS | GT | GE | LT | LE | REGEX | LIKE | IS_NULL | NOT_NULL | AND | OR | NOT | TRUE | FALSE | SELECT | DECLARE | OPTIONAL | REQUIRED | AS | WHERE | MESSAGE | SEGMENT | SEGMENT_NAME | NUMBER | STRING_LITERAL | IDENTIFIER );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_45 = input.LA(1);
						s = -1;
						if ( ((LA17_45 >= '\u0000' && LA17_45 <= '\b')||(LA17_45 >= '\u000B' && LA17_45 <= '\f')||(LA17_45 >= '\u000E' && LA17_45 <= '\u001F')||(LA17_45 >= '!' && LA17_45 <= '#')||(LA17_45 >= '%' && LA17_45 <= '&')||LA17_45=='+'||LA17_45=='-'||(LA17_45 >= '0' && LA17_45 <= '9')||(LA17_45 >= '<' && LA17_45 <= 'Z')||LA17_45=='\\'||(LA17_45 >= '^' && LA17_45 <= 'z')||LA17_45=='|'||(LA17_45 >= '~' && LA17_45 <= '\uFFFF')) ) {s = 38;}
						else s = 75;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_104 = input.LA(1);
						s = -1;
						if ( (LA17_104=='\"') ) {s = 72;}
						else if ( (LA17_104=='\\') ) {s = 70;}
						else if ( ((LA17_104 >= '\u0000' && LA17_104 <= '\b')||(LA17_104 >= '\u000B' && LA17_104 <= '\f')||(LA17_104 >= '\u000E' && LA17_104 <= '\u001F')||LA17_104=='!'||LA17_104=='#'||(LA17_104 >= '%' && LA17_104 <= '&')||LA17_104=='+'||LA17_104=='-'||(LA17_104 >= '0' && LA17_104 <= '9')||(LA17_104 >= '<' && LA17_104 <= 'Z')||(LA17_104 >= '^' && LA17_104 <= 'z')||LA17_104=='|'||(LA17_104 >= '~' && LA17_104 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_104==' '||LA17_104=='$'||(LA17_104 >= '\'' && LA17_104 <= '*')||LA17_104==','||(LA17_104 >= '.' && LA17_104 <= '/')||(LA17_104 >= ':' && LA17_104 <= ';')||LA17_104=='['||LA17_104==']'||LA17_104=='{'||LA17_104=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_178 = input.LA(1);
						s = -1;
						if ( ((LA17_178 >= '\u0000' && LA17_178 <= '\b')||(LA17_178 >= '\u000B' && LA17_178 <= '\f')||(LA17_178 >= '\u000E' && LA17_178 <= '\u001F')||(LA17_178 >= '!' && LA17_178 <= '#')||(LA17_178 >= '%' && LA17_178 <= '&')||LA17_178=='+'||LA17_178=='-'||(LA17_178 >= '0' && LA17_178 <= '9')||(LA17_178 >= '<' && LA17_178 <= 'Z')||LA17_178=='\\'||(LA17_178 >= '^' && LA17_178 <= 'z')||LA17_178=='|'||(LA17_178 >= '~' && LA17_178 <= '\uFFFF')) ) {s = 38;}
						else s = 181;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_39 = input.LA(1);
						s = -1;
						if ( ((LA17_39 >= '\t' && LA17_39 <= '\n')||LA17_39=='\r'||LA17_39==' '||LA17_39=='$'||(LA17_39 >= '\'' && LA17_39 <= '*')||LA17_39==','||(LA17_39 >= '.' && LA17_39 <= '/')||(LA17_39 >= ':' && LA17_39 <= ';')||LA17_39=='['||LA17_39==']'||LA17_39=='{'||LA17_39=='}') ) {s = 40;}
						else if ( ((LA17_39 >= '\u0000' && LA17_39 <= '\b')||(LA17_39 >= '\u000B' && LA17_39 <= '\f')||(LA17_39 >= '\u000E' && LA17_39 <= '\u001F')||(LA17_39 >= '!' && LA17_39 <= '#')||(LA17_39 >= '%' && LA17_39 <= '&')||LA17_39=='+'||LA17_39=='-'||(LA17_39 >= '0' && LA17_39 <= '9')||(LA17_39 >= '<' && LA17_39 <= 'Z')||LA17_39=='\\'||(LA17_39 >= '^' && LA17_39 <= 'z')||LA17_39=='|'||(LA17_39 >= '~' && LA17_39 <= '\uFFFF')) ) {s = 39;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_175 = input.LA(1);
						s = -1;
						if ( ((LA17_175 >= '\u0000' && LA17_175 <= '\b')||(LA17_175 >= '\u000B' && LA17_175 <= '\f')||(LA17_175 >= '\u000E' && LA17_175 <= '\u001F')||(LA17_175 >= '!' && LA17_175 <= '#')||(LA17_175 >= '%' && LA17_175 <= '&')||LA17_175=='+'||LA17_175=='-'||(LA17_175 >= '0' && LA17_175 <= '9')||(LA17_175 >= '<' && LA17_175 <= 'Z')||LA17_175=='\\'||(LA17_175 >= '^' && LA17_175 <= 'z')||LA17_175=='|'||(LA17_175 >= '~' && LA17_175 <= '\uFFFF')) ) {s = 38;}
						else s = 181;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_105 = input.LA(1);
						s = -1;
						if ( (LA17_105=='\"') ) {s = 72;}
						else if ( (LA17_105=='\\') ) {s = 70;}
						else if ( ((LA17_105 >= '\u0000' && LA17_105 <= '\b')||(LA17_105 >= '\u000B' && LA17_105 <= '\f')||(LA17_105 >= '\u000E' && LA17_105 <= '\u001F')||LA17_105=='!'||LA17_105=='#'||(LA17_105 >= '%' && LA17_105 <= '&')||LA17_105=='+'||LA17_105=='-'||(LA17_105 >= '0' && LA17_105 <= '9')||(LA17_105 >= '<' && LA17_105 <= 'Z')||(LA17_105 >= '^' && LA17_105 <= 'z')||LA17_105=='|'||(LA17_105 >= '~' && LA17_105 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_105==' '||LA17_105=='$'||(LA17_105 >= '\'' && LA17_105 <= '*')||LA17_105==','||(LA17_105 >= '.' && LA17_105 <= '/')||(LA17_105 >= ':' && LA17_105 <= ';')||LA17_105=='['||LA17_105==']'||LA17_105=='{'||LA17_105=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_76 = input.LA(1);
						s = -1;
						if ( (LA17_76=='C') ) {s = 106;}
						else if ( ((LA17_76 >= '\u0000' && LA17_76 <= '\b')||(LA17_76 >= '\u000B' && LA17_76 <= '\f')||(LA17_76 >= '\u000E' && LA17_76 <= '\u001F')||(LA17_76 >= '!' && LA17_76 <= '#')||(LA17_76 >= '%' && LA17_76 <= '&')||LA17_76=='+'||LA17_76=='-'||(LA17_76 >= '0' && LA17_76 <= '9')||(LA17_76 >= '<' && LA17_76 <= 'B')||(LA17_76 >= 'D' && LA17_76 <= 'Z')||LA17_76=='\\'||(LA17_76 >= '^' && LA17_76 <= 'z')||LA17_76=='|'||(LA17_76 >= '~' && LA17_76 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_109 = input.LA(1);
						s = -1;
						if ( ((LA17_109 >= '\u0000' && LA17_109 <= '\b')||(LA17_109 >= '\u000B' && LA17_109 <= '\f')||(LA17_109 >= '\u000E' && LA17_109 <= '\u001F')||(LA17_109 >= '!' && LA17_109 <= '#')||(LA17_109 >= '%' && LA17_109 <= '&')||LA17_109=='+'||LA17_109=='-'||(LA17_109 >= '0' && LA17_109 <= '9')||(LA17_109 >= '<' && LA17_109 <= 'Z')||LA17_109=='\\'||(LA17_109 >= '^' && LA17_109 <= 'z')||LA17_109=='|'||(LA17_109 >= '~' && LA17_109 <= '\uFFFF')) ) {s = 38;}
						else s = 130;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_72 = input.LA(1);
						s = -1;
						if ( ((LA17_72 >= '\u0000' && LA17_72 <= '\b')||(LA17_72 >= '\u000B' && LA17_72 <= '\f')||(LA17_72 >= '\u000E' && LA17_72 <= '\u001F')||(LA17_72 >= '!' && LA17_72 <= '#')||(LA17_72 >= '%' && LA17_72 <= '&')||LA17_72=='+'||LA17_72=='-'||(LA17_72 >= '0' && LA17_72 <= '9')||(LA17_72 >= '<' && LA17_72 <= 'Z')||LA17_72=='\\'||(LA17_72 >= '^' && LA17_72 <= 'z')||LA17_72=='|'||(LA17_72 >= '~' && LA17_72 <= '\uFFFF')) ) {s = 38;}
						else s = 37;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_79 = input.LA(1);
						s = -1;
						if ( (LA17_79=='E') ) {s = 109;}
						else if ( ((LA17_79 >= '\u0000' && LA17_79 <= '\b')||(LA17_79 >= '\u000B' && LA17_79 <= '\f')||(LA17_79 >= '\u000E' && LA17_79 <= '\u001F')||(LA17_79 >= '!' && LA17_79 <= '#')||(LA17_79 >= '%' && LA17_79 <= '&')||LA17_79=='+'||LA17_79=='-'||(LA17_79 >= '0' && LA17_79 <= '9')||(LA17_79 >= '<' && LA17_79 <= 'D')||(LA17_79 >= 'F' && LA17_79 <= 'Z')||LA17_79=='\\'||(LA17_79 >= '^' && LA17_79 <= 'z')||LA17_79=='|'||(LA17_79 >= '~' && LA17_79 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_81 = input.LA(1);
						s = -1;
						if ( (LA17_81==' ') ) {s = 110;}
						else if ( ((LA17_81 >= '\u0000' && LA17_81 <= '\b')||(LA17_81 >= '\u000B' && LA17_81 <= '\f')||(LA17_81 >= '\u000E' && LA17_81 <= '\u001F')||(LA17_81 >= '!' && LA17_81 <= '#')||(LA17_81 >= '%' && LA17_81 <= '&')||LA17_81=='+'||LA17_81=='-'||(LA17_81 >= '0' && LA17_81 <= '9')||(LA17_81 >= '<' && LA17_81 <= 'Z')||LA17_81=='\\'||(LA17_81 >= '^' && LA17_81 <= 'z')||LA17_81=='|'||(LA17_81 >= '~' && LA17_81 <= '\uFFFF')) ) {s = 38;}
						else s = 111;
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_179 = input.LA(1);
						s = -1;
						if ( ((LA17_179 >= '\u0000' && LA17_179 <= '\b')||(LA17_179 >= '\u000B' && LA17_179 <= '\f')||(LA17_179 >= '\u000E' && LA17_179 <= '\u001F')||(LA17_179 >= '!' && LA17_179 <= '#')||(LA17_179 >= '%' && LA17_179 <= '&')||LA17_179=='+'||LA17_179=='-'||(LA17_179 >= '0' && LA17_179 <= '9')||(LA17_179 >= '<' && LA17_179 <= 'Z')||LA17_179=='\\'||(LA17_179 >= '^' && LA17_179 <= 'z')||LA17_179=='|'||(LA17_179 >= '~' && LA17_179 <= '\uFFFF')) ) {s = 38;}
						else s = 182;
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_180 = input.LA(1);
						s = -1;
						if ( ((LA17_180 >= '\u0000' && LA17_180 <= '\b')||(LA17_180 >= '\u000B' && LA17_180 <= '\f')||(LA17_180 >= '\u000E' && LA17_180 <= '\u001F')||(LA17_180 >= '!' && LA17_180 <= '#')||(LA17_180 >= '%' && LA17_180 <= '&')||LA17_180=='+'||LA17_180=='-'||(LA17_180 >= '0' && LA17_180 <= '9')||(LA17_180 >= '<' && LA17_180 <= 'Z')||LA17_180=='\\'||(LA17_180 >= '^' && LA17_180 <= 'z')||LA17_180=='|'||(LA17_180 >= '~' && LA17_180 <= '\uFFFF')) ) {s = 38;}
						else s = 182;
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_82 = input.LA(1);
						s = -1;
						if ( ((LA17_82 >= '\u0000' && LA17_82 <= '\b')||(LA17_82 >= '\u000B' && LA17_82 <= '\f')||(LA17_82 >= '\u000E' && LA17_82 <= '\u001F')||(LA17_82 >= '!' && LA17_82 <= '#')||(LA17_82 >= '%' && LA17_82 <= '&')||LA17_82=='+'||LA17_82=='-'||(LA17_82 >= '0' && LA17_82 <= '9')||(LA17_82 >= '<' && LA17_82 <= 'Z')||LA17_82=='\\'||(LA17_82 >= '^' && LA17_82 <= 'z')||LA17_82=='|'||(LA17_82 >= '~' && LA17_82 <= '\uFFFF')) ) {s = 38;}
						else s = 112;
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_66 = input.LA(1);
						s = -1;
						if ( ((LA17_66 >= '\u0000' && LA17_66 <= '\b')||(LA17_66 >= '\u000B' && LA17_66 <= '\f')||(LA17_66 >= '\u000E' && LA17_66 <= '\u001F')||(LA17_66 >= '!' && LA17_66 <= '#')||(LA17_66 >= '%' && LA17_66 <= '&')||LA17_66=='+'||LA17_66=='-'||(LA17_66 >= '0' && LA17_66 <= '9')||(LA17_66 >= '<' && LA17_66 <= 'Z')||LA17_66=='\\'||(LA17_66 >= '^' && LA17_66 <= 'z')||LA17_66=='|'||(LA17_66 >= '~' && LA17_66 <= '\uFFFF')) ) {s = 38;}
						else s = 83;
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_13 = input.LA(1);
						s = -1;
						if ( (LA17_13=='=') ) {s = 43;}
						else if ( ((LA17_13 >= '\u0000' && LA17_13 <= '\b')||(LA17_13 >= '\u000B' && LA17_13 <= '\f')||(LA17_13 >= '\u000E' && LA17_13 <= '\u001F')||(LA17_13 >= '!' && LA17_13 <= '#')||(LA17_13 >= '%' && LA17_13 <= '&')||LA17_13=='+'||LA17_13=='-'||(LA17_13 >= '0' && LA17_13 <= '9')||LA17_13=='<'||(LA17_13 >= '>' && LA17_13 <= 'Z')||LA17_13=='\\'||(LA17_13 >= '^' && LA17_13 <= 'z')||LA17_13=='|'||(LA17_13 >= '~' && LA17_13 <= '\uFFFF')) ) {s = 38;}
						else s = 44;
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_90 = input.LA(1);
						s = -1;
						if ( (LA17_90=='E') ) {s = 118;}
						else if ( ((LA17_90 >= '\u0000' && LA17_90 <= '\b')||(LA17_90 >= '\u000B' && LA17_90 <= '\f')||(LA17_90 >= '\u000E' && LA17_90 <= '\u001F')||(LA17_90 >= '!' && LA17_90 <= '#')||(LA17_90 >= '%' && LA17_90 <= '&')||LA17_90=='+'||LA17_90=='-'||(LA17_90 >= '0' && LA17_90 <= '9')||(LA17_90 >= '<' && LA17_90 <= 'D')||(LA17_90 >= 'F' && LA17_90 <= 'Z')||LA17_90=='\\'||(LA17_90 >= '^' && LA17_90 <= 'z')||LA17_90=='|'||(LA17_90 >= '~' && LA17_90 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_77 = input.LA(1);
						s = -1;
						if ( ((LA17_77 >= '\u0000' && LA17_77 <= '\b')||(LA17_77 >= '\u000B' && LA17_77 <= '\f')||(LA17_77 >= '\u000E' && LA17_77 <= '\u001F')||(LA17_77 >= '!' && LA17_77 <= '#')||(LA17_77 >= '%' && LA17_77 <= '&')||LA17_77=='+'||LA17_77=='-'||(LA17_77 >= '0' && LA17_77 <= '9')||(LA17_77 >= '<' && LA17_77 <= 'Z')||LA17_77=='\\'||(LA17_77 >= '^' && LA17_77 <= 'z')||LA17_77=='|'||(LA17_77 >= '~' && LA17_77 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_143 = input.LA(1);
						s = -1;
						if ( ((LA17_143 >= '\u0000' && LA17_143 <= '\b')||(LA17_143 >= '\u000B' && LA17_143 <= '\f')||(LA17_143 >= '\u000E' && LA17_143 <= '\u001F')||(LA17_143 >= '!' && LA17_143 <= '#')||(LA17_143 >= '%' && LA17_143 <= '&')||LA17_143=='+'||LA17_143=='-'||(LA17_143 >= '0' && LA17_143 <= '9')||(LA17_143 >= '<' && LA17_143 <= 'Z')||LA17_143=='\\'||(LA17_143 >= '^' && LA17_143 <= 'z')||LA17_143=='|'||(LA17_143 >= '~' && LA17_143 <= '\uFFFF')) ) {s = 38;}
						else s = 159;
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_114 = input.LA(1);
						s = -1;
						if ( ((LA17_114 >= '\u0000' && LA17_114 <= '\b')||(LA17_114 >= '\u000B' && LA17_114 <= '\f')||(LA17_114 >= '\u000E' && LA17_114 <= '\u001F')||(LA17_114 >= '!' && LA17_114 <= '#')||(LA17_114 >= '%' && LA17_114 <= '&')||LA17_114=='+'||LA17_114=='-'||(LA17_114 >= '0' && LA17_114 <= '9')||(LA17_114 >= '<' && LA17_114 <= 'Z')||LA17_114=='\\'||(LA17_114 >= '^' && LA17_114 <= 'z')||LA17_114=='|'||(LA17_114 >= '~' && LA17_114 <= '\uFFFF')) ) {s = 38;}
						else s = 132;
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_54 = input.LA(1);
						s = -1;
						if ( ((LA17_54 >= '0' && LA17_54 <= '9')||(LA17_54 >= 'A' && LA17_54 <= 'Z')) ) {s = 77;}
						else if ( ((LA17_54 >= '\u0000' && LA17_54 <= '\b')||(LA17_54 >= '\u000B' && LA17_54 <= '\f')||(LA17_54 >= '\u000E' && LA17_54 <= '\u001F')||(LA17_54 >= '!' && LA17_54 <= '#')||(LA17_54 >= '%' && LA17_54 <= '&')||LA17_54=='+'||LA17_54=='-'||(LA17_54 >= '<' && LA17_54 <= '@')||LA17_54=='\\'||(LA17_54 >= '^' && LA17_54 <= 'z')||LA17_54=='|'||(LA17_54 >= '~' && LA17_54 <= '\uFFFF')) ) {s = 38;}
						else s = 83;
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_144 = input.LA(1);
						s = -1;
						if ( ((LA17_144 >= '\u0000' && LA17_144 <= '\b')||(LA17_144 >= '\u000B' && LA17_144 <= '\f')||(LA17_144 >= '\u000E' && LA17_144 <= '\u001F')||(LA17_144 >= '!' && LA17_144 <= '#')||(LA17_144 >= '%' && LA17_144 <= '&')||LA17_144=='+'||LA17_144=='-'||(LA17_144 >= '0' && LA17_144 <= '9')||(LA17_144 >= '<' && LA17_144 <= 'Z')||LA17_144=='\\'||(LA17_144 >= '^' && LA17_144 <= 'z')||LA17_144=='|'||(LA17_144 >= '~' && LA17_144 <= '\uFFFF')) ) {s = 38;}
						else s = 159;
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_93 = input.LA(1);
						s = -1;
						if ( (LA17_93=='L') ) {s = 121;}
						else if ( ((LA17_93 >= '\u0000' && LA17_93 <= '\b')||(LA17_93 >= '\u000B' && LA17_93 <= '\f')||(LA17_93 >= '\u000E' && LA17_93 <= '\u001F')||(LA17_93 >= '!' && LA17_93 <= '#')||(LA17_93 >= '%' && LA17_93 <= '&')||LA17_93=='+'||LA17_93=='-'||(LA17_93 >= '0' && LA17_93 <= '9')||(LA17_93 >= '<' && LA17_93 <= 'K')||(LA17_93 >= 'M' && LA17_93 <= 'Z')||LA17_93=='\\'||(LA17_93 >= '^' && LA17_93 <= 'z')||LA17_93=='|'||(LA17_93 >= '~' && LA17_93 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_55 = input.LA(1);
						s = -1;
						if ( ((LA17_55 >= '0' && LA17_55 <= '9')||(LA17_55 >= 'A' && LA17_55 <= 'Z')) ) {s = 77;}
						else if ( ((LA17_55 >= '\u0000' && LA17_55 <= '\b')||(LA17_55 >= '\u000B' && LA17_55 <= '\f')||(LA17_55 >= '\u000E' && LA17_55 <= '\u001F')||(LA17_55 >= '!' && LA17_55 <= '#')||(LA17_55 >= '%' && LA17_55 <= '&')||LA17_55=='+'||LA17_55=='-'||(LA17_55 >= '<' && LA17_55 <= '@')||LA17_55=='\\'||(LA17_55 >= '^' && LA17_55 <= 'z')||LA17_55=='|'||(LA17_55 >= '~' && LA17_55 <= '\uFFFF')) ) {s = 38;}
						else s = 84;
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_14 = input.LA(1);
						s = -1;
						if ( (LA17_14=='=') ) {s = 45;}
						else if ( ((LA17_14 >= '\u0000' && LA17_14 <= '\b')||(LA17_14 >= '\u000B' && LA17_14 <= '\f')||(LA17_14 >= '\u000E' && LA17_14 <= '\u001F')||(LA17_14 >= '!' && LA17_14 <= '#')||(LA17_14 >= '%' && LA17_14 <= '&')||LA17_14=='+'||LA17_14=='-'||(LA17_14 >= '0' && LA17_14 <= '9')||LA17_14=='<'||(LA17_14 >= '>' && LA17_14 <= 'Z')||LA17_14=='\\'||(LA17_14 >= '^' && LA17_14 <= 'z')||LA17_14=='|'||(LA17_14 >= '~' && LA17_14 <= '\uFFFF')) ) {s = 38;}
						else s = 46;
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_133 = input.LA(1);
						s = -1;
						if ( ((LA17_133 >= '\u0000' && LA17_133 <= '\b')||(LA17_133 >= '\u000B' && LA17_133 <= '\f')||(LA17_133 >= '\u000E' && LA17_133 <= '\u001F')||(LA17_133 >= '!' && LA17_133 <= '#')||(LA17_133 >= '%' && LA17_133 <= '&')||LA17_133=='+'||LA17_133=='-'||(LA17_133 >= '0' && LA17_133 <= '9')||(LA17_133 >= '<' && LA17_133 <= 'Z')||LA17_133=='\\'||(LA17_133 >= '^' && LA17_133 <= 'z')||LA17_133=='|'||(LA17_133 >= '~' && LA17_133 <= '\uFFFF')) ) {s = 38;}
						else s = 149;
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA17_85 = input.LA(1);
						s = -1;
						if ( (LA17_85=='I') ) {s = 113;}
						else if ( ((LA17_85 >= '\u0000' && LA17_85 <= '\b')||(LA17_85 >= '\u000B' && LA17_85 <= '\f')||(LA17_85 >= '\u000E' && LA17_85 <= '\u001F')||(LA17_85 >= '!' && LA17_85 <= '#')||(LA17_85 >= '%' && LA17_85 <= '&')||LA17_85=='+'||LA17_85=='-'||(LA17_85 >= '0' && LA17_85 <= '9')||(LA17_85 >= '<' && LA17_85 <= 'H')||(LA17_85 >= 'J' && LA17_85 <= 'Z')||LA17_85=='\\'||(LA17_85 >= '^' && LA17_85 <= 'z')||LA17_85=='|'||(LA17_85 >= '~' && LA17_85 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA17_150 = input.LA(1);
						s = -1;
						if ( ((LA17_150 >= '\u0000' && LA17_150 <= '\b')||(LA17_150 >= '\u000B' && LA17_150 <= '\f')||(LA17_150 >= '\u000E' && LA17_150 <= '\u001F')||(LA17_150 >= '!' && LA17_150 <= '#')||(LA17_150 >= '%' && LA17_150 <= '&')||LA17_150=='+'||LA17_150=='-'||(LA17_150 >= '0' && LA17_150 <= '9')||(LA17_150 >= '<' && LA17_150 <= 'Z')||LA17_150=='\\'||(LA17_150 >= '^' && LA17_150 <= 'z')||LA17_150=='|'||(LA17_150 >= '~' && LA17_150 <= '\uFFFF')) ) {s = 38;}
						else s = 164;
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA17_152 = input.LA(1);
						s = -1;
						if ( ((LA17_152 >= '\u0000' && LA17_152 <= '\b')||(LA17_152 >= '\u000B' && LA17_152 <= '\f')||(LA17_152 >= '\u000E' && LA17_152 <= '\u001F')||(LA17_152 >= '!' && LA17_152 <= '#')||(LA17_152 >= '%' && LA17_152 <= '&')||LA17_152=='+'||LA17_152=='-'||(LA17_152 >= '0' && LA17_152 <= '9')||(LA17_152 >= '<' && LA17_152 <= 'Z')||LA17_152=='\\'||(LA17_152 >= '^' && LA17_152 <= 'z')||LA17_152=='|'||(LA17_152 >= '~' && LA17_152 <= '\uFFFF')) ) {s = 38;}
						else s = 164;
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA17_162 = input.LA(1);
						s = -1;
						if ( ((LA17_162 >= '\u0000' && LA17_162 <= '\b')||(LA17_162 >= '\u000B' && LA17_162 <= '\f')||(LA17_162 >= '\u000E' && LA17_162 <= '\u001F')||(LA17_162 >= '!' && LA17_162 <= '#')||(LA17_162 >= '%' && LA17_162 <= '&')||LA17_162=='+'||LA17_162=='-'||(LA17_162 >= '0' && LA17_162 <= '9')||(LA17_162 >= '<' && LA17_162 <= 'Z')||LA17_162=='\\'||(LA17_162 >= '^' && LA17_162 <= 'z')||LA17_162=='|'||(LA17_162 >= '~' && LA17_162 <= '\uFFFF')) ) {s = 38;}
						else s = 174;
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA17_96 = input.LA(1);
						s = -1;
						if ( (LA17_96=='U') ) {s = 124;}
						else if ( ((LA17_96 >= '\u0000' && LA17_96 <= '\b')||(LA17_96 >= '\u000B' && LA17_96 <= '\f')||(LA17_96 >= '\u000E' && LA17_96 <= '\u001F')||(LA17_96 >= '!' && LA17_96 <= '#')||(LA17_96 >= '%' && LA17_96 <= '&')||LA17_96=='+'||LA17_96=='-'||(LA17_96 >= '0' && LA17_96 <= '9')||(LA17_96 >= '<' && LA17_96 <= 'T')||(LA17_96 >= 'V' && LA17_96 <= 'Z')||LA17_96=='\\'||(LA17_96 >= '^' && LA17_96 <= 'z')||LA17_96=='|'||(LA17_96 >= '~' && LA17_96 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA17_172 = input.LA(1);
						s = -1;
						if ( ((LA17_172 >= '\u0000' && LA17_172 <= '\b')||(LA17_172 >= '\u000B' && LA17_172 <= '\f')||(LA17_172 >= '\u000E' && LA17_172 <= '\u001F')||(LA17_172 >= '!' && LA17_172 <= '#')||(LA17_172 >= '%' && LA17_172 <= '&')||LA17_172=='+'||LA17_172=='-'||(LA17_172 >= '0' && LA17_172 <= '9')||(LA17_172 >= '<' && LA17_172 <= 'Z')||LA17_172=='\\'||(LA17_172 >= '^' && LA17_172 <= 'z')||LA17_172=='|'||(LA17_172 >= '~' && LA17_172 <= '\uFFFF')) ) {s = 38;}
						else s = 174;
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA17_11 = input.LA(1);
						s = -1;
						if ( ((LA17_11 >= '\u0000' && LA17_11 <= '\b')||(LA17_11 >= '\u000B' && LA17_11 <= '\f')||(LA17_11 >= '\u000E' && LA17_11 <= '\u001F')||(LA17_11 >= '!' && LA17_11 <= '#')||(LA17_11 >= '%' && LA17_11 <= '&')||LA17_11=='+'||LA17_11=='-'||(LA17_11 >= '0' && LA17_11 <= '9')||(LA17_11 >= '<' && LA17_11 <= 'Z')||LA17_11=='\\'||(LA17_11 >= '^' && LA17_11 <= 'z')||LA17_11=='|'||(LA17_11 >= '~' && LA17_11 <= '\uFFFF')) ) {s = 38;}
						else s = 41;
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA17_0 = input.LA(1);
						s = -1;
						if ( ((LA17_0 >= '\t' && LA17_0 <= '\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 1;}
						else if ( (LA17_0=='#') ) {s = 2;}
						else if ( (LA17_0=='(') ) {s = 3;}
						else if ( (LA17_0==')') ) {s = 4;}
						else if ( (LA17_0=='{') ) {s = 5;}
						else if ( (LA17_0=='}') ) {s = 6;}
						else if ( (LA17_0==':') ) {s = 7;}
						else if ( (LA17_0==',') ) {s = 8;}
						else if ( (LA17_0=='.') ) {s = 9;}
						else if ( (LA17_0==';') ) {s = 10;}
						else if ( (LA17_0=='=') ) {s = 11;}
						else if ( (LA17_0=='!') ) {s = 12;}
						else if ( (LA17_0=='>') ) {s = 13;}
						else if ( (LA17_0=='<') ) {s = 14;}
						else if ( (LA17_0=='M') ) {s = 15;}
						else if ( (LA17_0=='L') ) {s = 16;}
						else if ( (LA17_0=='I') ) {s = 17;}
						else if ( (LA17_0=='N') ) {s = 18;}
						else if ( (LA17_0=='A') ) {s = 19;}
						else if ( (LA17_0=='O') ) {s = 20;}
						else if ( (LA17_0=='t') ) {s = 21;}
						else if ( (LA17_0=='f') ) {s = 22;}
						else if ( (LA17_0=='s') ) {s = 23;}
						else if ( (LA17_0=='S') ) {s = 24;}
						else if ( (LA17_0=='d') ) {s = 25;}
						else if ( (LA17_0=='D') ) {s = 26;}
						else if ( (LA17_0=='o') ) {s = 27;}
						else if ( (LA17_0=='r') ) {s = 28;}
						else if ( (LA17_0=='R') ) {s = 29;}
						else if ( (LA17_0=='a') ) {s = 30;}
						else if ( (LA17_0=='w') ) {s = 31;}
						else if ( (LA17_0=='W') ) {s = 32;}
						else if ( (LA17_0=='m') ) {s = 33;}
						else if ( ((LA17_0 >= 'B' && LA17_0 <= 'C')||(LA17_0 >= 'E' && LA17_0 <= 'H')||(LA17_0 >= 'J' && LA17_0 <= 'K')||(LA17_0 >= 'P' && LA17_0 <= 'Q')||(LA17_0 >= 'T' && LA17_0 <= 'V')||(LA17_0 >= 'X' && LA17_0 <= 'Z')) ) {s = 34;}
						else if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {s = 35;}
						else if ( (LA17_0=='\"') ) {s = 36;}
						else if ( (LA17_0=='\'') ) {s = 37;}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\b')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\u001F')||(LA17_0 >= '%' && LA17_0 <= '&')||LA17_0=='+'||LA17_0=='-'||(LA17_0 >= '?' && LA17_0 <= '@')||LA17_0=='\\'||(LA17_0 >= '^' && LA17_0 <= '`')||(LA17_0 >= 'b' && LA17_0 <= 'c')||LA17_0=='e'||(LA17_0 >= 'g' && LA17_0 <= 'l')||LA17_0=='n'||(LA17_0 >= 'p' && LA17_0 <= 'q')||(LA17_0 >= 'u' && LA17_0 <= 'v')||(LA17_0 >= 'x' && LA17_0 <= 'z')||LA17_0=='|'||(LA17_0 >= '~' && LA17_0 <= '\uFFFF')) ) {s = 38;}
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA17_2 = input.LA(1);
						s = -1;
						if ( ((LA17_2 >= '\u0000' && LA17_2 <= '\b')||(LA17_2 >= '\u000B' && LA17_2 <= '\f')||(LA17_2 >= '\u000E' && LA17_2 <= '\u001F')||(LA17_2 >= '!' && LA17_2 <= '#')||(LA17_2 >= '%' && LA17_2 <= '&')||LA17_2=='+'||LA17_2=='-'||(LA17_2 >= '0' && LA17_2 <= '9')||(LA17_2 >= '<' && LA17_2 <= 'Z')||LA17_2=='\\'||(LA17_2 >= '^' && LA17_2 <= 'z')||LA17_2=='|'||(LA17_2 >= '~' && LA17_2 <= '\uFFFF')) ) {s = 39;}
						else if ( ((LA17_2 >= '\t' && LA17_2 <= '\n')||LA17_2=='\r'||LA17_2==' '||LA17_2=='$'||(LA17_2 >= '\'' && LA17_2 <= '*')||LA17_2==','||(LA17_2 >= '.' && LA17_2 <= '/')||(LA17_2 >= ':' && LA17_2 <= ';')||LA17_2=='['||LA17_2==']'||LA17_2=='{'||LA17_2=='}') ) {s = 40;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA17_42 = input.LA(1);
						s = -1;
						if ( ((LA17_42 >= '\u0000' && LA17_42 <= '\b')||(LA17_42 >= '\u000B' && LA17_42 <= '\f')||(LA17_42 >= '\u000E' && LA17_42 <= '\u001F')||(LA17_42 >= '!' && LA17_42 <= '#')||(LA17_42 >= '%' && LA17_42 <= '&')||LA17_42=='+'||LA17_42=='-'||(LA17_42 >= '0' && LA17_42 <= '9')||(LA17_42 >= '<' && LA17_42 <= 'Z')||LA17_42=='\\'||(LA17_42 >= '^' && LA17_42 <= 'z')||LA17_42=='|'||(LA17_42 >= '~' && LA17_42 <= '\uFFFF')) ) {s = 38;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA17_98 = input.LA(1);
						s = -1;
						if ( (LA17_98=='R') ) {s = 126;}
						else if ( ((LA17_98 >= '\u0000' && LA17_98 <= '\b')||(LA17_98 >= '\u000B' && LA17_98 <= '\f')||(LA17_98 >= '\u000E' && LA17_98 <= '\u001F')||(LA17_98 >= '!' && LA17_98 <= '#')||(LA17_98 >= '%' && LA17_98 <= '&')||LA17_98=='+'||LA17_98=='-'||(LA17_98 >= '0' && LA17_98 <= '9')||(LA17_98 >= '<' && LA17_98 <= 'Q')||(LA17_98 >= 'S' && LA17_98 <= 'Z')||LA17_98=='\\'||(LA17_98 >= '^' && LA17_98 <= 'z')||LA17_98=='|'||(LA17_98 >= '~' && LA17_98 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA17_167 = input.LA(1);
						s = -1;
						if ( ((LA17_167 >= '\u0000' && LA17_167 <= '\b')||(LA17_167 >= '\u000B' && LA17_167 <= '\f')||(LA17_167 >= '\u000E' && LA17_167 <= '\u001F')||(LA17_167 >= '!' && LA17_167 <= '#')||(LA17_167 >= '%' && LA17_167 <= '&')||LA17_167=='+'||LA17_167=='-'||(LA17_167 >= '0' && LA17_167 <= '9')||(LA17_167 >= '<' && LA17_167 <= 'Z')||LA17_167=='\\'||(LA17_167 >= '^' && LA17_167 <= 'z')||LA17_167=='|'||(LA17_167 >= '~' && LA17_167 <= '\uFFFF')) ) {s = 38;}
						else s = 177;
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA17_78 = input.LA(1);
						s = -1;
						if ( (LA17_78=='S') ) {s = 108;}
						else if ( ((LA17_78 >= '\u0000' && LA17_78 <= '\b')||(LA17_78 >= '\u000B' && LA17_78 <= '\f')||(LA17_78 >= '\u000E' && LA17_78 <= '\u001F')||(LA17_78 >= '!' && LA17_78 <= '#')||(LA17_78 >= '%' && LA17_78 <= '&')||LA17_78=='+'||LA17_78=='-'||(LA17_78 >= '0' && LA17_78 <= '9')||(LA17_78 >= '<' && LA17_78 <= 'R')||(LA17_78 >= 'T' && LA17_78 <= 'Z')||LA17_78=='\\'||(LA17_78 >= '^' && LA17_78 <= 'z')||LA17_78=='|'||(LA17_78 >= '~' && LA17_78 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA17_168 = input.LA(1);
						s = -1;
						if ( ((LA17_168 >= '\u0000' && LA17_168 <= '\b')||(LA17_168 >= '\u000B' && LA17_168 <= '\f')||(LA17_168 >= '\u000E' && LA17_168 <= '\u001F')||(LA17_168 >= '!' && LA17_168 <= '#')||(LA17_168 >= '%' && LA17_168 <= '&')||LA17_168=='+'||LA17_168=='-'||(LA17_168 >= '0' && LA17_168 <= '9')||(LA17_168 >= '<' && LA17_168 <= 'Z')||LA17_168=='\\'||(LA17_168 >= '^' && LA17_168 <= 'z')||LA17_168=='|'||(LA17_168 >= '~' && LA17_168 <= '\uFFFF')) ) {s = 38;}
						else s = 177;
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA17_100 = input.LA(1);
						s = -1;
						if ( (LA17_100=='\"') ) {s = 72;}
						else if ( (LA17_100=='\\') ) {s = 70;}
						else if ( ((LA17_100 >= '\u0000' && LA17_100 <= '\b')||(LA17_100 >= '\u000B' && LA17_100 <= '\f')||(LA17_100 >= '\u000E' && LA17_100 <= '\u001F')||LA17_100=='!'||LA17_100=='#'||(LA17_100 >= '%' && LA17_100 <= '&')||LA17_100=='+'||LA17_100=='-'||(LA17_100 >= '0' && LA17_100 <= '9')||(LA17_100 >= '<' && LA17_100 <= 'Z')||(LA17_100 >= '^' && LA17_100 <= 'z')||LA17_100=='|'||(LA17_100 >= '~' && LA17_100 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_100==' '||LA17_100=='$'||(LA17_100 >= '\'' && LA17_100 <= '*')||LA17_100==','||(LA17_100 >= '.' && LA17_100 <= '/')||(LA17_100 >= ':' && LA17_100 <= ';')||LA17_100=='['||LA17_100==']'||LA17_100=='{'||LA17_100=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA17_166 = input.LA(1);
						s = -1;
						if ( ((LA17_166 >= '\u0000' && LA17_166 <= '\b')||(LA17_166 >= '\u000B' && LA17_166 <= '\f')||(LA17_166 >= '\u000E' && LA17_166 <= '\u001F')||(LA17_166 >= '!' && LA17_166 <= '#')||(LA17_166 >= '%' && LA17_166 <= '&')||LA17_166=='+'||LA17_166=='-'||(LA17_166 >= '0' && LA17_166 <= '9')||(LA17_166 >= '<' && LA17_166 <= 'Z')||LA17_166=='\\'||(LA17_166 >= '^' && LA17_166 <= 'z')||LA17_166=='|'||(LA17_166 >= '~' && LA17_166 <= '\uFFFF')) ) {s = 38;}
						else s = 176;
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA17_43 = input.LA(1);
						s = -1;
						if ( ((LA17_43 >= '\u0000' && LA17_43 <= '\b')||(LA17_43 >= '\u000B' && LA17_43 <= '\f')||(LA17_43 >= '\u000E' && LA17_43 <= '\u001F')||(LA17_43 >= '!' && LA17_43 <= '#')||(LA17_43 >= '%' && LA17_43 <= '&')||LA17_43=='+'||LA17_43=='-'||(LA17_43 >= '0' && LA17_43 <= '9')||(LA17_43 >= '<' && LA17_43 <= 'Z')||LA17_43=='\\'||(LA17_43 >= '^' && LA17_43 <= 'z')||LA17_43=='|'||(LA17_43 >= '~' && LA17_43 <= '\uFFFF')) ) {s = 38;}
						else s = 74;
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA17_70 = input.LA(1);
						s = -1;
						if ( (LA17_70=='\"') ) {s = 100;}
						else if ( ((LA17_70 >= '\t' && LA17_70 <= '\n')||LA17_70=='\r'||LA17_70==' '||LA17_70=='$'||(LA17_70 >= '\'' && LA17_70 <= '*')||LA17_70==','||(LA17_70 >= '.' && LA17_70 <= '/')||(LA17_70 >= ':' && LA17_70 <= ';')||LA17_70=='['||LA17_70==']'||LA17_70=='{'||LA17_70=='}') ) {s = 37;}
						else if ( (LA17_70=='r') ) {s = 101;}
						else if ( (LA17_70=='n') ) {s = 102;}
						else if ( (LA17_70=='t') ) {s = 103;}
						else if ( (LA17_70=='\\') ) {s = 104;}
						else if ( ((LA17_70 >= '\u0000' && LA17_70 <= '\b')||(LA17_70 >= '\u000B' && LA17_70 <= '\f')||(LA17_70 >= '\u000E' && LA17_70 <= '\u001F')||LA17_70=='!'||LA17_70=='#'||(LA17_70 >= '%' && LA17_70 <= '&')||LA17_70=='+'||LA17_70=='-'||(LA17_70 >= '0' && LA17_70 <= '9')||(LA17_70 >= '<' && LA17_70 <= 'Z')||(LA17_70 >= '^' && LA17_70 <= 'm')||(LA17_70 >= 'o' && LA17_70 <= 'q')||LA17_70=='s'||(LA17_70 >= 'u' && LA17_70 <= 'z')||LA17_70=='|'||(LA17_70 >= '~' && LA17_70 <= '\uFFFF')) ) {s = 105;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA17_36 = input.LA(1);
						s = -1;
						if ( (LA17_36=='\\') ) {s = 70;}
						else if ( ((LA17_36 >= '\u0000' && LA17_36 <= '\b')||(LA17_36 >= '\u000B' && LA17_36 <= '\f')||(LA17_36 >= '\u000E' && LA17_36 <= '\u001F')||LA17_36=='!'||LA17_36=='#'||(LA17_36 >= '%' && LA17_36 <= '&')||LA17_36=='+'||LA17_36=='-'||(LA17_36 >= '0' && LA17_36 <= '9')||(LA17_36 >= '<' && LA17_36 <= 'Z')||(LA17_36 >= '^' && LA17_36 <= 'z')||LA17_36=='|'||(LA17_36 >= '~' && LA17_36 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_36=='\"') ) {s = 72;}
						else if ( (LA17_36==' '||LA17_36=='$'||(LA17_36 >= '\'' && LA17_36 <= '*')||LA17_36==','||(LA17_36 >= '.' && LA17_36 <= '/')||(LA17_36 >= ':' && LA17_36 <= ';')||LA17_36=='['||LA17_36==']'||LA17_36=='{'||LA17_36=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA17_165 = input.LA(1);
						s = -1;
						if ( ((LA17_165 >= '\u0000' && LA17_165 <= '\b')||(LA17_165 >= '\u000B' && LA17_165 <= '\f')||(LA17_165 >= '\u000E' && LA17_165 <= '\u001F')||(LA17_165 >= '!' && LA17_165 <= '#')||(LA17_165 >= '%' && LA17_165 <= '&')||LA17_165=='+'||LA17_165=='-'||(LA17_165 >= '0' && LA17_165 <= '9')||(LA17_165 >= '<' && LA17_165 <= 'Z')||LA17_165=='\\'||(LA17_165 >= '^' && LA17_165 <= 'z')||LA17_165=='|'||(LA17_165 >= '~' && LA17_165 <= '\uFFFF')) ) {s = 38;}
						else s = 176;
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA17_71 = input.LA(1);
						s = -1;
						if ( (LA17_71=='\"') ) {s = 72;}
						else if ( (LA17_71=='\\') ) {s = 70;}
						else if ( ((LA17_71 >= '\u0000' && LA17_71 <= '\b')||(LA17_71 >= '\u000B' && LA17_71 <= '\f')||(LA17_71 >= '\u000E' && LA17_71 <= '\u001F')||LA17_71=='!'||LA17_71=='#'||(LA17_71 >= '%' && LA17_71 <= '&')||LA17_71=='+'||LA17_71=='-'||(LA17_71 >= '0' && LA17_71 <= '9')||(LA17_71 >= '<' && LA17_71 <= 'Z')||(LA17_71 >= '^' && LA17_71 <= 'z')||LA17_71=='|'||(LA17_71 >= '~' && LA17_71 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_71==' '||LA17_71=='$'||(LA17_71 >= '\'' && LA17_71 <= '*')||LA17_71==','||(LA17_71 >= '.' && LA17_71 <= '/')||(LA17_71 >= ':' && LA17_71 <= ';')||LA17_71=='['||LA17_71==']'||LA17_71=='{'||LA17_71=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA17_101 = input.LA(1);
						s = -1;
						if ( (LA17_101=='\"') ) {s = 72;}
						else if ( (LA17_101=='\\') ) {s = 70;}
						else if ( ((LA17_101 >= '\u0000' && LA17_101 <= '\b')||(LA17_101 >= '\u000B' && LA17_101 <= '\f')||(LA17_101 >= '\u000E' && LA17_101 <= '\u001F')||LA17_101=='!'||LA17_101=='#'||(LA17_101 >= '%' && LA17_101 <= '&')||LA17_101=='+'||LA17_101=='-'||(LA17_101 >= '0' && LA17_101 <= '9')||(LA17_101 >= '<' && LA17_101 <= 'Z')||(LA17_101 >= '^' && LA17_101 <= 'z')||LA17_101=='|'||(LA17_101 >= '~' && LA17_101 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_101==' '||LA17_101=='$'||(LA17_101 >= '\'' && LA17_101 <= '*')||LA17_101==','||(LA17_101 >= '.' && LA17_101 <= '/')||(LA17_101 >= ':' && LA17_101 <= ';')||LA17_101=='['||LA17_101==']'||LA17_101=='{'||LA17_101=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA17_91 = input.LA(1);
						s = -1;
						if ( (LA17_91=='M') ) {s = 119;}
						else if ( ((LA17_91 >= '\u0000' && LA17_91 <= '\b')||(LA17_91 >= '\u000B' && LA17_91 <= '\f')||(LA17_91 >= '\u000E' && LA17_91 <= '\u001F')||(LA17_91 >= '!' && LA17_91 <= '#')||(LA17_91 >= '%' && LA17_91 <= '&')||LA17_91=='+'||LA17_91=='-'||(LA17_91 >= '0' && LA17_91 <= '9')||(LA17_91 >= '<' && LA17_91 <= 'L')||(LA17_91 >= 'N' && LA17_91 <= 'Z')||LA17_91=='\\'||(LA17_91 >= '^' && LA17_91 <= 'z')||LA17_91=='|'||(LA17_91 >= '~' && LA17_91 <= '\uFFFF')) ) {s = 38;}
						else s = 107;
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA17_102 = input.LA(1);
						s = -1;
						if ( (LA17_102=='\"') ) {s = 72;}
						else if ( (LA17_102=='\\') ) {s = 70;}
						else if ( ((LA17_102 >= '\u0000' && LA17_102 <= '\b')||(LA17_102 >= '\u000B' && LA17_102 <= '\f')||(LA17_102 >= '\u000E' && LA17_102 <= '\u001F')||LA17_102=='!'||LA17_102=='#'||(LA17_102 >= '%' && LA17_102 <= '&')||LA17_102=='+'||LA17_102=='-'||(LA17_102 >= '0' && LA17_102 <= '9')||(LA17_102 >= '<' && LA17_102 <= 'Z')||(LA17_102 >= '^' && LA17_102 <= 'z')||LA17_102=='|'||(LA17_102 >= '~' && LA17_102 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_102==' '||LA17_102=='$'||(LA17_102 >= '\'' && LA17_102 <= '*')||LA17_102==','||(LA17_102 >= '.' && LA17_102 <= '/')||(LA17_102 >= ':' && LA17_102 <= ';')||LA17_102=='['||LA17_102==']'||LA17_102=='{'||LA17_102=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA17_103 = input.LA(1);
						s = -1;
						if ( (LA17_103=='\"') ) {s = 72;}
						else if ( (LA17_103=='\\') ) {s = 70;}
						else if ( ((LA17_103 >= '\u0000' && LA17_103 <= '\b')||(LA17_103 >= '\u000B' && LA17_103 <= '\f')||(LA17_103 >= '\u000E' && LA17_103 <= '\u001F')||LA17_103=='!'||LA17_103=='#'||(LA17_103 >= '%' && LA17_103 <= '&')||LA17_103=='+'||LA17_103=='-'||(LA17_103 >= '0' && LA17_103 <= '9')||(LA17_103 >= '<' && LA17_103 <= 'Z')||(LA17_103 >= '^' && LA17_103 <= 'z')||LA17_103=='|'||(LA17_103 >= '~' && LA17_103 <= '\uFFFF')) ) {s = 71;}
						else if ( (LA17_103==' '||LA17_103=='$'||(LA17_103 >= '\'' && LA17_103 <= '*')||LA17_103==','||(LA17_103 >= '.' && LA17_103 <= '/')||(LA17_103 >= ':' && LA17_103 <= ';')||LA17_103=='['||LA17_103==']'||LA17_103=='{'||LA17_103=='}') ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
