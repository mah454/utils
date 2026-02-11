// Generated from MapGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MapGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, MAP=20, AND=21, OR=22, NULL=23, IDENT=24, NUMBER=25, 
		STRING=26, WS=27;
	public static final int
		RULE_program = 0, RULE_clauses = 1, RULE_assignment = 2, RULE_expression = 3, 
		RULE_path = 4, RULE_pathSegment = 5, RULE_arraySelector = 6, RULE_statement = 7, 
		RULE_stmtValue = 8, RULE_comparator = 9, RULE_mathOperation = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "clauses", "assignment", "expression", "path", "pathSegment", 
			"arraySelector", "statement", "stmtValue", "comparator", "mathOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'='", "'+'", "'('", "')'", "'.'", "'['", "']'", "'=='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'~'", "'!~'", "'-'", "'*'", "'/'", 
			"'map'", "'and'", "'or'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "MAP", "AND", "OR", "NULL", 
			"IDENT", "NUMBER", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MapGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MapGrammerParser.EOF, 0); }
		public List<ClausesContext> clauses() {
			return getRuleContexts(ClausesContext.class);
		}
		public ClausesContext clauses(int i) {
			return getRuleContext(ClausesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(22);
				clauses();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClausesContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(MapGrammerParser.MAP, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(MAP);
			setState(31);
			match(T__0);
			setState(32);
			assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			path();
			setState(35);
			match(T__1);
			setState(36);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MapGrammerParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExprContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(MapGrammerParser.NULL, 0); }
		public NullExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public MathExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathExprContext extends ExpressionContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterPathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitPathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitPathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MapGrammerParser.NUMBER, 0); }
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConcatExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitConcatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(T__3);
				setState(40);
				expression(0);
				setState(41);
				match(T__4);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(STRING);
				}
				break;
			case NULL:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(NULL);
				}
				break;
			case T__6:
			case IDENT:
				{
				_localctx = new PathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				path();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(50);
						match(T__2);
						setState(51);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53);
						mathOperation();
						setState(54);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public List<PathSegmentContext> pathSegment() {
			return getRuleContexts(PathSegmentContext.class);
		}
		public PathSegmentContext pathSegment(int i) {
			return getRuleContext(PathSegmentContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			pathSegment();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(T__5);
					setState(63);
					pathSegment();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathSegmentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MapGrammerParser.IDENT, 0); }
		public List<ArraySelectorContext> arraySelector() {
			return getRuleContexts(ArraySelectorContext.class);
		}
		public ArraySelectorContext arraySelector(int i) {
			return getRuleContext(ArraySelectorContext.class,i);
		}
		public PathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterPathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitPathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitPathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSegmentContext pathSegment() throws RecognitionException {
		PathSegmentContext _localctx = new PathSegmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pathSegment);
		try {
			int _alt;
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(IDENT);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						arraySelector();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				arraySelector();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySelectorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MapGrammerParser.NUMBER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ArraySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterArraySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitArraySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitArraySelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySelectorContext arraySelector() throws RecognitionException {
		ArraySelectorContext _localctx = new ArraySelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arraySelector);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__6);
				setState(80);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__6);
				setState(82);
				match(NUMBER);
				setState(83);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__6);
				setState(85);
				statement(0);
				setState(86);
				match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<StmtValueContext> stmtValue() {
			return getRuleContexts(StmtValueContext.class);
		}
		public StmtValueContext stmtValue(int i) {
			return getRuleContext(StmtValueContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(MapGrammerParser.NUMBER, 0); }
		public TerminalNode OR() { return getToken(MapGrammerParser.OR, 0); }
		public TerminalNode AND() { return getToken(MapGrammerParser.AND, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(91);
				stmtValue();
				setState(92);
				comparator();
				setState(93);
				stmtValue();
				}
				break;
			case 2:
				{
				setState(95);
				match(T__3);
				setState(96);
				statement(0);
				setState(97);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(99);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						match(OR);
						setState(104);
						statement(5);
						}
						break;
					case 2:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						match(AND);
						setState(107);
						statement(4);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MapGrammerParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MapGrammerParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(MapGrammerParser.NULL, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StmtValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterStmtValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitStmtValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitStmtValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtValueContext stmtValue() throws RecognitionException {
		StmtValueContext _localctx = new StmtValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtValue);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(NUMBER);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(NULL);
				}
				break;
			case T__6:
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				path();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathOperationContext extends ParserRuleContext {
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapGrammerListener ) ((MapGrammerListener)listener).exitMathOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapGrammerVisitor ) return ((MapGrammerVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mathOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005K\t\u0005"+
		"\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007m\b\u0007\n\u0007\f\u0007p\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0000\u0002\u0006\u000e\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\t\u0010\u0002\u0000"+
		"\u0003\u0003\u0011\u0013\u0083\u0000\u0019\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006/"+
		"\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010"+
		"u\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014y\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0014\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003\u0004\u0002"+
		"\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0003\b\u0004\u0000#$\u0005\u0002"+
		"\u0000\u0000$%\u0003\u0006\u0003\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"&\'\u0006\u0003\uffff\uffff\u0000\'(\u0005\u0004\u0000\u0000()\u0003\u0006"+
		"\u0003\u0000)*\u0005\u0005\u0000\u0000*0\u0001\u0000\u0000\u0000+0\u0005"+
		"\u0019\u0000\u0000,0\u0005\u001a\u0000\u0000-0\u0005\u0017\u0000\u0000"+
		".0\u0003\b\u0004\u0000/&\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000"+
		"/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u00000:\u0001\u0000\u0000\u000012\n\u0007\u0000\u000023\u0005\u0003\u0000"+
		"\u000039\u0003\u0006\u0003\b45\n\u0006\u0000\u000056\u0003\u0014\n\u0000"+
		"67\u0003\u0006\u0003\u000779\u0001\u0000\u0000\u000081\u0001\u0000\u0000"+
		"\u000084\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=B\u0003\n\u0005\u0000>?\u0005\u0006\u0000\u0000"+
		"?A\u0003\n\u0005\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EI\u0005\u0018\u0000\u0000FH\u0003\f\u0006"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LN\u0003\f\u0006\u0000ME\u0001\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0007\u0000"+
		"\u0000PY\u0005\b\u0000\u0000QR\u0005\u0007\u0000\u0000RS\u0005\u0019\u0000"+
		"\u0000SY\u0005\b\u0000\u0000TU\u0005\u0007\u0000\u0000UV\u0003\u000e\u0007"+
		"\u0000VW\u0005\b\u0000\u0000WY\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000"+
		"\u0000XQ\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000Y\r\u0001\u0000"+
		"\u0000\u0000Z[\u0006\u0007\uffff\uffff\u0000[\\\u0003\u0010\b\u0000\\"+
		"]\u0003\u0012\t\u0000]^\u0003\u0010\b\u0000^e\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0004\u0000\u0000`a\u0003\u000e\u0007\u0000ab\u0005\u0005\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ce\u0005\u0019\u0000\u0000dZ\u0001\u0000"+
		"\u0000\u0000d_\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000en\u0001"+
		"\u0000\u0000\u0000fg\n\u0004\u0000\u0000gh\u0005\u0016\u0000\u0000hm\u0003"+
		"\u000e\u0007\u0005ij\n\u0003\u0000\u0000jk\u0005\u0015\u0000\u0000km\u0003"+
		"\u000e\u0007\u0004lf\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\u000f\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qv\u0005"+
		"\u001a\u0000\u0000rv\u0005\u0019\u0000\u0000sv\u0005\u0017\u0000\u0000"+
		"tv\u0003\b\u0004\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0011\u0001\u0000"+
		"\u0000\u0000wx\u0007\u0000\u0000\u0000x\u0013\u0001\u0000\u0000\u0000"+
		"yz\u0007\u0001\u0000\u0000z\u0015\u0001\u0000\u0000\u0000\f\u0019/8:B"+
		"IMXdlnu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}