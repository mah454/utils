// Generated from FilterGrammer.g4 by ANTLR 4.13.2
package ir.moke.utils.json.antlr4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FilterGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		FILTER=18, AND=19, OR=20, NULL=21, IDENT=22, NUMBER=23, STRING=24, WS=25;
	public static final int
		RULE_program = 0, RULE_clauses = 1, RULE_expressions = 2, RULE_arrayFilter = 3, 
		RULE_statement = 4, RULE_stmtValue = 5, RULE_path = 6, RULE_pathSegment = 7, 
		RULE_comparator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "clauses", "expressions", "arrayFilter", "statement", "stmtValue", 
			"path", "pathSegment", "comparator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'('", "')'", "'['", "']'", "'@'", "'.'", "'='", "'=='", 
			"'!='", "'!=='", "'>'", "'>='", "'<'", "'<='", "'~'", "'!~'", "'filter'", 
			"'and'", "'or'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "FILTER", "AND", "OR", "NULL", "IDENT", 
			"NUMBER", "STRING", "WS"
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
	public String getGrammarFileName() { return "FilterGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FilterGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FilterGrammerParser.EOF, 0); }
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
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FILTER) {
				{
				{
				setState(18);
				clauses();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
		public TerminalNode FILTER() { return getToken(FilterGrammerParser.FILTER, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(FILTER);
			setState(27);
			match(T__0);
			setState(28);
			expressions(0);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ArrayFilterContext arrayFilter() {
			return getRuleContext(ArrayFilterContext.class,0);
		}
		public TerminalNode OR() { return getToken(FilterGrammerParser.OR, 0); }
		public TerminalNode AND() { return getToken(FilterGrammerParser.AND, 0); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(31);
				match(T__1);
				setState(32);
				expressions(0);
				setState(33);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(35);
				statement();
				}
				break;
			case 3:
				{
				setState(36);
				arrayFilter();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressions);
						setState(39);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(40);
						match(OR);
						setState(41);
						expressions(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressions);
						setState(42);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(43);
						match(AND);
						setState(44);
						expressions(5);
						}
						break;
					}
					} 
				}
				setState(49);
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
	public static class ArrayFilterContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(FilterGrammerParser.NUMBER, 0); }
		public ArrayFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterArrayFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitArrayFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitArrayFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFilterContext arrayFilter() throws RecognitionException {
		ArrayFilterContext _localctx = new ArrayFilterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayFilter);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				path();
				setState(51);
				match(T__3);
				setState(52);
				expressions(0);
				setState(53);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				path();
				setState(56);
				match(T__3);
				setState(57);
				match(NUMBER);
				setState(58);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__3);
				setState(61);
				match(NUMBER);
				setState(62);
				match(T__4);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			stmtValue();
			setState(66);
			comparator();
			setState(67);
			stmtValue();
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
	public static class StmtValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FilterGrammerParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(FilterGrammerParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(FilterGrammerParser.NULL, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StmtValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterStmtValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitStmtValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitStmtValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtValueContext stmtValue() throws RecognitionException {
		StmtValueContext _localctx = new StmtValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtValue);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NUMBER);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(NULL);
				}
				break;
			case T__3:
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				path();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(T__5);
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
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			pathSegment();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(T__6);
					setState(78);
					pathSegment();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode IDENT() { return getToken(FilterGrammerParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(FilterGrammerParser.NUMBER, 0); }
		public PathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterPathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitPathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitPathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSegmentContext pathSegment() throws RecognitionException {
		PathSegmentContext _localctx = new PathSegmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pathSegment);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(IDENT);
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(85);
					match(T__3);
					setState(86);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(89);
				match(T__3);
				setState(90);
				match(T__4);
				}
				setState(92);
				matchWildcard();
				setState(93);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(IDENT);
				setState(95);
				match(T__3);
				setState(96);
				match(NUMBER);
				setState(97);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__3);
				setState(99);
				match(NUMBER);
				setState(100);
				match(T__4);
				setState(101);
				match(IDENT);
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
	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FilterGrammerListener ) ((FilterGrammerListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FilterGrammerVisitor ) return ((FilterGrammerVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 261888L) != 0)) ) {
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
		case 2:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002"+
		"\f\u00021\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006P\b\u0006\n\u0006\f\u0006S\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007X\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0000\u0001\u0004\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\b\u0011q\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000"+
		"\nJ\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000ef\u0001\u0000"+
		"\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0012\u0000\u0000\u001b\u001c\u0005\u0001\u0000"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u0003\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0006\u0002\uffff\uffff\u0000\u001f \u0005\u0002\u0000"+
		"\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u0003\u0000\u0000\"&\u0001\u0000"+
		"\u0000\u0000#&\u0003\b\u0004\u0000$&\u0003\u0006\u0003\u0000%\u001e\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&/\u0001\u0000\u0000\u0000\'(\n\u0005\u0000\u0000()\u0005\u0014\u0000"+
		"\u0000).\u0003\u0004\u0002\u0006*+\n\u0004\u0000\u0000+,\u0005\u0013\u0000"+
		"\u0000,.\u0003\u0004\u0002\u0005-\'\u0001\u0000\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000023\u0003\f\u0006\u000034\u0005\u0004\u0000\u000045\u0003\u0004\u0002"+
		"\u000056\u0005\u0005\u0000\u00006@\u0001\u0000\u0000\u000078\u0003\f\u0006"+
		"\u000089\u0005\u0004\u0000\u00009:\u0005\u0017\u0000\u0000:;\u0005\u0005"+
		"\u0000\u0000;@\u0001\u0000\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0005"+
		"\u0017\u0000\u0000>@\u0005\u0005\u0000\u0000?2\u0001\u0000\u0000\u0000"+
		"?7\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AB\u0003\n\u0005\u0000BC\u0003\u0010\b\u0000CD\u0003\n\u0005"+
		"\u0000D\t\u0001\u0000\u0000\u0000EK\u0005\u0018\u0000\u0000FK\u0005\u0017"+
		"\u0000\u0000GK\u0005\u0015\u0000\u0000HK\u0003\f\u0006\u0000IK\u0005\u0006"+
		"\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"K\u000b\u0001\u0000\u0000\u0000LQ\u0003\u000e\u0007\u0000MN\u0005\u0007"+
		"\u0000\u0000NP\u0003\u000e\u0007\u0000OM\u0001\u0000\u0000\u0000PS\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"R\r\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0005\u0016\u0000"+
		"\u0000UV\u0005\u0004\u0000\u0000VX\u0005\u0005\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000Xg\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0004\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\t\u0000\u0000\u0000]g\u0005\u0016\u0000\u0000^_\u0005\u0016\u0000"+
		"\u0000_`\u0005\u0004\u0000\u0000`a\u0005\u0017\u0000\u0000ag\u0005\u0005"+
		"\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005\u0017\u0000\u0000de\u0005"+
		"\u0005\u0000\u0000eg\u0005\u0016\u0000\u0000fT\u0001\u0000\u0000\u0000"+
		"fY\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000"+
		"\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000\u0000i\u0011"+
		"\u0001\u0000\u0000\u0000\t\u0015%-/?JQWf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}