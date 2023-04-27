// Generated from d:\school\github\scripts_util\ruby.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LITERAL=5, COMMA=6, ELLIPSIS=7, SEMICOLON=8, 
		CRLF=9, REQUIRE=10, BEGIN=11, END=12, DEF=13, RETURN=14, PIR=15, RAISE=16, 
		ENSURE=17, IF=18, ELSE=19, ELSIF=20, UNLESS=21, WHILE=22, RETRY=23, BREAK=24, 
		FOR=25, THEN=26, IN=27, DO=28, RESCUE=29, TRUE=30, FALSE=31, YIELD=32, 
		PLUS=33, MINUS=34, MUL=35, DIV=36, MOD=37, EXP=38, EQUAL=39, NOT_EQUAL=40, 
		GREATER=41, LESS=42, LESS_EQUAL=43, GREATER_EQUAL=44, ASSIGN=45, PLUS_ASSIGN=46, 
		MINUS_ASSIGN=47, MUL_ASSIGN=48, DIV_ASSIGN=49, MOD_ASSIGN=50, EXP_ASSIGN=51, 
		BIT_AND=52, BIT_OR=53, BIT_XOR=54, BIT_NOT=55, BIT_SHL=56, BIT_SHR=57, 
		AND=58, OR=59, NOT=60, HASH_OP=61, LEFT_RBRACKET=62, RIGHT_RBRACKET=63, 
		LEFT_SBRACKET=64, RIGHT_SBRACKET=65, LEFT_BBRACKET=66, RIGHT_BBRACKET=67, 
		NIL=68, SL_COMMENT=69, ML_COMMENT=70, WS=71, INT=72, FLOAT=73, ID=74, 
		CONST_ID=75, ID_GLOBAL=76, ID_INSTANCE=77, ID_FUNCTION=78;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_begin_expression = 3, 
		RULE_end_expression = 4, RULE_beigin_rescue_expression = 5, RULE_global_get = 6, 
		RULE_global_set = 7, RULE_global_result = 8, RULE_instance_get = 9, RULE_instance_set = 10, 
		RULE_instance_result = 11, RULE_const_set = 12, RULE_function_inline_call = 13, 
		RULE_require_block = 14, RULE_pir_inline = 15, RULE_pir_expression_list = 16, 
		RULE_class_definition = 17, RULE_module_definition = 18, RULE_function_definition = 19, 
		RULE_function_definition_body = 20, RULE_function_definition_header = 21, 
		RULE_function_name = 22, RULE_function_definition_params = 23, RULE_function_definition_params_list = 24, 
		RULE_function_definition_param_id = 25, RULE_return_statement = 26, RULE_function_call = 27, 
		RULE_function_call_param_list = 28, RULE_function_call_params = 29, RULE_function_param = 30, 
		RULE_function_unnamed_param = 31, RULE_function_named_param = 32, RULE_function_call_assignment = 33, 
		RULE_all_result = 34, RULE_elsif_statement = 35, RULE_if_elsif_statement = 36, 
		RULE_if_statement = 37, RULE_unless_statement = 38, RULE_while_statement = 39, 
		RULE_all_assignment = 40, RULE_for_statement = 41, RULE_for_each_statement = 42, 
		RULE_cond_expression = 43, RULE_loop_expression = 44, RULE_hash_expression = 45, 
		RULE_statement_body = 46, RULE_statement_expression_list = 47, RULE_assignment = 48, 
		RULE_dynamic_assignment = 49, RULE_int_assignment = 50, RULE_float_assignment = 51, 
		RULE_string_assignment = 52, RULE_initial_array_assignment = 53, RULE_array_assignment = 54, 
		RULE_array_definition = 55, RULE_array_definition_elements = 56, RULE_array_selector = 57, 
		RULE_dynamic_result = 58, RULE_map_result = 59, RULE_dynamic_ = 60, RULE_int_result = 61, 
		RULE_float_result = 62, RULE_string_result = 63, RULE_comparison_list = 64, 
		RULE_comparison = 65, RULE_comp_var = 66, RULE_lvalue = 67, RULE_rvalue = 68, 
		RULE_break_expression = 69, RULE_raise_expression = 70, RULE_yield_expression = 71, 
		RULE_literal_t = 72, RULE_float_t = 73, RULE_int_t = 74, RULE_bool_t = 75, 
		RULE_nil_t = 76, RULE_id_ = 77, RULE_id_global = 78, RULE_id_instance = 79, 
		RULE_id_constence = 80, RULE_id_function = 81, RULE_terminator = 82, RULE_else_token = 83, 
		RULE_crlf = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression_list", "expression", "begin_expression", "end_expression", 
			"beigin_rescue_expression", "global_get", "global_set", "global_result", 
			"instance_get", "instance_set", "instance_result", "const_set", "function_inline_call", 
			"require_block", "pir_inline", "pir_expression_list", "class_definition", 
			"module_definition", "function_definition", "function_definition_body", 
			"function_definition_header", "function_name", "function_definition_params", 
			"function_definition_params_list", "function_definition_param_id", "return_statement", 
			"function_call", "function_call_param_list", "function_call_params", 
			"function_param", "function_unnamed_param", "function_named_param", "function_call_assignment", 
			"all_result", "elsif_statement", "if_elsif_statement", "if_statement", 
			"unless_statement", "while_statement", "all_assignment", "for_statement", 
			"for_each_statement", "cond_expression", "loop_expression", "hash_expression", 
			"statement_body", "statement_expression_list", "assignment", "dynamic_assignment", 
			"int_assignment", "float_assignment", "string_assignment", "initial_array_assignment", 
			"array_assignment", "array_definition", "array_definition_elements", 
			"array_selector", "dynamic_result", "map_result", "dynamic_", "int_result", 
			"float_result", "string_result", "comparison_list", "comparison", "comp_var", 
			"lvalue", "rvalue", "break_expression", "raise_expression", "yield_expression", 
			"literal_t", "float_t", "int_t", "bool_t", "nil_t", "id_", "id_global", 
			"id_instance", "id_constence", "id_function", "terminator", "else_token", 
			"crlf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'module'", "'.'", "'::'", null, "','", "'..'", "';'", 
			null, "'require'", "'begin'", "'end'", "'def'", "'return'", "'pir'", 
			"'raise'", "'ensure'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", 
			"'retry'", "'break'", "'for'", "'then'", "'in'", "'do'", "'rescue'", 
			"'true'", "'false'", "'yield'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
			"'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'", 
			"'>>'", null, null, null, "'=>'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "LITERAL", "COMMA", "ELLIPSIS", "SEMICOLON", 
			"CRLF", "REQUIRE", "BEGIN", "END", "DEF", "RETURN", "PIR", "RAISE", "ENSURE", 
			"IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "THEN", 
			"IN", "DO", "RESCUE", "TRUE", "FALSE", "YIELD", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "HASH_OP", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "LEFT_BBRACKET", 
			"RIGHT_BBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
			"ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", "ID_FUNCTION"
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
	public String getGrammarFileName() { return "ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rubyParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			expression_list(0);
			setState(171);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case LITERAL:
			case REQUIRE:
			case BEGIN:
			case END:
			case DEF:
			case RETURN:
			case PIR:
			case RAISE:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case LEFT_BBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case CONST_ID:
			case ID_GLOBAL:
			case ID_INSTANCE:
			case ID_FUNCTION:
				{
				setState(174);
				expression();
				setState(175);
				terminator(0);
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(177);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(181);
					expression();
					setState(182);
					terminator(0);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Raise_expressionContext raise_expression() {
			return getRuleContext(Raise_expressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Hash_expressionContext hash_expression() {
			return getRuleContext(Hash_expressionContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Module_definitionContext module_definition() {
			return getRuleContext(Module_definitionContext.class,0);
		}
		public Begin_expressionContext begin_expression() {
			return getRuleContext(Begin_expressionContext.class,0);
		}
		public End_expressionContext end_expression() {
			return getRuleContext(End_expressionContext.class,0);
		}
		public Beigin_rescue_expressionContext beigin_rescue_expression() {
			return getRuleContext(Beigin_rescue_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				function_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				function_inline_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				require_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				unless_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				rvalue(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				raise_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				return_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				while_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(199);
				pir_inline();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(200);
				hash_expression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(201);
				class_definition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(202);
				module_definition();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(203);
				begin_expression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(204);
				end_expression();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(205);
				beigin_rescue_expression();
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

	public static class Begin_expressionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(rubyParser.BEGIN, 0); }
		public TerminalNode LEFT_BBRACKET() { return getToken(rubyParser.LEFT_BBRACKET, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BBRACKET() { return getToken(rubyParser.RIGHT_BBRACKET, 0); }
		public Begin_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_expression; }
	}

	public final Begin_expressionContext begin_expression() throws RecognitionException {
		Begin_expressionContext _localctx = new Begin_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(BEGIN);
			setState(209);
			match(LEFT_BBRACKET);
			setState(210);
			crlf();
			setState(211);
			statement_body();
			setState(212);
			match(RIGHT_BBRACKET);
			setState(213);
			crlf();
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

	public static class End_expressionContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public TerminalNode LEFT_BBRACKET() { return getToken(rubyParser.LEFT_BBRACKET, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BBRACKET() { return getToken(rubyParser.RIGHT_BBRACKET, 0); }
		public End_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_expression; }
	}

	public final End_expressionContext end_expression() throws RecognitionException {
		End_expressionContext _localctx = new End_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(END);
			setState(216);
			match(LEFT_BBRACKET);
			setState(217);
			crlf();
			setState(218);
			statement_body();
			setState(219);
			match(RIGHT_BBRACKET);
			setState(220);
			crlf();
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

	public static class Beigin_rescue_expressionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(rubyParser.BEGIN, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public List<TerminalNode> RESCUE() { return getTokens(rubyParser.RESCUE); }
		public TerminalNode RESCUE(int i) {
			return getToken(rubyParser.RESCUE, i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public TerminalNode ENSURE() { return getToken(rubyParser.ENSURE, 0); }
		public Beigin_rescue_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beigin_rescue_expression; }
	}

	public final Beigin_rescue_expressionContext beigin_rescue_expression() throws RecognitionException {
		Beigin_rescue_expressionContext _localctx = new Beigin_rescue_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_beigin_rescue_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(BEGIN);
			setState(223);
			crlf();
			setState(224);
			statement_body();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RESCUE) {
				{
				{
				setState(225);
				match(RESCUE);
				setState(226);
				crlf();
				setState(227);
				statement_body();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(234);
				else_token();
				setState(235);
				crlf();
				setState(236);
				statement_body();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(240);
				match(ENSURE);
				setState(241);
				crlf();
				setState(242);
				statement_body();
				}
			}

			setState(246);
			match(END);
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

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(249);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(250);
			((Global_getContext)_localctx).global_name = id_global();
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

	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((Global_setContext)_localctx).global_name = id_global();
			setState(253);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(254);
			((Global_setContext)_localctx).result = all_result();
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

	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			id_global();
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

	public static class Instance_getContext extends ParserRuleContext {
		public LvalueContext instance_name;
		public Token op;
		public Id_instanceContext result;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public Id_instanceContext id_instance() {
			return getRuleContext(Id_instanceContext.class,0);
		}
		public Instance_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_get; }
	}

	public final Instance_getContext instance_get() throws RecognitionException {
		Instance_getContext _localctx = new Instance_getContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instance_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((Instance_getContext)_localctx).instance_name = lvalue();
			setState(259);
			((Instance_getContext)_localctx).op = match(ASSIGN);
			setState(260);
			((Instance_getContext)_localctx).result = id_instance();
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

	public static class Instance_setContext extends ParserRuleContext {
		public Id_instanceContext instance_name;
		public Token op;
		public All_resultContext result;
		public Id_instanceContext id_instance() {
			return getRuleContext(Id_instanceContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Instance_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_set; }
	}

	public final Instance_setContext instance_set() throws RecognitionException {
		Instance_setContext _localctx = new Instance_setContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instance_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((Instance_setContext)_localctx).instance_name = id_instance();
			setState(263);
			((Instance_setContext)_localctx).op = match(ASSIGN);
			setState(264);
			((Instance_setContext)_localctx).result = all_result();
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

	public static class Instance_resultContext extends ParserRuleContext {
		public Id_instanceContext id_instance() {
			return getRuleContext(Id_instanceContext.class,0);
		}
		public Instance_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_result; }
	}

	public final Instance_resultContext instance_result() throws RecognitionException {
		Instance_resultContext _localctx = new Instance_resultContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instance_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			id_instance();
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

	public static class Const_setContext extends ParserRuleContext {
		public Id_constenceContext constance_name;
		public Token op;
		public All_resultContext result;
		public Id_constenceContext id_constence() {
			return getRuleContext(Id_constenceContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Const_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_set; }
	}

	public final Const_setContext const_set() throws RecognitionException {
		Const_setContext _localctx = new Const_setContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((Const_setContext)_localctx).constance_name = id_constence();
			setState(269);
			((Const_setContext)_localctx).op = match(ASSIGN);
			setState(270);
			((Const_setContext)_localctx).result = all_result();
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

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			function_call();
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

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(rubyParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(REQUIRE);
			setState(275);
			literal_t();
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

	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(rubyParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(PIR);
			setState(278);
			crlf();
			setState(279);
			pir_expression_list();
			setState(280);
			match(END);
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

	public static class Pir_expression_listContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression_list(0);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public LvalueContext superclass_id;
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<TerminalNode> CRLF() { return getTokens(rubyParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(rubyParser.CRLF, i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public TerminalNode LESS() { return getToken(rubyParser.LESS, 0); }
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__0);
			setState(285);
			lvalue();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(286);
				match(LESS);
				setState(287);
				((Class_definitionContext)_localctx).superclass_id = lvalue();
				}
			}

			setState(290);
			match(CRLF);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LITERAL) | (1L << REQUIRE) | (1L << BEGIN) | (1L << END) | (1L << DEF) | (1L << RETURN) | (1L << PIR) | (1L << RAISE) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETRY) | (1L << BREAK) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << YIELD) | (1L << BIT_NOT) | (1L << NOT) | (1L << LEFT_RBRACKET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BBRACKET - 66)) | (1L << (NIL - 66)) | (1L << (INT - 66)) | (1L << (FLOAT - 66)) | (1L << (ID - 66)) | (1L << (CONST_ID - 66)) | (1L << (ID_GLOBAL - 66)) | (1L << (ID_INSTANCE - 66)) | (1L << (ID_FUNCTION - 66)))) != 0)) {
				{
				setState(291);
				statement_expression_list(0);
				}
			}

			setState(294);
			match(CRLF);
			setState(295);
			match(END);
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

	public static class Module_definitionContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public List<TerminalNode> CRLF() { return getTokens(rubyParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(rubyParser.CRLF, i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Module_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_definition; }
	}

	public final Module_definitionContext module_definition() throws RecognitionException {
		Module_definitionContext _localctx = new Module_definitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_module_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__1);
			setState(298);
			id_();
			setState(299);
			match(CRLF);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LITERAL) | (1L << REQUIRE) | (1L << BEGIN) | (1L << END) | (1L << DEF) | (1L << RETURN) | (1L << PIR) | (1L << RAISE) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETRY) | (1L << BREAK) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << YIELD) | (1L << BIT_NOT) | (1L << NOT) | (1L << LEFT_RBRACKET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BBRACKET - 66)) | (1L << (NIL - 66)) | (1L << (INT - 66)) | (1L << (FLOAT - 66)) | (1L << (ID - 66)) | (1L << (CONST_ID - 66)) | (1L << (ID_GLOBAL - 66)) | (1L << (ID_INSTANCE - 66)) | (1L << (ID_FUNCTION - 66)))) != 0)) {
				{
				setState(300);
				statement_expression_list(0);
				}
			}

			setState(303);
			match(CRLF);
			setState(304);
			match(END);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			function_definition_header();
			setState(307);
			function_definition_body();
			setState(308);
			match(END);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			expression_list(0);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(rubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_definition_header);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(DEF);
				setState(313);
				function_name();
				setState(314);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(DEF);
				setState(317);
				function_name();
				setState(318);
				function_definition_params();
				setState(319);
				crlf();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_name);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				id_();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_definition_params);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(LEFT_RBRACKET);
				setState(328);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(LEFT_RBRACKET);
				setState(330);
				function_definition_params_list(0);
				setState(331);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				function_definition_params_list(0);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_idContext function_definition_param_id() {
			return getRuleContext(Function_definition_param_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(340);
					match(COMMA);
					setState(341);
					function_definition_param_id();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Function_definition_param_idContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			id_();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(rubyParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(RETURN);
			setState(350);
			all_result();
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
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_call);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				((Function_callContext)_localctx).name = function_name();
				setState(353);
				match(LEFT_RBRACKET);
				setState(354);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(355);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((Function_callContext)_localctx).name = function_name();
				setState(358);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				((Function_callContext)_localctx).name = function_name();
				setState(361);
				match(LEFT_RBRACKET);
				setState(362);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				id_();
				setState(365);
				match(T__2);
				setState(366);
				((Function_callContext)_localctx).name = function_name();
				setState(367);
				match(LEFT_RBRACKET);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERAL || _la==LEFT_RBRACKET || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BBRACKET - 66)) | (1L << (INT - 66)) | (1L << (FLOAT - 66)) | (1L << (ID - 66)) | (1L << (ID_GLOBAL - 66)) | (1L << (ID_FUNCTION - 66)))) != 0)) {
					{
					setState(368);
					((Function_callContext)_localctx).params = function_call_param_list();
					}
				}

				setState(371);
				match(RIGHT_RBRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				id_();
				setState(374);
				match(T__2);
				setState(375);
				((Function_callContext)_localctx).name = function_name();
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(376);
					((Function_callContext)_localctx).params = function_call_param_list();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				id_();
				setState(380);
				match(T__3);
				setState(381);
				((Function_callContext)_localctx).name = function_name();
				setState(382);
				match(LEFT_RBRACKET);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERAL || _la==LEFT_RBRACKET || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BBRACKET - 66)) | (1L << (INT - 66)) | (1L << (FLOAT - 66)) | (1L << (ID - 66)) | (1L << (ID_GLOBAL - 66)) | (1L << (ID_FUNCTION - 66)))) != 0)) {
					{
					setState(383);
					((Function_callContext)_localctx).params = function_call_param_list();
					}
				}

				setState(386);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				id_();
				setState(389);
				match(T__3);
				setState(390);
				((Function_callContext)_localctx).name = function_name();
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(391);
					((Function_callContext)_localctx).params = function_call_param_list();
					}
					break;
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			function_call_params(0);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(401);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(402);
					match(COMMA);
					setState(403);
					function_param();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(409);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(410);
				function_named_param();
				}
				break;
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

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(413);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(414);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(415);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(416);
				dynamic_result(0);
				}
				break;
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

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			id_();
			setState(420);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(421);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(422);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(423);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(424);
				dynamic_result(0);
				}
				break;
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

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			function_call();
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

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public Instance_resultContext instance_result() {
			return getRuleContext(Instance_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(429);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(430);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(431);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(432);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(433);
				global_result();
				}
				break;
			case 6:
				{
				setState(434);
				instance_result();
				}
				break;
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			if_elsif_statement();
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(rubyParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode THEN() { return getToken(rubyParser.THEN, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_elsif_statement);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(ELSIF);
				setState(440);
				cond_expression();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(441);
					match(THEN);
					}
				}

				setState(444);
				crlf();
				setState(445);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(ELSIF);
				setState(448);
				cond_expression();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(449);
					match(THEN);
					}
				}

				setState(452);
				crlf();
				setState(453);
				statement_body();
				setState(454);
				else_token();
				setState(455);
				crlf();
				setState(456);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(ELSIF);
				setState(459);
				cond_expression();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(460);
					match(THEN);
					}
				}

				setState(463);
				crlf();
				setState(464);
				statement_body();
				setState(465);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(rubyParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public TerminalNode THEN() { return getToken(rubyParser.THEN, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_statement);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(IF);
				setState(470);
				cond_expression();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(471);
					match(THEN);
					}
				}

				setState(474);
				crlf();
				setState(475);
				statement_body();
				setState(476);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(IF);
				setState(479);
				cond_expression();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(480);
					match(THEN);
					}
				}

				setState(483);
				crlf();
				setState(484);
				statement_body();
				setState(485);
				else_token();
				setState(486);
				crlf();
				setState(487);
				statement_body();
				setState(488);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(IF);
				setState(491);
				cond_expression();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(492);
					match(THEN);
					}
				}

				setState(495);
				crlf();
				setState(496);
				statement_body();
				setState(497);
				elsif_statement();
				setState(498);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(rubyParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unless_statement);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(UNLESS);
				setState(503);
				cond_expression();
				setState(504);
				crlf();
				setState(505);
				statement_body();
				setState(506);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(UNLESS);
				setState(509);
				cond_expression();
				setState(510);
				crlf();
				setState(511);
				statement_body();
				setState(512);
				else_token();
				setState(513);
				crlf();
				setState(514);
				statement_body();
				setState(515);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(UNLESS);
				setState(518);
				cond_expression();
				setState(519);
				crlf();
				setState(520);
				statement_body();
				setState(521);
				elsif_statement();
				setState(522);
				match(END);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(rubyParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(WHILE);
			setState(527);
			cond_expression();
			setState(528);
			crlf();
			setState(529);
			statement_body();
			setState(530);
			match(END);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(532);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(533);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(534);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(535);
				dynamic_assignment();
				}
				break;
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(rubyParser.FOR, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode IN() { return getToken(rubyParser.IN, 0); }
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode CRLF() { return getToken(rubyParser.CRLF, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(rubyParser.END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(rubyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rubyParser.COMMA, i);
		}
		public TerminalNode DO() { return getToken(rubyParser.DO, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(FOR);
			setState(539);
			lvalue();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(540);
				match(COMMA);
				setState(541);
				lvalue();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(IN);
			setState(548);
			loop_expression();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(549);
				match(DO);
				}
			}

			setState(552);
			match(CRLF);
			setState(553);
			statement_body();
			setState(554);
			match(END);
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

	public static class For_each_statementContext extends ParserRuleContext {
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_for_each_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			comparison_list();
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			array_definition();
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

	public static class Hash_expressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_BBRACKET() { return getToken(rubyParser.LEFT_BBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BBRACKET() { return getToken(rubyParser.RIGHT_BBRACKET, 0); }
		public TerminalNode HASH_OP() { return getToken(rubyParser.HASH_OP, 0); }
		public Hash_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_expression; }
	}

	public final Hash_expressionContext hash_expression() throws RecognitionException {
		Hash_expressionContext _localctx = new Hash_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_hash_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(LEFT_BBRACKET);
			setState(563);
			expression();
			setState(564);
			((Hash_expressionContext)_localctx).op = match(HASH_OP);
			setState(565);
			expression();
			setState(566);
			match(RIGHT_BBRACKET);
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			statement_expression_list(0);
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

	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(rubyParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Raise_expressionContext raise_expression() {
			return getRuleContext(Raise_expressionContext.class,0);
		}
		public Yield_expressionContext yield_expression() {
			return getRuleContext(Yield_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(571);
				expression();
				setState(572);
				terminator(0);
				}
				break;
			case 2:
				{
				setState(574);
				match(RETRY);
				setState(575);
				terminator(0);
				}
				break;
			case 3:
				{
				setState(576);
				break_expression();
				setState(577);
				terminator(0);
				}
				break;
			case 4:
				{
				setState(579);
				raise_expression();
				setState(580);
				terminator(0);
				}
				break;
			case 5:
				{
				setState(582);
				yield_expression();
				setState(583);
				terminator(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(598);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(587);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(588);
						expression();
						setState(589);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(591);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(592);
						match(RETRY);
						setState(593);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(594);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(595);
						break_expression();
						setState(596);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(rubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(rubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(rubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(rubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(rubyParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignment);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(604);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(605);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(608);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(609);
				rvalue(0);
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(rubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(rubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(rubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(rubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(rubyParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dynamic_assignment);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(614);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(615);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(618);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(rubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(rubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(rubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(rubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(rubyParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_int_assignment);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(624);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(625);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(628);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				int_result(0);
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(rubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(rubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(rubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(rubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(rubyParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_float_assignment);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(634);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(635);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(638);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(rubyParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_string_assignment);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(644);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(645);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(648);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(649);
				string_result(0);
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

	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(rubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(rubyParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(654);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(655);
			match(LEFT_SBRACKET);
			setState(656);
			match(RIGHT_SBRACKET);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(rubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(659);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(660);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(rubyParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(rubyParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_array_definition);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_SBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(LEFT_SBRACKET);
				setState(663);
				array_definition_elements(0);
				setState(664);
				match(RIGHT_SBRACKET);
				}
				break;
			case LITERAL:
			case LEFT_RBRACKET:
			case LEFT_BBRACKET:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				array_definition_elements(0);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(rubyParser.COMMA, 0); }
		public TerminalNode ELLIPSIS() { return getToken(rubyParser.ELLIPSIS, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(670);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(671);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
						setState(674);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(675);
						match(COMMA);
						setState(678);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(676);
							int_result(0);
							}
							break;
						case 2:
							{
							setState(677);
							dynamic_result(0);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
						setState(680);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(681);
						match(ELLIPSIS);
						setState(684);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(682);
							int_result(0);
							}
							break;
						case 2:
							{
							setState(683);
							dynamic_result(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Array_selectorContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(rubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(rubyParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_array_selector);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				id_();
				setState(692);
				match(LEFT_SBRACKET);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(693);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(694);
					dynamic_result(0);
					}
					break;
				}
				setState(697);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				id_global();
				setState(700);
				match(LEFT_SBRACKET);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(701);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(702);
					dynamic_result(0);
					}
					break;
				}
				setState(705);
				match(RIGHT_SBRACKET);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Map_resultContext map_result() {
			return getRuleContext(Map_resultContext.class,0);
		}
		public Dynamic_Context dynamic_() {
			return getRuleContext(Dynamic_Context.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(710);
				int_result(0);
				setState(711);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				dynamic_result(14);
				}
				break;
			case 2:
				{
				setState(714);
				float_result(0);
				setState(715);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(716);
				dynamic_result(12);
				}
				break;
			case 3:
				{
				setState(718);
				string_result(0);
				setState(719);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(720);
				dynamic_result(9);
				}
				break;
			case 4:
				{
				setState(722);
				int_result(0);
				setState(723);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(724);
				dynamic_result(7);
				}
				break;
			case 5:
				{
				setState(726);
				float_result(0);
				setState(727);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				dynamic_result(5);
				}
				break;
			case 6:
				{
				setState(730);
				match(LEFT_RBRACKET);
				setState(731);
				dynamic_result(0);
				setState(732);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(734);
				map_result();
				}
				break;
			case 8:
				{
				setState(735);
				dynamic_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(738);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(739);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(740);
						dynamic_result(12);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(741);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(742);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(743);
						dynamic_result(5);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(744);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(745);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(746);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(747);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(748);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(750);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(751);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(752);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(753);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(754);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(755);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(756);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(757);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(758);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class Map_resultContext extends ParserRuleContext {
		public Hash_expressionContext hash_expression() {
			return getRuleContext(Hash_expressionContext.class,0);
		}
		public Map_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_result; }
	}

	public final Map_resultContext map_result() throws RecognitionException {
		Map_resultContext _localctx = new Map_resultContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_map_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			hash_expression();
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

	public static class Dynamic_Context extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Dynamic_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_; }
	}

	public final Dynamic_Context dynamic_() throws RecognitionException {
		Dynamic_Context _localctx = new Dynamic_Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_dynamic_);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				id_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				array_selector();
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

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(772);
				match(LEFT_RBRACKET);
				setState(773);
				int_result(0);
				setState(774);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(776);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(785);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(779);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(780);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(781);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(782);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(783);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(784);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(791);
				int_result(0);
				setState(792);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(793);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(795);
				int_result(0);
				setState(796);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(797);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(799);
				match(LEFT_RBRACKET);
				setState(800);
				float_result(0);
				setState(801);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(803);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(806);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(807);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(808);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(809);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(810);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(811);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(812);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(813);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(814);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(815);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(816);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(817);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(824);
				int_result(0);
				setState(825);
				((String_resultContext)_localctx).op = match(MUL);
				setState(826);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(828);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(831);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(832);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(833);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(834);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(835);
						((String_resultContext)_localctx).op = match(MUL);
						setState(836);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(rubyParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(rubyParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(rubyParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(rubyParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_comparison_list);
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				((Comparison_listContext)_localctx).left = comparison();
				setState(843);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(844);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				((Comparison_listContext)_localctx).left = comparison();
				setState(847);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(848);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				((Comparison_listContext)_localctx).left = comparison();
				setState(851);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(852);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				((Comparison_listContext)_localctx).left = comparison();
				setState(855);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(856);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(858);
				match(LEFT_RBRACKET);
				setState(859);
				comparison_list();
				setState(860);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(862);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(rubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(rubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(rubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(rubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(rubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(rubyParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_comparison);
		int _la;
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				((ComparisonContext)_localctx).left = comp_var();
				setState(866);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				((ComparisonContext)_localctx).left = comp_var();
				setState(870);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(871);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Id_constenceContext id_constence() {
			return getRuleContext(Id_constenceContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_comp_var);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				id_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878);
				id_constence();
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

	public static class LvalueContext extends ParserRuleContext {
		public Id_constenceContext id_constence() {
			return getRuleContext(Id_constenceContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lvalue);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				id_constence();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				id_global();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				id_();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Instance_setContext instance_set() {
			return getRuleContext(Instance_setContext.class,0);
		}
		public Instance_getContext instance_get() {
			return getRuleContext(Instance_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(rubyParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(rubyParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(rubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(rubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(rubyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(rubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(rubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(rubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(rubyParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(rubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(rubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(rubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(rubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(rubyParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(rubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(rubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(rubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(rubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(rubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(rubyParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(rubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(rubyParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(887);
				lvalue();
				}
				break;
			case 2:
				{
				setState(888);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(889);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(890);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(891);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(892);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(893);
				global_set();
				}
				break;
			case 8:
				{
				setState(894);
				global_get();
				}
				break;
			case 9:
				{
				setState(895);
				instance_set();
				}
				break;
			case 10:
				{
				setState(896);
				instance_get();
				}
				break;
			case 11:
				{
				setState(897);
				dynamic_assignment();
				}
				break;
			case 12:
				{
				setState(898);
				string_assignment();
				}
				break;
			case 13:
				{
				setState(899);
				float_assignment();
				}
				break;
			case 14:
				{
				setState(900);
				int_assignment();
				}
				break;
			case 15:
				{
				setState(901);
				assignment();
				}
				break;
			case 16:
				{
				setState(902);
				function_call();
				}
				break;
			case 17:
				{
				setState(903);
				literal_t();
				}
				break;
			case 18:
				{
				setState(904);
				bool_t();
				}
				break;
			case 19:
				{
				setState(905);
				float_t();
				}
				break;
			case 20:
				{
				setState(906);
				int_t();
				}
				break;
			case 21:
				{
				setState(907);
				nil_t();
				}
				break;
			case 22:
				{
				setState(908);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(909);
				rvalue(10);
				}
				break;
			case 23:
				{
				setState(910);
				match(LEFT_RBRACKET);
				setState(911);
				rvalue(0);
				setState(912);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(943);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(916);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(917);
						match(EXP);
						setState(918);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(919);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(920);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(921);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(922);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(923);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(924);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(925);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(926);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(927);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(928);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(929);
						match(BIT_AND);
						setState(930);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(931);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(932);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(933);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(934);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(935);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(936);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(937);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(938);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(939);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(940);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(941);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(942);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(rubyParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(BREAK);
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

	public static class Raise_expressionContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(rubyParser.RAISE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Raise_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_expression; }
	}

	public final Raise_expressionContext raise_expression() throws RecognitionException {
		Raise_expressionContext _localctx = new Raise_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_raise_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(RAISE);
			setState(951);
			lvalue();
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

	public static class Yield_expressionContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(rubyParser.YIELD, 0); }
		public Yield_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expression; }
	}

	public final Yield_expressionContext yield_expression() throws RecognitionException {
		Yield_expressionContext _localctx = new Yield_expressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_yield_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(YIELD);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(rubyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(LITERAL);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(rubyParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(rubyParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(rubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(rubyParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(rubyParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(NIL);
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

	public static class Id_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rubyParser.ID, 0); }
		public Id_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_; }
	}

	public final Id_Context id_() throws RecognitionException {
		Id_Context _localctx = new Id_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_id_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(ID);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(rubyParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(ID_GLOBAL);
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

	public static class Id_instanceContext extends ParserRuleContext {
		public TerminalNode ID_INSTANCE() { return getToken(rubyParser.ID_INSTANCE, 0); }
		public Id_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_instance; }
	}

	public final Id_instanceContext id_instance() throws RecognitionException {
		Id_instanceContext _localctx = new Id_instanceContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_id_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(ID_INSTANCE);
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

	public static class Id_constenceContext extends ParserRuleContext {
		public TerminalNode CONST_ID() { return getToken(rubyParser.CONST_ID, 0); }
		public Id_constenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_constence; }
	}

	public final Id_constenceContext id_constence() throws RecognitionException {
		Id_constenceContext _localctx = new Id_constenceContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_id_constence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(CONST_ID);
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(rubyParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(ID_FUNCTION);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(rubyParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(976);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(977);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(984);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(980);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(981);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(982);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(983);
						crlf();
						}
						break;
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(rubyParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(ELSE);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(rubyParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 24:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 29:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 47:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 56:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 58:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 61:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 62:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 63:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 68:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 82:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 11);
		case 24:
			return precpred(_ctx, 9);
		case 25:
			return precpred(_ctx, 8);
		case 26:
			return precpred(_ctx, 7);
		case 27:
			return precpred(_ctx, 6);
		case 28:
			return precpred(_ctx, 5);
		case 29:
			return precpred(_ctx, 4);
		case 30:
			return precpred(_ctx, 3);
		case 31:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u03e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00b5\n\3\3\3\3\3\3\3"+
		"\3\3\7\3\u00bb\n\3\f\3\16\3\u00be\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d1\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e8"+
		"\n\7\f\7\16\7\u00eb\13\7\3\7\3\7\3\7\3\7\5\7\u00f1\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00f7\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5"+
		"\23\u0123\n\23\3\23\3\23\5\23\u0127\n\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u0130\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3\30\3\30\5\30"+
		"\u0148\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0151\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u0159\n\32\f\32\16\32\u015c\13\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0174\n\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u017c\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0183\n\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u018b\n\35\5\35\u018d\n\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0197\n\37\f\37\16\37\u019a\13\37"+
		"\3 \3 \5 \u019e\n \3!\3!\3!\3!\5!\u01a4\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u01ac\n\"\3#\3#\3$\3$\3$\3$\3$\3$\5$\u01b6\n$\3%\3%\3&\3&\3&\5&\u01bd"+
		"\n&\3&\3&\3&\3&\3&\3&\5&\u01c5\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01d0"+
		"\n&\3&\3&\3&\3&\5&\u01d6\n&\3\'\3\'\3\'\5\'\u01db\n\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u01e4\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u01f0\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f7\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u020f\n(\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\5*\u021b\n*\3+\3+\3+\3+\7+\u0221\n+\f+\16+\u0224\13+\3+"+
		"\3+\3+\5+\u0229\n+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u024c\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0259\n\61\f\61\16\61\u025c\13\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0266\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u0270\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u027a"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0284\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u028e\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\39\59\u029e\n9\3:\3:\3:\5:\u02a3\n:\3:\3:\3:"+
		"\3:\5:\u02a9\n:\3:\3:\3:\3:\5:\u02af\n:\7:\u02b1\n:\f:\16:\u02b4\13:\3"+
		";\3;\3;\3;\5;\u02ba\n;\3;\3;\3;\3;\3;\3;\5;\u02c2\n;\3;\3;\5;\u02c6\n"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\5<\u02e3\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\7<\u02fa\n<\f<\16<\u02fd\13<\3=\3=\3>\3>\3>\5>\u0304"+
		"\n>\3?\3?\3?\3?\3?\3?\5?\u030c\n?\3?\3?\3?\3?\3?\3?\7?\u0314\n?\f?\16"+
		"?\u0317\13?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0327\n@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0335\n@\f@\16@\u0338\13@\3A\3A\3A"+
		"\3A\3A\3A\5A\u0340\nA\3A\3A\3A\3A\3A\3A\7A\u0348\nA\fA\16A\u034b\13A\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0362"+
		"\nB\3C\3C\3C\3C\3C\3C\3C\3C\5C\u036c\nC\3D\3D\3D\3D\5D\u0372\nD\3E\3E"+
		"\3E\5E\u0377\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0395\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u03b2\nF\fF"+
		"\16F\u03b5\13F\3G\3G\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\5T\u03d5\nT\3T\3T\3T\3T\7T\u03db\n"+
		"T\fT\16T\u03de\13T\3U\3U\3V\3V\3V\2\r\4\62<`rv|~\u0080\u008a\u00a6W\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\2\f\3\2\60\65\3\2%\'\3\2#$\3\2+.\3\2)*\4\299>>\3\2:;\3\2"+
		"\678\3\2<=\3\2 !\2\u0432\2\u00ac\3\2\2\2\4\u00b4\3\2\2\2\6\u00d0\3\2\2"+
		"\2\b\u00d2\3\2\2\2\n\u00d9\3\2\2\2\f\u00e0\3\2\2\2\16\u00fa\3\2\2\2\20"+
		"\u00fe\3\2\2\2\22\u0102\3\2\2\2\24\u0104\3\2\2\2\26\u0108\3\2\2\2\30\u010c"+
		"\3\2\2\2\32\u010e\3\2\2\2\34\u0112\3\2\2\2\36\u0114\3\2\2\2 \u0117\3\2"+
		"\2\2\"\u011c\3\2\2\2$\u011e\3\2\2\2&\u012b\3\2\2\2(\u0134\3\2\2\2*\u0138"+
		"\3\2\2\2,\u0143\3\2\2\2.\u0147\3\2\2\2\60\u0150\3\2\2\2\62\u0152\3\2\2"+
		"\2\64\u015d\3\2\2\2\66\u015f\3\2\2\28\u018c\3\2\2\2:\u018e\3\2\2\2<\u0190"+
		"\3\2\2\2>\u019d\3\2\2\2@\u01a3\3\2\2\2B\u01a5\3\2\2\2D\u01ad\3\2\2\2F"+
		"\u01b5\3\2\2\2H\u01b7\3\2\2\2J\u01d5\3\2\2\2L\u01f6\3\2\2\2N\u020e\3\2"+
		"\2\2P\u0210\3\2\2\2R\u021a\3\2\2\2T\u021c\3\2\2\2V\u022e\3\2\2\2X\u0230"+
		"\3\2\2\2Z\u0232\3\2\2\2\\\u0234\3\2\2\2^\u023a\3\2\2\2`\u024b\3\2\2\2"+
		"b\u0265\3\2\2\2d\u026f\3\2\2\2f\u0279\3\2\2\2h\u0283\3\2\2\2j\u028d\3"+
		"\2\2\2l\u028f\3\2\2\2n\u0294\3\2\2\2p\u029d\3\2\2\2r\u029f\3\2\2\2t\u02c5"+
		"\3\2\2\2v\u02e2\3\2\2\2x\u02fe\3\2\2\2z\u0303\3\2\2\2|\u030b\3\2\2\2~"+
		"\u0326\3\2\2\2\u0080\u033f\3\2\2\2\u0082\u0361\3\2\2\2\u0084\u036b\3\2"+
		"\2\2\u0086\u0371\3\2\2\2\u0088\u0376\3\2\2\2\u008a\u0394\3\2\2\2\u008c"+
		"\u03b6\3\2\2\2\u008e\u03b8\3\2\2\2\u0090\u03bb\3\2\2\2\u0092\u03bd\3\2"+
		"\2\2\u0094\u03bf\3\2\2\2\u0096\u03c1\3\2\2\2\u0098\u03c3\3\2\2\2\u009a"+
		"\u03c5\3\2\2\2\u009c\u03c7\3\2\2\2\u009e\u03c9\3\2\2\2\u00a0\u03cb\3\2"+
		"\2\2\u00a2\u03cd\3\2\2\2\u00a4\u03cf\3\2\2\2\u00a6\u03d4\3\2\2\2\u00a8"+
		"\u03df\3\2\2\2\u00aa\u03e1\3\2\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7\2"+
		"\2\3\u00ae\3\3\2\2\2\u00af\u00b0\b\3\1\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2"+
		"\5\u00a6T\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\5\u00a6T\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b7\f\4\2\2\u00b7"+
		"\u00b8\5\6\4\2\u00b8\u00b9\5\u00a6T\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\5\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00d1\5T+\2\u00c0\u00d1\5(\25\2\u00c1"+
		"\u00d1\5\34\17\2\u00c2\u00d1\5\36\20\2\u00c3\u00d1\5L\'\2\u00c4\u00d1"+
		"\5N(\2\u00c5\u00d1\5\u008aF\2\u00c6\u00d1\5\u008eH\2\u00c7\u00d1\5\66"+
		"\34\2\u00c8\u00d1\5P)\2\u00c9\u00d1\5 \21\2\u00ca\u00d1\5\\/\2\u00cb\u00d1"+
		"\5$\23\2\u00cc\u00d1\5&\24\2\u00cd\u00d1\5\b\5\2\u00ce\u00d1\5\n\6\2\u00cf"+
		"\u00d1\5\f\7\2\u00d0\u00bf\3\2\2\2\u00d0\u00c0\3\2\2\2\u00d0\u00c1\3\2"+
		"\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00c3\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0"+
		"\u00c5\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00c8\3\2"+
		"\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\7\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\7D\2\2\u00d4\u00d5"+
		"\5\u00aaV\2\u00d5\u00d6\5^\60\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\5\u00aa"+
		"V\2\u00d8\t\3\2\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\7D\2\2\u00db\u00dc"+
		"\5\u00aaV\2\u00dc\u00dd\5^\60\2\u00dd\u00de\7E\2\2\u00de\u00df\5\u00aa"+
		"V\2\u00df\13\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\5\u00aaV\2\u00e2"+
		"\u00e9\5^\60\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\5\u00aaV\2\u00e5\u00e6"+
		"\5^\60\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f0\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\5\u00a8U\2\u00ed\u00ee\5\u00aaV\2\u00ee\u00ef\5^\60\2"+
		"\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6"+
		"\3\2\2\2\u00f2\u00f3\7\23\2\2\u00f3\u00f4\5\u00aaV\2\u00f4\u00f5\5^\60"+
		"\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\7\16\2\2\u00f9\r\3\2\2\2\u00fa\u00fb\5\u0088E\2\u00fb"+
		"\u00fc\7/\2\2\u00fc\u00fd\5\u009eP\2\u00fd\17\3\2\2\2\u00fe\u00ff\5\u009e"+
		"P\2\u00ff\u0100\7/\2\2\u0100\u0101\5F$\2\u0101\21\3\2\2\2\u0102\u0103"+
		"\5\u009eP\2\u0103\23\3\2\2\2\u0104\u0105\5\u0088E\2\u0105\u0106\7/\2\2"+
		"\u0106\u0107\5\u00a0Q\2\u0107\25\3\2\2\2\u0108\u0109\5\u00a0Q\2\u0109"+
		"\u010a\7/\2\2\u010a\u010b\5F$\2\u010b\27\3\2\2\2\u010c\u010d\5\u00a0Q"+
		"\2\u010d\31\3\2\2\2\u010e\u010f\5\u00a2R\2\u010f\u0110\7/\2\2\u0110\u0111"+
		"\5F$\2\u0111\33\3\2\2\2\u0112\u0113\58\35\2\u0113\35\3\2\2\2\u0114\u0115"+
		"\7\f\2\2\u0115\u0116\5\u0092J\2\u0116\37\3\2\2\2\u0117\u0118\7\21\2\2"+
		"\u0118\u0119\5\u00aaV\2\u0119\u011a\5\"\22\2\u011a\u011b\7\16\2\2\u011b"+
		"!\3\2\2\2\u011c\u011d\5\4\3\2\u011d#\3\2\2\2\u011e\u011f\7\3\2\2\u011f"+
		"\u0122\5\u0088E\2\u0120\u0121\7,\2\2\u0121\u0123\5\u0088E\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\13\2\2"+
		"\u0125\u0127\5`\61\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\7\13\2\2\u0129\u012a\7\16\2\2\u012a%\3\2\2\2\u012b"+
		"\u012c\7\4\2\2\u012c\u012d\5\u009cO\2\u012d\u012f\7\13\2\2\u012e\u0130"+
		"\5`\61\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\13\2\2\u0132\u0133\7\16\2\2\u0133\'\3\2\2\2\u0134\u0135\5,\27"+
		"\2\u0135\u0136\5*\26\2\u0136\u0137\7\16\2\2\u0137)\3\2\2\2\u0138\u0139"+
		"\5\4\3\2\u0139+\3\2\2\2\u013a\u013b\7\17\2\2\u013b\u013c\5.\30\2\u013c"+
		"\u013d\5\u00aaV\2\u013d\u0144\3\2\2\2\u013e\u013f\7\17\2\2\u013f\u0140"+
		"\5.\30\2\u0140\u0141\5\60\31\2\u0141\u0142\5\u00aaV\2\u0142\u0144\3\2"+
		"\2\2\u0143\u013a\3\2\2\2\u0143\u013e\3\2\2\2\u0144-\3\2\2\2\u0145\u0148"+
		"\5\u00a4S\2\u0146\u0148\5\u009cO\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148/\3\2\2\2\u0149\u014a\7@\2\2\u014a\u0151\7A\2\2\u014b\u014c"+
		"\7@\2\2\u014c\u014d\5\62\32\2\u014d\u014e\7A\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u0151\5\62\32\2\u0150\u0149\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014f\3"+
		"\2\2\2\u0151\61\3\2\2\2\u0152\u0153\b\32\1\2\u0153\u0154\5\64\33\2\u0154"+
		"\u015a\3\2\2\2\u0155\u0156\f\3\2\2\u0156\u0157\7\b\2\2\u0157\u0159\5\64"+
		"\33\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\63\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\5\u009c"+
		"O\2\u015e\65\3\2\2\2\u015f\u0160\7\20\2\2\u0160\u0161\5F$\2\u0161\67\3"+
		"\2\2\2\u0162\u0163\5.\30\2\u0163\u0164\7@\2\2\u0164\u0165\5:\36\2\u0165"+
		"\u0166\7A\2\2\u0166\u018d\3\2\2\2\u0167\u0168\5.\30\2\u0168\u0169\5:\36"+
		"\2\u0169\u018d\3\2\2\2\u016a\u016b\5.\30\2\u016b\u016c\7@\2\2\u016c\u016d"+
		"\7A\2\2\u016d\u018d\3\2\2\2\u016e\u016f\5\u009cO\2\u016f\u0170\7\5\2\2"+
		"\u0170\u0171\5.\30\2\u0171\u0173\7@\2\2\u0172\u0174\5:\36\2\u0173\u0172"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7A\2\2\u0176"+
		"\u018d\3\2\2\2\u0177\u0178\5\u009cO\2\u0178\u0179\7\5\2\2\u0179\u017b"+
		"\5.\30\2\u017a\u017c\5:\36\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u018d\3\2\2\2\u017d\u017e\5\u009cO\2\u017e\u017f\7\6\2\2\u017f\u0180"+
		"\5.\30\2\u0180\u0182\7@\2\2\u0181\u0183\5:\36\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7A\2\2\u0185\u018d\3\2"+
		"\2\2\u0186\u0187\5\u009cO\2\u0187\u0188\7\6\2\2\u0188\u018a\5.\30\2\u0189"+
		"\u018b\5:\36\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u0162\3\2\2\2\u018c\u0167\3\2\2\2\u018c\u016a\3\2\2\2\u018c"+
		"\u016e\3\2\2\2\u018c\u0177\3\2\2\2\u018c\u017d\3\2\2\2\u018c\u0186\3\2"+
		"\2\2\u018d9\3\2\2\2\u018e\u018f\5<\37\2\u018f;\3\2\2\2\u0190\u0191\b\37"+
		"\1\2\u0191\u0192\5> \2\u0192\u0198\3\2\2\2\u0193\u0194\f\3\2\2\u0194\u0195"+
		"\7\b\2\2\u0195\u0197\5> \2\u0196\u0193\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199=\3\2\2\2\u019a\u0198\3\2\2\2"+
		"\u019b\u019e\5@!\2\u019c\u019e\5B\"\2\u019d\u019b\3\2\2\2\u019d\u019c"+
		"\3\2\2\2\u019e?\3\2\2\2\u019f\u01a4\5|?\2\u01a0\u01a4\5~@\2\u01a1\u01a4"+
		"\5\u0080A\2\u01a2\u01a4\5v<\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4A\3\2\2\2\u01a5\u01a6\5"+
		"\u009cO\2\u01a6\u01ab\7/\2\2\u01a7\u01ac\5|?\2\u01a8\u01ac\5~@\2\u01a9"+
		"\u01ac\5\u0080A\2\u01aa\u01ac\5v<\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acC\3\2\2\2\u01ad\u01ae"+
		"\58\35\2\u01aeE\3\2\2\2\u01af\u01b6\5|?\2\u01b0\u01b6\5~@\2\u01b1\u01b6"+
		"\5\u0080A\2\u01b2\u01b6\5v<\2\u01b3\u01b6\5\22\n\2\u01b4\u01b6\5\30\r"+
		"\2\u01b5\u01af\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6G\3\2\2\2\u01b7"+
		"\u01b8\5J&\2\u01b8I\3\2\2\2\u01b9\u01ba\7\26\2\2\u01ba\u01bc\5X-\2\u01bb"+
		"\u01bd\7\34\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01bf\5\u00aaV\2\u01bf\u01c0\5^\60\2\u01c0\u01d6\3\2\2\2"+
		"\u01c1\u01c2\7\26\2\2\u01c2\u01c4\5X-\2\u01c3\u01c5\7\34\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5\u00aaV"+
		"\2\u01c7\u01c8\5^\60\2\u01c8\u01c9\5\u00a8U\2\u01c9\u01ca\5\u00aaV\2\u01ca"+
		"\u01cb\5^\60\2\u01cb\u01d6\3\2\2\2\u01cc\u01cd\7\26\2\2\u01cd\u01cf\5"+
		"X-\2\u01ce\u01d0\7\34\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\5\u00aaV\2\u01d2\u01d3\5^\60\2\u01d3\u01d4"+
		"\5J&\2\u01d4\u01d6\3\2\2\2\u01d5\u01b9\3\2\2\2\u01d5\u01c1\3\2\2\2\u01d5"+
		"\u01cc\3\2\2\2\u01d6K\3\2\2\2\u01d7\u01d8\7\24\2\2\u01d8\u01da\5X-\2\u01d9"+
		"\u01db\7\34\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3"+
		"\2\2\2\u01dc\u01dd\5\u00aaV\2\u01dd\u01de\5^\60\2\u01de\u01df\7\16\2\2"+
		"\u01df\u01f7\3\2\2\2\u01e0\u01e1\7\24\2\2\u01e1\u01e3\5X-\2\u01e2\u01e4"+
		"\7\34\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2"+
		"\u01e5\u01e6\5\u00aaV\2\u01e6\u01e7\5^\60\2\u01e7\u01e8\5\u00a8U\2\u01e8"+
		"\u01e9\5\u00aaV\2\u01e9\u01ea\5^\60\2\u01ea\u01eb\7\16\2\2\u01eb\u01f7"+
		"\3\2\2\2\u01ec\u01ed\7\24\2\2\u01ed\u01ef\5X-\2\u01ee\u01f0\7\34\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5\u00aa"+
		"V\2\u01f2\u01f3\5^\60\2\u01f3\u01f4\5H%\2\u01f4\u01f5\7\16\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01d7\3\2\2\2\u01f6\u01e0\3\2\2\2\u01f6\u01ec\3\2\2\2\u01f7"+
		"M\3\2\2\2\u01f8\u01f9\7\27\2\2\u01f9\u01fa\5X-\2\u01fa\u01fb\5\u00aaV"+
		"\2\u01fb\u01fc\5^\60\2\u01fc\u01fd\7\16\2\2\u01fd\u020f\3\2\2\2\u01fe"+
		"\u01ff\7\27\2\2\u01ff\u0200\5X-\2\u0200\u0201\5\u00aaV\2\u0201\u0202\5"+
		"^\60\2\u0202\u0203\5\u00a8U\2\u0203\u0204\5\u00aaV\2\u0204\u0205\5^\60"+
		"\2\u0205\u0206\7\16\2\2\u0206\u020f\3\2\2\2\u0207\u0208\7\27\2\2\u0208"+
		"\u0209\5X-\2\u0209\u020a\5\u00aaV\2\u020a\u020b\5^\60\2\u020b\u020c\5"+
		"H%\2\u020c\u020d\7\16\2\2\u020d\u020f\3\2\2\2\u020e\u01f8\3\2\2\2\u020e"+
		"\u01fe\3\2\2\2\u020e\u0207\3\2\2\2\u020fO\3\2\2\2\u0210\u0211\7\30\2\2"+
		"\u0211\u0212\5X-\2\u0212\u0213\5\u00aaV\2\u0213\u0214\5^\60\2\u0214\u0215"+
		"\7\16\2\2\u0215Q\3\2\2\2\u0216\u021b\5f\64\2\u0217\u021b\5h\65\2\u0218"+
		"\u021b\5j\66\2\u0219\u021b\5d\63\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021bS\3\2\2\2\u021c\u021d"+
		"\7\33\2\2\u021d\u0222\5\u0088E\2\u021e\u021f\7\b\2\2\u021f\u0221\5\u0088"+
		"E\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\35"+
		"\2\2\u0226\u0228\5Z.\2\u0227\u0229\7\36\2\2\u0228\u0227\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7\13\2\2\u022b\u022c\5"+
		"^\60\2\u022c\u022d\7\16\2\2\u022dU\3\2\2\2\u022e\u022f\3\2\2\2\u022fW"+
		"\3\2\2\2\u0230\u0231\5\u0082B\2\u0231Y\3\2\2\2\u0232\u0233\5p9\2\u0233"+
		"[\3\2\2\2\u0234\u0235\7D\2\2\u0235\u0236\5\6\4\2\u0236\u0237\7?\2\2\u0237"+
		"\u0238\5\6\4\2\u0238\u0239\7E\2\2\u0239]\3\2\2\2\u023a\u023b\5`\61\2\u023b"+
		"_\3\2\2\2\u023c\u023d\b\61\1\2\u023d\u023e\5\6\4\2\u023e\u023f\5\u00a6"+
		"T\2\u023f\u024c\3\2\2\2\u0240\u0241\7\31\2\2\u0241\u024c\5\u00a6T\2\u0242"+
		"\u0243\5\u008cG\2\u0243\u0244\5\u00a6T\2\u0244\u024c\3\2\2\2\u0245\u0246"+
		"\5\u008eH\2\u0246\u0247\5\u00a6T\2\u0247\u024c\3\2\2\2\u0248\u0249\5\u0090"+
		"I\2\u0249\u024a\5\u00a6T\2\u024a\u024c\3\2\2\2\u024b\u023c\3\2\2\2\u024b"+
		"\u0240\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024c\u025a\3\2\2\2\u024d\u024e\f\5\2\2\u024e\u024f\5\6\4\2\u024f"+
		"\u0250\5\u00a6T\2\u0250\u0259\3\2\2\2\u0251\u0252\f\4\2\2\u0252\u0253"+
		"\7\31\2\2\u0253\u0259\5\u00a6T\2\u0254\u0255\f\3\2\2\u0255\u0256\5\u008c"+
		"G\2\u0256\u0257\5\u00a6T\2\u0257\u0259\3\2\2\2\u0258\u024d\3\2\2\2\u0258"+
		"\u0251\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025ba\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e"+
		"\5\u0088E\2\u025e\u025f\7/\2\2\u025f\u0260\5\u008aF\2\u0260\u0266\3\2"+
		"\2\2\u0261\u0262\5\u0088E\2\u0262\u0263\t\2\2\2\u0263\u0264\5\u008aF\2"+
		"\u0264\u0266\3\2\2\2\u0265\u025d\3\2\2\2\u0265\u0261\3\2\2\2\u0266c\3"+
		"\2\2\2\u0267\u0268\5\u0088E\2\u0268\u0269\7/\2\2\u0269\u026a\5v<\2\u026a"+
		"\u0270\3\2\2\2\u026b\u026c\5\u0088E\2\u026c\u026d\t\2\2\2\u026d\u026e"+
		"\5v<\2\u026e\u0270\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u026b\3\2\2\2\u0270"+
		"e\3\2\2\2\u0271\u0272\5\u0088E\2\u0272\u0273\7/\2\2\u0273\u0274\5|?\2"+
		"\u0274\u027a\3\2\2\2\u0275\u0276\5\u0088E\2\u0276\u0277\t\2\2\2\u0277"+
		"\u0278\5|?\2\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2"+
		"\2\u027ag\3\2\2\2\u027b\u027c\5\u0088E\2\u027c\u027d\7/\2\2\u027d\u027e"+
		"\5~@\2\u027e\u0284\3\2\2\2\u027f\u0280\5\u0088E\2\u0280\u0281\t\2\2\2"+
		"\u0281\u0282\5~@\2\u0282\u0284\3\2\2\2\u0283\u027b\3\2\2\2\u0283\u027f"+
		"\3\2\2\2\u0284i\3\2\2\2\u0285\u0286\5\u0088E\2\u0286\u0287\7/\2\2\u0287"+
		"\u0288\5\u0080A\2\u0288\u028e\3\2\2\2\u0289\u028a\5\u0088E\2\u028a\u028b"+
		"\7\60\2\2\u028b\u028c\5\u0080A\2\u028c\u028e\3\2\2\2\u028d\u0285\3\2\2"+
		"\2\u028d\u0289\3\2\2\2\u028ek\3\2\2\2\u028f\u0290\5\u0088E\2\u0290\u0291"+
		"\7/\2\2\u0291\u0292\7B\2\2\u0292\u0293\7C\2\2\u0293m\3\2\2\2\u0294\u0295"+
		"\5t;\2\u0295\u0296\7/\2\2\u0296\u0297\5F$\2\u0297o\3\2\2\2\u0298\u0299"+
		"\7B\2\2\u0299\u029a\5r:\2\u029a\u029b\7C\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029e\5r:\2\u029d\u0298\3\2\2\2\u029d\u029c\3\2\2\2\u029eq\3\2\2\2\u029f"+
		"\u02a2\b:\1\2\u02a0\u02a3\5|?\2\u02a1\u02a3\5v<\2\u02a2\u02a0\3\2\2\2"+
		"\u02a2\u02a1\3\2\2\2\u02a3\u02b2\3\2\2\2\u02a4\u02a5\f\4\2\2\u02a5\u02a8"+
		"\7\b\2\2\u02a6\u02a9\5|?\2\u02a7\u02a9\5v<\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a7\3\2\2\2\u02a9\u02b1\3\2\2\2\u02aa\u02ab\f\3\2\2\u02ab\u02ae\7\t"+
		"\2\2\u02ac\u02af\5|?\2\u02ad\u02af\5v<\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a4\3\2\2\2\u02b0\u02aa\3\2\2\2\u02b1"+
		"\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3s\3\2\2\2"+
		"\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5\u009cO\2\u02b6\u02b9\7B\2\2\u02b7\u02ba"+
		"\5|?\2\u02b8\u02ba\5v<\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\7C\2\2\u02bc\u02c6\3\2\2\2\u02bd\u02be\5\u009e"+
		"P\2\u02be\u02c1\7B\2\2\u02bf\u02c2\5|?\2\u02c0\u02c2\5v<\2\u02c1\u02bf"+
		"\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7C\2\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02b5\3\2\2\2\u02c5\u02bd\3\2\2\2\u02c6u\3\2\2\2"+
		"\u02c7\u02c8\b<\1\2\u02c8\u02c9\5|?\2\u02c9\u02ca\t\3\2\2\u02ca\u02cb"+
		"\5v<\20\u02cb\u02e3\3\2\2\2\u02cc\u02cd\5~@\2\u02cd\u02ce\t\3\2\2\u02ce"+
		"\u02cf\5v<\16\u02cf\u02e3\3\2\2\2\u02d0\u02d1\5\u0080A\2\u02d1\u02d2\7"+
		"%\2\2\u02d2\u02d3\5v<\13\u02d3\u02e3\3\2\2\2\u02d4\u02d5\5|?\2\u02d5\u02d6"+
		"\t\4\2\2\u02d6\u02d7\5v<\t\u02d7\u02e3\3\2\2\2\u02d8\u02d9\5~@\2\u02d9"+
		"\u02da\t\4\2\2\u02da\u02db\5v<\7\u02db\u02e3\3\2\2\2\u02dc\u02dd\7@\2"+
		"\2\u02dd\u02de\5v<\2\u02de\u02df\7A\2\2\u02df\u02e3\3\2\2\2\u02e0\u02e3"+
		"\5x=\2\u02e1\u02e3\5z>\2\u02e2\u02c7\3\2\2\2\u02e2\u02cc\3\2\2\2\u02e2"+
		"\u02d0\3\2\2\2\u02e2\u02d4\3\2\2\2\u02e2\u02d8\3\2\2\2\u02e2\u02dc\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02fb\3\2\2\2\u02e4"+
		"\u02e5\f\r\2\2\u02e5\u02e6\t\3\2\2\u02e6\u02fa\5v<\16\u02e7\u02e8\f\6"+
		"\2\2\u02e8\u02e9\t\4\2\2\u02e9\u02fa\5v<\7\u02ea\u02eb\f\21\2\2\u02eb"+
		"\u02ec\t\3\2\2\u02ec\u02fa\5|?\2\u02ed\u02ee\f\17\2\2\u02ee\u02ef\t\3"+
		"\2\2\u02ef\u02fa\5~@\2\u02f0\u02f1\f\f\2\2\u02f1\u02f2\7%\2\2\u02f2\u02fa"+
		"\5\u0080A\2\u02f3\u02f4\f\n\2\2\u02f4\u02f5\t\4\2\2\u02f5\u02fa\5|?\2"+
		"\u02f6\u02f7\f\b\2\2\u02f7\u02f8\t\4\2\2\u02f8\u02fa\5~@\2\u02f9\u02e4"+
		"\3\2\2\2\u02f9\u02e7\3\2\2\2\u02f9\u02ea\3\2\2\2\u02f9\u02ed\3\2\2\2\u02f9"+
		"\u02f0\3\2\2\2\u02f9\u02f3\3\2\2\2\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2"+
		"\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fcw\3\2\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fe\u02ff\5\\/\2\u02ffy\3\2\2\2\u0300\u0304\5\u009cO\2\u0301"+
		"\u0304\5D#\2\u0302\u0304\5t;\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2"+
		"\u0303\u0302\3\2\2\2\u0304{\3\2\2\2\u0305\u0306\b?\1\2\u0306\u0307\7@"+
		"\2\2\u0307\u0308\5|?\2\u0308\u0309\7A\2\2\u0309\u030c\3\2\2\2\u030a\u030c"+
		"\5\u0096L\2\u030b\u0305\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u0315\3\2\2"+
		"\2\u030d\u030e\f\6\2\2\u030e\u030f\t\3\2\2\u030f\u0314\5|?\7\u0310\u0311"+
		"\f\5\2\2\u0311\u0312\t\4\2\2\u0312\u0314\5|?\6\u0313\u030d\3\2\2\2\u0313"+
		"\u0310\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316}\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\b@\1\2\u0319\u031a"+
		"\5|?\2\u031a\u031b\t\3\2\2\u031b\u031c\5~@\t\u031c\u0327\3\2\2\2\u031d"+
		"\u031e\5|?\2\u031e\u031f\t\4\2\2\u031f\u0320\5~@\6\u0320\u0327\3\2\2\2"+
		"\u0321\u0322\7@\2\2\u0322\u0323\5~@\2\u0323\u0324\7A\2\2\u0324\u0327\3"+
		"\2\2\2\u0325\u0327\5\u0094K\2\u0326\u0318\3\2\2\2\u0326\u031d\3\2\2\2"+
		"\u0326\u0321\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u0336\3\2\2\2\u0328\u0329"+
		"\f\n\2\2\u0329\u032a\t\3\2\2\u032a\u0335\5~@\13\u032b\u032c\f\7\2\2\u032c"+
		"\u032d\t\4\2\2\u032d\u0335\5~@\b\u032e\u032f\f\b\2\2\u032f\u0330\t\3\2"+
		"\2\u0330\u0335\5|?\2\u0331\u0332\f\5\2\2\u0332\u0333\t\4\2\2\u0333\u0335"+
		"\5|?\2\u0334\u0328\3\2\2\2\u0334\u032b\3\2\2\2\u0334\u032e\3\2\2\2\u0334"+
		"\u0331\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\177\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a\bA\1\2\u033a\u033b"+
		"\5|?\2\u033b\u033c\7%\2\2\u033c\u033d\5\u0080A\5\u033d\u0340\3\2\2\2\u033e"+
		"\u0340\5\u0092J\2\u033f\u0339\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0349"+
		"\3\2\2\2\u0341\u0342\f\4\2\2\u0342\u0343\7#\2\2\u0343\u0348\5\u0080A\5"+
		"\u0344\u0345\f\6\2\2\u0345\u0346\7%\2\2\u0346\u0348\5|?\2\u0347\u0341"+
		"\3\2\2\2\u0347\u0344\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u0081\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d\5\u0084"+
		"C\2\u034d\u034e\7\66\2\2\u034e\u034f\5\u0082B\2\u034f\u0362\3\2\2\2\u0350"+
		"\u0351\5\u0084C\2\u0351\u0352\7<\2\2\u0352\u0353\5\u0082B\2\u0353\u0362"+
		"\3\2\2\2\u0354\u0355\5\u0084C\2\u0355\u0356\7\67\2\2\u0356\u0357\5\u0082"+
		"B\2\u0357\u0362\3\2\2\2\u0358\u0359\5\u0084C\2\u0359\u035a\7=\2\2\u035a"+
		"\u035b\5\u0082B\2\u035b\u0362\3\2\2\2\u035c\u035d\7@\2\2\u035d\u035e\5"+
		"\u0082B\2\u035e\u035f\7A\2\2\u035f\u0362\3\2\2\2\u0360\u0362\5\u0084C"+
		"\2\u0361\u034c\3\2\2\2\u0361\u0350\3\2\2\2\u0361\u0354\3\2\2\2\u0361\u0358"+
		"\3\2\2\2\u0361\u035c\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u0083\3\2\2\2\u0363"+
		"\u0364\5\u0086D\2\u0364\u0365\t\5\2\2\u0365\u0366\5\u0086D\2\u0366\u036c"+
		"\3\2\2\2\u0367\u0368\5\u0086D\2\u0368\u0369\t\6\2\2\u0369\u036a\5\u0086"+
		"D\2\u036a\u036c\3\2\2\2\u036b\u0363\3\2\2\2\u036b\u0367\3\2\2\2\u036c"+
		"\u0085\3\2\2\2\u036d\u0372\5F$\2\u036e\u0372\5t;\2\u036f\u0372\5\u009c"+
		"O\2\u0370\u0372\5\u00a2R\2\u0371\u036d\3\2\2\2\u0371\u036e\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372\u0087\3\2\2\2\u0373\u0377\5\u00a2"+
		"R\2\u0374\u0377\5\u009eP\2\u0375\u0377\5\u009cO\2\u0376\u0373\3\2\2\2"+
		"\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u0089\3\2\2\2\u0378\u0379"+
		"\bF\1\2\u0379\u0395\5\u0088E\2\u037a\u0395\5l\67\2\u037b\u0395\5n8\2\u037c"+
		"\u0395\5|?\2\u037d\u0395\5~@\2\u037e\u0395\5\u0080A\2\u037f\u0395\5\20"+
		"\t\2\u0380\u0395\5\16\b\2\u0381\u0395\5\26\f\2\u0382\u0395\5\24\13\2\u0383"+
		"\u0395\5d\63\2\u0384\u0395\5j\66\2\u0385\u0395\5h\65\2\u0386\u0395\5f"+
		"\64\2\u0387\u0395\5b\62\2\u0388\u0395\58\35\2\u0389\u0395\5\u0092J\2\u038a"+
		"\u0395\5\u0098M\2\u038b\u0395\5\u0094K\2\u038c\u0395\5\u0096L\2\u038d"+
		"\u0395\5\u009aN\2\u038e\u038f\t\7\2\2\u038f\u0395\5\u008aF\f\u0390\u0391"+
		"\7@\2\2\u0391\u0392\5\u008aF\2\u0392\u0393\7A\2\2\u0393\u0395\3\2\2\2"+
		"\u0394\u0378\3\2\2\2\u0394\u037a\3\2\2\2\u0394\u037b\3\2\2\2\u0394\u037c"+
		"\3\2\2\2\u0394\u037d\3\2\2\2\u0394\u037e\3\2\2\2\u0394\u037f\3\2\2\2\u0394"+
		"\u0380\3\2\2\2\u0394\u0381\3\2\2\2\u0394\u0382\3\2\2\2\u0394\u0383\3\2"+
		"\2\2\u0394\u0384\3\2\2\2\u0394\u0385\3\2\2\2\u0394\u0386\3\2\2\2\u0394"+
		"\u0387\3\2\2\2\u0394\u0388\3\2\2\2\u0394\u0389\3\2\2\2\u0394\u038a\3\2"+
		"\2\2\u0394\u038b\3\2\2\2\u0394\u038c\3\2\2\2\u0394\u038d\3\2\2\2\u0394"+
		"\u038e\3\2\2\2\u0394\u0390\3\2\2\2\u0395\u03b3\3\2\2\2\u0396\u0397\f\r"+
		"\2\2\u0397\u0398\7(\2\2\u0398\u03b2\5\u008aF\16\u0399\u039a\f\13\2\2\u039a"+
		"\u039b\t\3\2\2\u039b\u03b2\5\u008aF\f\u039c\u039d\f\n\2\2\u039d\u039e"+
		"\t\4\2\2\u039e\u03b2\5\u008aF\13\u039f\u03a0\f\t\2\2\u03a0\u03a1\t\b\2"+
		"\2\u03a1\u03b2\5\u008aF\n\u03a2\u03a3\f\b\2\2\u03a3\u03a4\7\66\2\2\u03a4"+
		"\u03b2\5\u008aF\t\u03a5\u03a6\f\7\2\2\u03a6\u03a7\t\t\2\2\u03a7\u03b2"+
		"\5\u008aF\b\u03a8\u03a9\f\6\2\2\u03a9\u03aa\t\5\2\2\u03aa\u03b2\5\u008a"+
		"F\7\u03ab\u03ac\f\5\2\2\u03ac\u03ad\t\6\2\2\u03ad\u03b2\5\u008aF\6\u03ae"+
		"\u03af\f\4\2\2\u03af\u03b0\t\n\2\2\u03b0\u03b2\5\u008aF\5\u03b1\u0396"+
		"\3\2\2\2\u03b1\u0399\3\2\2\2\u03b1\u039c\3\2\2\2\u03b1\u039f\3\2\2\2\u03b1"+
		"\u03a2\3\2\2\2\u03b1\u03a5\3\2\2\2\u03b1\u03a8\3\2\2\2\u03b1\u03ab\3\2"+
		"\2\2\u03b1\u03ae\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u008b\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7\32"+
		"\2\2\u03b7\u008d\3\2\2\2\u03b8\u03b9\7\22\2\2\u03b9\u03ba\5\u0088E\2\u03ba"+
		"\u008f\3\2\2\2\u03bb\u03bc\7\"\2\2\u03bc\u0091\3\2\2\2\u03bd\u03be\7\7"+
		"\2\2\u03be\u0093\3\2\2\2\u03bf\u03c0\7K\2\2\u03c0\u0095\3\2\2\2\u03c1"+
		"\u03c2\7J\2\2\u03c2\u0097\3\2\2\2\u03c3\u03c4\t\13\2\2\u03c4\u0099\3\2"+
		"\2\2\u03c5\u03c6\7F\2\2\u03c6\u009b\3\2\2\2\u03c7\u03c8\7L\2\2\u03c8\u009d"+
		"\3\2\2\2\u03c9\u03ca\7N\2\2\u03ca\u009f\3\2\2\2\u03cb\u03cc\7O\2\2\u03cc"+
		"\u00a1\3\2\2\2\u03cd\u03ce\7M\2\2\u03ce\u00a3\3\2\2\2\u03cf\u03d0\7P\2"+
		"\2\u03d0\u00a5\3\2\2\2\u03d1\u03d2\bT\1\2\u03d2\u03d5\7\n\2\2\u03d3\u03d5"+
		"\5\u00aaV\2\u03d4\u03d1\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5\u03dc\3\2\2"+
		"\2\u03d6\u03d7\f\6\2\2\u03d7\u03db\7\n\2\2\u03d8\u03d9\f\5\2\2\u03d9\u03db"+
		"\5\u00aaV\2\u03da\u03d6\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03de\3\2\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u00a7\3\2\2\2\u03de\u03dc"+
		"\3\2\2\2\u03df\u03e0\7\25\2\2\u03e0\u00a9\3\2\2\2\u03e1\u03e2\7\13\2\2"+
		"\u03e2\u00ab\3\2\2\2M\u00b4\u00bc\u00d0\u00e9\u00f0\u00f6\u0122\u0126"+
		"\u012f\u0143\u0147\u0150\u015a\u0173\u017b\u0182\u018a\u018c\u0198\u019d"+
		"\u01a3\u01ab\u01b5\u01bc\u01c4\u01cf\u01d5\u01da\u01e3\u01ef\u01f6\u020e"+
		"\u021a\u0222\u0228\u024b\u0258\u025a\u0265\u026f\u0279\u0283\u028d\u029d"+
		"\u02a2\u02a8\u02ae\u02b0\u02b2\u02b9\u02c1\u02c5\u02e2\u02f9\u02fb\u0303"+
		"\u030b\u0313\u0315\u0326\u0334\u0336\u033f\u0347\u0349\u0361\u036b\u0371"+
		"\u0376\u0394\u03b1\u03b3\u03d4\u03da\u03dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}