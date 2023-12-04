// Generated from CommandX.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, FLOAT=3, CHAR=4, BOOLEAN=5, STRING=6, POINTER_INT=7, 
		POINTER_DOUBLE=8, POINTER_FLOAT=9, POINTER_CHAR=10, POINTER_BOOLEAN=11, 
		POINTER_STRING=12, POINTER_VAR=13, PROGRAM=14, VAR=15, READ=16, PRINT=17, 
		FUNC=18, PROC=19, VOID=20, RETURN=21, IF=22, ELSE=23, FOR=24, WHILE=25, 
		ADDITIVE_OPERATOR=26, MULTIPLICATIVE_OPERATOR=27, MOD=28, AND=29, OR=30, 
		NOT=31, PLUS_PLUS=32, MINUS_MINUS=33, RELATIONAL_OPERATOR=34, EQUALITY_OPERATOR=35, 
		ASSIGN=36, PAR_OPEN=37, PAR_CLOSE=38, BRACES_OPEN=39, BRACES_CLOSE=40, 
		BRACKET_OPEN=41, BRACKET_CLOSE=42, SEMICOL=43, COMMA=44, INTEGER_LITERAL=45, 
		BOOLEAN_LITERAL=46, CHAR_LITERAL=47, STRING_LITERAL=48, FLOAT_LITERAL=49, 
		DOUBLE_LITERAL=50, ID=51, LINE_COMMENT=52, BLOCK_COMMENT=53, WS=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "'double'", "'float'", "'char'", "'boolean'", "'string'", 
		"'int*'", "'double*'", "'float*'", "'char*'", "'boolean*'", "'string*'", 
		"'var*'", "'program'", "'var'", "'read'", "'print'", "'func'", "'proc'", 
		"'void'", "'return'", "'if'", "'else'", "'for'", "'while'", "ADDITIVE_OPERATOR", 
		"MULTIPLICATIVE_OPERATOR", "'%'", "'&&'", "'||'", "'!'", "'++'", "'--'", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "INTEGER_LITERAL", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "ID", 
		"LINE_COMMENT", "BLOCK_COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_comment = 2, RULE_print = 3, RULE_read_statement = 4, 
		RULE_conditional = 5, RULE_while_loop = 6, RULE_for_loop = 7, RULE_logicalExpression = 8, 
		RULE_logicalOrExpression = 9, RULE_logicalAndExpression = 10, RULE_equalityExpression = 11, 
		RULE_relationalExpression = 12, RULE_additiveExpression = 13, RULE_multiplicativeExpression = 14, 
		RULE_unaryExpression = 15, RULE_primaryExpression = 16, RULE_logicalNotExpression = 17, 
		RULE_var_decl = 18, RULE_var_assign = 19, RULE_function_declaration = 20, 
		RULE_procedure_declaration = 21, RULE_function_call = 22, RULE_procedure_call = 23, 
		RULE_argumentList = 24, RULE_parameterList = 25, RULE_parameter = 26, 
		RULE_typeDeclaration = 27;
	public static final String[] ruleNames = {
		"start", "sentence", "comment", "print", "read_statement", "conditional", 
		"while_loop", "for_loop", "logicalExpression", "logicalOrExpression", 
		"logicalAndExpression", "equalityExpression", "relationalExpression", 
		"additiveExpression", "multiplicativeExpression", "unaryExpression", "primaryExpression", 
		"logicalNotExpression", "var_decl", "var_assign", "function_declaration", 
		"procedure_declaration", "function_call", "procedure_call", "argumentList", 
		"parameterList", "parameter", "typeDeclaration"
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


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public CommandXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PROGRAM() { return getToken(CommandXParser.PROGRAM, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
			setState(56); match(PROGRAM);
			setState(57); match(ID);
			setState(58); match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> symbolTable = new HashMap<String, Object>();
					
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(60); ((StartContext)_localctx).sentence = sentence();
				body.add(((StartContext)_localctx).sentence.node);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); match(BRACES_CLOSE);

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
		public While_loopContext while_loop;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public Read_statementContext read_statement;
		public For_loopContext for_loop;
		public Function_declarationContext function_declaration;
		public Procedure_declarationContext procedure_declaration;
		public Function_callContext function_call;
		public Procedure_callContext procedure_call;
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Procedure_declarationContext procedure_declaration() {
			return getRuleContext(Procedure_declarationContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
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
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); ((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); ((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((SentenceContext)_localctx).while_loop = while_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_loop.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); ((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); ((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86); ((SentenceContext)_localctx).read_statement = read_statement();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).read_statement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89); ((SentenceContext)_localctx).for_loop = for_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92); ((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95); ((SentenceContext)_localctx).procedure_declaration = procedure_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_declaration.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(98); ((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101); ((SentenceContext)_localctx).procedure_call = procedure_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).procedure_call.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104); comment();
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
		public TerminalNode BLOCK_COMMENT() { return getToken(CommandXParser.BLOCK_COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(CommandXParser.LINE_COMMENT, 0); }
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
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
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

	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode PRINT() { return getToken(CommandXParser.PRINT, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(PRINT);
			setState(110); ((PrintContext)_localctx).logicalExpression = logicalExpression();
			setState(111); match(SEMICOL);
			((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).logicalExpression.node);
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
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode READ() { return getToken(CommandXParser.READ, 0); }
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
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(READ);
			setState(115); ((Read_statementContext)_localctx).ID = match(ID);
			setState(116); match(SEMICOL);
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
		public LogicalExpressionContext logicalExpression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode ELSE() { return getToken(CommandXParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CommandXParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode BRACES_CLOSE(int i) {
			return getToken(CommandXParser.BRACES_CLOSE, i);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> BRACES_CLOSE() { return getTokens(CommandXParser.BRACES_CLOSE); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode BRACES_OPEN(int i) {
			return getToken(CommandXParser.BRACES_OPEN, i);
		}
		public List<TerminalNode> BRACES_OPEN() { return getTokens(CommandXParser.BRACES_OPEN); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(IF);
			setState(120); match(PAR_OPEN);
			setState(121); ((ConditionalContext)_localctx).logicalExpression = logicalExpression();
			setState(122); match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(124); match(BRACES_OPEN);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(125); ((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(BRACES_CLOSE);
			setState(134); match(ELSE);

					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(136); match(BRACES_OPEN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(137); ((ConditionalContext)_localctx).s2 = sentence();
				elseBody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145); match(BRACES_CLOSE);

					((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).logicalExpression.node, body, elseBody);
				
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
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode WHILE() { return getToken(CommandXParser.WHILE, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(WHILE);
			setState(149); match(PAR_OPEN);
			setState(150); ((While_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(151); match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(153); match(BRACES_OPEN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(154); ((While_loopContext)_localctx).s1 = sentence();
				body.add(((While_loopContext)_localctx).s1.node);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(BRACES_CLOSE);

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
		public Var_assignContext var_assign(int i) {
			return getRuleContext(Var_assignContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CommandXParser.FOR, 0); }
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public List<Var_assignContext> var_assign() {
			return getRuleContexts(Var_assignContext.class);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(FOR);
			setState(166); match(PAR_OPEN);
			setState(167); ((For_loopContext)_localctx).initialization = var_assign();
			setState(168); ((For_loopContext)_localctx).logicalExpression = logicalExpression();
			setState(169); match(SEMICOL);
			setState(170); ((For_loopContext)_localctx).update = var_assign();
			setState(171); match(PAR_CLOSE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(173); match(BRACES_OPEN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(174); ((For_loopContext)_localctx).s = sentence();
				body.add(((For_loopContext)_localctx).s.node);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182); match(BRACES_CLOSE);

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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext logicalOrExpression;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode NOT() { return getToken(CommandXParser.NOT, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
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
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalExpression);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); ((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); ((LogicalExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalAndExpression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(NOT);
				setState(192); ((LogicalExpressionContext)_localctx).logicalExpression = logicalExpression();
				((LogicalExpressionContext)_localctx).node =  new LogicalNot(_localctx.node);
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
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CommandXParser.OR); }
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
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
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(199); match(OR);
				setState(200); ((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(207);
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
		public TerminalNode AND(int i) {
			return getToken(CommandXParser.AND, i);
		}
		public List<TerminalNode> AND() { return getTokens(CommandXParser.AND); }
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
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
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(210); match(AND);
				setState(211); ((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(218);
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
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALITY_OPERATOR() { return getTokens(CommandXParser.EQUALITY_OPERATOR); }
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
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
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(221); ((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR = match(EQUALITY_OPERATOR);
				setState(222); ((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR!=null?((EqualityExpressionContext)_localctx).EQUALITY_OPERATOR.getText():null));
				}
				}
				setState(229);
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
		public List<TerminalNode> RELATIONAL_OPERATOR() { return getTokens(CommandXParser.RELATIONAL_OPERATOR); }
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode RELATIONAL_OPERATOR(int i) {
			return getToken(CommandXParser.RELATIONAL_OPERATOR, i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
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
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OPERATOR) {
				{
				{
				setState(232); ((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR = match(RELATIONAL_OPERATOR);
				setState(233); ((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR!=null?((RelationalExpressionContext)_localctx).RELATIONAL_OPERATOR.getText():null));
				}
				}
				setState(240);
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
		public TerminalNode ADDITIVE_OPERATOR(int i) {
			return getToken(CommandXParser.ADDITIVE_OPERATOR, i);
		}
		public List<TerminalNode> ADDITIVE_OPERATOR() { return getTokens(CommandXParser.ADDITIVE_OPERATOR); }
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243); ((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
					setState(244); ((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
					((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR!=null?((AdditiveExpressionContext)_localctx).ADDITIVE_OPERATOR.getText():null));
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode MULTIPLICATIVE_OPERATOR(int i) {
			return getToken(CommandXParser.MULTIPLICATIVE_OPERATOR, i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public List<TerminalNode> MULTIPLICATIVE_OPERATOR() { return getTokens(CommandXParser.MULTIPLICATIVE_OPERATOR); }
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIVE_OPERATOR) {
				{
				{
				setState(254); ((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR = match(MULTIPLICATIVE_OPERATOR);
				setState(255); ((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR!=null?((MultiplicativeExpressionContext)_localctx).MULTIPLICATIVE_OPERATOR.getText():null));
				}
				}
				setState(262);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ADDITIVE_OPERATOR;
		public UnaryExpressionContext operand;
		public PrimaryExpressionContext primaryExpression;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(CommandXParser.ADDITIVE_OPERATOR, 0); }
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryExpression);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case ADDITIVE_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); ((UnaryExpressionContext)_localctx).ADDITIVE_OPERATOR = match(ADDITIVE_OPERATOR);
				setState(264); ((UnaryExpressionContext)_localctx).operand = unaryExpression();
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
				setState(267); ((UnaryExpressionContext)_localctx).primaryExpression = primaryExpression();
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
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(CommandXParser.INTEGER_LITERAL, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandXParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CommandXParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CommandXParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CommandXParser.CHAR_LITERAL, 0); }
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
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryExpression);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); ((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); ((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(277); ((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(279); ((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(281); ((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(283); ((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(285); ((PrimaryExpressionContext)_localctx).ID = match(ID);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(287); match(PAR_OPEN);
				setState(288); ((PrimaryExpressionContext)_localctx).expr = logicalExpression();
				setState(289); match(PAR_CLOSE);
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
	}

	public final LogicalNotExpressionContext logicalNotExpression() throws RecognitionException {
		LogicalNotExpressionContext _localctx = new LogicalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(NOT);
			setState(295); ((LogicalNotExpressionContext)_localctx).operand = primaryExpression();
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public TypeDeclarationContext typeDeclaration;
		public Token ID;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
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
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_decl);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); ((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(299); ((Var_declContext)_localctx).ID = match(ID);
				setState(300); match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); ((Var_declContext)_localctx).typeDeclaration = typeDeclaration();
				setState(304); ((Var_declContext)_localctx).ID = match(ID);
				setState(305); match(SEMICOL);
				((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null), (((Var_declContext)_localctx).typeDeclaration!=null?_input.getText(((Var_declContext)_localctx).typeDeclaration.start,((Var_declContext)_localctx).typeDeclaration.stop):null));
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CommandXParser.ASSIGN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
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
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_assign);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); ((Var_assignContext)_localctx).ID = match(ID);
				setState(311); match(ASSIGN);
				setState(312); ((Var_assignContext)_localctx).logicalExpression = logicalExpression();
				setState(313); match(SEMICOL);
				((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).logicalExpression.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); ((Var_assignContext)_localctx).ID = match(ID);
				setState(317); match(ASSIGN);
				setState(318); ((Var_assignContext)_localctx).logicalExpression = logicalExpression();
				((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).logicalExpression.node);
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
		public SentenceContext s;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(CommandXParser.FUNC, 0); }
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(FUNC);
			setState(324); ((Function_declarationContext)_localctx).ID = match(ID);
			setState(325); match(PAR_OPEN);
			setState(326); parameterList();
			setState(327); match(PAR_CLOSE);
			setState(328); match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(330); ((Function_declarationContext)_localctx).s = sentence();
				body.add(((Function_declarationContext)_localctx).s.node);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338); match(BRACES_CLOSE);
			((Function_declarationContext)_localctx).node =  new FunctionDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
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
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode PROC() { return getToken(CommandXParser.PROC, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACES_CLOSE() { return getToken(CommandXParser.BRACES_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode BRACES_OPEN() { return getToken(CommandXParser.BRACES_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
		Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procedure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(PROC);
			setState(342); ((Procedure_declarationContext)_localctx).ID = match(ID);
			setState(343); match(PAR_OPEN);
			setState(344); parameterList();
			setState(345); match(PAR_CLOSE);
			setState(346); match(BRACES_OPEN);

						List<ASTNode> body = new ArrayList<ASTNode>();
						Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR) | (1L << READ) | (1L << PRINT) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << LINE_COMMENT) | (1L << BLOCK_COMMENT))) != 0)) {
				{
				{
				setState(348); ((Procedure_declarationContext)_localctx).s = sentence();
				body.add(((Procedure_declarationContext)_localctx).s.node);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356); match(BRACES_CLOSE);
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

	public static class Function_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); ((Function_callContext)_localctx).ID = match(ID);
			setState(360); match(PAR_OPEN);
			setState(361); ((Function_callContext)_localctx).argumentList = argumentList();
			setState(362); match(PAR_CLOSE);
			setState(363); match(SEMICOL);
			((Function_callContext)_localctx).node =  new FunctionCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null), ((Function_callContext)_localctx).argumentList.list);
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
		public TerminalNode PAR_CLOSE() { return getToken(CommandXParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CommandXParser.PAR_OPEN, 0); }
		public TerminalNode SEMICOL() { return getToken(CommandXParser.SEMICOL, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
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
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); ((Procedure_callContext)_localctx).ID = match(ID);
			setState(367); match(PAR_OPEN);
			setState(368); ((Procedure_callContext)_localctx).argumentList = argumentList();
			setState(369); match(PAR_CLOSE);
			setState(370); match(SEMICOL);
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
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CommandXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CommandXParser.COMMA, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			{
			setState(374); ((ArgumentListContext)_localctx).e = logicalExpression();
			args.add(((ArgumentListContext)_localctx).e.node);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376); match(COMMA);
				setState(377); ((ArgumentListContext)_localctx).e = logicalExpression();
				args.add(((ArgumentListContext)_localctx).e.node);
				}
				}
				setState(384);
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
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(388); ((ParameterListContext)_localctx).p = parameter();
			params.add(((ParameterListContext)_localctx).p.param);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390); match(COMMA);
				setState(391); ((ParameterListContext)_localctx).p = parameter();
				params.add(((ParameterListContext)_localctx).p.param);
				}
				}
				setState(398);
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
		public TerminalNode ID() { return getToken(CommandXParser.ID, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
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
		enterRule(_localctx, 52, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); ((ParameterContext)_localctx).typeDeclaration = typeDeclaration();
			setState(402); ((ParameterContext)_localctx).ID = match(ID);
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
		public TerminalNode VAR() { return getToken(CommandXParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(CommandXParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(CommandXParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CommandXParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(CommandXParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CommandXParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CommandXParser.FLOAT, 0); }
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f"+
		"\7\16\7\u0086\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008f\n\7\f\7\16\7"+
		"\u0092\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a0"+
		"\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e4\n\r"+
		"\f\r\16\r\u00e7\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ef\n\16\f\16"+
		"\16\16\u00f2\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fa\n\17\f\17"+
		"\16\17\u00fd\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20"+
		"\16\20\u0108\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0127\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0137\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0144\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0150\n\26\f\26\16\26\u0153"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0162\n\27\f\27\16\27\u0165\13\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u017f\n\32\f\32\16\32\u0182\13\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u018d\n\33\f\33\16\33\u0190\13"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2\66\67\4\2\3\b\21"+
		"\21\u01a3\2:\3\2\2\2\4k\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\nt\3\2\2\2\fy\3"+
		"\2\2\2\16\u0096\3\2\2\2\20\u00a7\3\2\2\2\22\u00c5\3\2\2\2\24\u00c7\3\2"+
		"\2\2\26\u00d2\3\2\2\2\30\u00dd\3\2\2\2\32\u00e8\3\2\2\2\34\u00f3\3\2\2"+
		"\2\36\u00fe\3\2\2\2 \u0110\3\2\2\2\"\u0126\3\2\2\2$\u0128\3\2\2\2&\u0136"+
		"\3\2\2\2(\u0143\3\2\2\2*\u0145\3\2\2\2,\u0157\3\2\2\2.\u0169\3\2\2\2\60"+
		"\u0170\3\2\2\2\62\u0177\3\2\2\2\64\u0185\3\2\2\2\66\u0193\3\2\2\28\u0197"+
		"\3\2\2\2:;\7\20\2\2;<\7\65\2\2<=\7)\2\2=C\b\2\1\2>?\5\4\3\2?@\b\2\1\2"+
		"@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FG\7*\2\2GH\b\2\1\2H\3\3\2\2\2IJ\5\b\5\2JK\b\3\1\2Kl\3\2\2\2LM\5\f\7\2"+
		"MN\b\3\1\2Nl\3\2\2\2OP\5\16\b\2PQ\b\3\1\2Ql\3\2\2\2RS\5&\24\2ST\b\3\1"+
		"\2Tl\3\2\2\2UV\5(\25\2VW\b\3\1\2Wl\3\2\2\2XY\5\n\6\2YZ\b\3\1\2Zl\3\2\2"+
		"\2[\\\5\20\t\2\\]\b\3\1\2]l\3\2\2\2^_\5*\26\2_`\b\3\1\2`l\3\2\2\2ab\5"+
		",\27\2bc\b\3\1\2cl\3\2\2\2de\5.\30\2ef\b\3\1\2fl\3\2\2\2gh\5\60\31\2h"+
		"i\b\3\1\2il\3\2\2\2jl\5\6\4\2kI\3\2\2\2kL\3\2\2\2kO\3\2\2\2kR\3\2\2\2"+
		"kU\3\2\2\2kX\3\2\2\2k[\3\2\2\2k^\3\2\2\2ka\3\2\2\2kd\3\2\2\2kg\3\2\2\2"+
		"kj\3\2\2\2l\5\3\2\2\2mn\t\2\2\2n\7\3\2\2\2op\7\23\2\2pq\5\22\n\2qr\7-"+
		"\2\2rs\b\5\1\2s\t\3\2\2\2tu\7\22\2\2uv\7\65\2\2vw\7-\2\2wx\b\6\1\2x\13"+
		"\3\2\2\2yz\7\30\2\2z{\7\'\2\2{|\5\22\n\2|}\7(\2\2}~\b\7\1\2~\u0084\7)"+
		"\2\2\177\u0080\5\4\3\2\u0080\u0081\b\7\1\2\u0081\u0083\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7*\2\2\u0088\u0089\7\31"+
		"\2\2\u0089\u008a\b\7\1\2\u008a\u0090\7)\2\2\u008b\u008c\5\4\3\2\u008c"+
		"\u008d\b\7\1\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7*\2\2\u0094\u0095\b\7\1\2\u0095\r\3\2\2\2"+
		"\u0096\u0097\7\33\2\2\u0097\u0098\7\'\2\2\u0098\u0099\5\22\n\2\u0099\u009a"+
		"\7(\2\2\u009a\u009b\b\b\1\2\u009b\u00a1\7)\2\2\u009c\u009d\5\4\3\2\u009d"+
		"\u009e\b\b\1\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\u00a6\b\b\1\2\u00a6\17\3\2\2\2"+
		"\u00a7\u00a8\7\32\2\2\u00a8\u00a9\7\'\2\2\u00a9\u00aa\5(\25\2\u00aa\u00ab"+
		"\5\22\n\2\u00ab\u00ac\7-\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\7(\2\2\u00ae"+
		"\u00af\b\t\1\2\u00af\u00b5\7)\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\b\t"+
		"\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\b\t\1\2\u00ba\21\3\2\2\2\u00bb\u00bc"+
		"\5\24\13\2\u00bc\u00bd\b\n\1\2\u00bd\u00c6\3\2\2\2\u00be\u00bf\5\26\f"+
		"\2\u00bf\u00c0\b\n\1\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\7!\2\2\u00c2\u00c3"+
		"\5\22\n\2\u00c3\u00c4\b\n\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00bb\3\2\2\2"+
		"\u00c5\u00be\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8"+
		"\5\26\f\2\u00c8\u00cf\b\13\1\2\u00c9\u00ca\7 \2\2\u00ca\u00cb\5\26\f\2"+
		"\u00cb\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00da\b\f\1\2\u00d4\u00d5\7"+
		"\37\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\b\f\1\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\27\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\32\16\2\u00de"+
		"\u00e5\b\r\1\2\u00df\u00e0\7%\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\b"+
		"\r\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\5\34\17\2\u00e9\u00f0\b\16\1\2\u00ea\u00eb\7$\2\2\u00eb"+
		"\u00ec\5\34\17\2\u00ec\u00ed\b\16\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\33\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00fb\b\17"+
		"\1\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\b\17\1\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\35\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\5 \21\2\u00ff\u0106\b\20\1\2\u0100\u0101\7\35\2\2\u0101\u0102\5 \21\2"+
		"\u0102\u0103\b\20\1\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\37\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\34\2\2\u010a\u010b\5 \21\2\u010b\u010c\b"+
		"\21\1\2\u010c\u0111\3\2\2\2\u010d\u010e\5\"\22\2\u010e\u010f\b\21\1\2"+
		"\u010f\u0111\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010d\3\2\2\2\u0111!\3"+
		"\2\2\2\u0112\u0113\5$\23\2\u0113\u0114\b\22\1\2\u0114\u0127\3\2\2\2\u0115"+
		"\u0116\7/\2\2\u0116\u0127\b\22\1\2\u0117\u0118\7\60\2\2\u0118\u0127\b"+
		"\22\1\2\u0119\u011a\7\61\2\2\u011a\u0127\b\22\1\2\u011b\u011c\7\62\2\2"+
		"\u011c\u0127\b\22\1\2\u011d\u011e\7\63\2\2\u011e\u0127\b\22\1\2\u011f"+
		"\u0120\7\65\2\2\u0120\u0127\b\22\1\2\u0121\u0122\7\'\2\2\u0122\u0123\5"+
		"\22\n\2\u0123\u0124\7(\2\2\u0124\u0125\b\22\1\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0112\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u0119\3\2"+
		"\2\2\u0126\u011b\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011f\3\2\2\2\u0126"+
		"\u0121\3\2\2\2\u0127#\3\2\2\2\u0128\u0129\7!\2\2\u0129\u012a\5\"\22\2"+
		"\u012a\u012b\b\23\1\2\u012b%\3\2\2\2\u012c\u012d\58\35\2\u012d\u012e\7"+
		"\65\2\2\u012e\u012f\7-\2\2\u012f\u0130\b\24\1\2\u0130\u0137\3\2\2\2\u0131"+
		"\u0132\58\35\2\u0132\u0133\7\65\2\2\u0133\u0134\7-\2\2\u0134\u0135\b\24"+
		"\1\2\u0135\u0137\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u0131\3\2\2\2\u0137"+
		"\'\3\2\2\2\u0138\u0139\7\65\2\2\u0139\u013a\7&\2\2\u013a\u013b\5\22\n"+
		"\2\u013b\u013c\7-\2\2\u013c\u013d\b\25\1\2\u013d\u0144\3\2\2\2\u013e\u013f"+
		"\7\65\2\2\u013f\u0140\7&\2\2\u0140\u0141\5\22\n\2\u0141\u0142\b\25\1\2"+
		"\u0142\u0144\3\2\2\2\u0143\u0138\3\2\2\2\u0143\u013e\3\2\2\2\u0144)\3"+
		"\2\2\2\u0145\u0146\7\24\2\2\u0146\u0147\7\65\2\2\u0147\u0148\7\'\2\2\u0148"+
		"\u0149\5\64\33\2\u0149\u014a\7(\2\2\u014a\u014b\7)\2\2\u014b\u0151\b\26"+
		"\1\2\u014c\u014d\5\4\3\2\u014d\u014e\b\26\1\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014c\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7*\2\2\u0155"+
		"\u0156\b\26\1\2\u0156+\3\2\2\2\u0157\u0158\7\25\2\2\u0158\u0159\7\65\2"+
		"\2\u0159\u015a\7\'\2\2\u015a\u015b\5\64\33\2\u015b\u015c\7(\2\2\u015c"+
		"\u015d\7)\2\2\u015d\u0163\b\27\1\2\u015e\u015f\5\4\3\2\u015f\u0160\b\27"+
		"\1\2\u0160\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0166\u0167\7*\2\2\u0167\u0168\b\27\1\2\u0168-\3\2\2\2\u0169\u016a"+
		"\7\65\2\2\u016a\u016b\7\'\2\2\u016b\u016c\5\62\32\2\u016c\u016d\7(\2\2"+
		"\u016d\u016e\7-\2\2\u016e\u016f\b\30\1\2\u016f/\3\2\2\2\u0170\u0171\7"+
		"\65\2\2\u0171\u0172\7\'\2\2\u0172\u0173\5\62\32\2\u0173\u0174\7(\2\2\u0174"+
		"\u0175\7-\2\2\u0175\u0176\b\31\1\2\u0176\61\3\2\2\2\u0177\u0178\b\32\1"+
		"\2\u0178\u0179\5\22\n\2\u0179\u0180\b\32\1\2\u017a\u017b\7.\2\2\u017b"+
		"\u017c\5\22\n\2\u017c\u017d\b\32\1\2\u017d\u017f\3\2\2\2\u017e\u017a\3"+
		"\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b\32\1\2\u0184\63\3\2\2"+
		"\2\u0185\u0186\b\33\1\2\u0186\u0187\5\66\34\2\u0187\u018e\b\33\1\2\u0188"+
		"\u0189\7.\2\2\u0189\u018a\5\66\34\2\u018a\u018b\b\33\1\2\u018b\u018d\3"+
		"\2\2\2\u018c\u0188\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\33"+
		"\1\2\u0192\65\3\2\2\2\u0193\u0194\58\35\2\u0194\u0195\7\65\2\2\u0195\u0196"+
		"\b\34\1\2\u0196\67\3\2\2\2\u0197\u0198\t\3\2\2\u01989\3\2\2\2\27Ck\u0084"+
		"\u0090\u00a1\u00b5\u00c5\u00cf\u00da\u00e5\u00f0\u00fb\u0106\u0110\u0126"+
		"\u0136\u0143\u0151\u0163\u0180\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}