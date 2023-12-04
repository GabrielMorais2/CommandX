// Generated from br\edu\u005Cunifg\CommandX\CommandX.g4 by ANTLR 4.5.1
package br.edu.unifg.CommandX;
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import br.edu.unifg.CommandX.ast.*;

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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, FLOAT=7, CHAR=8, BOOLEAN=9, 
		STRING=10, POINTER=11, PROGRAM=12, VAR=13, READ=14, PRINT=15, FUNC=16, 
		PROC=17, VOID=18, RETURN=19, IF=20, ELSE=21, ELIF=22, FOR=23, WHILE=24, 
		ADDITIVE_OPERATOR=25, MULTIPLICATIVE_OPERATOR=26, MOD=27, INCREMENT_OPERATOR=28, 
		AND=29, OR=30, NOT=31, RELATIONAL_OPERATOR=32, EQUALITY_OPERATOR=33, ASSING=34, 
		PAR_OPEN=35, PAR_CLOSE=36, BRACES_OPEN=37, BRACES_CLOSE=38, BRACKET_OPEN=39, 
		BRACKET_CLOSE=40, SEMICOL=41, COMMA=42, INTEGER_LITERAL=43, BOOLEAN_LITERAL=44, 
		CHAR_LITERAL=45, STRING_LITERAL=46, FLOAT_LITERAL=47, ID=48, LINE_COMMENT=49, 
		BLOCK_COMMENT=50, WS=51;
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_comment = 2, RULE_print = 3, RULE_read_statement = 4, 
		RULE_conditional = 5, RULE_while_loop = 6, RULE_for_loop = 7, RULE_for_loop_increment = 8, 
		RULE_array_assign = 9, RULE_array_literal = 10, RULE_array_decl = 11, 
		RULE_arrayAccess = 12, RULE_logicalExpression = 13, RULE_logicalOrExpression = 14, 
		RULE_logicalAndExpression = 15, RULE_equalityExpression = 16, RULE_relationalExpression = 17, 
		RULE_additiveExpression = 18, RULE_multiplicativeExpression = 19, RULE_incrementExpression = 20, 
		RULE_unaryExpression = 21, RULE_primaryExpression = 22, RULE_logicalNotExpression = 23, 
		RULE_pointer_var = 24, RULE_pointer_decl = 25, RULE_pointer_assign = 26, 
		RULE_value_pointer = 27, RULE_pointer_manipulation = 28, RULE_var_assign = 29, 
		RULE_var_decl = 30, RULE_function_declaration = 31, RULE_function_declaration_with_return = 32, 
		RULE_returnFunc = 33, RULE_function_call = 34, RULE_procedure_declaration = 35, 
		RULE_procedure_call = 36, RULE_argumentList = 37, RULE_parameterList = 38, 
		RULE_parameter = 39, RULE_typeDeclaration = 40;
	public static final String[] ruleNames = {
		"start", "sentence", "comment", "print", "read_statement", "conditional", 
		"while_loop", "for_loop", "for_loop_increment", "array_assign", "array_literal", 
		"array_decl", "arrayAccess", "logicalExpression", "logicalOrExpression", 
		"logicalAndExpression", "equalityExpression", "relationalExpression", 
		"additiveExpression", "multiplicativeExpression", "incrementExpression", 
		"unaryExpression", "primaryExpression", "logicalNotExpression", "pointer_var", 
		"pointer_decl", "pointer_assign", "value_pointer", "pointer_manipulation", 
		"var_assign", "var_decl", "function_declaration", "function_declaration_with_return", 
		"returnFunc", "function_call", "procedure_declaration", "procedure_call", 
		"argumentList", "parameterList", "parameter", "typeDeclaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int*'", "'float*'", "'char*'", "'bool*'", "'string*'", "'int'", 
		"'float'", "'char'", "'boolean'", "'string'", "'pointer'", "'program'", 
		"'var'", "'read'", "'print'", "'func'", "'proc'", "'void'", "'return'", 
		"'if'", "'else'", "'elif'", "'for'", "'while'", null, null, "'%'", null, 
		"'&&'", "'||'", "'!'", null, null, "'='", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "INT", "FLOAT", "CHAR", "BOOLEAN", 
		"STRING", "POINTER", "PROGRAM", "VAR", "READ", "PRINT", "FUNC", "PROC", 
		"VOID", "RETURN", "IF", "ELSE", "ELIF", "FOR", "WHILE", "ADDITIVE_OPERATOR", 
		"MULTIPLICATIVE_OPERATOR", "MOD", "INCREMENT_OPERATOR", "AND", "OR", "NOT", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "ASSING", "PAR_OPEN", "PAR_CLOSE", 
		"BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "SEMICOL", 
		"COMMA", "INTEGER_LITERAL", "BOOLEAN_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"FLOAT_LITERAL", "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CommandX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();
		Map<String, Object> functionSymbolTable = new HashMap<String, Object>();

	public CommandXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(CommandXParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PROGRAM);
			setState(83);
			match(ID);
			setState(84);
			match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> symbolTable = new HashMap<String, Object>();
					
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(86);
				((StartContext)_localctx).sentence = sentence();
				body.add(((StartContext)_localctx).sentence.node);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(BRACES_CLOSE);

						for(ASTNode n : body) {
							n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintContext print;
		public ConditionalContext conditional;
		public IncrementExpressionContext incrementExpression;
		public While_loopContext while_loop;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public Read_statementContext read_statement;
		public For_loopContext for_loop;
		public For_loop_incrementContext for_loop_increment;
		public Function_declarationContext function_declaration;
		public Function_declaration_with_returnContext function_declaration_with_return;
		public Procedure_declarationContext procedure_declaration;
		public Function_callContext function_call;
		public Procedure_callContext procedure_call;
		public Pointer_declContext pointer_decl;
		public Pointer_manipulationContext pointer_manipulation;
		public Array_assignContext array_assign;
		public Array_literalContext array_literal;
		public Array_declContext array_decl;
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public IncrementExpressionContext incrementExpression() {
			return getRuleContext(IncrementExpressionContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public For_loop_incrementContext for_loop_increment() {
			return getRuleContext(For_loop_incrementContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_declaration_with_returnContext function_declaration_with_return() {
			return getRuleContext(Function_declaration_with_returnContext.class,0);
		}
		public Procedure_declarationContext procedure_declaration() {
			return getRuleContext(Procedure_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Pointer_declContext pointer_decl() {
			return getRuleContext(Pointer_declContext.class,0);
		}
		public Pointer_manipulationContext pointer_manipulation() {
			return getRuleContext(Pointer_manipulationContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Array_declContext array_decl() {
			return getRuleContext(Array_declContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((SentenceContext)_localctx).incrementExpression = incrementExpression();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).incrementExpression.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				((SentenceContext)_localctx).while_loop = while_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_loop.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				((SentenceContext)_localctx).read_statement = read_statement();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).read_statement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				((SentenceContext)_localctx).for_loop = for_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				((SentenceContext)_localctx).for_loop_increment = for_loop_increment();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop_increment.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				((SentenceContext)_localctx).function_declaration_with_return = function_declaration_with_return();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration_with_return.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				((SentenceContext)_localctx).procedure_declaration = procedure_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_declaration.node;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(136);
				((SentenceContext)_localctx).procedure_call = procedure_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_call.node;
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(139);
				((SentenceContext)_localctx).pointer_decl = pointer_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pointer_decl.node;
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(142);
				((SentenceContext)_localctx).pointer_manipulation = pointer_manipulation();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pointer_manipulation.node;
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(145);
				((SentenceContext)_localctx).array_assign = array_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).array_assign.node;
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(148);
				((SentenceContext)_localctx).array_literal = array_literal();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).array_literal.node;
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(151);
				((SentenceContext)_localctx).array_decl = array_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).array_decl.node;
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(154);
				comment();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(CommandXParser.LINE_COMMENT, 0); }
		public TerminalNode BLOCK_COMMENT() { return getToken(CommandXParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode PRINT() { return getToken(CommandXParser.PRINT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(PRINT);
				setState(160);
				match(PAR_OPEN);
				setState(161);
				((PrintContext)_localctx).logicalExpression = logicalExpression();
				setState(162);
				match(PAR_CLOSE);
				setState(163);
				match(SEMICOL);
				((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).logicalExpression.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(PRINT);
				setState(167);
				match(PAR_OPEN);
				 System.out.println(); 
				setState(169);
				match(PAR_CLOSE);
				setState(170);
				match(SEMICOL);
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

	public static class Read_statementContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode READ() { return getToken(CommandXParser.READ, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitRead_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitRead_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(READ);
			setState(174);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(175);
			match(SEMICOL);
			((Read_statementContext)_localctx).node =  new Read((((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null));
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext ifLogicalExpression;
		public SentenceContext s1;
		public LogicalExpressionContext elifLogicalExpression;
		public SentenceContext s2;
		public SentenceContext s3;
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public List<TerminalNode> PAR_OPEN() { return getTokens(CommandXParser.PAR_OPEN); }
		public TerminalNode PAR_OPEN(int i) {
			return getToken(CommandXParser.PAR_OPEN, i);
		}
		public List<TerminalNode> PAR_CLOSE() { return getTokens(CommandXParser.PAR_CLOSE); }
		public TerminalNode PAR_CLOSE(int i) {
			return getToken(CommandXParser.PAR_CLOSE, i);
		}
		public List<TerminalNode> BRACES_OPEN() { return getTokens(CommandXParser.BRACES_OPEN); }
		public TerminalNode BRACES_OPEN(int i) {
			return getToken(CommandXParser.BRACES_OPEN, i);
		}
		public List<TerminalNode> BRACES_CLOSE() { return getTokens(CommandXParser.BRACES_CLOSE); }
		public TerminalNode BRACES_CLOSE(int i) {
			return getToken(CommandXParser.BRACES_CLOSE, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CommandXParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(CommandXParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(CommandXParser.ELIF, i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IF);
			setState(179);
			match(PAR_OPEN);
			setState(180);
			((ConditionalContext)_localctx).ifLogicalExpression = logicalExpression();
			setState(181);
			match(PAR_CLOSE);

			        List<ASTNode> ifBody = new ArrayList<ASTNode>();
			        List<ASTNode> elseBody = new ArrayList<ASTNode>();
			        List<ElifNode> elifNodes = new ArrayList<ElifNode>();
			    
			setState(183);
			match(BRACES_OPEN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(184);
				((ConditionalContext)_localctx).s1 = sentence();
				ifBody.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(BRACES_CLOSE);
			setState(214);
			_la = _input.LA(1);
			if (_la==ELIF) {
				{
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					match(ELIF);
					setState(194);
					match(PAR_OPEN);
					setState(195);
					((ConditionalContext)_localctx).elifLogicalExpression = logicalExpression();
					setState(196);
					match(PAR_CLOSE);
					 List<ASTNode> elifBody = new ArrayList<ASTNode>(); 
					setState(198);
					match(BRACES_OPEN);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
						{
						{
						setState(199);
						((ConditionalContext)_localctx).s2 = sentence();
						elifBody.add(((ConditionalContext)_localctx).s2.node);
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(207);
					match(BRACES_CLOSE);
					 ElifNode elifNode = new ElifNode(((ConditionalContext)_localctx).elifLogicalExpression.node, elifBody); elifNodes.add(elifNode); 
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				}
			}

			setState(227);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(216);
				match(ELSE);
				setState(217);
				match(BRACES_OPEN);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(218);
					((ConditionalContext)_localctx).s3 = sentence();
					elseBody.add(((ConditionalContext)_localctx).s3.node);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(BRACES_CLOSE);
				}
			}


			        ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).ifLogicalExpression.node, ifBody, elifNodes, elseBody);
			    
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
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public SentenceContext s1;
		public TerminalNode WHILE() { return getToken(CommandXParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(WHILE);
			setState(232);
			match(PAR_OPEN);
			setState(233);
			((While_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(234);
			match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(236);
			match(BRACES_OPEN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(237);
				((While_loopContext)_localctx).s1 = sentence();
				body.add(((While_loopContext)_localctx).s1.node);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(BRACES_CLOSE);

					((While_loopContext)_localctx).node =  new While_loop(((While_loopContext)_localctx).logicalExpression.node, body);
				
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
		public ASTNode node;
		public Var_assignContext initialization;
		public LogicalExpressionContext logicalExpression;
		public Var_assignContext update;
		public SentenceContext s;
		public TerminalNode FOR() { return getToken(CommandXParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public List<Var_assignContext> var_assign() {
			return getRuleContexts(Var_assignContext.class);
		}
		public Var_assignContext var_assign(int i) {
			return getRuleContext(Var_assignContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FOR);
			setState(249);
			match(PAR_OPEN);
			setState(250);
			((For_loopContext)_localctx).initialization = var_assign();
			setState(251);
			((For_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(252);
			match(SEMICOL);
			setState(253);
			((For_loopContext)_localctx).update = var_assign();
			setState(254);
			match(PAR_CLOSE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(256);
			match(BRACES_OPEN);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(257);
				((For_loopContext)_localctx).s = sentence();
				body.add(((For_loopContext)_localctx).s.node);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(BRACES_CLOSE);

			        ((For_loopContext)_localctx).node =  new For_loop(((For_loopContext)_localctx).initialization.node, ((For_loopContext)_localctx).logicalExpression.node, ((For_loopContext)_localctx).update.node, body);
			    
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

	public static class For_loop_incrementContext extends ParserRuleContext {
		public ASTNode node;
		public Var_assignContext initialization;
		public LogicalExpressionContext logicalExpression;
		public IncrementExpressionContext update;
		public SentenceContext s;
		public TerminalNode FOR() { return getToken(CommandXParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public IncrementExpressionContext incrementExpression() {
			return getRuleContext(IncrementExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public For_loop_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFor_loop_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFor_loop_increment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitFor_loop_increment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_incrementContext for_loop_increment() throws RecognitionException {
		For_loop_incrementContext _localctx = new For_loop_incrementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FOR);
			setState(269);
			match(PAR_OPEN);
			setState(270);
			((For_loop_incrementContext)_localctx).initialization = var_assign();
			setState(271);
			((For_loop_incrementContext)_localctx).logicalExpression = logicalExpression();
			setState(272);
			match(SEMICOL);
			setState(273);
			((For_loop_incrementContext)_localctx).update = incrementExpression();
			setState(274);
			match(PAR_CLOSE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(276);
			match(BRACES_OPEN);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(277);
				((For_loop_incrementContext)_localctx).s = sentence();
				body.add(((For_loop_incrementContext)_localctx).s.node);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(BRACES_CLOSE);

			        ((For_loop_incrementContext)_localctx).node =  new For_loop(((For_loop_incrementContext)_localctx).initialization.node, ((For_loop_incrementContext)_localctx).logicalExpression.node, ((For_loop_incrementContext)_localctx).update.node, body);
			    
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

	public static class Array_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicalExpressionContext index;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public TerminalNode ASSING() { return getToken(CommandXParser.ASSING, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Array_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArray_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArray_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitArray_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignContext array_assign() throws RecognitionException {
		Array_assignContext _localctx = new Array_assignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((Array_assignContext)_localctx).ID = match(ID);
			setState(289);
			match(BRACKET_OPEN);
			setState(290);
			((Array_assignContext)_localctx).index = ((Array_assignContext)_localctx).logicalExpression = logicalExpression();
			setState(291);
			match(BRACKET_CLOSE);
			setState(292);
			match(ASSING);
			setState(293);
			((Array_assignContext)_localctx).logicalExpression = logicalExpression();
			setState(294);
			match(SEMICOL);

			    String declaredType = (String) symbolTable.get((((Array_assignContext)_localctx).ID!=null?((Array_assignContext)_localctx).ID.getText():null));
			    ((Array_assignContext)_localctx).node =  new ArrayAssign((((Array_assignContext)_localctx).ID!=null?((Array_assignContext)_localctx).ID.getText():null), ((Array_assignContext)_localctx).index.node, ((Array_assignContext)_localctx).logicalExpression.node);

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

	public static class Array_literalContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext e;
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(BRACKET_OPEN);

			        List<ASTNode> list = new ArrayList<ASTNode>();
			    
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIVE_OPERATOR) | (1L << NOT) | (1L << PAR_OPEN) | (1L << INTEGER_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(299);
				((Array_literalContext)_localctx).e = logicalExpression();
				list.add(((Array_literalContext)_localctx).e.node);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301);
					match(COMMA);
					setState(302);
					((Array_literalContext)_localctx).e = logicalExpression();
					list.add(((Array_literalContext)_localctx).e.node);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(312);
			match(BRACKET_CLOSE);

			        ((Array_literalContext)_localctx).node =  new ArrayLiteral(list);
			    
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

	public static class Array_declContext extends ParserRuleContext {
		public ASTNode node;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public Token INTEGER_LITERAL;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArray_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArray_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitArray_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((Array_declContext)_localctx).typeDeclaration = typeDeclaration();
			setState(316);
			((Array_declContext)_localctx).ID = match(ID);
			setState(317);
			match(BRACKET_OPEN);
			setState(318);
			((Array_declContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
			setState(319);
			match(BRACKET_CLOSE);
			setState(320);
			match(SEMICOL);


			    symbolTable.put((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), (((Array_declContext)_localctx).typeDeclaration!=null?_input.getText(((Array_declContext)_localctx).typeDeclaration.start,((Array_declContext)_localctx).typeDeclaration.stop):null) + "[]");
			    ((Array_declContext)_localctx).node =  new ArrayDecl((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), (((Array_declContext)_localctx).typeDeclaration!=null?_input.getText(((Array_declContext)_localctx).typeDeclaration.start,((Array_declContext)_localctx).typeDeclaration.stop):null), Integer.parseInt((((Array_declContext)_localctx).INTEGER_LITERAL!=null?((Array_declContext)_localctx).INTEGER_LITERAL.getText():null)));

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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicalExpressionContext index;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CommandXParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CommandXParser.BRACKET_CLOSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ArrayAccessContext)_localctx).ID = match(ID);
			setState(324);
			match(BRACKET_OPEN);
			setState(325);
			((ArrayAccessContext)_localctx).index = logicalExpression();
			setState(326);
			match(BRACKET_CLOSE);

			        ((ArrayAccessContext)_localctx).node =  new ArrayAccess((((ArrayAccessContext)_localctx).ID!=null?((ArrayAccessContext)_localctx).ID.getText():null), ((ArrayAccessContext)_localctx).index.node);
			    
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext logicalOrExpression;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalExpressionContext logicalExpression;
		public Function_callContext function_call;
		public ArrayAccessContext arrayAccess;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalExpression);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((LogicalExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalAndExpression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(NOT);
				setState(336);
				((LogicalExpressionContext)_localctx).logicalExpression = logicalExpression();
				((LogicalExpressionContext)_localctx).node =  new LogicalNot(_localctx.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				((LogicalExpressionContext)_localctx).function_call = function_call();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).function_call.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				((LogicalExpressionContext)_localctx).arrayAccess = arrayAccess();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).arrayAccess.node;
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalAndExpressionContext right;
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CommandXParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CommandXParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(349);
				match(OR);
				setState(350);
				((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(357);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public EqualityExpressionContext equalityExpression;
		public EqualityExpressionContext right;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CommandXParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CommandXParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(360);
				match(AND);
				setState(361);
				((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(368);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public RelationalExpressionContext relationalExpression;
		public Token EQUALITY_OPERATOR;
		public RelationalExpressionContext right;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALITY_OPERATOR() { return getTokens(CommandXParser.EQUALITY_OPERATOR); }
		public TerminalNode EQUALITY_OPERATOR(int i) {
			return getToken(CommandXParser.EQUALITY_OPERATOR, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(371);
				((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR = match(EQUALITY_OPERATOR);
				setState(372);
				((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR!=null?((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR.getText():null));
				}
				}
				setState(379);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public AdditiveExpressionContext additiveExpression;
		public Token RELATIONAL_OPERATOR;
		public AdditiveExpressionContext right;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OPERATOR() { return getTokens(CommandXParser.RELATIONAL_OPERATOR); }
		public TerminalNode RELATIONAL_OPERATOR(int i) {
			return getToken(CommandXParser.RELATIONAL_OPERATOR, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OPERATOR) {
				{
				{
				setState(382);
				((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR = match(RELATIONAL_OPERATOR);
				setState(383);
				((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR!=null?((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR.getText():null));
				}
				}
				setState(390);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public Token ADDITIVE_OPERATOR;
		public MultiplicativeExpressionContext right;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADDITIVE_OPERATOR() { return getTokens(CommandXParser.ADDITIVE_OPERATOR); }
		public TerminalNode ADDITIVE_OPERATOR(int i) {
			return getToken(CommandXParser.ADDITIVE_OPERATOR, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(393);
				((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(394);
				((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null));
				}
				}
				setState(401);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public UnaryExpressionContext unaryExpression;
		public Token MULTIPLICATIVE_OPERATOR;
		public UnaryExpressionContext right;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATIVE_OPERATOR() { return getTokens(CommandXParser.MULTIPLICATIVE_OPERATOR); }
		public TerminalNode MULTIPLICATIVE_OPERATOR(int i) {
			return getToken(CommandXParser.MULTIPLICATIVE_OPERATOR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIVE_OPERATOR) {
				{
				{
				setState(404);
				((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR = match(MULTIPLICATIVE_OPERATOR);
				setState(405);
				((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR!=null?((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR.getText():null));
				}
				}
				setState(412);
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

	public static class IncrementExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Token op;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode INCREMENT_OPERATOR() { return getToken(CommandXParser.INCREMENT_OPERATOR, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public IncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementExpressionContext incrementExpression() throws RecognitionException {
		IncrementExpressionContext _localctx = new IncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incrementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((IncrementExpressionContext)_localctx).ID = match(ID);
			setState(414);
			((IncrementExpressionContext)_localctx).op = match(INCREMENT_OPERATOR);
			setState(416);
			_la = _input.LA(1);
			if (_la==SEMICOL) {
				{
				setState(415);
				match(SEMICOL);
				}
			}

			((IncrementExpressionContext)_localctx).node =  new IncrementExpression((((IncrementExpressionContext)_localctx).ID!=null?((IncrementExpressionContext)_localctx).ID.getText():null), (((IncrementExpressionContext)_localctx).op!=null?((IncrementExpressionContext)_localctx).op.getText():null));
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ADDITIVE_OPERATOR;
		public UnaryExpressionContext operand;
		public PrimaryExpressionContext primaryExpression;
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(CommandXParser.ADDITIVE_OPERATOR, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpression);
		try {
			setState(427);
			switch (_input.LA(1)) {
			case ADDITIVE_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(421);
				((UnaryExpressionContext)_localctx).operand = unaryExpression();
				((UnaryExpressionContext)_localctx).node =  new UnaryExpression((((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null), ((UnaryExpressionContext)_localctx).operand.node);
				}
				break;
			case NOT:
			case PAR_OPEN:
			case INTEGER_LITERAL:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				((UnaryExpressionContext)_localctx).primaryExpression = primaryExpression();
				((UnaryExpressionContext)_localctx).node =  ((UnaryExpressionContext)_localctx).primaryExpression.node;
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalNotExpressionContext logicalNotExpression;
		public Token INTEGER_LITERAL;
		public Token BOOLEAN_LITERAL;
		public Token CHAR_LITERAL;
		public Token STRING_LITERAL;
		public Token FLOAT_LITERAL;
		public Token ID;
		public LogicalExpressionContext expr;
		public LogicalNotExpressionContext logicalNotExpression() {
			return getRuleContext(LogicalNotExpressionContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CommandXParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CommandXParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CommandXParser.FLOAT_LITERAL, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primaryExpression);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				((PrimaryExpressionContext)_localctx).ID = match(ID);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(444);
				match(PAR_OPEN);
				setState(445);
				((PrimaryExpressionContext)_localctx).expr = logicalExpression();
				setState(446);
				match(PAR_CLOSE);
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).expr.node;
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

	public static class LogicalNotExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public PrimaryExpressionContext operand;
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LogicalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterLogicalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitLogicalNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitLogicalNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalNotExpressionContext logicalNotExpression() throws RecognitionException {
		LogicalNotExpressionContext _localctx = new LogicalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(NOT);
			setState(452);
			((LogicalNotExpressionContext)_localctx).operand = primaryExpression();
			((LogicalNotExpressionContext)_localctx).node =  new LogicalNot(((LogicalNotExpressionContext)_localctx).operand.node);
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

	public static class Pointer_varContext extends ParserRuleContext {
		public Pointer_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPointer_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPointer_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPointer_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_varContext pointer_var() throws RecognitionException {
		Pointer_varContext _localctx = new Pointer_varContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pointer_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Pointer_declContext extends ParserRuleContext {
		public ASTNode node;
		public Pointer_varContext pointer_var;
		public Token ID;
		public Pointer_varContext pointer_var() {
			return getRuleContext(Pointer_varContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Pointer_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPointer_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPointer_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPointer_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_declContext pointer_decl() throws RecognitionException {
		Pointer_declContext _localctx = new Pointer_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pointer_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((Pointer_declContext)_localctx).pointer_var = pointer_var();
			setState(458);
			((Pointer_declContext)_localctx).ID = match(ID);
			setState(459);
			match(SEMICOL);

				symbolTable.put((((Pointer_declContext)_localctx).ID!=null?((Pointer_declContext)_localctx).ID.getText():null), (((Pointer_declContext)_localctx).pointer_var!=null?_input.getText(((Pointer_declContext)_localctx).pointer_var.start,((Pointer_declContext)_localctx).pointer_var.stop):null));
				((Pointer_declContext)_localctx).node =  new VarDecl((((Pointer_declContext)_localctx).ID!=null?((Pointer_declContext)_localctx).ID.getText():null), (((Pointer_declContext)_localctx).pointer_var!=null?_input.getText(((Pointer_declContext)_localctx).pointer_var.start,((Pointer_declContext)_localctx).pointer_var.stop):null));

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

	public static class Pointer_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token pointer;
		public Token variable;
		public TerminalNode ASSING() { return getToken(CommandXParser.ASSING, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public List<TerminalNode> ID() { return getTokens(CommandXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CommandXParser.ID, i);
		}
		public Pointer_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPointer_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPointer_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPointer_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_assignContext pointer_assign() throws RecognitionException {
		Pointer_assignContext _localctx = new Pointer_assignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pointer_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			((Pointer_assignContext)_localctx).pointer = match(ID);
			setState(463);
			match(ASSING);
			setState(464);
			((Pointer_assignContext)_localctx).variable = match(ID);
			setState(465);
			match(SEMICOL);

				String declaredTypePointer = (String) symbolTable.get((((Pointer_assignContext)_localctx).pointer!=null?((Pointer_assignContext)_localctx).pointer.getText():null));
				String declaredTypeVar = (String) symbolTable.get((((Pointer_assignContext)_localctx).variable!=null?((Pointer_assignContext)_localctx).variable.getText():null));
				symbolTable.put((((Pointer_assignContext)_localctx).pointer!=null?((Pointer_assignContext)_localctx).pointer.getText():null), (((Pointer_assignContext)_localctx).variable!=null?((Pointer_assignContext)_localctx).variable.getText():null));
				((Pointer_assignContext)_localctx).node =  new PointerAssign((((Pointer_assignContext)_localctx).pointer!=null?((Pointer_assignContext)_localctx).pointer.getText():null), (((Pointer_assignContext)_localctx).variable!=null?((Pointer_assignContext)_localctx).variable.getText():null),declaredTypePointer,declaredTypeVar);

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

	public static class Value_pointerContext extends ParserRuleContext {
		public ASTNode node;
		public Token INTEGER_LITERAL;
		public Token BOOLEAN_LITERAL;
		public Token CHAR_LITERAL;
		public Token STRING_LITERAL;
		public Token FLOAT_LITERAL;
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CommandXParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CommandXParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CommandXParser.FLOAT_LITERAL, 0); }
		public Value_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterValue_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitValue_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitValue_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_pointerContext value_pointer() throws RecognitionException {
		Value_pointerContext _localctx = new Value_pointerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value_pointer);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				((Value_pointerContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant(Integer.parseInt((((Value_pointerContext)_localctx).INTEGER_LITERAL!=null?((Value_pointerContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				((Value_pointerContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant(Boolean.parseBoolean((((Value_pointerContext)_localctx).BOOLEAN_LITERAL!=null?((Value_pointerContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				((Value_pointerContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant((((Value_pointerContext)_localctx).CHAR_LITERAL!=null?((Value_pointerContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				((Value_pointerContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant((((Value_pointerContext)_localctx).STRING_LITERAL!=null?((Value_pointerContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((Value_pointerContext)_localctx).STRING_LITERAL!=null?((Value_pointerContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				((Value_pointerContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant(Float.parseFloat((((Value_pointerContext)_localctx).FLOAT_LITERAL!=null?((Value_pointerContext)_localctx).FLOAT_LITERAL.getText():null)));
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

	public static class Pointer_manipulationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Value_pointerContext value_pointer;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(CommandXParser.ASSING, 0); }
		public Value_pointerContext value_pointer() {
			return getRuleContext(Value_pointerContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Pointer_manipulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_manipulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterPointer_manipulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitPointer_manipulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitPointer_manipulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_manipulationContext pointer_manipulation() throws RecognitionException {
		Pointer_manipulationContext _localctx = new Pointer_manipulationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pointer_manipulation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			((Pointer_manipulationContext)_localctx).ID = match(ID);
			setState(481);
			match(ASSING);
			setState(482);
			((Pointer_manipulationContext)_localctx).value_pointer = value_pointer();
			setState(483);
			match(SEMICOL);

				String pointerValue = (String) symbolTable.get((((Pointer_manipulationContext)_localctx).ID!=null?((Pointer_manipulationContext)_localctx).ID.getText():null));
				((Pointer_manipulationContext)_localctx).node =  new PointerManipulation((((Pointer_manipulationContext)_localctx).ID!=null?((Pointer_manipulationContext)_localctx).ID.getText():null), ((Pointer_manipulationContext)_localctx).value_pointer.node,pointerValue);

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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(CommandXParser.ASSING, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(487);
			match(ASSING);
			setState(488);
			((Var_assignContext)_localctx).logicalExpression = logicalExpression();
			setState(489);
			match(SEMICOL);

				String declaredType = (String) symbolTable.get((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null));
				((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).logicalExpression.node);

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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public LogicalExpressionContext logicalExpression;
		public Function_callContext function_call;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode ASSING() { return getToken(CommandXParser.ASSING, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_var_decl);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(493);
				((Var_declContext)_localctx).ID = match(ID);
				setState(494);
				match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(498);
				((Var_declContext)_localctx).ID = match(ID);
				setState(499);
				match(ASSING);
				setState(500);
				((Var_declContext)_localctx).logicalExpression = logicalExpression();
				setState(501);
				match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarAssignDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null), ((Var_declContext)_localctx).logicalExpression.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(505);
				((Var_declContext)_localctx).ID = match(ID);
				setState(506);
				match(ASSING);
				setState(507);
				((Var_declContext)_localctx).function_call = function_call();
				setState(509);
				_la = _input.LA(1);
				if (_la==SEMICOL) {
					{
					setState(508);
					match(SEMICOL);
					}
				}

				((Var_declContext)_localctx).node =  new VarAssignDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null), ((Var_declContext)_localctx).function_call.node);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ParameterListContext parameterList;
		public SentenceContext s;
		public TerminalNode FUNC() { return getToken(CommandXParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_declaration);
		int _la;
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(FUNC);
				setState(516);
				((Function_declarationContext)_localctx).ID = match(ID);
				setState(517);
				match(PAR_OPEN);
				setState(518);
				((Function_declarationContext)_localctx).parameterList = parameterList();
				setState(519);
				match(PAR_CLOSE);
				setState(520);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				        List<Parameter> parameterList = ((Function_declarationContext)_localctx).parameterList.list;
				    
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(522);
					((Function_declarationContext)_localctx).s = sentence();
					 body.add(((Function_declarationContext)_localctx).s.node); 
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList);
				setState(531);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(FUNC);
				setState(535);
				((Function_declarationContext)_localctx).ID = match(ID);
				setState(536);
				match(PAR_OPEN);
				setState(537);
				match(PAR_CLOSE);
				setState(538);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				    
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(540);
					((Function_declarationContext)_localctx).s = sentence();
					 body.add(((Function_declarationContext)_localctx).s.node); 
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, null);
				setState(549);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, null));
				    
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

	public static class Function_declaration_with_returnContext extends ParserRuleContext {
		public ASTNode node;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public ParameterListContext parameterList;
		public SentenceContext s;
		public ReturnFuncContext r;
		public TerminalNode FUNC() { return getToken(CommandXParser.FUNC, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Function_declaration_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunction_declaration_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunction_declaration_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitFunction_declaration_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_with_returnContext function_declaration_with_return() throws RecognitionException {
		Function_declaration_with_returnContext _localctx = new Function_declaration_with_returnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_declaration_with_return);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(FUNC);
				setState(554);
				((Function_declaration_with_returnContext)_localctx).typeDeclaration = typeDeclaration();
				setState(555);
				((Function_declaration_with_returnContext)_localctx).ID = match(ID);
				setState(556);
				match(PAR_OPEN);
				setState(557);
				((Function_declaration_with_returnContext)_localctx).parameterList = parameterList();
				setState(558);
				match(PAR_CLOSE);
				setState(559);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<ASTNode>();
				        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				        List<Parameter> parameterList = ((Function_declaration_with_returnContext)_localctx).parameterList.list;
				        ASTNode returnFunc = null;
				    
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(561);
					((Function_declaration_with_returnContext)_localctx).s = sentence();
					body.add(((Function_declaration_with_returnContext)_localctx).s.node);
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(569);
				((Function_declaration_with_returnContext)_localctx).r = returnFunc();
				returnFunc = ((Function_declaration_with_returnContext)_localctx).r.node;
				}
				((Function_declaration_with_returnContext)_localctx).node =  new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc);
				setState(573);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(FUNC);
				setState(577);
				((Function_declaration_with_returnContext)_localctx).typeDeclaration = typeDeclaration();
				setState(578);
				((Function_declaration_with_returnContext)_localctx).ID = match(ID);
				setState(579);
				match(PAR_OPEN);
				setState(580);
				match(PAR_CLOSE);
				setState(581);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				        ASTNode returnFunc = null;
				    
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(583);
					((Function_declaration_with_returnContext)_localctx).s = sentence();
					 body.add(((Function_declaration_with_returnContext)_localctx).s.node); 
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(591);
					((Function_declaration_with_returnContext)_localctx).r = returnFunc();
					 returnFunc = ((Function_declaration_with_returnContext)_localctx).r.node; 
					}
				}

				((Function_declaration_with_returnContext)_localctx).node =  new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, null, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc);
				setState(597);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, null, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc));
				    
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext expr;
		public TerminalNode RETURN() { return getToken(CommandXParser.RETURN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterReturnFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitReturnFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitReturnFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(RETURN);
			setState(603);
			((ReturnFuncContext)_localctx).expr = logicalExpression();
			setState(604);
			match(SEMICOL);

			        ((ReturnFuncContext)_localctx).node =  new ReturnFunc(((ReturnFuncContext)_localctx).expr.node);
			    
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

	public static class Function_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				((Function_callContext)_localctx).ID = match(ID);
				setState(608);
				match(PAR_OPEN);
				setState(609);
				match(PAR_CLOSE);
				setState(610);
				match(SEMICOL);

				        Object declaration = functionSymbolTable.get((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null));

				        if (declaration instanceof FunctionDeclarationReturn) {
				            ((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), null, true);
				        } else if (declaration instanceof FunctionDeclaration) {
				            ((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), null, false);
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				((Function_callContext)_localctx).ID = match(ID);
				setState(613);
				match(PAR_OPEN);
				setState(614);
				((Function_callContext)_localctx).argumentList = argumentList();
				setState(615);
				match(PAR_CLOSE);
				setState(616);
				match(SEMICOL);

				        Object declaration = functionSymbolTable.get((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null));

				        if (declaration instanceof FunctionDeclarationReturn) {
				            ((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), ((Function_callContext)_localctx).argumentList.list, true);
				        } else if (declaration instanceof FunctionDeclaration) {
				            ((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), ((Function_callContext)_localctx).argumentList.list, false);
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

	public static class Procedure_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public SentenceContext s;
		public TerminalNode PROC() { return getToken(CommandXParser.PROC, 0); }
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Procedure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterProcedure_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitProcedure_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitProcedure_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
		Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_procedure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(PROC);
			setState(622);
			((Procedure_declarationContext)_localctx).ID = match(ID);
			setState(623);
			match(PAR_OPEN);
			setState(624);
			parameterList();
			setState(625);
			match(PAR_CLOSE);
			setState(626);
			match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BRACKET_OPEN) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(628);
				((Procedure_declarationContext)_localctx).s = sentence();
				body.add(((Procedure_declarationContext)_localctx).s.node);
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			match(BRACES_CLOSE);
			((Procedure_declarationContext)_localctx).node =  new ProcedureDeclaration((((Procedure_declarationContext)_localctx).ID!=null?((Procedure_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
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

	public static class Procedure_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			((Procedure_callContext)_localctx).ID = match(ID);
			setState(640);
			match(PAR_OPEN);
			setState(641);
			((Procedure_callContext)_localctx).argumentList = argumentList();
			setState(642);
			match(PAR_CLOSE);
			setState(643);
			match(SEMICOL);
			((Procedure_callContext)_localctx).node =  new ProcedureCall((((Procedure_callContext)_localctx).ID!=null?((Procedure_callContext)_localctx).ID.getText():null), ((Procedure_callContext)_localctx).argumentList.list);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ASTNode> list;
		public LogicalExpressionContext e;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			{
			setState(647);
			((ArgumentListContext)_localctx).e = logicalExpression();
			args.add(((ArgumentListContext)_localctx).e.node);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(649);
				match(COMMA);
				setState(650);
				((ArgumentListContext)_localctx).e = logicalExpression();
				args.add(((ArgumentListContext)_localctx).e.node);
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ArgumentListContext)_localctx).list =  args;
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<Parameter> list;
		public ParameterContext p;
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
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(661);
			((ParameterListContext)_localctx).p = parameter();
			params.add(((ParameterListContext)_localctx).p.param);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(663);
				match(COMMA);
				setState(664);
				((ParameterListContext)_localctx).p = parameter();
				params.add(((ParameterListContext)_localctx).p.param);
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ParameterListContext)_localctx).list =  params;
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
		public Parameter param;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			((ParameterContext)_localctx).typeDeclaration = typeDeclaration();
			setState(675);
			((ParameterContext)_localctx).ID = match(ID);
			((ParameterContext)_localctx).param =  new Parameter((((ParameterContext)_localctx).typeDeclaration!=null?_input.getText(((ParameterContext)_localctx).typeDeclaration.start,((ParameterContext)_localctx).typeDeclaration.stop):null), (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null));
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CommandXParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CommandXParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(CommandXParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CommandXParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(CommandXParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(CommandXParser.STRING, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandXListener ) ((CommandXListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandXVisitor ) return ((CommandXVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u02ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u009e\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0\13\7\3\7\3\7\3\7\6\7\u00d5"+
		"\n\7\r\7\16\7\u00d6\5\7\u00d9\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e0\n\7\f"+
		"\7\16\7\u00e3\13\7\3\7\5\7\u00e6\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00f3\n\b\f\b\16\b\u00f6\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0107\n\t\f\t\16\t\u010a\13\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u011b\n"+
		"\n\f\n\16\n\u011e\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0134\n\f\f\f\16\f\u0137"+
		"\13\f\5\f\u0139\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u015c\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0164\n\20\f\20\16\20\u0167\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u016f\n\21\f\21\16\21\u0172\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u017a\n\22\f\22\16\22\u017d\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u0185\n\23\f\23\16\23\u0188\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0190\n\24\f\24\16\24\u0193\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u019b\n\25\f\25\16\25\u019e\13\25\3\26\3\26\3\26\5\26"+
		"\u01a3\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ae\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c4\n\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e1\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0200\n \3 \3 \5 \u0204\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\7!\u0210\n!\f!\16!\u0213\13!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\7!\u0222\n!\f!\16!\u0225\13!\3!\3!\3!\5!\u022a\n"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0237\n\"\f\"\16\"\u023a"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u024d\n\"\f\"\16\"\u0250\13\"\3\"\3\"\3\"\5\"\u0255\n\"\3\"\3"+
		"\"\3\"\3\"\5\"\u025b\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u026e\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u027a\n%\f%\16%\u027d"+
		"\13%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0290"+
		"\n\'\f\'\16\'\u0293\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\7(\u029e\n(\f(\16"+
		"(\u02a1\13(\3(\3(\3)\3)\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\5\3\2\63\64\3\2\3\7"+
		"\4\2\b\f\17\17\u02c6\2T\3\2\2\2\4\u009d\3\2\2\2\6\u009f\3\2\2\2\b\u00ad"+
		"\3\2\2\2\n\u00af\3\2\2\2\f\u00b4\3\2\2\2\16\u00e9\3\2\2\2\20\u00fa\3\2"+
		"\2\2\22\u010e\3\2\2\2\24\u0122\3\2\2\2\26\u012b\3\2\2\2\30\u013d\3\2\2"+
		"\2\32\u0145\3\2\2\2\34\u015b\3\2\2\2\36\u015d\3\2\2\2 \u0168\3\2\2\2\""+
		"\u0173\3\2\2\2$\u017e\3\2\2\2&\u0189\3\2\2\2(\u0194\3\2\2\2*\u019f\3\2"+
		"\2\2,\u01ad\3\2\2\2.\u01c3\3\2\2\2\60\u01c5\3\2\2\2\62\u01c9\3\2\2\2\64"+
		"\u01cb\3\2\2\2\66\u01d0\3\2\2\28\u01e0\3\2\2\2:\u01e2\3\2\2\2<\u01e8\3"+
		"\2\2\2>\u0203\3\2\2\2@\u0229\3\2\2\2B\u025a\3\2\2\2D\u025c\3\2\2\2F\u026d"+
		"\3\2\2\2H\u026f\3\2\2\2J\u0281\3\2\2\2L\u0288\3\2\2\2N\u0296\3\2\2\2P"+
		"\u02a4\3\2\2\2R\u02a8\3\2\2\2TU\7\16\2\2UV\7\62\2\2VW\7\'\2\2W]\b\2\1"+
		"\2XY\5\4\3\2YZ\b\2\1\2Z\\\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_]\3\2\2\2`a\7(\2\2ab\b\2\1\2b\3\3\2\2\2cd\5\b\5\2de\b\3"+
		"\1\2e\u009e\3\2\2\2fg\5\f\7\2gh\b\3\1\2h\u009e\3\2\2\2ij\5*\26\2jk\b\3"+
		"\1\2k\u009e\3\2\2\2lm\5\16\b\2mn\b\3\1\2n\u009e\3\2\2\2op\5> \2pq\b\3"+
		"\1\2q\u009e\3\2\2\2rs\5<\37\2st\b\3\1\2t\u009e\3\2\2\2uv\5\n\6\2vw\b\3"+
		"\1\2w\u009e\3\2\2\2xy\5\20\t\2yz\b\3\1\2z\u009e\3\2\2\2{|\5\22\n\2|}\b"+
		"\3\1\2}\u009e\3\2\2\2~\177\5@!\2\177\u0080\b\3\1\2\u0080\u009e\3\2\2\2"+
		"\u0081\u0082\5B\"\2\u0082\u0083\b\3\1\2\u0083\u009e\3\2\2\2\u0084\u0085"+
		"\5H%\2\u0085\u0086\b\3\1\2\u0086\u009e\3\2\2\2\u0087\u0088\5F$\2\u0088"+
		"\u0089\b\3\1\2\u0089\u009e\3\2\2\2\u008a\u008b\5J&\2\u008b\u008c\b\3\1"+
		"\2\u008c\u009e\3\2\2\2\u008d\u008e\5\64\33\2\u008e\u008f\b\3\1\2\u008f"+
		"\u009e\3\2\2\2\u0090\u0091\5:\36\2\u0091\u0092\b\3\1\2\u0092\u009e\3\2"+
		"\2\2\u0093\u0094\5\24\13\2\u0094\u0095\b\3\1\2\u0095\u009e\3\2\2\2\u0096"+
		"\u0097\5\26\f\2\u0097\u0098\b\3\1\2\u0098\u009e\3\2\2\2\u0099\u009a\5"+
		"\30\r\2\u009a\u009b\b\3\1\2\u009b\u009e\3\2\2\2\u009c\u009e\5\6\4\2\u009d"+
		"c\3\2\2\2\u009df\3\2\2\2\u009di\3\2\2\2\u009dl\3\2\2\2\u009do\3\2\2\2"+
		"\u009dr\3\2\2\2\u009du\3\2\2\2\u009dx\3\2\2\2\u009d{\3\2\2\2\u009d~\3"+
		"\2\2\2\u009d\u0081\3\2\2\2\u009d\u0084\3\2\2\2\u009d\u0087\3\2\2\2\u009d"+
		"\u008a\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0090\3\2\2\2\u009d\u0093\3\2"+
		"\2\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\5\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\7\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2"+
		"\u00a3\7%\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\7+"+
		"\2\2\u00a6\u00a7\b\5\1\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9"+
		"\u00aa\7%\2\2\u00aa\u00ab\b\5\1\2\u00ab\u00ac\7&\2\2\u00ac\u00ae\7+\2"+
		"\2\u00ad\u00a1\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\t\3\2\2\2\u00af\u00b0"+
		"\7\20\2\2\u00b0\u00b1\7\62\2\2\u00b1\u00b2\7+\2\2\u00b2\u00b3\b\6\1\2"+
		"\u00b3\13\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\7%\2\2\u00b6\u00b7"+
		"\5\34\17\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\b\7\1\2\u00b9\u00bf\7\'\2\2"+
		"\u00ba\u00bb\5\4\3\2\u00bb\u00bc\b\7\1\2\u00bc\u00be\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00d8\7(\2\2\u00c3\u00c4\7\30"+
		"\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\7&\2\2\u00c7"+
		"\u00c8\b\7\1\2\u00c8\u00ce\7\'\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\b\7"+
		"\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7(\2\2\u00d2\u00d3\b\7\1\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00c3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00e5\3\2\2\2\u00da\u00db\7\27\2\2\u00db\u00e1\7\'\2\2\u00dc\u00dd\5"+
		"\4\3\2\u00dd\u00de\b\7\1\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7(\2\2\u00e5\u00da\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\7\1\2\u00e8\r\3\2\2\2"+
		"\u00e9\u00ea\7\32\2\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed"+
		"\7&\2\2\u00ed\u00ee\b\b\1\2\u00ee\u00f4\7\'\2\2\u00ef\u00f0\5\4\3\2\u00f0"+
		"\u00f1\b\b\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\b\b\1\2\u00f9\17\3\2\2\2"+
		"\u00fa\u00fb\7\31\2\2\u00fb\u00fc\7%\2\2\u00fc\u00fd\5<\37\2\u00fd\u00fe"+
		"\5\34\17\2\u00fe\u00ff\7+\2\2\u00ff\u0100\5<\37\2\u0100\u0101\7&\2\2\u0101"+
		"\u0102\b\t\1\2\u0102\u0108\7\'\2\2\u0103\u0104\5\4\3\2\u0104\u0105\b\t"+
		"\1\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010c\7(\2\2\u010c\u010d\b\t\1\2\u010d\21\3\2\2\2\u010e\u010f"+
		"\7\31\2\2\u010f\u0110\7%\2\2\u0110\u0111\5<\37\2\u0111\u0112\5\34\17\2"+
		"\u0112\u0113\7+\2\2\u0113\u0114\5*\26\2\u0114\u0115\7&\2\2\u0115\u0116"+
		"\b\n\1\2\u0116\u011c\7\'\2\2\u0117\u0118\5\4\3\2\u0118\u0119\b\n\1\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\7(\2\2\u0120\u0121\b\n\1\2\u0121\23\3\2\2\2\u0122\u0123\7\62\2"+
		"\2\u0123\u0124\7)\2\2\u0124\u0125\5\34\17\2\u0125\u0126\7*\2\2\u0126\u0127"+
		"\7$\2\2\u0127\u0128\5\34\17\2\u0128\u0129\7+\2\2\u0129\u012a\b\13\1\2"+
		"\u012a\25\3\2\2\2\u012b\u012c\7)\2\2\u012c\u0138\b\f\1\2\u012d\u012e\5"+
		"\34\17\2\u012e\u0135\b\f\1\2\u012f\u0130\7,\2\2\u0130\u0131\5\34\17\2"+
		"\u0131\u0132\b\f\1\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\7*\2\2\u013b\u013c\b\f\1\2\u013c\27\3\2\2\2\u013d\u013e"+
		"\5R*\2\u013e\u013f\7\62\2\2\u013f\u0140\7)\2\2\u0140\u0141\7-\2\2\u0141"+
		"\u0142\7*\2\2\u0142\u0143\7+\2\2\u0143\u0144\b\r\1\2\u0144\31\3\2\2\2"+
		"\u0145\u0146\7\62\2\2\u0146\u0147\7)\2\2\u0147\u0148\5\34\17\2\u0148\u0149"+
		"\7*\2\2\u0149\u014a\b\16\1\2\u014a\33\3\2\2\2\u014b\u014c\5\36\20\2\u014c"+
		"\u014d\b\17\1\2\u014d\u015c\3\2\2\2\u014e\u014f\5 \21\2\u014f\u0150\b"+
		"\17\1\2\u0150\u015c\3\2\2\2\u0151\u0152\7!\2\2\u0152\u0153\5\34\17\2\u0153"+
		"\u0154\b\17\1\2\u0154\u015c\3\2\2\2\u0155\u0156\5F$\2\u0156\u0157\b\17"+
		"\1\2\u0157\u015c\3\2\2\2\u0158\u0159\5\32\16\2\u0159\u015a\b\17\1\2\u015a"+
		"\u015c\3\2\2\2\u015b\u014b\3\2\2\2\u015b\u014e\3\2\2\2\u015b\u0151\3\2"+
		"\2\2\u015b\u0155\3\2\2\2\u015b\u0158\3\2\2\2\u015c\35\3\2\2\2\u015d\u015e"+
		"\5 \21\2\u015e\u0165\b\20\1\2\u015f\u0160\7 \2\2\u0160\u0161\5 \21\2\u0161"+
		"\u0162\b\20\1\2\u0162\u0164\3\2\2\2\u0163\u015f\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\37\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\5\"\22\2\u0169\u0170\b\21\1\2\u016a\u016b\7"+
		"\37\2\2\u016b\u016c\5\"\22\2\u016c\u016d\b\21\1\2\u016d\u016f\3\2\2\2"+
		"\u016e\u016a\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171!\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5$\23\2\u0174"+
		"\u017b\b\22\1\2\u0175\u0176\7#\2\2\u0176\u0177\5$\23\2\u0177\u0178\b\22"+
		"\1\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c#\3\2\2\2\u017d\u017b\3\2\2\2"+
		"\u017e\u017f\5&\24\2\u017f\u0186\b\23\1\2\u0180\u0181\7\"\2\2\u0181\u0182"+
		"\5&\24\2\u0182\u0183\b\23\1\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2"+
		"\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187%\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\5(\25\2\u018a\u0191\b\24\1\2\u018b"+
		"\u018c\7\33\2\2\u018c\u018d\5(\25\2\u018d\u018e\b\24\1\2\u018e\u0190\3"+
		"\2\2\2\u018f\u018b\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\'\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5,\27\2"+
		"\u0195\u019c\b\25\1\2\u0196\u0197\7\34\2\2\u0197\u0198\5,\27\2\u0198\u0199"+
		"\b\25\1\2\u0199\u019b\3\2\2\2\u019a\u0196\3\2\2\2\u019b\u019e\3\2\2\2"+
		"\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d)\3\2\2\2\u019e\u019c\3"+
		"\2\2\2\u019f\u01a0\7\62\2\2\u01a0\u01a2\7\36\2\2\u01a1\u01a3\7+\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\26"+
		"\1\2\u01a5+\3\2\2\2\u01a6\u01a7\7\33\2\2\u01a7\u01a8\5,\27\2\u01a8\u01a9"+
		"\b\27\1\2\u01a9\u01ae\3\2\2\2\u01aa\u01ab\5.\30\2\u01ab\u01ac\b\27\1\2"+
		"\u01ac\u01ae\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae-\3"+
		"\2\2\2\u01af\u01b0\5\60\31\2\u01b0\u01b1\b\30\1\2\u01b1\u01c4\3\2\2\2"+
		"\u01b2\u01b3\7-\2\2\u01b3\u01c4\b\30\1\2\u01b4\u01b5\7.\2\2\u01b5\u01c4"+
		"\b\30\1\2\u01b6\u01b7\7/\2\2\u01b7\u01c4\b\30\1\2\u01b8\u01b9\7\60\2\2"+
		"\u01b9\u01c4\b\30\1\2\u01ba\u01bb\7\61\2\2\u01bb\u01c4\b\30\1\2\u01bc"+
		"\u01bd\7\62\2\2\u01bd\u01c4\b\30\1\2\u01be\u01bf\7%\2\2\u01bf\u01c0\5"+
		"\34\17\2\u01c0\u01c1\7&\2\2\u01c1\u01c2\b\30\1\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01af\3\2\2\2\u01c3\u01b2\3\2\2\2\u01c3\u01b4\3\2\2\2\u01c3\u01b6\3\2"+
		"\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3"+
		"\u01be\3\2\2\2\u01c4/\3\2\2\2\u01c5\u01c6\7!\2\2\u01c6\u01c7\5.\30\2\u01c7"+
		"\u01c8\b\31\1\2\u01c8\61\3\2\2\2\u01c9\u01ca\t\3\2\2\u01ca\63\3\2\2\2"+
		"\u01cb\u01cc\5\62\32\2\u01cc\u01cd\7\62\2\2\u01cd\u01ce\7+\2\2\u01ce\u01cf"+
		"\b\33\1\2\u01cf\65\3\2\2\2\u01d0\u01d1\7\62\2\2\u01d1\u01d2\7$\2\2\u01d2"+
		"\u01d3\7\62\2\2\u01d3\u01d4\7+\2\2\u01d4\u01d5\b\34\1\2\u01d5\67\3\2\2"+
		"\2\u01d6\u01d7\7-\2\2\u01d7\u01e1\b\35\1\2\u01d8\u01d9\7.\2\2\u01d9\u01e1"+
		"\b\35\1\2\u01da\u01db\7/\2\2\u01db\u01e1\b\35\1\2\u01dc\u01dd\7\60\2\2"+
		"\u01dd\u01e1\b\35\1\2\u01de\u01df\7\61\2\2\u01df\u01e1\b\35\1\2\u01e0"+
		"\u01d6\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0\u01da\3\2\2\2\u01e0\u01dc\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e19\3\2\2\2\u01e2\u01e3\7\62\2\2\u01e3\u01e4"+
		"\7$\2\2\u01e4\u01e5\58\35\2\u01e5\u01e6\7+\2\2\u01e6\u01e7\b\36\1\2\u01e7"+
		";\3\2\2\2\u01e8\u01e9\7\62\2\2\u01e9\u01ea\7$\2\2\u01ea\u01eb\5\34\17"+
		"\2\u01eb\u01ec\7+\2\2\u01ec\u01ed\b\37\1\2\u01ed=\3\2\2\2\u01ee\u01ef"+
		"\5R*\2\u01ef\u01f0\7\62\2\2\u01f0\u01f1\7+\2\2\u01f1\u01f2\b \1\2\u01f2"+
		"\u0204\3\2\2\2\u01f3\u01f4\5R*\2\u01f4\u01f5\7\62\2\2\u01f5\u01f6\7$\2"+
		"\2\u01f6\u01f7\5\34\17\2\u01f7\u01f8\7+\2\2\u01f8\u01f9\b \1\2\u01f9\u0204"+
		"\3\2\2\2\u01fa\u01fb\5R*\2\u01fb\u01fc\7\62\2\2\u01fc\u01fd\7$\2\2\u01fd"+
		"\u01ff\5F$\2\u01fe\u0200\7+\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0202\b \1\2\u0202\u0204\3\2\2\2\u0203\u01ee"+
		"\3\2\2\2\u0203\u01f3\3\2\2\2\u0203\u01fa\3\2\2\2\u0204?\3\2\2\2\u0205"+
		"\u0206\7\22\2\2\u0206\u0207\7\62\2\2\u0207\u0208\7%\2\2\u0208\u0209\5"+
		"N(\2\u0209\u020a\7&\2\2\u020a\u020b\7\'\2\2\u020b\u0211\b!\1\2\u020c\u020d"+
		"\5\4\3\2\u020d\u020e\b!\1\2\u020e\u0210\3\2\2\2\u020f\u020c\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0214\u0215\b!\1\2\u0215\u0216\7(\2\2\u0216\u0217"+
		"\b!\1\2\u0217\u022a\3\2\2\2\u0218\u0219\7\22\2\2\u0219\u021a\7\62\2\2"+
		"\u021a\u021b\7%\2\2\u021b\u021c\7&\2\2\u021c\u021d\7\'\2\2\u021d\u0223"+
		"\b!\1\2\u021e\u021f\5\4\3\2\u021f\u0220\b!\1\2\u0220\u0222\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\b!\1\2\u0227"+
		"\u0228\7(\2\2\u0228\u022a\b!\1\2\u0229\u0205\3\2\2\2\u0229\u0218\3\2\2"+
		"\2\u022aA\3\2\2\2\u022b\u022c\7\22\2\2\u022c\u022d\5R*\2\u022d\u022e\7"+
		"\62\2\2\u022e\u022f\7%\2\2\u022f\u0230\5N(\2\u0230\u0231\7&\2\2\u0231"+
		"\u0232\7\'\2\2\u0232\u0238\b\"\1\2\u0233\u0234\5\4\3\2\u0234\u0235\b\""+
		"\1\2\u0235\u0237\3\2\2\2\u0236\u0233\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023b\u023c\5D#\2\u023c\u023d\b\"\1\2\u023d\u023e\3\2\2\2\u023e\u023f"+
		"\b\"\1\2\u023f\u0240\7(\2\2\u0240\u0241\b\"\1\2\u0241\u025b\3\2\2\2\u0242"+
		"\u0243\7\22\2\2\u0243\u0244\5R*\2\u0244\u0245\7\62\2\2\u0245\u0246\7%"+
		"\2\2\u0246\u0247\7&\2\2\u0247\u0248\7\'\2\2\u0248\u024e\b\"\1\2\u0249"+
		"\u024a\5\4\3\2\u024a\u024b\b\"\1\2\u024b\u024d\3\2\2\2\u024c\u0249\3\2"+
		"\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0254\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\5D#\2\u0252\u0253\b\"\1"+
		"\2\u0253\u0255\3\2\2\2\u0254\u0251\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\b\"\1\2\u0257\u0258\7(\2\2\u0258\u0259\b\"\1\2\u0259"+
		"\u025b\3\2\2\2\u025a\u022b\3\2\2\2\u025a\u0242\3\2\2\2\u025bC\3\2\2\2"+
		"\u025c\u025d\7\25\2\2\u025d\u025e\5\34\17\2\u025e\u025f\7+\2\2\u025f\u0260"+
		"\b#\1\2\u0260E\3\2\2\2\u0261\u0262\7\62\2\2\u0262\u0263\7%\2\2\u0263\u0264"+
		"\7&\2\2\u0264\u0265\7+\2\2\u0265\u026e\b$\1\2\u0266\u0267\7\62\2\2\u0267"+
		"\u0268\7%\2\2\u0268\u0269\5L\'\2\u0269\u026a\7&\2\2\u026a\u026b\7+\2\2"+
		"\u026b\u026c\b$\1\2\u026c\u026e\3\2\2\2\u026d\u0261\3\2\2\2\u026d\u0266"+
		"\3\2\2\2\u026eG\3\2\2\2\u026f\u0270\7\23\2\2\u0270\u0271\7\62\2\2\u0271"+
		"\u0272\7%\2\2\u0272\u0273\5N(\2\u0273\u0274\7&\2\2\u0274\u0275\7\'\2\2"+
		"\u0275\u027b\b%\1\2\u0276\u0277\5\4\3\2\u0277\u0278\b%\1\2\u0278\u027a"+
		"\3\2\2\2\u0279\u0276\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7("+
		"\2\2\u027f\u0280\b%\1\2\u0280I\3\2\2\2\u0281\u0282\7\62\2\2\u0282\u0283"+
		"\7%\2\2\u0283\u0284\5L\'\2\u0284\u0285\7&\2\2\u0285\u0286\7+\2\2\u0286"+
		"\u0287\b&\1\2\u0287K\3\2\2\2\u0288\u0289\b\'\1\2\u0289\u028a\5\34\17\2"+
		"\u028a\u0291\b\'\1\2\u028b\u028c\7,\2\2\u028c\u028d\5\34\17\2\u028d\u028e"+
		"\b\'\1\2\u028e\u0290\3\2\2\2\u028f\u028b\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0295\b\'\1\2\u0295M\3\2\2\2\u0296\u0297\b(\1\2\u0297\u0298"+
		"\5P)\2\u0298\u029f\b(\1\2\u0299\u029a\7,\2\2\u029a\u029b\5P)\2\u029b\u029c"+
		"\b(\1\2\u029c\u029e\3\2\2\2\u029d\u0299\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a2\u02a3\b(\1\2\u02a3O\3\2\2\2\u02a4\u02a5\5R*\2\u02a5\u02a6\7"+
		"\62\2\2\u02a6\u02a7\b)\1\2\u02a7Q\3\2\2\2\u02a8\u02a9\t\4\2\2\u02a9S\3"+
		"\2\2\2(]\u009d\u00ad\u00bf\u00ce\u00d6\u00d8\u00e1\u00e5\u00f4\u0108\u011c"+
		"\u0135\u0138\u015b\u0165\u0170\u017b\u0186\u0191\u019c\u01a2\u01ad\u01c3"+
		"\u01e0\u01ff\u0203\u0211\u0223\u0229\u0238\u024e\u0254\u025a\u026d\u027b"+
		"\u0291\u029f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}