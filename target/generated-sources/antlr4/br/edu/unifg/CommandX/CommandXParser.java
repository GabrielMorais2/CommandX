// Generated from CommandX.g4 by ANTLR 4.4
package br.edu.unifg.CommandX;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, FLOAT=3, CHAR=4, BOOLEAN=5, STRING=6, POINTER_INT=7, 
		POINTER_DOUBLE=8, POINTER_FLOAT=9, POINTER_CHAR=10, POINTER_BOOLEAN=11, 
		POINTER_STRING=12, POINTER_VAR=13, PROGRAM=14, VAR=15, PRINT=16, READ=17, 
		FUNC=18, PROC=19, VOID=20, RETURN=21, IF=22, ELSE=23, FOR=24, WHILE=25, 
		ADDITIVE_OPERATOR=26, MULTIPLICATIVE_OPERATOR=27, MOD=28, AND=29, OR=30, 
		NOT=31, PLUS_PLUS=32, MINUS_MINUS=33, RELATIONAL_OPERATOR=34, EQUALITY_OPERATOR=35, 
		ASSIGN=36, PAR_OPEN=37, PAR_CLOSE=38, BRACES_OPEN=39, BRACES_CLOSE=40, 
		BRACKET_OPEN=41, BRACKET_CLOSE=42, SEMICOL=43, COMMA=44, INTEGER_LITERAL=45, 
		BOOLEAN_LITERAL=46, CHAR_LITERAL=47, STRING_LITERAL=48, FLOAT_LITERAL=49, 
		ID=50, LINE_COMMENT=51, BLOCK_COMMENT=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "'double'", "'float'", "'char'", "'boolean'", "'string'", 
		"'int*'", "'double*'", "'float*'", "'char*'", "'boolean*'", "'string*'", 
		"'var*'", "'program'", "'var'", "'print'", "'read'", "'func'", "'proc'", 
		"'void'", "'return'", "'if'", "'else'", "'for'", "'while'", "ADDITIVE_OPERATOR", 
		"MULTIPLICATIVE_OPERATOR", "'%'", "'&&'", "'||'", "'!'", "'++'", "'--'", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "INTEGER_LITERAL", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "FLOAT_LITERAL", "ID", "LINE_COMMENT", 
		"BLOCK_COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_relationalExpression = 2, RULE_arithmeticExpression = 3, 
		RULE_booleanExpression = 4, RULE_integer_literal_or_id = 5, RULE_string = 6, 
		RULE_read = 7, RULE_type_return = 8, RULE_parameter = 9, RULE_parameter_list = 10, 
		RULE_func = 11, RULE_func_i = 12, RULE_increment = 13, RULE_assign_arithmetic = 14, 
		RULE_assign_op = 15, RULE_conditional_expression = 16, RULE_pointer = 17, 
		RULE_declaration = 18, RULE_for_loop = 19, RULE_while_loop = 20, RULE_if_statement = 21, 
		RULE_else_if_statement = 22, RULE_if_else_structure = 23, RULE_decision = 24, 
		RULE_print = 25, RULE_array = 26, RULE_primary_variable = 27;
	public static final String[] ruleNames = {
		"start", "statement", "relationalExpression", "arithmeticExpression", 
		"booleanExpression", "integer_literal_or_id", "string", "read", "type_return", 
		"parameter", "parameter_list", "func", "func_i", "increment", "assign_arithmetic", 
		"assign_op", "conditional_expression", "pointer", "declaration", "for_loop", 
		"while_loop", "if_statement", "else_if_statement", "if_else_structure", 
		"decision", "print", "array", "primary_variable"
	};

	@Override
	public String getGrammarFileName() { return "CommandX.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode PROGRAM() { return getToken(CommandXParser.PROGRAM, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(PROGRAM);
			setState(57); match(ID);
			setState(58); match(BRACES_OPEN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(59); statement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(BRACES_CLOSE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(66); func();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Func_iContext func_i() {
			return getRuleContext(Func_iContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); assign_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76); while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77); decision();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78); read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79); func();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80); func_i();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81); array();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(82); increment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public TerminalNode RELATIONAL_OPERATOR() { return getToken(CommandXParser.RELATIONAL_OPERATOR, 0); }
		public TerminalNode EQUALITY_OPERATOR() { return getToken(CommandXParser.EQUALITY_OPERATOR, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==RELATIONAL_OPERATOR || _la==EQUALITY_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATIVE_OPERATOR() { return getToken(CommandXParser.MULTIPLICATIVE_OPERATOR, 0); }
		public TerminalNode MOD() { return getToken(CommandXParser.MOD, 0); }
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(CommandXParser.ADDITIVE_OPERATOR, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIVE_OPERATOR) | (1L << MULTIPLICATIVE_OPERATOR) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public TerminalNode AND() { return getToken(CommandXParser.AND, 0); }
		public TerminalNode OR() { return getToken(CommandXParser.OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literal_or_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public Integer_literal_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal_or_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterInteger_literal_or_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitInteger_literal_or_id(this);
		}
	}

	public final Integer_literal_or_idContext integer_literal_or_id() throws RecognitionException {
		Integer_literal_or_idContext _localctx = new Integer_literal_or_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer_literal_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode READ() { return getToken(CommandXParser.READ, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(READ);
			setState(96); match(PAR_OPEN);
			setState(97); match(PAR_CLOSE);
			setState(98); match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_returnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CommandXParser.VOID, 0); }
		public Primary_variableContext primary_variable() {
			return getRuleContext(Primary_variableContext.class,0);
		}
		public Type_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterType_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitType_return(this);
		}
	}

	public final Type_returnContext type_return() throws RecognitionException {
		Type_returnContext _localctx = new Type_returnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_return);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case BOOLEAN:
			case STRING:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); primary_variable();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public Type_returnContext type_return() {
			return getRuleContext(Type_returnContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); type_return();
			setState(105); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); parameter();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108); match(COMMA);
				setState(109); parameter();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode RETURN() { return getToken(CommandXParser.RETURN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public Type_returnContext type_return() {
			return getRuleContext(Type_returnContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); type_return();
			setState(116); match(ID);
			setState(117); match(PAR_OPEN);
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << VOID))) != 0)) {
				{
				setState(118); parameter_list();
				}
			}

			setState(121); match(PAR_CLOSE);
			setState(122); match(BRACES_OPEN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(123); statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(RETURN);
			setState(130); match(ID);
			setState(131); match(SEMICOL);
			setState(132); match(BRACES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_iContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Func_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunc_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunc_i(this);
		}
	}

	public final Func_iContext func_i() throws RecognitionException {
		Func_iContext _localctx = new Func_iContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(ID);
			setState(135); match(PAR_OPEN);
			setState(136); match(STRING_LITERAL);
			setState(137); match(PAR_CLOSE);
			setState(138); match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(CommandXParser.PLUS_PLUS, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(CommandXParser.MINUS_MINUS, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_increment);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(ID);
				setState(141); match(PLUS_PLUS);
				setState(142); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); match(ID);
				setState(144); match(MINUS_MINUS);
				setState(145); match(SEMICOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(ID);
				setState(147); match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148); match(ID);
				setState(149); match(MINUS_MINUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_arithmeticContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode ASSIGN() { return getToken(CommandXParser.ASSIGN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public TerminalNode READ() { return getToken(CommandXParser.READ, 0); }
		public Assign_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterAssign_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitAssign_arithmetic(this);
		}
	}

	public final Assign_arithmeticContext assign_arithmetic() throws RecognitionException {
		Assign_arithmeticContext _localctx = new Assign_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign_arithmetic);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(ID);
				setState(153); match(ASSIGN);
				setState(154); match(ID);
				setState(155); arithmeticExpression();
				setState(156); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(ID);
				setState(159); match(ASSIGN);
				setState(160); match(ID);
				setState(161); arithmeticExpression();
				setState(162); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164); match(ID);
				setState(165); match(ASSIGN);
				setState(166); match(ID);
				setState(167); arithmeticExpression();
				setState(168); match(READ);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode ASSIGN() { return getToken(CommandXParser.ASSIGN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_op);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(ID);
				setState(173); match(ASSIGN);
				setState(174); match(INTEGER_LITERAL);
				setState(175); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(ID);
				setState(177); match(ASSIGN);
				setState(178); match(ID);
				setState(179); match(SEMICOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180); match(ID);
				setState(181); match(ASSIGN);
				setState(182); read();
				setState(183); match(SEMICOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185); match(ID);
				setState(186); match(ASSIGN);
				setState(187); match(STRING_LITERAL);
				setState(188); match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(CommandXParser.INTEGER_LITERAL); }
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(CommandXParser.INTEGER_LITERAL, i);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_expression);
		try {
			int _alt;
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(ID);
				setState(192); relationalExpression();
				setState(193); match(ID);
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194); booleanExpression();
						setState(195); conditional_expression();
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(ID);
				setState(203); relationalExpression();
				setState(204); match(INTEGER_LITERAL);
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205); booleanExpression();
						setState(206); conditional_expression();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); match(INTEGER_LITERAL);
				setState(214); relationalExpression();
				setState(215); match(INTEGER_LITERAL);
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216); booleanExpression();
						setState(217); conditional_expression();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224); match(INTEGER_LITERAL);
				setState(225); relationalExpression();
				setState(226); match(ID);
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227); booleanExpression();
						setState(228); conditional_expression();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode POINTER_INT() { return getToken(CommandXParser.POINTER_INT, 0); }
		public TerminalNode POINTER_VAR() { return getToken(CommandXParser.POINTER_VAR, 0); }
		public TerminalNode POINTER_CHAR() { return getToken(CommandXParser.POINTER_CHAR, 0); }
		public TerminalNode POINTER_STRING() { return getToken(CommandXParser.POINTER_STRING, 0); }
		public TerminalNode POINTER_DOUBLE() { return getToken(CommandXParser.POINTER_DOUBLE, 0); }
		public TerminalNode POINTER_BOOLEAN() { return getToken(CommandXParser.POINTER_BOOLEAN, 0); }
		public TerminalNode POINTER_FLOAT() { return getToken(CommandXParser.POINTER_FLOAT, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Assign_arithmeticContext assign_arithmetic() {
			return getRuleContext(Assign_arithmeticContext.class,0);
		}
		public Primary_variableContext primary_variable() {
			return getRuleContext(Primary_variableContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); primary_variable();
				setState(240); match(ID);
				setState(241); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); pointer();
				setState(244); match(ID);
				setState(245); match(SEMICOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247); primary_variable();
				setState(248); assign_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); primary_variable();
				setState(251); assign_arithmetic();
				setState(252); match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode FOR() { return getToken(CommandXParser.FOR, 0); }
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Primary_variableContext primary_variable() {
			return getRuleContext(Primary_variableContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assign_arithmeticContext assign_arithmetic() {
			return getRuleContext(Assign_arithmeticContext.class,0);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop);
		int _la;
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); match(FOR);
				setState(257); match(PAR_OPEN);
				setState(258); primary_variable();
				setState(259); assign_op();
				setState(260); conditional_expression();
				setState(261); match(SEMICOL);
				setState(262); increment();
				setState(263); match(PAR_CLOSE);
				setState(264); match(BRACES_OPEN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(265); statement();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271); match(BRACES_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(FOR);
				setState(274); match(PAR_OPEN);
				setState(275); primary_variable();
				setState(276); assign_op();
				setState(277); conditional_expression();
				setState(278); match(SEMICOL);
				setState(279); assign_arithmetic();
				setState(280); match(PAR_CLOSE);
				setState(281); match(BRACES_OPEN);
				setState(282); statement();
				setState(283); match(BRACES_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285); match(FOR);
				setState(286); match(PAR_OPEN);
				setState(287); assign_op();
				setState(288); conditional_expression();
				setState(289); match(SEMICOL);
				setState(290); assign_arithmetic();
				setState(291); match(PAR_CLOSE);
				setState(292); match(BRACES_OPEN);
				setState(293); statement();
				setState(294); match(BRACES_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296); match(FOR);
				setState(297); match(PAR_OPEN);
				setState(298); primary_variable();
				setState(299); assign_op();
				setState(300); conditional_expression();
				setState(301); match(SEMICOL);
				setState(302); increment();
				setState(303); match(PAR_CLOSE);
				setState(304); match(BRACES_OPEN);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(305); statement();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311); match(BRACES_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WHILE() { return getToken(CommandXParser.WHILE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(WHILE);
			setState(316); match(PAR_OPEN);
			setState(317); conditional_expression();
			setState(318); match(PAR_CLOSE);
			setState(319); match(BRACES_OPEN);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(320); statement();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326); match(BRACES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(IF);
			setState(329); match(PAR_OPEN);
			setState(330); conditional_expression();
			setState(331); match(PAR_CLOSE);
			setState(332); match(BRACES_OPEN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(333); statement();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339); match(BRACES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CommandXParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(ELSE);
			setState(342); match(IF);
			setState(343); match(PAR_OPEN);
			setState(344); conditional_expression();
			setState(345); match(PAR_CLOSE);
			setState(346); match(BRACES_OPEN);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(347); statement();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353); match(BRACES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_structureContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CommandXParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BRACES_CLOSE(int i) {
			return getToken(CommandXParser.BRACES_CLOSE, i);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public List<TerminalNode> BRACES_CLOSE() { return getTokens(CommandXParser.BRACES_CLOSE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN(int i) {
			return getToken(CommandXParser.BRACES_OPEN, i);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public List<TerminalNode> BRACES_OPEN() { return getTokens(CommandXParser.BRACES_OPEN); }
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public If_else_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterIf_else_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitIf_else_structure(this);
		}
	}

	public final If_else_structureContext if_else_structure() throws RecognitionException {
		If_else_structureContext _localctx = new If_else_structureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_else_structure);
		int _la;
		try {
			int _alt;
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); match(IF);
				setState(356); match(PAR_OPEN);
				setState(357); conditional_expression();
				setState(358); match(PAR_CLOSE);
				setState(359); match(BRACES_OPEN);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(360); statement();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366); match(BRACES_CLOSE);
				setState(367); match(ELSE);
				setState(368); match(BRACES_OPEN);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(369); statement();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375); match(BRACES_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); match(IF);
				setState(378); match(PAR_OPEN);
				setState(379); conditional_expression();
				setState(380); match(PAR_CLOSE);
				setState(381); match(BRACES_OPEN);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(382); statement();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388); match(BRACES_CLOSE);
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389); else_if_statement();
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(395); match(ELSE);
				setState(396); match(BRACES_OPEN);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(397); statement();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403); match(BRACES_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405); match(IF);
				setState(406); match(PAR_OPEN);
				setState(407); conditional_expression();
				setState(408); match(PAR_CLOSE);
				setState(409); match(BRACES_OPEN);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << READ) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(410); statement();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416); match(BRACES_CLOSE);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(417); else_if_statement();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecisionContext extends ParserRuleContext {
		public If_else_structureContext if_else_structure() {
			return getRuleContext(If_else_structureContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitDecision(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decision);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); if_else_structure();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CommandXParser.PRINT, 0); }
		public Integer_literal_or_idContext integer_literal_or_id() {
			return getRuleContext(Integer_literal_or_idContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429); match(PRINT);
				setState(430); match(PAR_OPEN);
				setState(431); integer_literal_or_id();
				setState(432); match(PAR_CLOSE);
				setState(433); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435); match(PRINT);
				setState(436); match(PAR_OPEN);
				setState(437); string();
				setState(438); match(PAR_CLOSE);
				setState(439); match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(CommandXParser.INTEGER_LITERAL); }
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(CommandXParser.BRACKET_CLOSE); }
		public Primary_variableContext primary_variable() {
			return getRuleContext(Primary_variableContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(CommandXParser.INTEGER_LITERAL, i);
		}
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(CommandXParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(CommandXParser.BRACKET_OPEN, i);
		}
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(CommandXParser.BRACKET_CLOSE, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array);
		try {
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); primary_variable();
				setState(444); match(ID);
				setState(445); match(BRACKET_OPEN);
				setState(446); match(INTEGER_LITERAL);
				setState(447); match(BRACKET_CLOSE);
				setState(448); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450); primary_variable();
				setState(451); match(ID);
				setState(452); match(BRACKET_OPEN);
				setState(453); match(INTEGER_LITERAL);
				setState(454); match(BRACKET_CLOSE);
				setState(455); match(BRACKET_OPEN);
				setState(456); match(INTEGER_LITERAL);
				setState(457); match(BRACKET_CLOSE);
				setState(458); match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_variableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CommandXParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(CommandXParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(CommandXParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CommandXParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(CommandXParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CommandXParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CommandXParser.FLOAT, 0); }
		public Primary_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPrimary_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPrimary_variable(this);
		}
	}

	public final Primary_variableContext primary_variable() throws RecognitionException {
		Primary_variableContext _localctx = new Primary_variableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u01d3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\5\ni\n\n\3\13\3\13\3\13\3\f\3\f\3\f\7\fq\n"+
		"\f\f\f\16\ft\13\f\3\r\3\r\3\r\3\r\5\rz\n\r\3\r\3\r\3\r\7\r\177\n\r\f\r"+
		"\16\r\u0082\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ad\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00c8\n\22\f\22\16\22\u00cb\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00d3\n\22\f\22\16\22\u00d6\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00de\n\22\f\22\16\22\u00e1\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00e9\n\22\f\22\16\22\u00ec\13\22\5\22\u00ee\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u010d\n\25\f\25\16\25\u0110\13\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0135\n\25\f\25\16\25\u0138\13\25\3\25\3\25\5\25"+
		"\u013c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0144\n\26\f\26\16\26\u0147"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0151\n\27\f\27\16"+
		"\27\u0154\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u015f"+
		"\n\30\f\30\16\30\u0162\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7"+
		"\31\u016c\n\31\f\31\16\31\u016f\13\31\3\31\3\31\3\31\3\31\7\31\u0175\n"+
		"\31\f\31\16\31\u0178\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0182\n\31\f\31\16\31\u0185\13\31\3\31\3\31\7\31\u0189\n\31\f\31\16\31"+
		"\u018c\13\31\3\31\3\31\3\31\7\31\u0191\n\31\f\31\16\31\u0194\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u019e\n\31\f\31\16\31\u01a1\13"+
		"\31\3\31\3\31\7\31\u01a5\n\31\f\31\16\31\u01a8\13\31\5\31\u01aa\n\31\3"+
		"\32\3\32\5\32\u01ae\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01bc\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01cf\n\34\3\35\3\35"+
		"\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\b\3\2$%\3\2\34\36\3\2\37!\4\2//\64\64\3\2\t\17\4\2\3\b\21\21\u01ec"+
		"\2:\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16"+
		"_\3\2\2\2\20a\3\2\2\2\22h\3\2\2\2\24j\3\2\2\2\26m\3\2\2\2\30u\3\2\2\2"+
		"\32\u0088\3\2\2\2\34\u0098\3\2\2\2\36\u00ac\3\2\2\2 \u00bf\3\2\2\2\"\u00ed"+
		"\3\2\2\2$\u00ef\3\2\2\2&\u0100\3\2\2\2(\u013b\3\2\2\2*\u013d\3\2\2\2,"+
		"\u014a\3\2\2\2.\u0157\3\2\2\2\60\u01a9\3\2\2\2\62\u01ad\3\2\2\2\64\u01bb"+
		"\3\2\2\2\66\u01ce\3\2\2\28\u01d0\3\2\2\2:;\7\20\2\2;<\7\64\2\2<@\7)\2"+
		"\2=?\5\4\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2"+
		"\2CG\7*\2\2DF\5\30\r\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2"+
		"\2\2IG\3\2\2\2JV\5&\24\2KV\5 \21\2LV\5\64\33\2MV\5(\25\2NV\5*\26\2OV\5"+
		"\62\32\2PV\5\20\t\2QV\5\30\r\2RV\5\32\16\2SV\5\66\34\2TV\5\34\17\2UJ\3"+
		"\2\2\2UK\3\2\2\2UL\3\2\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3"+
		"\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\5\3\2\2\2WX\t\2\2\2X\7\3\2\2\2Y"+
		"Z\t\3\2\2Z\t\3\2\2\2[\\\t\4\2\2\\\13\3\2\2\2]^\t\5\2\2^\r\3\2\2\2_`\7"+
		"\62\2\2`\17\3\2\2\2ab\7\23\2\2bc\7\'\2\2cd\7(\2\2de\7-\2\2e\21\3\2\2\2"+
		"fi\58\35\2gi\7\26\2\2hf\3\2\2\2hg\3\2\2\2i\23\3\2\2\2jk\5\22\n\2kl\7\64"+
		"\2\2l\25\3\2\2\2mr\5\24\13\2no\7.\2\2oq\5\24\13\2pn\3\2\2\2qt\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tr\3\2\2\2uv\5\22\n\2vw\7\64\2\2wy\7\'"+
		"\2\2xz\5\26\f\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7(\2\2|\u0080\7)\2\2}"+
		"\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\27\2\2\u0084"+
		"\u0085\7\64\2\2\u0085\u0086\7-\2\2\u0086\u0087\7*\2\2\u0087\31\3\2\2\2"+
		"\u0088\u0089\7\64\2\2\u0089\u008a\7\'\2\2\u008a\u008b\7\62\2\2\u008b\u008c"+
		"\7(\2\2\u008c\u008d\7-\2\2\u008d\33\3\2\2\2\u008e\u008f\7\64\2\2\u008f"+
		"\u0090\7\"\2\2\u0090\u0099\7-\2\2\u0091\u0092\7\64\2\2\u0092\u0093\7#"+
		"\2\2\u0093\u0099\7-\2\2\u0094\u0095\7\64\2\2\u0095\u0099\7\"\2\2\u0096"+
		"\u0097\7\64\2\2\u0097\u0099\7#\2\2\u0098\u008e\3\2\2\2\u0098\u0091\3\2"+
		"\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099\35\3\2\2\2\u009a\u009b"+
		"\7\64\2\2\u009b\u009c\7&\2\2\u009c\u009d\7\64\2\2\u009d\u009e\5\b\5\2"+
		"\u009e\u009f\7\64\2\2\u009f\u00ad\3\2\2\2\u00a0\u00a1\7\64\2\2\u00a1\u00a2"+
		"\7&\2\2\u00a2\u00a3\7\64\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\7/\2\2\u00a5"+
		"\u00ad\3\2\2\2\u00a6\u00a7\7\64\2\2\u00a7\u00a8\7&\2\2\u00a8\u00a9\7\64"+
		"\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7\23\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u009a\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\37\3\2\2"+
		"\2\u00ae\u00af\7\64\2\2\u00af\u00b0\7&\2\2\u00b0\u00b1\7/\2\2\u00b1\u00c0"+
		"\7-\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7\64\2\2\u00b5"+
		"\u00c0\7-\2\2\u00b6\u00b7\7\64\2\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\5\20"+
		"\t\2\u00b9\u00ba\7-\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\7\64\2\2\u00bc"+
		"\u00bd\7&\2\2\u00bd\u00be\7\62\2\2\u00be\u00c0\7-\2\2\u00bf\u00ae\3\2"+
		"\2\2\u00bf\u00b2\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00c2\7\64\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c9\7\64\2"+
		"\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\5\"\22\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00ee\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\64\2\2\u00cd"+
		"\u00ce\5\6\4\2\u00ce\u00d4\7/\2\2\u00cf\u00d0\5\n\6\2\u00d0\u00d1\5\""+
		"\22\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00ee\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00df\7/\2\2\u00da\u00db"+
		"\5\n\6\2\u00db\u00dc\5\"\22\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00ee"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\5\6\4\2\u00e4"+
		"\u00ea\7\64\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\5\"\22\2\u00e7\u00e9\3"+
		"\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00c1\3\2"+
		"\2\2\u00ed\u00cc\3\2\2\2\u00ed\u00d7\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ee"+
		"#\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0%\3\2\2\2\u00f1\u00f2\58\35\2\u00f2"+
		"\u00f3\7\64\2\2\u00f3\u00f4\7-\2\2\u00f4\u0101\3\2\2\2\u00f5\u00f6\5$"+
		"\23\2\u00f6\u00f7\7\64\2\2\u00f7\u00f8\7-\2\2\u00f8\u0101\3\2\2\2\u00f9"+
		"\u00fa\58\35\2\u00fa\u00fb\5 \21\2\u00fb\u0101\3\2\2\2\u00fc\u00fd\58"+
		"\35\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\7-\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00f1\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0101\'\3\2\2\2\u0102\u0103\7\32\2\2\u0103\u0104\7\'\2\2\u0104\u0105"+
		"\58\35\2\u0105\u0106\5 \21\2\u0106\u0107\5\"\22\2\u0107\u0108\7-\2\2\u0108"+
		"\u0109\5\34\17\2\u0109\u010a\7(\2\2\u010a\u010e\7)\2\2\u010b\u010d\5\4"+
		"\3\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7*"+
		"\2\2\u0112\u013c\3\2\2\2\u0113\u0114\7\32\2\2\u0114\u0115\7\'\2\2\u0115"+
		"\u0116\58\35\2\u0116\u0117\5 \21\2\u0117\u0118\5\"\22\2\u0118\u0119\7"+
		"-\2\2\u0119\u011a\5\36\20\2\u011a\u011b\7(\2\2\u011b\u011c\7)\2\2\u011c"+
		"\u011d\5\4\3\2\u011d\u011e\7*\2\2\u011e\u013c\3\2\2\2\u011f\u0120\7\32"+
		"\2\2\u0120\u0121\7\'\2\2\u0121\u0122\5 \21\2\u0122\u0123\5\"\22\2\u0123"+
		"\u0124\7-\2\2\u0124\u0125\5\36\20\2\u0125\u0126\7(\2\2\u0126\u0127\7)"+
		"\2\2\u0127\u0128\5\4\3\2\u0128\u0129\7*\2\2\u0129\u013c\3\2\2\2\u012a"+
		"\u012b\7\32\2\2\u012b\u012c\7\'\2\2\u012c\u012d\58\35\2\u012d\u012e\5"+
		" \21\2\u012e\u012f\5\"\22\2\u012f\u0130\7-\2\2\u0130\u0131\5\34\17\2\u0131"+
		"\u0132\7(\2\2\u0132\u0136\7)\2\2\u0133\u0135\5\4\3\2\u0134\u0133\3\2\2"+
		"\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7*\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0102\3\2\2\2\u013b\u0113\3\2\2\2\u013b\u011f\3\2\2\2\u013b\u012a\3\2"+
		"\2\2\u013c)\3\2\2\2\u013d\u013e\7\33\2\2\u013e\u013f\7\'\2\2\u013f\u0140"+
		"\5\"\22\2\u0140\u0141\7(\2\2\u0141\u0145\7)\2\2\u0142\u0144\5\4\3\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7*\2\2\u0149"+
		"+\3\2\2\2\u014a\u014b\7\30\2\2\u014b\u014c\7\'\2\2\u014c\u014d\5\"\22"+
		"\2\u014d\u014e\7(\2\2\u014e\u0152\7)\2\2\u014f\u0151\5\4\3\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7*\2\2\u0156-\3\2\2\2\u0157"+
		"\u0158\7\31\2\2\u0158\u0159\7\30\2\2\u0159\u015a\7\'\2\2\u015a\u015b\5"+
		"\"\22\2\u015b\u015c\7(\2\2\u015c\u0160\7)\2\2\u015d\u015f\5\4\3\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7*\2\2\u0164"+
		"/\3\2\2\2\u0165\u0166\7\30\2\2\u0166\u0167\7\'\2\2\u0167\u0168\5\"\22"+
		"\2\u0168\u0169\7(\2\2\u0169\u016d\7)\2\2\u016a\u016c\5\4\3\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7*\2\2\u0171\u0172\7\31"+
		"\2\2\u0172\u0176\7)\2\2\u0173\u0175\5\4\3\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7*\2\2\u017a\u01aa\3\2\2\2\u017b"+
		"\u017c\7\30\2\2\u017c\u017d\7\'\2\2\u017d\u017e\5\"\22\2\u017e\u017f\7"+
		"(\2\2\u017f\u0183\7)\2\2\u0180\u0182\5\4\3\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u018a\7*\2\2\u0187\u0189\5.\30\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\31\2\2\u018e"+
		"\u0192\7)\2\2\u018f\u0191\5\4\3\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\7*\2\2\u0196\u01aa\3\2\2\2\u0197\u0198\7\30"+
		"\2\2\u0198\u0199\7\'\2\2\u0199\u019a\5\"\22\2\u019a\u019b\7(\2\2\u019b"+
		"\u019f\7)\2\2\u019c\u019e\5\4\3\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a6\7*\2\2\u01a3\u01a5\5.\30\2\u01a4\u01a3\3\2"+
		"\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u0165\3\2\2\2\u01a9\u017b\3\2"+
		"\2\2\u01a9\u0197\3\2\2\2\u01aa\61\3\2\2\2\u01ab\u01ae\5,\27\2\u01ac\u01ae"+
		"\5\60\31\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\63\3\2\2\2\u01af"+
		"\u01b0\7\22\2\2\u01b0\u01b1\7\'\2\2\u01b1\u01b2\5\f\7\2\u01b2\u01b3\7"+
		"(\2\2\u01b3\u01b4\7-\2\2\u01b4\u01bc\3\2\2\2\u01b5\u01b6\7\22\2\2\u01b6"+
		"\u01b7\7\'\2\2\u01b7\u01b8\5\16\b\2\u01b8\u01b9\7(\2\2\u01b9\u01ba\7-"+
		"\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bc"+
		"\65\3\2\2\2\u01bd\u01be\58\35\2\u01be\u01bf\7\64\2\2\u01bf\u01c0\7+\2"+
		"\2\u01c0\u01c1\7/\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\7-\2\2\u01c3\u01cf"+
		"\3\2\2\2\u01c4\u01c5\58\35\2\u01c5\u01c6\7\64\2\2\u01c6\u01c7\7+\2\2\u01c7"+
		"\u01c8\7/\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\7+\2\2\u01ca\u01cb\7/\2\2"+
		"\u01cb\u01cc\7,\2\2\u01cc\u01cd\7-\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01bd"+
		"\3\2\2\2\u01ce\u01c4\3\2\2\2\u01cf\67\3\2\2\2\u01d0\u01d1\t\7\2\2\u01d1"+
		"9\3\2\2\2#@GUhry\u0080\u0098\u00ac\u00bf\u00c9\u00d4\u00df\u00ea\u00ed"+
		"\u0100\u010e\u0136\u013b\u0145\u0152\u0160\u016d\u0176\u0183\u018a\u0192"+
		"\u019f\u01a6\u01a9\u01ad\u01bb\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}