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
		POINTER_STRING=12, POINTER_VAR=13, PROGRAM=14, VAR=15, PRINT=16, FUNC=17, 
		PROC=18, VOID=19, RETURN=20, IF=21, ELSE=22, FOR=23, WHILE=24, ADDITIVE_OPERATOR=25, 
		MULTIPLICATIVE_OPERATOR=26, MOD=27, AND=28, OR=29, NOT=30, PLUS_PLUS=31, 
		MINUS_MINUS=32, RELATIONAL_OPERATOR=33, EQUALITY_OPERATOR=34, ASSIGN=35, 
		PAR_OPEN=36, PAR_CLOSE=37, BRACES_OPEN=38, BRACES_CLOSE=39, BRACKET_OPEN=40, 
		BRACKET_CLOSE=41, SEMICOL=42, COMMA=43, INTEGER_LITERAL=44, BOOLEAN_LITERAL=45, 
		CHAR_LITERAL=46, STRING_LITERAL=47, FLOAT_LITERAL=48, DOUBLE_LITERAL=49, 
		ID=50, LINE_COMMENT=51, BLOCK_COMMENT=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "'double'", "'float'", "'char'", "'boolean'", "'string'", 
		"'int*'", "'double*'", "'float*'", "'char*'", "'boolean*'", "'string*'", 
		"'var*'", "'program'", "'var'", "'print'", "'func'", "'proc'", "'void'", 
		"'return'", "'if'", "'else'", "'for'", "'while'", "ADDITIVE_OPERATOR", 
		"MULTIPLICATIVE_OPERATOR", "'%'", "'&&'", "'||'", "'!'", "'++'", "'--'", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "INTEGER_LITERAL", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "ID", 
		"LINE_COMMENT", "BLOCK_COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_relationalExpression = 2, RULE_arithmeticExpression = 3, 
		RULE_booleanExpression = 4, RULE_integer_literal_or_id = 5, RULE_string = 6, 
		RULE_type_return = 7, RULE_parameter = 8, RULE_parameter_list = 9, RULE_function = 10, 
		RULE_increment = 11, RULE_assign_arithmetic = 12, RULE_assign_operator = 13, 
		RULE_conditional_expression = 14, RULE_pointer = 15, RULE_declaration = 16, 
		RULE_for_loop = 17, RULE_while_loop = 18, RULE_if_statement = 19, RULE_else_if_statement = 20, 
		RULE_if_else_structure = 21, RULE_decision = 22, RULE_print = 23, RULE_array = 24, 
		RULE_primary_variable = 25, RULE_literal_values = 26;
	public static final String[] ruleNames = {
		"start", "statement", "relationalExpression", "arithmeticExpression", 
		"booleanExpression", "integer_literal_or_id", "string", "type_return", 
		"parameter", "parameter_list", "function", "increment", "assign_arithmetic", 
		"assign_operator", "conditional_expression", "pointer", "declaration", 
		"for_loop", "while_loop", "if_statement", "else_if_statement", "if_else_structure", 
		"decision", "print", "array", "primary_variable", "literal_values"
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
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
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
			setState(54); match(PROGRAM);
			setState(55); match(ID);
			setState(56); match(BRACES_OPEN);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(57); statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(BRACES_CLOSE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(64); function();
				}
				}
				setState(69);
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
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); assign_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); decision();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77); array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78); increment();
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
			setState(81);
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
			setState(83);
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
			setState(85);
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
			setState(87);
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
			setState(89); match(STRING_LITERAL);
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
		enterRule(_localctx, 14, RULE_type_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); primary_variable();
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
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); type_return();
			setState(94); match(ID);
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
		enterRule(_localctx, 18, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); parameter();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97); match(COMMA);
				setState(98); parameter();
				}
				}
				setState(103);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public List<Parameter_listContext> parameter_list() {
			return getRuleContexts(Parameter_listContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode RETURN() { return getToken(CommandXParser.RETURN, 0); }
		public Type_returnContext type_return() {
			return getRuleContext(Type_returnContext.class,0);
		}
		public Parameter_listContext parameter_list(int i) {
			return getRuleContext(Parameter_listContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CommandXParser.VOID, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Literal_valuesContext literal_values() {
			return getRuleContext(Literal_valuesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			setState(144);
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
				setState(104); type_return();
				setState(105); match(ID);
				setState(106); match(PAR_OPEN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR))) != 0)) {
					{
					{
					setState(107); parameter_list();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113); match(PAR_CLOSE);
				setState(114); match(BRACES_OPEN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(115); statement();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121); match(RETURN);
				setState(124);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(122); match(ID);
					}
					break;
				case INTEGER_LITERAL:
				case BOOLEAN_LITERAL:
				case CHAR_LITERAL:
				case STRING_LITERAL:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
					{
					setState(123); literal_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); match(SEMICOL);
				setState(127); match(BRACES_CLOSE);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(VOID);
				setState(130); match(ID);
				setState(131); match(PAR_OPEN);
				setState(133);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR))) != 0)) {
					{
					setState(132); parameter_list();
					}
				}

				setState(135); match(PAR_CLOSE);
				setState(136); match(BRACES_OPEN);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(137); statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143); match(BRACES_CLOSE);
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
		enterRule(_localctx, 22, RULE_increment);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(ID);
				setState(147); match(PLUS_PLUS);
				setState(148); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); match(ID);
				setState(150); match(MINUS_MINUS);
				setState(151); match(SEMICOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); match(ID);
				setState(153); match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154); match(ID);
				setState(155); match(MINUS_MINUS);
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
		enterRule(_localctx, 24, RULE_assign_arithmetic);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); match(ID);
				setState(159); match(ASSIGN);
				setState(160); match(ID);
				setState(161); arithmeticExpression();
				setState(162); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(ID);
				setState(165); match(ASSIGN);
				setState(166); match(ID);
				setState(167); arithmeticExpression();
				setState(168); match(INTEGER_LITERAL);
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

	public static class Assign_operatorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode ASSIGN() { return getToken(CommandXParser.ASSIGN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterAssign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitAssign_operator(this);
		}
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_operator);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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
				setState(182); match(STRING_LITERAL);
				setState(183); match(SEMICOL);
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
		enterRule(_localctx, 28, RULE_conditional_expression);
		try {
			int _alt;
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(ID);
				setState(187); relationalExpression();
				setState(188); match(ID);
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189); booleanExpression();
						setState(190); conditional_expression();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); match(ID);
				setState(198); relationalExpression();
				setState(199); match(INTEGER_LITERAL);
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200); booleanExpression();
						setState(201); conditional_expression();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); match(INTEGER_LITERAL);
				setState(209); relationalExpression();
				setState(210); match(INTEGER_LITERAL);
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211); booleanExpression();
						setState(212); conditional_expression();
						}
						} 
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); match(INTEGER_LITERAL);
				setState(220); relationalExpression();
				setState(221); match(ID);
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222); booleanExpression();
						setState(223); conditional_expression();
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 30, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_declaration);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); primary_variable();
				setState(235); match(ID);
				setState(236); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); pointer();
				setState(239); match(ID);
				setState(240); match(SEMICOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242); primary_variable();
				setState(243); assign_operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245); primary_variable();
				setState(246); assign_arithmetic();
				setState(247); match(SEMICOL);
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
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_for_loop);
		int _la;
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(FOR);
				setState(252); match(PAR_OPEN);
				setState(253); primary_variable();
				setState(254); assign_operator();
				setState(255); conditional_expression();
				setState(256); match(SEMICOL);
				setState(257); increment();
				setState(258); match(PAR_CLOSE);
				setState(259); match(BRACES_OPEN);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(260); statement();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266); match(BRACES_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(FOR);
				setState(269); match(PAR_OPEN);
				setState(270); primary_variable();
				setState(271); assign_operator();
				setState(272); conditional_expression();
				setState(273); match(SEMICOL);
				setState(274); assign_arithmetic();
				setState(275); match(PAR_CLOSE);
				setState(276); match(BRACES_OPEN);
				setState(277); statement();
				setState(278); match(BRACES_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); match(FOR);
				setState(281); match(PAR_OPEN);
				setState(282); assign_operator();
				setState(283); conditional_expression();
				setState(284); match(SEMICOL);
				setState(285); assign_arithmetic();
				setState(286); match(PAR_CLOSE);
				setState(287); match(BRACES_OPEN);
				setState(288); statement();
				setState(289); match(BRACES_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291); match(FOR);
				setState(292); match(PAR_OPEN);
				setState(293); primary_variable();
				setState(294); assign_operator();
				setState(295); conditional_expression();
				setState(296); match(SEMICOL);
				setState(297); increment();
				setState(298); match(PAR_CLOSE);
				setState(299); match(BRACES_OPEN);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(300); statement();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306); match(BRACES_CLOSE);
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
		enterRule(_localctx, 36, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(WHILE);
			setState(311); match(PAR_OPEN);
			setState(312); conditional_expression();
			setState(313); match(PAR_CLOSE);
			setState(314); match(BRACES_OPEN);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(315); statement();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321); match(BRACES_CLOSE);
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
		enterRule(_localctx, 38, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(IF);
			setState(324); match(PAR_OPEN);
			setState(325); conditional_expression();
			setState(326); match(PAR_CLOSE);
			setState(327); match(BRACES_OPEN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(328); statement();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334); match(BRACES_CLOSE);
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
		enterRule(_localctx, 40, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(ELSE);
			setState(337); match(IF);
			setState(338); match(PAR_OPEN);
			setState(339); conditional_expression();
			setState(340); match(PAR_CLOSE);
			setState(341); match(BRACES_OPEN);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(342); statement();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348); match(BRACES_CLOSE);
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
		enterRule(_localctx, 42, RULE_if_else_structure);
		int _la;
		try {
			int _alt;
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350); match(IF);
				setState(351); match(PAR_OPEN);
				setState(352); conditional_expression();
				setState(353); match(PAR_CLOSE);
				setState(354); match(BRACES_OPEN);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(355); statement();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361); match(BRACES_CLOSE);
				setState(362); match(ELSE);
				setState(363); match(BRACES_OPEN);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(364); statement();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370); match(BRACES_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372); match(IF);
				setState(373); match(PAR_OPEN);
				setState(374); conditional_expression();
				setState(375); match(PAR_CLOSE);
				setState(376); match(BRACES_OPEN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(377); statement();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383); match(BRACES_CLOSE);
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(384); else_if_statement();
						}
						} 
					}
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(390); match(ELSE);
				setState(391); match(BRACES_OPEN);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(392); statement();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398); match(BRACES_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400); match(IF);
				setState(401); match(PAR_OPEN);
				setState(402); conditional_expression();
				setState(403); match(PAR_CLOSE);
				setState(404); match(BRACES_OPEN);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << POINTER_INT) | (1L << POINTER_DOUBLE) | (1L << POINTER_FLOAT) | (1L << POINTER_CHAR) | (1L << POINTER_BOOLEAN) | (1L << POINTER_STRING) | (1L << POINTER_VAR) | (1L << VAR) | (1L << PRINT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(405); statement();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411); match(BRACES_CLOSE);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(412); else_if_statement();
					}
					}
					setState(417);
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
		enterRule(_localctx, 44, RULE_decision);
		try {
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420); if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421); if_else_structure();
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
		enterRule(_localctx, 46, RULE_print);
		try {
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); match(PRINT);
				setState(425); match(PAR_OPEN);
				setState(426); integer_literal_or_id();
				setState(427); match(PAR_CLOSE);
				setState(428); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430); match(PRINT);
				setState(431); match(PAR_OPEN);
				setState(432); string();
				setState(433); match(PAR_CLOSE);
				setState(434); match(SEMICOL);
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
		enterRule(_localctx, 48, RULE_array);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438); primary_variable();
				setState(439); match(ID);
				setState(440); match(BRACKET_OPEN);
				setState(441); match(INTEGER_LITERAL);
				setState(442); match(BRACKET_CLOSE);
				setState(443); match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); primary_variable();
				setState(446); match(ID);
				setState(447); match(BRACKET_OPEN);
				setState(448); match(INTEGER_LITERAL);
				setState(449); match(BRACKET_CLOSE);
				setState(450); match(BRACKET_OPEN);
				setState(451); match(INTEGER_LITERAL);
				setState(452); match(BRACKET_CLOSE);
				setState(453); match(SEMICOL);
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
		enterRule(_localctx, 50, RULE_primary_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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

	public static class Literal_valuesContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(CommandXParser.DOUBLE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CommandXParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CommandXParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CommandXParser.CHAR_LITERAL, 0); }
		public Literal_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterLiteral_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitLiteral_values(this);
		}
	}

	public final Literal_valuesContext literal_values() throws RecognitionException {
		Literal_valuesContext _localctx = new Literal_valuesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u01d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3R\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\7\13f\n\13\f\13\16\13i\13\13\3\f\3\f\3\f\3\f\7\fo\n\f\f"+
		"\f\16\fr\13\f\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\f\5\f\177"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\f\7\f\u008d\n"+
		"\f\f\f\16\f\u0090\13\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00ad\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00bb\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00c3\n\20\f\20\16\20\u00c6\13\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00d9\n\20\f\20\16\20\u00dc\13\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00e4\n\20\f\20\16\20\u00e7\13\20\5\20\u00e9\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00fc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0108"+
		"\n\23\f\23\16\23\u010b\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0130"+
		"\n\23\f\23\16\23\u0133\13\23\3\23\3\23\5\23\u0137\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u013f\n\24\f\24\16\24\u0142\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u014c\n\25\f\25\16\25\u014f\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015a\n\26\f\26\16\26\u015d"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0167\n\27\f\27\16"+
		"\27\u016a\13\27\3\27\3\27\3\27\3\27\7\27\u0170\n\27\f\27\16\27\u0173\13"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u017d\n\27\f\27\16\27"+
		"\u0180\13\27\3\27\3\27\7\27\u0184\n\27\f\27\16\27\u0187\13\27\3\27\3\27"+
		"\3\27\7\27\u018c\n\27\f\27\16\27\u018f\13\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0199\n\27\f\27\16\27\u019c\13\27\3\27\3\27\7\27"+
		"\u01a0\n\27\f\27\16\27\u01a3\13\27\5\27\u01a5\n\27\3\30\3\30\5\30\u01a9"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01b7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01ca\n\32\3\33\3\33\3\34\3\34\3\34\2\2"+
		"\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\3"+
		"\2#$\3\2\33\35\3\2\36 \4\2..\64\64\3\2\t\17\4\2\3\b\21\21\3\2.\63\u01e9"+
		"\28\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16"+
		"[\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24b\3\2\2\2\26\u0092\3\2\2\2\30\u009e"+
		"\3\2\2\2\32\u00ac\3\2\2\2\34\u00ba\3\2\2\2\36\u00e8\3\2\2\2 \u00ea\3\2"+
		"\2\2\"\u00fb\3\2\2\2$\u0136\3\2\2\2&\u0138\3\2\2\2(\u0145\3\2\2\2*\u0152"+
		"\3\2\2\2,\u01a4\3\2\2\2.\u01a8\3\2\2\2\60\u01b6\3\2\2\2\62\u01c9\3\2\2"+
		"\2\64\u01cb\3\2\2\2\66\u01cd\3\2\2\289\7\20\2\29:\7\64\2\2:>\7(\2\2;="+
		"\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2A"+
		"E\7)\2\2BD\5\26\f\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2"+
		"GE\3\2\2\2HR\5\"\22\2IR\5\34\17\2JR\5\60\31\2KR\5$\23\2LR\5&\24\2MR\5"+
		".\30\2NR\5\26\f\2OR\5\62\32\2PR\5\30\r\2QH\3\2\2\2QI\3\2\2\2QJ\3\2\2\2"+
		"QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\5\3\2\2"+
		"\2ST\t\2\2\2T\7\3\2\2\2UV\t\3\2\2V\t\3\2\2\2WX\t\4\2\2X\13\3\2\2\2YZ\t"+
		"\5\2\2Z\r\3\2\2\2[\\\7\61\2\2\\\17\3\2\2\2]^\5\64\33\2^\21\3\2\2\2_`\5"+
		"\20\t\2`a\7\64\2\2a\23\3\2\2\2bg\5\22\n\2cd\7-\2\2df\5\22\n\2ec\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\25\3\2\2\2ig\3\2\2\2jk\5\20\t\2kl\7"+
		"\64\2\2lp\7&\2\2mo\5\24\13\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q"+
		"s\3\2\2\2rp\3\2\2\2st\7\'\2\2tx\7(\2\2uw\5\4\3\2vu\3\2\2\2wz\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{~\7\26\2\2|\177\7\64\2\2}\177"+
		"\5\66\34\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7,\2\2\u0081"+
		"\u0082\7)\2\2\u0082\u0093\3\2\2\2\u0083\u0084\7\25\2\2\u0084\u0085\7\64"+
		"\2\2\u0085\u0087\7&\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\'\2\2\u008a\u008e\7("+
		"\2\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0093\7)\2\2\u0092j\3\2\2\2\u0092\u0083\3\2\2\2\u0093\27\3"+
		"\2\2\2\u0094\u0095\7\64\2\2\u0095\u0096\7!\2\2\u0096\u009f\7,\2\2\u0097"+
		"\u0098\7\64\2\2\u0098\u0099\7\"\2\2\u0099\u009f\7,\2\2\u009a\u009b\7\64"+
		"\2\2\u009b\u009f\7!\2\2\u009c\u009d\7\64\2\2\u009d\u009f\7\"\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\64\2\2\u00a1\u00a2\7%\2\2\u00a2\u00a3"+
		"\7\64\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\7\64\2\2\u00a5\u00ad\3\2\2\2"+
		"\u00a6\u00a7\7\64\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\7\64\2\2\u00a9\u00aa"+
		"\5\b\5\2\u00aa\u00ab\7.\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac"+
		"\u00a6\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7\64\2\2\u00af\u00b0\7%\2"+
		"\2\u00b0\u00b1\7.\2\2\u00b1\u00bb\7,\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4"+
		"\7%\2\2\u00b4\u00b5\7\64\2\2\u00b5\u00bb\7,\2\2\u00b6\u00b7\7\64\2\2\u00b7"+
		"\u00b8\7%\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00bb\7,\2\2\u00ba\u00ae\3\2"+
		"\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd"+
		"\7\64\2\2\u00bd\u00be\5\6\4\2\u00be\u00c4\7\64\2\2\u00bf\u00c0\5\n\6\2"+
		"\u00c0\u00c1\5\36\20\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00e9\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7\64\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00cf\7"+
		".\2\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc\5\36\20\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00e9\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3"+
		"\u00d4\5\6\4\2\u00d4\u00da\7.\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\5\36"+
		"\20\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e9\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7.\2\2\u00de\u00df\5\6\4\2\u00df\u00e5\7\64\2\2\u00e0"+
		"\u00e1\5\n\6\2\u00e1\u00e2\5\36\20\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3"+
		"\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00bc\3\2\2\2\u00e8\u00c7\3\2"+
		"\2\2\u00e8\u00d2\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e9\37\3\2\2\2\u00ea\u00eb"+
		"\t\6\2\2\u00eb!\3\2\2\2\u00ec\u00ed\5\64\33\2\u00ed\u00ee\7\64\2\2\u00ee"+
		"\u00ef\7,\2\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\5 \21\2\u00f1\u00f2\7\64"+
		"\2\2\u00f2\u00f3\7,\2\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5"+
		"\u00f6\5\34\17\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\5\64\33\2\u00f8\u00f9"+
		"\5\32\16\2\u00f9\u00fa\7,\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00ec\3\2\2\2"+
		"\u00fb\u00f0\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc#\3"+
		"\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\7&\2\2\u00ff\u0100\5\64\33\2\u0100"+
		"\u0101\5\34\17\2\u0101\u0102\5\36\20\2\u0102\u0103\7,\2\2\u0103\u0104"+
		"\5\30\r\2\u0104\u0105\7\'\2\2\u0105\u0109\7(\2\2\u0106\u0108\5\4\3\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7)\2\2\u010d"+
		"\u0137\3\2\2\2\u010e\u010f\7\31\2\2\u010f\u0110\7&\2\2\u0110\u0111\5\64"+
		"\33\2\u0111\u0112\5\34\17\2\u0112\u0113\5\36\20\2\u0113\u0114\7,\2\2\u0114"+
		"\u0115\5\32\16\2\u0115\u0116\7\'\2\2\u0116\u0117\7(\2\2\u0117\u0118\5"+
		"\4\3\2\u0118\u0119\7)\2\2\u0119\u0137\3\2\2\2\u011a\u011b\7\31\2\2\u011b"+
		"\u011c\7&\2\2\u011c\u011d\5\34\17\2\u011d\u011e\5\36\20\2\u011e\u011f"+
		"\7,\2\2\u011f\u0120\5\32\16\2\u0120\u0121\7\'\2\2\u0121\u0122\7(\2\2\u0122"+
		"\u0123\5\4\3\2\u0123\u0124\7)\2\2\u0124\u0137\3\2\2\2\u0125\u0126\7\31"+
		"\2\2\u0126\u0127\7&\2\2\u0127\u0128\5\64\33\2\u0128\u0129\5\34\17\2\u0129"+
		"\u012a\5\36\20\2\u012a\u012b\7,\2\2\u012b\u012c\5\30\r\2\u012c\u012d\7"+
		"\'\2\2\u012d\u0131\7(\2\2\u012e\u0130\5\4\3\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7)\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u00fd\3\2\2\2\u0136\u010e\3\2\2\2\u0136\u011a\3\2\2\2\u0136\u0125\3\2"+
		"\2\2\u0137%\3\2\2\2\u0138\u0139\7\32\2\2\u0139\u013a\7&\2\2\u013a\u013b"+
		"\5\36\20\2\u013b\u013c\7\'\2\2\u013c\u0140\7(\2\2\u013d\u013f\5\4\3\2"+
		"\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7)\2\2\u0144"+
		"\'\3\2\2\2\u0145\u0146\7\27\2\2\u0146\u0147\7&\2\2\u0147\u0148\5\36\20"+
		"\2\u0148\u0149\7\'\2\2\u0149\u014d\7(\2\2\u014a\u014c\5\4\3\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7)\2\2\u0151)\3\2\2\2\u0152"+
		"\u0153\7\30\2\2\u0153\u0154\7\27\2\2\u0154\u0155\7&\2\2\u0155\u0156\5"+
		"\36\20\2\u0156\u0157\7\'\2\2\u0157\u015b\7(\2\2\u0158\u015a\5\4\3\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7)\2\2\u015f"+
		"+\3\2\2\2\u0160\u0161\7\27\2\2\u0161\u0162\7&\2\2\u0162\u0163\5\36\20"+
		"\2\u0163\u0164\7\'\2\2\u0164\u0168\7(\2\2\u0165\u0167\5\4\3\2\u0166\u0165"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7)\2\2\u016c\u016d\7\30"+
		"\2\2\u016d\u0171\7(\2\2\u016e\u0170\5\4\3\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7)\2\2\u0175\u01a5\3\2\2\2\u0176"+
		"\u0177\7\27\2\2\u0177\u0178\7&\2\2\u0178\u0179\5\36\20\2\u0179\u017a\7"+
		"\'\2\2\u017a\u017e\7(\2\2\u017b\u017d\5\4\3\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0185\7)\2\2\u0182\u0184\5*\26\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\30\2\2\u0189"+
		"\u018d\7(\2\2\u018a\u018c\5\4\3\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0191\7)\2\2\u0191\u01a5\3\2\2\2\u0192\u0193\7\27"+
		"\2\2\u0193\u0194\7&\2\2\u0194\u0195\5\36\20\2\u0195\u0196\7\'\2\2\u0196"+
		"\u019a\7(\2\2\u0197\u0199\5\4\3\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u01a1\7)\2\2\u019e\u01a0\5*\26\2\u019f\u019e\3\2"+
		"\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u0160\3\2\2\2\u01a4\u0176\3\2"+
		"\2\2\u01a4\u0192\3\2\2\2\u01a5-\3\2\2\2\u01a6\u01a9\5(\25\2\u01a7\u01a9"+
		"\5,\27\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9/\3\2\2\2\u01aa"+
		"\u01ab\7\22\2\2\u01ab\u01ac\7&\2\2\u01ac\u01ad\5\f\7\2\u01ad\u01ae\7\'"+
		"\2\2\u01ae\u01af\7,\2\2\u01af\u01b7\3\2\2\2\u01b0\u01b1\7\22\2\2\u01b1"+
		"\u01b2\7&\2\2\u01b2\u01b3\5\16\b\2\u01b3\u01b4\7\'\2\2\u01b4\u01b5\7,"+
		"\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b7"+
		"\61\3\2\2\2\u01b8\u01b9\5\64\33\2\u01b9\u01ba\7\64\2\2\u01ba\u01bb\7*"+
		"\2\2\u01bb\u01bc\7.\2\2\u01bc\u01bd\7+\2\2\u01bd\u01be\7,\2\2\u01be\u01ca"+
		"\3\2\2\2\u01bf\u01c0\5\64\33\2\u01c0\u01c1\7\64\2\2\u01c1\u01c2\7*\2\2"+
		"\u01c2\u01c3\7.\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c5\7*\2\2\u01c5\u01c6"+
		"\7.\2\2\u01c6\u01c7\7+\2\2\u01c7\u01c8\7,\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01b8\3\2\2\2\u01c9\u01bf\3\2\2\2\u01ca\63\3\2\2\2\u01cb\u01cc\t\7\2"+
		"\2\u01cc\65\3\2\2\2\u01cd\u01ce\t\b\2\2\u01ce\67\3\2\2\2&>EQgpx~\u0087"+
		"\u008e\u0092\u009e\u00ac\u00ba\u00c4\u00cf\u00da\u00e5\u00e8\u00fb\u0109"+
		"\u0131\u0136\u0140\u014d\u015b\u0168\u0171\u017e\u0185\u018d\u019a\u01a1"+
		"\u01a4\u01a8\u01b6\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}