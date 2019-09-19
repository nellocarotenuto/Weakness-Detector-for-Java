/* Generated By:JavaCC: Do not edit this line. SSPTParser.java */
package org.apache.camel.component.sql.stored.template.generated;

import java.io.Reader;

import org.apache.camel.spi.ClassResolver;
import org.apache.camel.component.sql.stored.template.ast.*;

public class SSPTParser implements SSPTParserConstants {
   int parameterNameCounter = 0;

   ClassResolver classResolver;

   public SSPTParser(Reader reader, ClassResolver classResolver) {
     this(reader);
     this.classResolver = classResolver;
   }

   String createNextParameterName() {
      return "_"+(parameterNameCounter++);
   }

  final public Template parse() throws ParseException {
    Token procedureName;
    Template template = new Template();
    Object parameter = null;
    procedureName = jj_consume_token(IDENTIFIER);
    jj_consume_token(PROCEDURE_BEGIN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 2:
    case NUMBER:
    case PARAMETER_NAME:
    case IDENTIFIER:
      parameter = Parameter();
                                                                               template.addParameter(parameter);
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEPARATOR:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        jj_consume_token(SEPARATOR);
        parameter = Parameter();
                template.addParameter(parameter);
      }
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    jj_consume_token(PROCEDURE_END);
    jj_consume_token(0);
   template.setProcedureName(procedureName.toString());
   {if (true) return template;}
    throw new Error("Missing return statement in function");
  }

  final public Object Parameter() throws ParseException {
    Object param;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
    case PARAMETER_NAME:
    case IDENTIFIER:
      param = InputParameter();
                                {if (true) return param;}
      break;
    case 2:
      param = OutParameter();
                                                                          {if (true) return param;}
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public InputParameter InputParameter() throws ParseException {
     Token sqlTypeToken;
     String name = null;
     Token valueSrcToken;
     Integer scale = null;
     String typeName = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARAMETER_NAME:
      name = ParameterName();
      jj_consume_token(1);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    sqlTypeToken = ParameterSqlType();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SCALE:
      scale = Scale();
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    jj_consume_token(1);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARAMETER_NAME:
      typeName = ParameterName();
      jj_consume_token(1);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    valueSrcToken = InputParameterSrc();
        int sqlType = ParseHelper.parseSqlType(sqlTypeToken, classResolver);

        {if (true) return new InputParameter(name == null ? createNextParameterName() : name, sqlType, valueSrcToken, scale, typeName);}
    throw new Error("Missing return statement in function");
  }

  final public OutParameter OutParameter() throws ParseException {
     Token sqlTypeToken;
     String outValueMapKey;
     Integer scale = null;
     String typeName = null;
    jj_consume_token(2);
    sqlTypeToken = ParameterSqlType();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SCALE:
      scale = Scale();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    jj_consume_token(1);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARAMETER_NAME:
      typeName = ParameterName();
      jj_consume_token(1);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    outValueMapKey = OutHeader();
        {if (true) return new OutParameter(ParseHelper.parseSqlType(sqlTypeToken, classResolver), outValueMapKey, scale, typeName);}
    throw new Error("Missing return statement in function");
  }

  final public String ParameterName() throws ParseException {
    Token t = null;
    t = jj_consume_token(PARAMETER_NAME);
        {if (true) return ParseHelper.removeQuotes(t.toString()) ;}
    throw new Error("Missing return statement in function");
  }

  final public Integer Scale() throws ParseException {
    Token t;
    t = jj_consume_token(SCALE);
        {if (true) return ParseHelper.parseScale(t);}
    throw new Error("Missing return statement in function");
  }

  final public Token ParameterSqlType() throws ParseException {
    Token t;
    Token scaleToken;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      t = jj_consume_token(NUMBER);
      break;
    case IDENTIFIER:
      t = jj_consume_token(IDENTIFIER);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
        {if (true) return t;}
    throw new Error("Missing return statement in function");
  }

  final public String OutHeader() throws ParseException {
 Token token;
    token = jj_consume_token(IDENTIFIER);
        {if (true) return token.toString();}
    throw new Error("Missing return statement in function");
  }

  final public Token InputParameterSrc() throws ParseException {
    Token ret = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMPLE_EXP_TOKEN:
      ret = jj_consume_token(SIMPLE_EXP_TOKEN);
        {if (true) return ret;}
      break;
    case PARAMETER_POS_TOKEN:
      ret = jj_consume_token(PARAMETER_POS_TOKEN);
            {if (true) return ret;}
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public SSPTParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400,0x18014,0x18014,0x8000,0x8,0x8000,0x8,0x8000,0x10010,0x6000,};
   }

  /** Constructor with InputStream. */
  public SSPTParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SSPTParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SSPTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SSPTParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SSPTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SSPTParser(SSPTParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SSPTParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[17];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 17; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
