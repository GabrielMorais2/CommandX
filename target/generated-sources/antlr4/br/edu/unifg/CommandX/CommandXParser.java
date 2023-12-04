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
		RULE_logicalExpression = 9, RULE_logicalOrExpression = 10, RULE_logicalAndExpression = 11, 
		RULE_equalityExpression = 12, RULE_relationalExpression = 13, RULE_additiveExpression = 14, 
		RULE_multiplicativeExpression = 15, RULE_incrementExpression = 16, RULE_unaryExpression = 17, 
		RULE_primaryExpression = 18, RULE_logicalNotExpression = 19, RULE_pointer_var = 20, 
		RULE_pointer_decl = 21, RULE_pointer_assign = 22, RULE_value_pointer = 23, 
		RULE_pointer_manipulation = 24, RULE_var_assign = 25, RULE_var_decl = 26, 
		RULE_function_declaration = 27, RULE_function_declaration_with_return = 28, 
		RULE_returnFunc = 29, RULE_function_call = 30, RULE_procedure_declaration = 31, 
		RULE_procedure_call = 32, RULE_argumentList = 33, RULE_parameterList = 34, 
		RULE_parameter = 35, RULE_typeDeclaration = 36;
	public static final String[] ruleNames = {
		"start", "sentence", "comment", "print", "read_statement", "conditional", 
		"while_loop", "for_loop", "for_loop_increment", "logicalExpression", "logicalOrExpression", 
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
			setState(74);
			match(PROGRAM);
			setState(75);
			match(ID);
			setState(76);
			match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> symbolTable = new HashMap<String, Object>();
					
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(78);
				((StartContext)_localctx).sentence = sentence();
				body.add(((StartContext)_localctx).sentence.node);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((SentenceContext)_localctx).incrementExpression = incrementExpression();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).incrementExpression.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				((SentenceContext)_localctx).while_loop = while_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_loop.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				((SentenceContext)_localctx).read_statement = read_statement();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).read_statement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				((SentenceContext)_localctx).for_loop = for_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				((SentenceContext)_localctx).for_loop_increment = for_loop_increment();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop_increment.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				((SentenceContext)_localctx).function_declaration_with_return = function_declaration_with_return();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration_with_return.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(122);
				((SentenceContext)_localctx).procedure_declaration = procedure_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_declaration.node;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(125);
				((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(128);
				((SentenceContext)_localctx).procedure_call = procedure_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_call.node;
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(131);
				((SentenceContext)_localctx).pointer_decl = pointer_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pointer_decl.node;
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(134);
				((SentenceContext)_localctx).pointer_manipulation = pointer_manipulation();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pointer_manipulation.node;
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(137);
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
			setState(140);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(PRINT);
				setState(143);
				match(PAR_OPEN);
				setState(144);
				((PrintContext)_localctx).logicalExpression = logicalExpression();
				setState(145);
				match(PAR_CLOSE);
				setState(146);
				match(SEMICOL);
				((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).logicalExpression.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(PRINT);
				setState(150);
				match(PAR_OPEN);
				 System.out.println(); 
				setState(152);
				match(PAR_CLOSE);
				setState(153);
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
			setState(156);
			match(READ);
			setState(157);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(158);
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
			setState(161);
			match(IF);
			setState(162);
			match(PAR_OPEN);
			setState(163);
			((ConditionalContext)_localctx).ifLogicalExpression = logicalExpression();
			setState(164);
			match(PAR_CLOSE);

			        List<ASTNode> ifBody = new ArrayList<ASTNode>();
			        List<ASTNode> elseBody = new ArrayList<ASTNode>();
			        List<ElifNode> elifNodes = new ArrayList<ElifNode>();
			    
			setState(166);
			match(BRACES_OPEN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(167);
				((ConditionalContext)_localctx).s1 = sentence();
				ifBody.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(BRACES_CLOSE);
			setState(197);
			_la = _input.LA(1);
			if (_la==ELIF) {
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(ELIF);
					setState(177);
					match(PAR_OPEN);
					setState(178);
					((ConditionalContext)_localctx).elifLogicalExpression = logicalExpression();
					setState(179);
					match(PAR_CLOSE);
					 List<ASTNode> elifBody = new ArrayList<ASTNode>(); 
					setState(181);
					match(BRACES_OPEN);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
						{
						{
						setState(182);
						((ConditionalContext)_localctx).s2 = sentence();
						elifBody.add(((ConditionalContext)_localctx).s2.node);
						}
						}
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(190);
					match(BRACES_CLOSE);
					 ElifNode elifNode = new ElifNode(((ConditionalContext)_localctx).elifLogicalExpression.node, elifBody); elifNodes.add(elifNode); 
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				}
			}

			setState(210);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(199);
				match(ELSE);
				setState(200);
				match(BRACES_OPEN);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(201);
					((ConditionalContext)_localctx).s3 = sentence();
					elseBody.add(((ConditionalContext)_localctx).s3.node);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
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
			setState(214);
			match(WHILE);
			setState(215);
			match(PAR_OPEN);
			setState(216);
			((While_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(217);
			match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(219);
			match(BRACES_OPEN);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(220);
				((While_loopContext)_localctx).s1 = sentence();
				body.add(((While_loopContext)_localctx).s1.node);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
			setState(231);
			match(FOR);
			setState(232);
			match(PAR_OPEN);
			setState(233);
			((For_loopContext)_localctx).initialization = var_assign();
			setState(234);
			((For_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(235);
			match(SEMICOL);
			setState(236);
			((For_loopContext)_localctx).update = var_assign();
			setState(237);
			match(PAR_CLOSE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(239);
			match(BRACES_OPEN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(240);
				((For_loopContext)_localctx).s = sentence();
				body.add(((For_loopContext)_localctx).s.node);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
			setState(251);
			match(FOR);
			setState(252);
			match(PAR_OPEN);
			setState(253);
			((For_loop_incrementContext)_localctx).initialization = var_assign();
			setState(254);
			((For_loop_incrementContext)_localctx).logicalExpression = logicalExpression();
			setState(255);
			match(SEMICOL);
			setState(256);
			((For_loop_incrementContext)_localctx).update = incrementExpression();
			setState(257);
			match(PAR_CLOSE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(259);
			match(BRACES_OPEN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(260);
				((For_loop_incrementContext)_localctx).s = sentence();
				body.add(((For_loop_incrementContext)_localctx).s.node);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext logicalOrExpression;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalExpressionContext logicalExpression;
		public Function_callContext function_call;
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
		enterRule(_localctx, 18, RULE_logicalExpression);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((LogicalExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalAndExpression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(NOT);
				setState(278);
				((LogicalExpressionContext)_localctx).logicalExpression = logicalExpression();
				((LogicalExpressionContext)_localctx).node =  new LogicalNot(_localctx.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((LogicalExpressionContext)_localctx).function_call = function_call();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).function_call.node;
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
		enterRule(_localctx, 20, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(288);
				match(OR);
				setState(289);
				((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(296);
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
		enterRule(_localctx, 22, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(299);
				match(AND);
				setState(300);
				((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(307);
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
		enterRule(_localctx, 24, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(310);
				((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR = match(EQUALITY_OPERATOR);
				setState(311);
				((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR!=null?((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR.getText():null));
				}
				}
				setState(318);
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
		enterRule(_localctx, 26, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OPERATOR) {
				{
				{
				setState(321);
				((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR = match(RELATIONAL_OPERATOR);
				setState(322);
				((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR!=null?((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR.getText():null));
				}
				}
				setState(329);
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
		enterRule(_localctx, 28, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(332);
				((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(333);
				((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null));
				}
				}
				setState(340);
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
		enterRule(_localctx, 30, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIVE_OPERATOR) {
				{
				{
				setState(343);
				((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR = match(MULTIPLICATIVE_OPERATOR);
				setState(344);
				((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR!=null?((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR.getText():null));
				}
				}
				setState(351);
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
		enterRule(_localctx, 32, RULE_incrementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((IncrementExpressionContext)_localctx).ID = match(ID);
			setState(353);
			((IncrementExpressionContext)_localctx).op = match(INCREMENT_OPERATOR);
			setState(355);
			_la = _input.LA(1);
			if (_la==SEMICOL) {
				{
				setState(354);
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
		enterRule(_localctx, 34, RULE_unaryExpression);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case ADDITIVE_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(360);
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
				setState(363);
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
		enterRule(_localctx, 36, RULE_primaryExpression);
		try {
			setState(388);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				((PrimaryExpressionContext)_localctx).ID = match(ID);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				match(PAR_OPEN);
				setState(384);
				((PrimaryExpressionContext)_localctx).expr = logicalExpression();
				setState(385);
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
		enterRule(_localctx, 38, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(NOT);
			setState(391);
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
		enterRule(_localctx, 40, RULE_pointer_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 42, RULE_pointer_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((Pointer_declContext)_localctx).pointer_var = pointer_var();
			setState(397);
			((Pointer_declContext)_localctx).ID = match(ID);
			setState(398);
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
		enterRule(_localctx, 44, RULE_pointer_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Pointer_assignContext)_localctx).pointer = match(ID);
			setState(402);
			match(ASSING);
			setState(403);
			((Pointer_assignContext)_localctx).variable = match(ID);
			setState(404);
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
		enterRule(_localctx, 46, RULE_value_pointer);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				((Value_pointerContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant(Integer.parseInt((((Value_pointerContext)_localctx).INTEGER_LITERAL!=null?((Value_pointerContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				((Value_pointerContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant(Boolean.parseBoolean((((Value_pointerContext)_localctx).BOOLEAN_LITERAL!=null?((Value_pointerContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				((Value_pointerContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant((((Value_pointerContext)_localctx).CHAR_LITERAL!=null?((Value_pointerContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				((Value_pointerContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((Value_pointerContext)_localctx).node =  new Constant((((Value_pointerContext)_localctx).STRING_LITERAL!=null?((Value_pointerContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((Value_pointerContext)_localctx).STRING_LITERAL!=null?((Value_pointerContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
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
		enterRule(_localctx, 48, RULE_pointer_manipulation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((Pointer_manipulationContext)_localctx).ID = match(ID);
			setState(420);
			match(ASSING);
			setState(421);
			((Pointer_manipulationContext)_localctx).value_pointer = value_pointer();
			setState(422);
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
		enterRule(_localctx, 50, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(426);
			match(ASSING);
			setState(427);
			((Var_assignContext)_localctx).logicalExpression = logicalExpression();
			setState(428);
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
		enterRule(_localctx, 52, RULE_var_decl);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(432);
				((Var_declContext)_localctx).ID = match(ID);
				setState(433);
				match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(437);
				((Var_declContext)_localctx).ID = match(ID);
				setState(438);
				match(ASSING);
				setState(439);
				((Var_declContext)_localctx).logicalExpression = logicalExpression();
				setState(440);
				match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarAssignDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null), ((Var_declContext)_localctx).logicalExpression.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(444);
				((Var_declContext)_localctx).ID = match(ID);
				setState(445);
				match(ASSING);
				setState(446);
				((Var_declContext)_localctx).function_call = function_call();
				setState(448);
				_la = _input.LA(1);
				if (_la==SEMICOL) {
					{
					setState(447);
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
		enterRule(_localctx, 54, RULE_function_declaration);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(FUNC);
				setState(455);
				((Function_declarationContext)_localctx).ID = match(ID);
				setState(456);
				match(PAR_OPEN);
				setState(457);
				((Function_declarationContext)_localctx).parameterList = parameterList();
				setState(458);
				match(PAR_CLOSE);
				setState(459);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				        List<Parameter> parameterList = ((Function_declarationContext)_localctx).parameterList.list;
				    
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(461);
					((Function_declarationContext)_localctx).s = sentence();
					 body.add(((Function_declarationContext)_localctx).s.node); 
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList);
				setState(470);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(FUNC);
				setState(474);
				((Function_declarationContext)_localctx).ID = match(ID);
				setState(475);
				match(PAR_OPEN);
				setState(476);
				match(PAR_CLOSE);
				setState(477);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				    
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(479);
					((Function_declarationContext)_localctx).s = sentence();
					 body.add(((Function_declarationContext)_localctx).s.node); 
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, null);
				setState(488);
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
		enterRule(_localctx, 56, RULE_function_declaration_with_return);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(FUNC);
				setState(493);
				((Function_declaration_with_returnContext)_localctx).typeDeclaration = typeDeclaration();
				setState(494);
				((Function_declaration_with_returnContext)_localctx).ID = match(ID);
				setState(495);
				match(PAR_OPEN);
				setState(496);
				((Function_declaration_with_returnContext)_localctx).parameterList = parameterList();
				setState(497);
				match(PAR_CLOSE);
				setState(498);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<ASTNode>();
				        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				        List<Parameter> parameterList = ((Function_declaration_with_returnContext)_localctx).parameterList.list;
				        ASTNode returnFunc = null;
				    
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(500);
					((Function_declaration_with_returnContext)_localctx).s = sentence();
					body.add(((Function_declaration_with_returnContext)_localctx).s.node);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(508);
				((Function_declaration_with_returnContext)_localctx).r = returnFunc();
				returnFunc = ((Function_declaration_with_returnContext)_localctx).r.node;
				}
				((Function_declaration_with_returnContext)_localctx).node =  new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc);
				setState(512);
				match(BRACES_CLOSE);

				        functionSymbolTable.put((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, parameterList, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(FUNC);
				setState(516);
				((Function_declaration_with_returnContext)_localctx).typeDeclaration = typeDeclaration();
				setState(517);
				((Function_declaration_with_returnContext)_localctx).ID = match(ID);
				setState(518);
				match(PAR_OPEN);
				setState(519);
				match(PAR_CLOSE);
				setState(520);
				match(BRACES_OPEN);

				        List<ASTNode> body = new ArrayList<>();
				        Map<String, Object> localSymbolTable = new HashMap<>();
				        ASTNode returnFunc = null;
				    
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
					{
					{
					setState(522);
					((Function_declaration_with_returnContext)_localctx).s = sentence();
					 body.add(((Function_declaration_with_returnContext)_localctx).s.node); 
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(530);
					((Function_declaration_with_returnContext)_localctx).r = returnFunc();
					 returnFunc = ((Function_declaration_with_returnContext)_localctx).r.node; 
					}
				}

				((Function_declaration_with_returnContext)_localctx).node =  new FunctionDeclarationReturn((((Function_declaration_with_returnContext)_localctx).ID!=null?((Function_declaration_with_returnContext)_localctx).ID.getText():null), body, localSymbolTable, null, (((Function_declaration_with_returnContext)_localctx).typeDeclaration!=null?_input.getText(((Function_declaration_with_returnContext)_localctx).typeDeclaration.start,((Function_declaration_with_returnContext)_localctx).typeDeclaration.stop):null), returnFunc);
				setState(536);
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
		enterRule(_localctx, 58, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(RETURN);
			setState(542);
			((ReturnFuncContext)_localctx).expr = logicalExpression();
			setState(543);
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
		enterRule(_localctx, 60, RULE_function_call);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				((Function_callContext)_localctx).ID = match(ID);
				setState(547);
				match(PAR_OPEN);
				setState(548);
				match(PAR_CLOSE);
				setState(549);
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
				setState(551);
				((Function_callContext)_localctx).ID = match(ID);
				setState(552);
				match(PAR_OPEN);
				setState(553);
				((Function_callContext)_localctx).argumentList = argumentList();
				setState(554);
				match(PAR_CLOSE);
				setState(555);
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
		enterRule(_localctx, 62, RULE_procedure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(PROC);
			setState(561);
			((Procedure_declarationContext)_localctx).ID = match(ID);
			setState(562);
			match(PAR_OPEN);
			setState(563);
			parameterList();
			setState(564);
			match(PAR_CLOSE);
			setState(565);
			match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(567);
				((Procedure_declarationContext)_localctx).s = sentence();
				body.add(((Procedure_declarationContext)_localctx).s.node);
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
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
		enterRule(_localctx, 64, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			((Procedure_callContext)_localctx).ID = match(ID);
			setState(579);
			match(PAR_OPEN);
			setState(580);
			((Procedure_callContext)_localctx).argumentList = argumentList();
			setState(581);
			match(PAR_CLOSE);
			setState(582);
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
		enterRule(_localctx, 66, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			{
			setState(586);
			((ArgumentListContext)_localctx).e = logicalExpression();
			args.add(((ArgumentListContext)_localctx).e.node);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588);
				match(COMMA);
				setState(589);
				((ArgumentListContext)_localctx).e = logicalExpression();
				args.add(((ArgumentListContext)_localctx).e.node);
				}
				}
				setState(596);
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
		enterRule(_localctx, 68, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(600);
			((ParameterListContext)_localctx).p = parameter();
			params.add(((ParameterListContext)_localctx).p.param);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(602);
				match(COMMA);
				setState(603);
				((ParameterListContext)_localctx).p = parameter();
				params.add(((ParameterListContext)_localctx).p.param);
				}
				}
				setState(610);
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
		enterRule(_localctx, 70, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			((ParameterContext)_localctx).typeDeclaration = typeDeclaration();
			setState(614);
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
		enterRule(_localctx, 72, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u026e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2T\n"+
		"\2\f\2\16\2W\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u008d\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf\13\7\3\7\3\7\3\7\6\7"+
		"\u00c4\n\7\r\7\16\7\u00c5\5\7\u00c8\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cf"+
		"\n\7\f\7\16\7\u00d2\13\7\3\7\5\7\u00d5\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00e2\n\b\f\b\16\b\u00e5\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f6\n\t\f\t\16\t\u00f9"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u010a\n\n\f\n\16\n\u010d\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011f\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0127\n\f\f\f\16\f\u012a\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0132\n\r\f\r\16\r\u0135\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u013d"+
		"\n\16\f\16\16\16\u0140\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0148"+
		"\n\17\f\17\16\17\u014b\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0153"+
		"\n\20\f\20\16\20\u0156\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015e"+
		"\n\21\f\21\16\21\u0161\13\21\3\22\3\22\3\22\5\22\u0166\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0171\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0187\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u01a4\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c3\n\34\3\34\3\34\5\34"+
		"\u01c7\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01d3"+
		"\n\35\f\35\16\35\u01d6\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\7\35\u01e5\n\35\f\35\16\35\u01e8\13\35\3\35\3"+
		"\35\3\35\5\35\u01ed\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u01fa\n\36\f\36\16\36\u01fd\13\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u0210\n\36\f\36\16\36\u0213\13\36\3\36\3\36\3\36\5\36\u0218\n\36\3\36"+
		"\3\36\3\36\3\36\5\36\u021e\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u0231\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u023d"+
		"\n!\f!\16!\u0240\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u0253\n#\f#\16#\u0256\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\7$\u0261"+
		"\n$\f$\16$\u0264\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\2\63\64\3\2"+
		"\3\7\4\2\b\f\17\17\u0287\2L\3\2\2\2\4\u008c\3\2\2\2\6\u008e\3\2\2\2\b"+
		"\u009c\3\2\2\2\n\u009e\3\2\2\2\f\u00a3\3\2\2\2\16\u00d8\3\2\2\2\20\u00e9"+
		"\3\2\2\2\22\u00fd\3\2\2\2\24\u011e\3\2\2\2\26\u0120\3\2\2\2\30\u012b\3"+
		"\2\2\2\32\u0136\3\2\2\2\34\u0141\3\2\2\2\36\u014c\3\2\2\2 \u0157\3\2\2"+
		"\2\"\u0162\3\2\2\2$\u0170\3\2\2\2&\u0186\3\2\2\2(\u0188\3\2\2\2*\u018c"+
		"\3\2\2\2,\u018e\3\2\2\2.\u0193\3\2\2\2\60\u01a3\3\2\2\2\62\u01a5\3\2\2"+
		"\2\64\u01ab\3\2\2\2\66\u01c6\3\2\2\28\u01ec\3\2\2\2:\u021d\3\2\2\2<\u021f"+
		"\3\2\2\2>\u0230\3\2\2\2@\u0232\3\2\2\2B\u0244\3\2\2\2D\u024b\3\2\2\2F"+
		"\u0259\3\2\2\2H\u0267\3\2\2\2J\u026b\3\2\2\2LM\7\16\2\2MN\7\62\2\2NO\7"+
		"\'\2\2OU\b\2\1\2PQ\5\4\3\2QR\b\2\1\2RT\3\2\2\2SP\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7(\2\2YZ\b\2\1\2Z\3\3\2\2\2[\\"+
		"\5\b\5\2\\]\b\3\1\2]\u008d\3\2\2\2^_\5\f\7\2_`\b\3\1\2`\u008d\3\2\2\2"+
		"ab\5\"\22\2bc\b\3\1\2c\u008d\3\2\2\2de\5\16\b\2ef\b\3\1\2f\u008d\3\2\2"+
		"\2gh\5\66\34\2hi\b\3\1\2i\u008d\3\2\2\2jk\5\64\33\2kl\b\3\1\2l\u008d\3"+
		"\2\2\2mn\5\n\6\2no\b\3\1\2o\u008d\3\2\2\2pq\5\20\t\2qr\b\3\1\2r\u008d"+
		"\3\2\2\2st\5\22\n\2tu\b\3\1\2u\u008d\3\2\2\2vw\58\35\2wx\b\3\1\2x\u008d"+
		"\3\2\2\2yz\5:\36\2z{\b\3\1\2{\u008d\3\2\2\2|}\5@!\2}~\b\3\1\2~\u008d\3"+
		"\2\2\2\177\u0080\5> \2\u0080\u0081\b\3\1\2\u0081\u008d\3\2\2\2\u0082\u0083"+
		"\5B\"\2\u0083\u0084\b\3\1\2\u0084\u008d\3\2\2\2\u0085\u0086\5,\27\2\u0086"+
		"\u0087\b\3\1\2\u0087\u008d\3\2\2\2\u0088\u0089\5\62\32\2\u0089\u008a\b"+
		"\3\1\2\u008a\u008d\3\2\2\2\u008b\u008d\5\6\4\2\u008c[\3\2\2\2\u008c^\3"+
		"\2\2\2\u008ca\3\2\2\2\u008cd\3\2\2\2\u008cg\3\2\2\2\u008cj\3\2\2\2\u008c"+
		"m\3\2\2\2\u008cp\3\2\2\2\u008cs\3\2\2\2\u008cv\3\2\2\2\u008cy\3\2\2\2"+
		"\u008c|\3\2\2\2\u008c\177\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0085\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008c\u008b\3\2\2\2\u008d\5\3\2\2\2\u008e\u008f"+
		"\t\2\2\2\u008f\7\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7%\2\2\u0092"+
		"\u0093\5\24\13\2\u0093\u0094\7&\2\2\u0094\u0095\7+\2\2\u0095\u0096\b\5"+
		"\1\2\u0096\u009d\3\2\2\2\u0097\u0098\7\21\2\2\u0098\u0099\7%\2\2\u0099"+
		"\u009a\b\5\1\2\u009a\u009b\7&\2\2\u009b\u009d\7+\2\2\u009c\u0090\3\2\2"+
		"\2\u009c\u0097\3\2\2\2\u009d\t\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0"+
		"\7\62\2\2\u00a0\u00a1\7+\2\2\u00a1\u00a2\b\6\1\2\u00a2\13\3\2\2\2\u00a3"+
		"\u00a4\7\26\2\2\u00a4\u00a5\7%\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\7"+
		"&\2\2\u00a7\u00a8\b\7\1\2\u00a8\u00ae\7\'\2\2\u00a9\u00aa\5\4\3\2\u00aa"+
		"\u00ab\b\7\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00c7\7(\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\7%"+
		"\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7&\2\2\u00b6\u00b7\b\7\1\2\u00b7"+
		"\u00bd\7\'\2\2\u00b8\u00b9\5\4\3\2\u00b9\u00ba\b\7\1\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7("+
		"\2\2\u00c1\u00c2\b\7\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00b2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d4\3\2\2\2\u00c9"+
		"\u00ca\7\27\2\2\u00ca\u00d0\7\'\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\b"+
		"\7\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d5\7(\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\b\7\1\2\u00d7\r\3\2\2\2\u00d8\u00d9\7\32\2"+
		"\2\u00d9\u00da\7%\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\7&\2\2\u00dc\u00dd"+
		"\b\b\1\2\u00dd\u00e3\7\'\2\2\u00de\u00df\5\4\3\2\u00df\u00e0\b\b\1\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7(\2\2\u00e7\u00e8\b\b\1\2\u00e8\17\3\2\2\2\u00e9\u00ea\7\31\2"+
		"\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\5\64\33\2\u00ec\u00ed\5\24\13\2\u00ed"+
		"\u00ee\7+\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f0\7&\2\2\u00f0\u00f1\b\t"+
		"\1\2\u00f1\u00f7\7\'\2\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\b\t\1\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7(\2\2\u00fb\u00fc\b\t\1\2\u00fc\21\3\2\2\2\u00fd\u00fe\7\31\2"+
		"\2\u00fe\u00ff\7%\2\2\u00ff\u0100\5\64\33\2\u0100\u0101\5\24\13\2\u0101"+
		"\u0102\7+\2\2\u0102\u0103\5\"\22\2\u0103\u0104\7&\2\2\u0104\u0105\b\n"+
		"\1\2\u0105\u010b\7\'\2\2\u0106\u0107\5\4\3\2\u0107\u0108\b\n\1\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7(\2\2\u010f\u0110\b\n\1\2\u0110\23\3\2\2\2\u0111\u0112\5\26\f"+
		"\2\u0112\u0113\b\13\1\2\u0113\u011f\3\2\2\2\u0114\u0115\5\30\r\2\u0115"+
		"\u0116\b\13\1\2\u0116\u011f\3\2\2\2\u0117\u0118\7!\2\2\u0118\u0119\5\24"+
		"\13\2\u0119\u011a\b\13\1\2\u011a\u011f\3\2\2\2\u011b\u011c\5> \2\u011c"+
		"\u011d\b\13\1\2\u011d\u011f\3\2\2\2\u011e\u0111\3\2\2\2\u011e\u0114\3"+
		"\2\2\2\u011e\u0117\3\2\2\2\u011e\u011b\3\2\2\2\u011f\25\3\2\2\2\u0120"+
		"\u0121\5\30\r\2\u0121\u0128\b\f\1\2\u0122\u0123\7 \2\2\u0123\u0124\5\30"+
		"\r\2\u0124\u0125\b\f\1\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\27\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012b\u012c\5\32\16\2\u012c\u0133\b\r\1\2\u012d"+
		"\u012e\7\37\2\2\u012e\u012f\5\32\16\2\u012f\u0130\b\r\1\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\31\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\34\17"+
		"\2\u0137\u013e\b\16\1\2\u0138\u0139\7#\2\2\u0139\u013a\5\34\17\2\u013a"+
		"\u013b\b\16\1\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\33\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0142\5\36\20\2\u0142\u0149\b\17\1\2\u0143\u0144"+
		"\7\"\2\2\u0144\u0145\5\36\20\2\u0145\u0146\b\17\1\2\u0146\u0148\3\2\2"+
		"\2\u0147\u0143\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\35\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\5 \21\2\u014d"+
		"\u0154\b\20\1\2\u014e\u014f\7\33\2\2\u014f\u0150\5 \21\2\u0150\u0151\b"+
		"\20\1\2\u0151\u0153\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\37\3\2\2\2\u0156\u0154\3\2\2"+
		"\2\u0157\u0158\5$\23\2\u0158\u015f\b\21\1\2\u0159\u015a\7\34\2\2\u015a"+
		"\u015b\5$\23\2\u015b\u015c\b\21\1\2\u015c\u015e\3\2\2\2\u015d\u0159\3"+
		"\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"!\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\62\2\2\u0163\u0165\7\36\2"+
		"\2\u0164\u0166\7+\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\b\22\1\2\u0168#\3\2\2\2\u0169\u016a\7\33\2\2\u016a"+
		"\u016b\5$\23\2\u016b\u016c\b\23\1\2\u016c\u0171\3\2\2\2\u016d\u016e\5"+
		"&\24\2\u016e\u016f\b\23\1\2\u016f\u0171\3\2\2\2\u0170\u0169\3\2\2\2\u0170"+
		"\u016d\3\2\2\2\u0171%\3\2\2\2\u0172\u0173\5(\25\2\u0173\u0174\b\24\1\2"+
		"\u0174\u0187\3\2\2\2\u0175\u0176\7-\2\2\u0176\u0187\b\24\1\2\u0177\u0178"+
		"\7.\2\2\u0178\u0187\b\24\1\2\u0179\u017a\7/\2\2\u017a\u0187\b\24\1\2\u017b"+
		"\u017c\7\60\2\2\u017c\u0187\b\24\1\2\u017d\u017e\7\61\2\2\u017e\u0187"+
		"\b\24\1\2\u017f\u0180\7\62\2\2\u0180\u0187\b\24\1\2\u0181\u0182\7%\2\2"+
		"\u0182\u0183\5\24\13\2\u0183\u0184\7&\2\2\u0184\u0185\b\24\1\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0172\3\2\2\2\u0186\u0175\3\2\2\2\u0186\u0177\3\2\2\2\u0186"+
		"\u0179\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u017d\3\2\2\2\u0186\u017f\3\2"+
		"\2\2\u0186\u0181\3\2\2\2\u0187\'\3\2\2\2\u0188\u0189\7!\2\2\u0189\u018a"+
		"\5&\24\2\u018a\u018b\b\25\1\2\u018b)\3\2\2\2\u018c\u018d\t\3\2\2\u018d"+
		"+\3\2\2\2\u018e\u018f\5*\26\2\u018f\u0190\7\62\2\2\u0190\u0191\7+\2\2"+
		"\u0191\u0192\b\27\1\2\u0192-\3\2\2\2\u0193\u0194\7\62\2\2\u0194\u0195"+
		"\7$\2\2\u0195\u0196\7\62\2\2\u0196\u0197\7+\2\2\u0197\u0198\b\30\1\2\u0198"+
		"/\3\2\2\2\u0199\u019a\7-\2\2\u019a\u01a4\b\31\1\2\u019b\u019c\7.\2\2\u019c"+
		"\u01a4\b\31\1\2\u019d\u019e\7/\2\2\u019e\u01a4\b\31\1\2\u019f\u01a0\7"+
		"\60\2\2\u01a0\u01a4\b\31\1\2\u01a1\u01a2\7\61\2\2\u01a2\u01a4\b\31\1\2"+
		"\u01a3\u0199\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\61\3\2\2\2\u01a5\u01a6\7\62\2\2\u01a6"+
		"\u01a7\7$\2\2\u01a7\u01a8\5\60\31\2\u01a8\u01a9\7+\2\2\u01a9\u01aa\b\32"+
		"\1\2\u01aa\63\3\2\2\2\u01ab\u01ac\7\62\2\2\u01ac\u01ad\7$\2\2\u01ad\u01ae"+
		"\5\24\13\2\u01ae\u01af\7+\2\2\u01af\u01b0\b\33\1\2\u01b0\65\3\2\2\2\u01b1"+
		"\u01b2\5J&\2\u01b2\u01b3\7\62\2\2\u01b3\u01b4\7+\2\2\u01b4\u01b5\b\34"+
		"\1\2\u01b5\u01c7\3\2\2\2\u01b6\u01b7\5J&\2\u01b7\u01b8\7\62\2\2\u01b8"+
		"\u01b9\7$\2\2\u01b9\u01ba\5\24\13\2\u01ba\u01bb\7+\2\2\u01bb\u01bc\b\34"+
		"\1\2\u01bc\u01c7\3\2\2\2\u01bd\u01be\5J&\2\u01be\u01bf\7\62\2\2\u01bf"+
		"\u01c0\7$\2\2\u01c0\u01c2\5> \2\u01c1\u01c3\7+\2\2\u01c2\u01c1\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\b\34\1\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01b1\3\2\2\2\u01c6\u01b6\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c7"+
		"\67\3\2\2\2\u01c8\u01c9\7\22\2\2\u01c9\u01ca\7\62\2\2\u01ca\u01cb\7%\2"+
		"\2\u01cb\u01cc\5F$\2\u01cc\u01cd\7&\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01d4"+
		"\b\35\1\2\u01cf\u01d0\5\4\3\2\u01d0\u01d1\b\35\1\2\u01d1\u01d3\3\2\2\2"+
		"\u01d2\u01cf\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\b\35\1\2"+
		"\u01d8\u01d9\7(\2\2\u01d9\u01da\b\35\1\2\u01da\u01ed\3\2\2\2\u01db\u01dc"+
		"\7\22\2\2\u01dc\u01dd\7\62\2\2\u01dd\u01de\7%\2\2\u01de\u01df\7&\2\2\u01df"+
		"\u01e0\7\'\2\2\u01e0\u01e6\b\35\1\2\u01e1\u01e2\5\4\3\2\u01e2\u01e3\b"+
		"\35\1\2\u01e3\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\b\35\1\2\u01ea\u01eb\7(\2\2\u01eb\u01ed\b\35\1\2\u01ec"+
		"\u01c8\3\2\2\2\u01ec\u01db\3\2\2\2\u01ed9\3\2\2\2\u01ee\u01ef\7\22\2\2"+
		"\u01ef\u01f0\5J&\2\u01f0\u01f1\7\62\2\2\u01f1\u01f2\7%\2\2\u01f2\u01f3"+
		"\5F$\2\u01f3\u01f4\7&\2\2\u01f4\u01f5\7\'\2\2\u01f5\u01fb\b\36\1\2\u01f6"+
		"\u01f7\5\4\3\2\u01f7\u01f8\b\36\1\2\u01f8\u01fa\3\2\2\2\u01f9\u01f6\3"+
		"\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5<\37\2\u01ff\u0200\b\36"+
		"\1\2\u0200\u0201\3\2\2\2\u0201\u0202\b\36\1\2\u0202\u0203\7(\2\2\u0203"+
		"\u0204\b\36\1\2\u0204\u021e\3\2\2\2\u0205\u0206\7\22\2\2\u0206\u0207\5"+
		"J&\2\u0207\u0208\7\62\2\2\u0208\u0209\7%\2\2\u0209\u020a\7&\2\2\u020a"+
		"\u020b\7\'\2\2\u020b\u0211\b\36\1\2\u020c\u020d\5\4\3\2\u020d\u020e\b"+
		"\36\1\2\u020e\u0210\3\2\2\2\u020f\u020c\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0217\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0215\5<\37\2\u0215\u0216\b\36\1\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0214\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\b\36"+
		"\1\2\u021a\u021b\7(\2\2\u021b\u021c\b\36\1\2\u021c\u021e\3\2\2\2\u021d"+
		"\u01ee\3\2\2\2\u021d\u0205\3\2\2\2\u021e;\3\2\2\2\u021f\u0220\7\25\2\2"+
		"\u0220\u0221\5\24\13\2\u0221\u0222\7+\2\2\u0222\u0223\b\37\1\2\u0223="+
		"\3\2\2\2\u0224\u0225\7\62\2\2\u0225\u0226\7%\2\2\u0226\u0227\7&\2\2\u0227"+
		"\u0228\7+\2\2\u0228\u0231\b \1\2\u0229\u022a\7\62\2\2\u022a\u022b\7%\2"+
		"\2\u022b\u022c\5D#\2\u022c\u022d\7&\2\2\u022d\u022e\7+\2\2\u022e\u022f"+
		"\b \1\2\u022f\u0231\3\2\2\2\u0230\u0224\3\2\2\2\u0230\u0229\3\2\2\2\u0231"+
		"?\3\2\2\2\u0232\u0233\7\23\2\2\u0233\u0234\7\62\2\2\u0234\u0235\7%\2\2"+
		"\u0235\u0236\5F$\2\u0236\u0237\7&\2\2\u0237\u0238\7\'\2\2\u0238\u023e"+
		"\b!\1\2\u0239\u023a\5\4\3\2\u023a\u023b\b!\1\2\u023b\u023d\3\2\2\2\u023c"+
		"\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\7(\2\2\u0242"+
		"\u0243\b!\1\2\u0243A\3\2\2\2\u0244\u0245\7\62\2\2\u0245\u0246\7%\2\2\u0246"+
		"\u0247\5D#\2\u0247\u0248\7&\2\2\u0248\u0249\7+\2\2\u0249\u024a\b\"\1\2"+
		"\u024aC\3\2\2\2\u024b\u024c\b#\1\2\u024c\u024d\5\24\13\2\u024d\u0254\b"+
		"#\1\2\u024e\u024f\7,\2\2\u024f\u0250\5\24\13\2\u0250\u0251\b#\1\2\u0251"+
		"\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257"+
		"\u0258\b#\1\2\u0258E\3\2\2\2\u0259\u025a\b$\1\2\u025a\u025b\5H%\2\u025b"+
		"\u0262\b$\1\2\u025c\u025d\7,\2\2\u025d\u025e\5H%\2\u025e\u025f\b$\1\2"+
		"\u025f\u0261\3\2\2\2\u0260\u025c\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265"+
		"\u0266\b$\1\2\u0266G\3\2\2\2\u0267\u0268\5J&\2\u0268\u0269\7\62\2\2\u0269"+
		"\u026a\b%\1\2\u026aI\3\2\2\2\u026b\u026c\t\4\2\2\u026cK\3\2\2\2&U\u008c"+
		"\u009c\u00ae\u00bd\u00c5\u00c7\u00d0\u00d4\u00e3\u00f7\u010b\u011e\u0128"+
		"\u0133\u013e\u0149\u0154\u015f\u0165\u0170\u0186\u01a3\u01c2\u01c6\u01d4"+
		"\u01e6\u01ec\u01fb\u0211\u0217\u021d\u0230\u023e\u0254\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}