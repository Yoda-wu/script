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
		T__0=1, T__1=2, T__2=3, LITERAL=4, COMMA=5, ELLIPSIS=6, SEMICOLON=7, CRLF=8, 
		REQUIRE=9, BEGIN=10, END=11, DEF=12, RETURN=13, PIR=14, IF=15, ELSE=16, 
		ELSIF=17, UNLESS=18, WHILE=19, RETRY=20, BREAK=21, FOR=22, THEN=23, IN=24, 
		UNTIL=25, DO=26, TRUE=27, FALSE=28, PLUS=29, MINUS=30, MUL=31, DIV=32, 
		MOD=33, EXP=34, EQUAL=35, NOT_EQUAL=36, GREATER=37, LESS=38, LESS_EQUAL=39, 
		GREATER_EQUAL=40, ASSIGN=41, PLUS_ASSIGN=42, MINUS_ASSIGN=43, MUL_ASSIGN=44, 
		DIV_ASSIGN=45, MOD_ASSIGN=46, EXP_ASSIGN=47, BIT_AND=48, BIT_OR=49, BIT_XOR=50, 
		BIT_NOT=51, BIT_SHL=52, BIT_SHR=53, AND=54, OR=55, NOT=56, HASH_OP=57, 
		LEFT_RBRACKET=58, RIGHT_RBRACKET=59, LEFT_SBRACKET=60, RIGHT_SBRACKET=61, 
		LEFT_BBRACKET=62, REFT_BBRACKET=63, NIL=64, SL_COMMENT=65, ML_COMMENT=66, 
		WS=67, INT=68, FLOAT=69, ID=70, CONST_ID=71, ID_GLOBAL=72, ID_INSTANCE=73, 
		ID_FUNCTION=74;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_global_get = 3, 
		RULE_global_set = 4, RULE_global_result = 5, RULE_instance_set = 6, RULE_instance_result = 7, 
		RULE_const_set = 8, RULE_function_inline_call = 9, RULE_require_block = 10, 
		RULE_pir_inline = 11, RULE_pir_expression_list = 12, RULE_class_definition = 13, 
		RULE_module_definition = 14, RULE_function_definition = 15, RULE_function_definition_body = 16, 
		RULE_function_definition_header = 17, RULE_function_name = 18, RULE_function_definition_params = 19, 
		RULE_function_definition_params_list = 20, RULE_function_definition_param_id = 21, 
		RULE_return_statement = 22, RULE_function_call = 23, RULE_function_call_param_list = 24, 
		RULE_function_call_params = 25, RULE_function_param = 26, RULE_function_unnamed_param = 27, 
		RULE_function_named_param = 28, RULE_function_call_assignment = 29, RULE_all_result = 30, 
		RULE_elsif_statement = 31, RULE_if_elsif_statement = 32, RULE_if_statement = 33, 
		RULE_unless_statement = 34, RULE_while_statement = 35, RULE_all_assignment = 36, 
		RULE_for_statement = 37, RULE_for_each_statement = 38, RULE_cond_expression = 39, 
		RULE_loop_expression = 40, RULE_hash_expression = 41, RULE_statement_body = 42, 
		RULE_statement_expression_list = 43, RULE_assignment = 44, RULE_dynamic_assignment = 45, 
		RULE_int_assignment = 46, RULE_float_assignment = 47, RULE_string_assignment = 48, 
		RULE_initial_array_assignment = 49, RULE_array_assignment = 50, RULE_array_definition = 51, 
		RULE_array_definition_elements = 52, RULE_array_selector = 53, RULE_dynamic_result = 54, 
		RULE_dynamic_ = 55, RULE_int_result = 56, RULE_float_result = 57, RULE_string_result = 58, 
		RULE_comparison_list = 59, RULE_comparison = 60, RULE_comp_var = 61, RULE_lvalue = 62, 
		RULE_rvalue = 63, RULE_break_expression = 64, RULE_literal_t = 65, RULE_float_t = 66, 
		RULE_int_t = 67, RULE_bool_t = 68, RULE_nil_t = 69, RULE_id_ = 70, RULE_id_global = 71, 
		RULE_id_instance = 72, RULE_id_constence = 73, RULE_id_function = 74, 
		RULE_terminator = 75, RULE_else_token = 76, RULE_crlf = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression_list", "expression", "global_get", "global_set", 
			"global_result", "instance_set", "instance_result", "const_set", "function_inline_call", 
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
			"array_selector", "dynamic_result", "dynamic_", "int_result", "float_result", 
			"string_result", "comparison_list", "comparison", "comp_var", "lvalue", 
			"rvalue", "break_expression", "literal_t", "float_t", "int_t", "bool_t", 
			"nil_t", "id_", "id_global", "id_instance", "id_constence", "id_function", 
			"terminator", "else_token", "crlf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'module'", "'.'", null, "','", "'..'", "';'", null, 
			"'require'", "'begin'", "'end'", "'def'", "'return'", "'pir'", "'if'", 
			"'else'", "'elsif'", "'unless'", "'while'", "'retry'", "'break'", "'for'", 
			"'then'", "'in'", "'until'", "'do'", "'true'", "'false'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", 
			"'^'", "'~'", "'<<'", "'>>'", null, null, null, "'=>'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LITERAL", "COMMA", "ELLIPSIS", "SEMICOLON", 
			"CRLF", "REQUIRE", "BEGIN", "END", "DEF", "RETURN", "PIR", "IF", "ELSE", 
			"ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "THEN", "IN", "UNTIL", 
			"DO", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", 
			"NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
			"AND", "OR", "NOT", "HASH_OP", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
			"RIGHT_SBRACKET", "LEFT_BBRACKET", "REFT_BBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", 
			"ID_FUNCTION"
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
			setState(156);
			expression_list(0);
			setState(157);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(160);
				expression();
				setState(161);
				terminator(0);
				}
				break;
			case 2:
				{
				setState(163);
				terminator(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
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
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					expression();
					setState(168);
					terminator(0);
					}
					} 
				}
				setState(174);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				function_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				function_inline_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				require_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				unless_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				rvalue(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				return_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				while_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(185);
				pir_inline();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(186);
				hash_expression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(187);
				class_definition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(188);
				module_definition();
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
		enterRule(_localctx, 6, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(192);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(193);
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
		enterRule(_localctx, 8, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((Global_setContext)_localctx).global_name = id_global();
			setState(196);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(197);
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
		enterRule(_localctx, 10, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 12, RULE_instance_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((Instance_setContext)_localctx).instance_name = id_instance();
			setState(202);
			((Instance_setContext)_localctx).op = match(ASSIGN);
			setState(203);
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
		enterRule(_localctx, 14, RULE_instance_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 16, RULE_const_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((Const_setContext)_localctx).constance_name = id_constence();
			setState(208);
			((Const_setContext)_localctx).op = match(ASSIGN);
			setState(209);
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
		enterRule(_localctx, 18, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 20, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(REQUIRE);
			setState(214);
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
		enterRule(_localctx, 22, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(PIR);
			setState(217);
			crlf();
			setState(218);
			pir_expression_list();
			setState(219);
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
		enterRule(_localctx, 24, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		public Id_Context superclass_id;
		public List<Id_Context> id_() {
			return getRuleContexts(Id_Context.class);
		}
		public Id_Context id_(int i) {
			return getRuleContext(Id_Context.class,i);
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
		enterRule(_localctx, 26, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__0);
			setState(224);
			id_();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(225);
				match(LESS);
				setState(226);
				((Class_definitionContext)_localctx).superclass_id = id_();
				}
			}

			setState(229);
			match(CRLF);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(230);
				statement_expression_list(0);
				}
				break;
			}
			setState(233);
			match(CRLF);
			setState(234);
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
		enterRule(_localctx, 28, RULE_module_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__1);
			setState(237);
			id_();
			setState(238);
			match(CRLF);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(239);
				statement_expression_list(0);
				}
				break;
			}
			setState(242);
			match(CRLF);
			setState(243);
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
		enterRule(_localctx, 30, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			function_definition_header();
			setState(246);
			function_definition_body();
			setState(247);
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
		enterRule(_localctx, 32, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 34, RULE_function_definition_header);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(DEF);
				setState(252);
				function_name();
				setState(253);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(DEF);
				setState(256);
				function_name();
				setState(257);
				function_definition_params();
				setState(258);
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
		enterRule(_localctx, 36, RULE_function_name);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		enterRule(_localctx, 38, RULE_function_definition_params);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(LEFT_RBRACKET);
				setState(267);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(LEFT_RBRACKET);
				setState(269);
				function_definition_params_list(0);
				setState(270);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					match(COMMA);
					setState(280);
					function_definition_param_id();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 42, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 44, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(RETURN);
			setState(289);
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
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((Function_callContext)_localctx).name = function_name();
				setState(292);
				match(LEFT_RBRACKET);
				setState(293);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(294);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((Function_callContext)_localctx).name = function_name();
				setState(297);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((Function_callContext)_localctx).name = function_name();
				setState(300);
				match(LEFT_RBRACKET);
				setState(301);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				id_();
				setState(304);
				match(T__2);
				setState(305);
				((Function_callContext)_localctx).name = function_name();
				setState(306);
				match(LEFT_RBRACKET);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERAL || _la==LEFT_RBRACKET || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INT - 68)) | (1L << (FLOAT - 68)) | (1L << (ID - 68)) | (1L << (ID_GLOBAL - 68)) | (1L << (ID_FUNCTION - 68)))) != 0)) {
					{
					setState(307);
					((Function_callContext)_localctx).params = function_call_param_list();
					}
				}

				setState(310);
				match(RIGHT_RBRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				id_();
				setState(313);
				match(T__2);
				setState(314);
				((Function_callContext)_localctx).name = function_name();
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(315);
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
		enterRule(_localctx, 48, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(325);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(326);
					match(COMMA);
					setState(327);
					function_param();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 52, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(333);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(334);
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
		enterRule(_localctx, 54, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(337);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(338);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(339);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(340);
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
		enterRule(_localctx, 56, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			id_();
			setState(344);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(345);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(346);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(347);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(348);
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
		enterRule(_localctx, 58, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 60, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(353);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(354);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(355);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(356);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(357);
				global_result();
				}
				break;
			case 6:
				{
				setState(358);
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
		enterRule(_localctx, 62, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 64, RULE_if_elsif_statement);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ELSIF);
				setState(364);
				cond_expression();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(365);
					match(THEN);
					}
				}

				setState(368);
				crlf();
				setState(369);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(ELSIF);
				setState(372);
				cond_expression();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(373);
					match(THEN);
					}
				}

				setState(376);
				crlf();
				setState(377);
				statement_body();
				setState(378);
				else_token();
				setState(379);
				crlf();
				setState(380);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(ELSIF);
				setState(383);
				cond_expression();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(384);
					match(THEN);
					}
				}

				setState(387);
				crlf();
				setState(388);
				statement_body();
				setState(389);
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
		enterRule(_localctx, 66, RULE_if_statement);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(IF);
				setState(394);
				cond_expression();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(395);
					match(THEN);
					}
				}

				setState(398);
				crlf();
				setState(399);
				statement_body();
				setState(400);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(IF);
				setState(403);
				cond_expression();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(404);
					match(THEN);
					}
				}

				setState(407);
				crlf();
				setState(408);
				statement_body();
				setState(409);
				else_token();
				setState(410);
				crlf();
				setState(411);
				statement_body();
				setState(412);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(IF);
				setState(415);
				cond_expression();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(416);
					match(THEN);
					}
				}

				setState(419);
				crlf();
				setState(420);
				statement_body();
				setState(421);
				elsif_statement();
				setState(422);
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
		enterRule(_localctx, 68, RULE_unless_statement);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(UNLESS);
				setState(427);
				cond_expression();
				setState(428);
				crlf();
				setState(429);
				statement_body();
				setState(430);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(UNLESS);
				setState(433);
				cond_expression();
				setState(434);
				crlf();
				setState(435);
				statement_body();
				setState(436);
				else_token();
				setState(437);
				crlf();
				setState(438);
				statement_body();
				setState(439);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(UNLESS);
				setState(442);
				cond_expression();
				setState(443);
				crlf();
				setState(444);
				statement_body();
				setState(445);
				elsif_statement();
				setState(446);
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
		enterRule(_localctx, 70, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(WHILE);
			setState(451);
			cond_expression();
			setState(452);
			crlf();
			setState(453);
			statement_body();
			setState(454);
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
		enterRule(_localctx, 72, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(456);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(457);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(458);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(459);
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
		enterRule(_localctx, 74, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(FOR);
			setState(463);
			lvalue();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464);
				match(COMMA);
				setState(465);
				lvalue();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(IN);
			setState(472);
			loop_expression();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DO) {
				{
				setState(473);
				match(DO);
				}
			}

			setState(476);
			match(CRLF);
			setState(477);
			statement_body();
			setState(478);
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
		enterRule(_localctx, 76, RULE_for_each_statement);
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
		enterRule(_localctx, 78, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 80, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		public TerminalNode REFT_BBRACKET() { return getToken(rubyParser.REFT_BBRACKET, 0); }
		public TerminalNode HASH_OP() { return getToken(rubyParser.HASH_OP, 0); }
		public Hash_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_expression; }
	}

	public final Hash_expressionContext hash_expression() throws RecognitionException {
		Hash_expressionContext _localctx = new Hash_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hash_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LEFT_BBRACKET);
			setState(487);
			expression();
			setState(488);
			((Hash_expressionContext)_localctx).op = match(HASH_OP);
			setState(489);
			expression();
			setState(490);
			match(REFT_BBRACKET);
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
		enterRule(_localctx, 84, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case LITERAL:
			case SEMICOLON:
			case CRLF:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
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
			case ID_FUNCTION:
				{
				setState(495);
				expression();
				setState(496);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(498);
				match(RETRY);
				setState(499);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(500);
				break_expression();
				setState(501);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(505);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(506);
						expression();
						setState(507);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(509);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(510);
						match(RETRY);
						setState(511);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(512);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(513);
						break_expression();
						setState(514);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 88, RULE_assignment);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(522);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(523);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(526);
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
				setState(527);
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
		enterRule(_localctx, 90, RULE_dynamic_assignment);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(532);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(533);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(536);
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
				setState(537);
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
		enterRule(_localctx, 92, RULE_int_assignment);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(542);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(543);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(546);
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
				setState(547);
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
		enterRule(_localctx, 94, RULE_float_assignment);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(552);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(553);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(556);
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
				setState(557);
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
		enterRule(_localctx, 96, RULE_string_assignment);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(562);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(563);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(566);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(567);
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
		enterRule(_localctx, 98, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(572);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(573);
			match(LEFT_SBRACKET);
			setState(574);
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
		enterRule(_localctx, 100, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(577);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(578);
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
		enterRule(_localctx, 102, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(LEFT_SBRACKET);
			setState(581);
			array_definition_elements(0);
			setState(582);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(585);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(586);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
						setState(589);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(590);
						match(COMMA);
						setState(593);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(591);
							int_result(0);
							}
							break;
						case 2:
							{
							setState(592);
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
						setState(595);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(596);
						match(ELLIPSIS);
						setState(599);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(597);
							int_result(0);
							}
							break;
						case 2:
							{
							setState(598);
							dynamic_result(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 106, RULE_array_selector);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				id_();
				setState(607);
				match(LEFT_SBRACKET);
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(608);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(609);
					dynamic_result(0);
					}
					break;
				}
				setState(612);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				id_global();
				setState(615);
				match(LEFT_SBRACKET);
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(616);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(617);
					dynamic_result(0);
					}
					break;
				}
				setState(620);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(625);
				int_result(0);
				setState(626);
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
				setState(627);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(629);
				float_result(0);
				setState(630);
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
				setState(631);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(633);
				string_result(0);
				setState(634);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(635);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(637);
				int_result(0);
				setState(638);
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
				setState(639);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(641);
				float_result(0);
				setState(642);
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
				setState(643);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(645);
				match(LEFT_RBRACKET);
				setState(646);
				dynamic_result(0);
				setState(647);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(649);
				dynamic_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(673);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(652);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(653);
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
						setState(654);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(655);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(656);
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
						setState(657);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(658);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(659);
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
						setState(660);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(661);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(662);
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
						setState(663);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(664);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(665);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(666);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(667);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(668);
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
						setState(669);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(670);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(671);
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
						setState(672);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(677);
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
		enterRule(_localctx, 110, RULE_dynamic_);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				id_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(684);
				match(LEFT_RBRACKET);
				setState(685);
				int_result(0);
				setState(686);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(688);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(691);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(692);
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
						setState(693);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(694);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(695);
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
						setState(696);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(703);
				int_result(0);
				setState(704);
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
				setState(705);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(707);
				int_result(0);
				setState(708);
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
				setState(709);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(711);
				match(LEFT_RBRACKET);
				setState(712);
				float_result(0);
				setState(713);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(715);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(718);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(719);
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
						setState(720);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(721);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(722);
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
						setState(723);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(724);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(725);
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
						setState(726);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(727);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(728);
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
						setState(729);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(736);
				int_result(0);
				setState(737);
				((String_resultContext)_localctx).op = match(MUL);
				setState(738);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(740);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(743);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(744);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(745);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(746);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(747);
						((String_resultContext)_localctx).op = match(MUL);
						setState(748);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(753);
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
		enterRule(_localctx, 118, RULE_comparison_list);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				((Comparison_listContext)_localctx).left = comparison();
				setState(755);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(756);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				((Comparison_listContext)_localctx).left = comparison();
				setState(759);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(760);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				((Comparison_listContext)_localctx).left = comparison();
				setState(763);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(764);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				((Comparison_listContext)_localctx).left = comparison();
				setState(767);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(768);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
				match(LEFT_RBRACKET);
				setState(771);
				comparison_list();
				setState(772);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(774);
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
		enterRule(_localctx, 120, RULE_comparison);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				((ComparisonContext)_localctx).left = comp_var();
				setState(778);
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
				setState(779);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				((ComparisonContext)_localctx).left = comp_var();
				setState(782);
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
				setState(783);
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
		enterRule(_localctx, 122, RULE_comp_var);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				id_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
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
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Id_constenceContext id_constence() {
			return getRuleContext(Id_constenceContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lvalue);
		try {
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				id_();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				id_global();
				}
				break;
			case CONST_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				id_constence();
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(799);
				lvalue();
				}
				break;
			case 2:
				{
				setState(800);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(801);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(802);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(803);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(804);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(805);
				global_set();
				}
				break;
			case 8:
				{
				setState(806);
				global_get();
				}
				break;
			case 9:
				{
				setState(807);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(808);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(809);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(810);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(811);
				assignment();
				}
				break;
			case 14:
				{
				setState(812);
				function_call();
				}
				break;
			case 15:
				{
				setState(813);
				literal_t();
				}
				break;
			case 16:
				{
				setState(814);
				bool_t();
				}
				break;
			case 17:
				{
				setState(815);
				float_t();
				}
				break;
			case 18:
				{
				setState(816);
				int_t();
				}
				break;
			case 19:
				{
				setState(817);
				nil_t();
				}
				break;
			case 20:
				{
				setState(818);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(819);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(820);
				match(LEFT_RBRACKET);
				setState(821);
				rvalue(0);
				setState(822);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(853);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(826);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(827);
						match(EXP);
						setState(828);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(829);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(830);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(831);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(832);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(833);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(834);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(835);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(836);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(837);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(838);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(839);
						match(BIT_AND);
						setState(840);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(841);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(842);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(843);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(844);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(845);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(846);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(847);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(848);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(849);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(850);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(851);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(852);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 128, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(rubyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
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
		enterRule(_localctx, 132, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
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
		enterRule(_localctx, 134, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		enterRule(_localctx, 136, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		enterRule(_localctx, 138, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		enterRule(_localctx, 140, RULE_id_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
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
		enterRule(_localctx, 142, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
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
		enterRule(_localctx, 144, RULE_id_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
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
		enterRule(_localctx, 146, RULE_id_constence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
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
		enterRule(_localctx, 148, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
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
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(881);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(882);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(885);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(886);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(887);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(888);
						crlf();
						}
						break;
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		enterRule(_localctx, 152, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
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
		enterRule(_localctx, 154, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
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
		case 20:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 25:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 43:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 52:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 54:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 56:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 57:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 58:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 63:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 75:
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
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u0385\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u00a7\n\3\3\3\3\3\3\3\3\3\7\3\u00ad\n\3\f\3\16\3\u00b0\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c0\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\5\17\u00e6\n\17\3\17\3\17\5\17\u00ea\n\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00f3\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24"+
		"\3\24\5\24\u010b\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0114\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011c\n\26\f\26\16\26\u011f\13"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0137\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u013f\n\31\5\31\u0141\n\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e\13\33\3\34\3"+
		"\34\5\34\u0152\n\34\3\35\3\35\3\35\3\35\5\35\u0158\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0160\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u016a\n"+
		" \3!\3!\3\"\3\"\3\"\5\"\u0171\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0179\n"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0184\n\"\3\"\3\"\3\"\3\"\5"+
		"\"\u018a\n\"\3#\3#\3#\5#\u018f\n#\3#\3#\3#\3#\3#\3#\3#\5#\u0198\n#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a4\n#\3#\3#\3#\3#\3#\5#\u01ab\n#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c3"+
		"\n$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01cf\n&\3\'\3\'\3\'\3\'\7\'\u01d5"+
		"\n\'\f\'\16\'\u01d8\13\'\3\'\3\'\3\'\5\'\u01dd\n\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u01fa\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0207\n-\f-\16-\u020a\13"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0214\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u021e"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0228\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0232\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u023c\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u024e\n\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0254\n\66\3\66\3\66\3\66\3\66\5\66\u025a\n\66\7\66\u025c\n"+
		"\66\f\66\16\66\u025f\13\66\3\67\3\67\3\67\3\67\5\67\u0265\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u026d\n\67\3\67\3\67\5\67\u0271\n\67\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\58\u028d\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\78\u02a4\n8\f8\168\u02a7\138\39\39\39\59\u02ac\n9\3:\3:\3:"+
		"\3:\3:\3:\5:\u02b4\n:\3:\3:\3:\3:\3:\3:\7:\u02bc\n:\f:\16:\u02bf\13:\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02cf\n;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\7;\u02dd\n;\f;\16;\u02e0\13;\3<\3<\3<\3<\3<\3<\5<"+
		"\u02e8\n<\3<\3<\3<\3<\3<\3<\7<\u02f0\n<\f<\16<\u02f3\13<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u030a\n=\3>\3>\3"+
		">\3>\3>\3>\3>\3>\5>\u0314\n>\3?\3?\3?\3?\5?\u031a\n?\3@\3@\3@\5@\u031f"+
		"\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u033b\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0358\nA\fA\16A\u035b\13A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3"+
		"M\5M\u0376\nM\3M\3M\3M\3M\7M\u037c\nM\fM\16M\u037f\13M\3N\3N\3O\3O\3O"+
		"\2\r\4*\64Xjnrtv\u0080\u0098P\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\2\f\3\2,\61\3\2!#\3\2\37 \3\2\'*\3\2%&\4\2\65\65::\3\2\66\67\3"+
		"\2\63\64\3\289\3\2\35\36\2\u03ca\2\u009e\3\2\2\2\4\u00a6\3\2\2\2\6\u00bf"+
		"\3\2\2\2\b\u00c1\3\2\2\2\n\u00c5\3\2\2\2\f\u00c9\3\2\2\2\16\u00cb\3\2"+
		"\2\2\20\u00cf\3\2\2\2\22\u00d1\3\2\2\2\24\u00d5\3\2\2\2\26\u00d7\3\2\2"+
		"\2\30\u00da\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2\2\2\36\u00ee\3\2\2\2"+
		" \u00f7\3\2\2\2\"\u00fb\3\2\2\2$\u0106\3\2\2\2&\u010a\3\2\2\2(\u0113\3"+
		"\2\2\2*\u0115\3\2\2\2,\u0120\3\2\2\2.\u0122\3\2\2\2\60\u0140\3\2\2\2\62"+
		"\u0142\3\2\2\2\64\u0144\3\2\2\2\66\u0151\3\2\2\28\u0157\3\2\2\2:\u0159"+
		"\3\2\2\2<\u0161\3\2\2\2>\u0169\3\2\2\2@\u016b\3\2\2\2B\u0189\3\2\2\2D"+
		"\u01aa\3\2\2\2F\u01c2\3\2\2\2H\u01c4\3\2\2\2J\u01ce\3\2\2\2L\u01d0\3\2"+
		"\2\2N\u01e2\3\2\2\2P\u01e4\3\2\2\2R\u01e6\3\2\2\2T\u01e8\3\2\2\2V\u01ee"+
		"\3\2\2\2X\u01f9\3\2\2\2Z\u0213\3\2\2\2\\\u021d\3\2\2\2^\u0227\3\2\2\2"+
		"`\u0231\3\2\2\2b\u023b\3\2\2\2d\u023d\3\2\2\2f\u0242\3\2\2\2h\u0246\3"+
		"\2\2\2j\u024a\3\2\2\2l\u0270\3\2\2\2n\u028c\3\2\2\2p\u02ab\3\2\2\2r\u02b3"+
		"\3\2\2\2t\u02ce\3\2\2\2v\u02e7\3\2\2\2x\u0309\3\2\2\2z\u0313\3\2\2\2|"+
		"\u0319\3\2\2\2~\u031e\3\2\2\2\u0080\u033a\3\2\2\2\u0082\u035c\3\2\2\2"+
		"\u0084\u035e\3\2\2\2\u0086\u0360\3\2\2\2\u0088\u0362\3\2\2\2\u008a\u0364"+
		"\3\2\2\2\u008c\u0366\3\2\2\2\u008e\u0368\3\2\2\2\u0090\u036a\3\2\2\2\u0092"+
		"\u036c\3\2\2\2\u0094\u036e\3\2\2\2\u0096\u0370\3\2\2\2\u0098\u0375\3\2"+
		"\2\2\u009a\u0380\3\2\2\2\u009c\u0382\3\2\2\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a0\7\2\2\3\u00a0\3\3\2\2\2\u00a1\u00a2\b\3\1\2\u00a2\u00a3\5\6\4\2"+
		"\u00a3\u00a4\5\u0098M\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5\u0098M\2\u00a6"+
		"\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\f\4"+
		"\2\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\5\u0098M\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\5\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00c0\5L\'\2\u00b2\u00c0"+
		"\5 \21\2\u00b3\u00c0\5\24\13\2\u00b4\u00c0\5\26\f\2\u00b5\u00c0\5D#\2"+
		"\u00b6\u00c0\5F$\2\u00b7\u00c0\5\u0080A\2\u00b8\u00c0\5.\30\2\u00b9\u00c0"+
		"\5H%\2\u00ba\u00c0\3\2\2\2\u00bb\u00c0\5\30\r\2\u00bc\u00c0\5T+\2\u00bd"+
		"\u00c0\5\34\17\2\u00be\u00c0\5\36\20\2\u00bf\u00b1\3\2\2\2\u00bf\u00b2"+
		"\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\7\3\2\2\2\u00c1\u00c2\5~@\2\u00c2"+
		"\u00c3\7+\2\2\u00c3\u00c4\5\u0090I\2\u00c4\t\3\2\2\2\u00c5\u00c6\5\u0090"+
		"I\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\5> \2\u00c8\13\3\2\2\2\u00c9\u00ca"+
		"\5\u0090I\2\u00ca\r\3\2\2\2\u00cb\u00cc\5\u0092J\2\u00cc\u00cd\7+\2\2"+
		"\u00cd\u00ce\5> \2\u00ce\17\3\2\2\2\u00cf\u00d0\5\u0092J\2\u00d0\21\3"+
		"\2\2\2\u00d1\u00d2\5\u0094K\2\u00d2\u00d3\7+\2\2\u00d3\u00d4\5> \2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d6\5\60\31\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\13\2"+
		"\2\u00d8\u00d9\5\u0084C\2\u00d9\27\3\2\2\2\u00da\u00db\7\20\2\2\u00db"+
		"\u00dc\5\u009cO\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7\r\2\2\u00de\31\3"+
		"\2\2\2\u00df\u00e0\5\4\3\2\u00e0\33\3\2\2\2\u00e1\u00e2\7\3\2\2\u00e2"+
		"\u00e5\5\u008eH\2\u00e3\u00e4\7(\2\2\u00e4\u00e6\5\u008eH\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\n\2\2\u00e8"+
		"\u00ea\5X-\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2"+
		"\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\7\r\2\2\u00ed\35\3\2\2\2\u00ee\u00ef"+
		"\7\4\2\2\u00ef\u00f0\5\u008eH\2\u00f0\u00f2\7\n\2\2\u00f1\u00f3\5X-\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\7\n\2\2\u00f5\u00f6\7\r\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\5$\23\2\u00f8"+
		"\u00f9\5\"\22\2\u00f9\u00fa\7\r\2\2\u00fa!\3\2\2\2\u00fb\u00fc\5\4\3\2"+
		"\u00fc#\3\2\2\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\5&\24\2\u00ff\u0100\5"+
		"\u009cO\2\u0100\u0107\3\2\2\2\u0101\u0102\7\16\2\2\u0102\u0103\5&\24\2"+
		"\u0103\u0104\5(\25\2\u0104\u0105\5\u009cO\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00fd\3\2\2\2\u0106\u0101\3\2\2\2\u0107%\3\2\2\2\u0108\u010b\5\u0096"+
		"L\2\u0109\u010b\5\u008eH\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\'\3\2\2\2\u010c\u010d\7<\2\2\u010d\u0114\7=\2\2\u010e\u010f\7<\2\2\u010f"+
		"\u0110\5*\26\2\u0110\u0111\7=\2\2\u0111\u0114\3\2\2\2\u0112\u0114\5*\26"+
		"\2\u0113\u010c\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0112\3\2\2\2\u0114)"+
		"\3\2\2\2\u0115\u0116\b\26\1\2\u0116\u0117\5,\27\2\u0117\u011d\3\2\2\2"+
		"\u0118\u0119\f\3\2\2\u0119\u011a\7\7\2\2\u011a\u011c\5,\27\2\u011b\u0118"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"+\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\u008eH\2\u0121-\3\2\2\2\u0122"+
		"\u0123\7\17\2\2\u0123\u0124\5> \2\u0124/\3\2\2\2\u0125\u0126\5&\24\2\u0126"+
		"\u0127\7<\2\2\u0127\u0128\5\62\32\2\u0128\u0129\7=\2\2\u0129\u0141\3\2"+
		"\2\2\u012a\u012b\5&\24\2\u012b\u012c\5\62\32\2\u012c\u0141\3\2\2\2\u012d"+
		"\u012e\5&\24\2\u012e\u012f\7<\2\2\u012f\u0130\7=\2\2\u0130\u0141\3\2\2"+
		"\2\u0131\u0132\5\u008eH\2\u0132\u0133\7\5\2\2\u0133\u0134\5&\24\2\u0134"+
		"\u0136\7<\2\2\u0135\u0137\5\62\32\2\u0136\u0135\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7=\2\2\u0139\u0141\3\2\2\2\u013a"+
		"\u013b\5\u008eH\2\u013b\u013c\7\5\2\2\u013c\u013e\5&\24\2\u013d\u013f"+
		"\5\62\32\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2"+
		"\u0140\u0125\3\2\2\2\u0140\u012a\3\2\2\2\u0140\u012d\3\2\2\2\u0140\u0131"+
		"\3\2\2\2\u0140\u013a\3\2\2\2\u0141\61\3\2\2\2\u0142\u0143\5\64\33\2\u0143"+
		"\63\3\2\2\2\u0144\u0145\b\33\1\2\u0145\u0146\5\66\34\2\u0146\u014c\3\2"+
		"\2\2\u0147\u0148\f\3\2\2\u0148\u0149\7\7\2\2\u0149\u014b\5\66\34\2\u014a"+
		"\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\65\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0152\58\35\2\u0150\u0152"+
		"\5:\36\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\67\3\2\2\2\u0153"+
		"\u0158\5r:\2\u0154\u0158\5t;\2\u0155\u0158\5v<\2\u0156\u0158\5n8\2\u0157"+
		"\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u01589\3\2\2\2\u0159\u015a\5\u008eH\2\u015a\u015f\7+\2\2\u015b\u0160"+
		"\5r:\2\u015c\u0160\5t;\2\u015d\u0160\5v<\2\u015e\u0160\5n8\2\u015f\u015b"+
		"\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		";\3\2\2\2\u0161\u0162\5\60\31\2\u0162=\3\2\2\2\u0163\u016a\5r:\2\u0164"+
		"\u016a\5t;\2\u0165\u016a\5v<\2\u0166\u016a\5n8\2\u0167\u016a\5\f\7\2\u0168"+
		"\u016a\5\20\t\2\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3"+
		"\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"?\3\2\2\2\u016b\u016c\5B\"\2\u016cA\3\2\2\2\u016d\u016e\7\23\2\2\u016e"+
		"\u0170\5P)\2\u016f\u0171\7\31\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\u009cO\2\u0173\u0174\5V,\2\u0174"+
		"\u018a\3\2\2\2\u0175\u0176\7\23\2\2\u0176\u0178\5P)\2\u0177\u0179\7\31"+
		"\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\5\u009cO\2\u017b\u017c\5V,\2\u017c\u017d\5\u009aN\2\u017d\u017e"+
		"\5\u009cO\2\u017e\u017f\5V,\2\u017f\u018a\3\2\2\2\u0180\u0181\7\23\2\2"+
		"\u0181\u0183\5P)\2\u0182\u0184\7\31\2\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5\u009cO\2\u0186\u0187\5V,\2"+
		"\u0187\u0188\5B\"\2\u0188\u018a\3\2\2\2\u0189\u016d\3\2\2\2\u0189\u0175"+
		"\3\2\2\2\u0189\u0180\3\2\2\2\u018aC\3\2\2\2\u018b\u018c\7\21\2\2\u018c"+
		"\u018e\5P)\2\u018d\u018f\7\31\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5\u009cO\2\u0191\u0192\5V,\2\u0192"+
		"\u0193\7\r\2\2\u0193\u01ab\3\2\2\2\u0194\u0195\7\21\2\2\u0195\u0197\5"+
		"P)\2\u0196\u0198\7\31\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\5\u009cO\2\u019a\u019b\5V,\2\u019b\u019c\5"+
		"\u009aN\2\u019c\u019d\5\u009cO\2\u019d\u019e\5V,\2\u019e\u019f\7\r\2\2"+
		"\u019f\u01ab\3\2\2\2\u01a0\u01a1\7\21\2\2\u01a1\u01a3\5P)\2\u01a2\u01a4"+
		"\7\31\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2"+
		"\u01a5\u01a6\5\u009cO\2\u01a6\u01a7\5V,\2\u01a7\u01a8\5@!\2\u01a8\u01a9"+
		"\7\r\2\2\u01a9\u01ab\3\2\2\2\u01aa\u018b\3\2\2\2\u01aa\u0194\3\2\2\2\u01aa"+
		"\u01a0\3\2\2\2\u01abE\3\2\2\2\u01ac\u01ad\7\24\2\2\u01ad\u01ae\5P)\2\u01ae"+
		"\u01af\5\u009cO\2\u01af\u01b0\5V,\2\u01b0\u01b1\7\r\2\2\u01b1\u01c3\3"+
		"\2\2\2\u01b2\u01b3\7\24\2\2\u01b3\u01b4\5P)\2\u01b4\u01b5\5\u009cO\2\u01b5"+
		"\u01b6\5V,\2\u01b6\u01b7\5\u009aN\2\u01b7\u01b8\5\u009cO\2\u01b8\u01b9"+
		"\5V,\2\u01b9\u01ba\7\r\2\2\u01ba\u01c3\3\2\2\2\u01bb\u01bc\7\24\2\2\u01bc"+
		"\u01bd\5P)\2\u01bd\u01be\5\u009cO\2\u01be\u01bf\5V,\2\u01bf\u01c0\5@!"+
		"\2\u01c0\u01c1\7\r\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01ac\3\2\2\2\u01c2\u01b2"+
		"\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c3G\3\2\2\2\u01c4\u01c5\7\25\2\2\u01c5"+
		"\u01c6\5P)\2\u01c6\u01c7\5\u009cO\2\u01c7\u01c8\5V,\2\u01c8\u01c9\7\r"+
		"\2\2\u01c9I\3\2\2\2\u01ca\u01cf\5^\60\2\u01cb\u01cf\5`\61\2\u01cc\u01cf"+
		"\5b\62\2\u01cd\u01cf\5\\/\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfK\3\2\2\2\u01d0\u01d1\7\30\2\2"+
		"\u01d1\u01d6\5~@\2\u01d2\u01d3\7\7\2\2\u01d3\u01d5\5~@\2\u01d4\u01d2\3"+
		"\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7\32\2\2\u01da\u01dc\5"+
		"R*\2\u01db\u01dd\7\34\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\7\n\2\2\u01df\u01e0\5V,\2\u01e0\u01e1\7\r\2"+
		"\2\u01e1M\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3O\3\2\2\2\u01e4\u01e5\5x=\2"+
		"\u01e5Q\3\2\2\2\u01e6\u01e7\5h\65\2\u01e7S\3\2\2\2\u01e8\u01e9\7@\2\2"+
		"\u01e9\u01ea\5\6\4\2\u01ea\u01eb\7;\2\2\u01eb\u01ec\5\6\4\2\u01ec\u01ed"+
		"\7A\2\2\u01edU\3\2\2\2\u01ee\u01ef\5X-\2\u01efW\3\2\2\2\u01f0\u01f1\b"+
		"-\1\2\u01f1\u01f2\5\6\4\2\u01f2\u01f3\5\u0098M\2\u01f3\u01fa\3\2\2\2\u01f4"+
		"\u01f5\7\26\2\2\u01f5\u01fa\5\u0098M\2\u01f6\u01f7\5\u0082B\2\u01f7\u01f8"+
		"\5\u0098M\2\u01f8\u01fa\3\2\2\2\u01f9\u01f0\3\2\2\2\u01f9\u01f4\3\2\2"+
		"\2\u01f9\u01f6\3\2\2\2\u01fa\u0208\3\2\2\2\u01fb\u01fc\f\5\2\2\u01fc\u01fd"+
		"\5\6\4\2\u01fd\u01fe\5\u0098M\2\u01fe\u0207\3\2\2\2\u01ff\u0200\f\4\2"+
		"\2\u0200\u0201\7\26\2\2\u0201\u0207\5\u0098M\2\u0202\u0203\f\3\2\2\u0203"+
		"\u0204\5\u0082B\2\u0204\u0205\5\u0098M\2\u0205\u0207\3\2\2\2\u0206\u01fb"+
		"\3\2\2\2\u0206\u01ff\3\2\2\2\u0206\u0202\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209Y\3\2\2\2\u020a\u0208\3\2\2\2"+
		"\u020b\u020c\5~@\2\u020c\u020d\7+\2\2\u020d\u020e\5\u0080A\2\u020e\u0214"+
		"\3\2\2\2\u020f\u0210\5~@\2\u0210\u0211\t\2\2\2\u0211\u0212\5\u0080A\2"+
		"\u0212\u0214\3\2\2\2\u0213\u020b\3\2\2\2\u0213\u020f\3\2\2\2\u0214[\3"+
		"\2\2\2\u0215\u0216\5~@\2\u0216\u0217\7+\2\2\u0217\u0218\5n8\2\u0218\u021e"+
		"\3\2\2\2\u0219\u021a\5~@\2\u021a\u021b\t\2\2\2\u021b\u021c\5n8\2\u021c"+
		"\u021e\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0219\3\2\2\2\u021e]\3\2\2\2"+
		"\u021f\u0220\5~@\2\u0220\u0221\7+\2\2\u0221\u0222\5r:\2\u0222\u0228\3"+
		"\2\2\2\u0223\u0224\5~@\2\u0224\u0225\t\2\2\2\u0225\u0226\5r:\2\u0226\u0228"+
		"\3\2\2\2\u0227\u021f\3\2\2\2\u0227\u0223\3\2\2\2\u0228_\3\2\2\2\u0229"+
		"\u022a\5~@\2\u022a\u022b\7+\2\2\u022b\u022c\5t;\2\u022c\u0232\3\2\2\2"+
		"\u022d\u022e\5~@\2\u022e\u022f\t\2\2\2\u022f\u0230\5t;\2\u0230\u0232\3"+
		"\2\2\2\u0231\u0229\3\2\2\2\u0231\u022d\3\2\2\2\u0232a\3\2\2\2\u0233\u0234"+
		"\5~@\2\u0234\u0235\7+\2\2\u0235\u0236\5v<\2\u0236\u023c\3\2\2\2\u0237"+
		"\u0238\5~@\2\u0238\u0239\7,\2\2\u0239\u023a\5v<\2\u023a\u023c\3\2\2\2"+
		"\u023b\u0233\3\2\2\2\u023b\u0237\3\2\2\2\u023cc\3\2\2\2\u023d\u023e\5"+
		"~@\2\u023e\u023f\7+\2\2\u023f\u0240\7>\2\2\u0240\u0241\7?\2\2\u0241e\3"+
		"\2\2\2\u0242\u0243\5l\67\2\u0243\u0244\7+\2\2\u0244\u0245\5> \2\u0245"+
		"g\3\2\2\2\u0246\u0247\7>\2\2\u0247\u0248\5j\66\2\u0248\u0249\7?\2\2\u0249"+
		"i\3\2\2\2\u024a\u024d\b\66\1\2\u024b\u024e\5r:\2\u024c\u024e\5n8\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u025d\3\2\2\2\u024f\u0250\f\4"+
		"\2\2\u0250\u0253\7\7\2\2\u0251\u0254\5r:\2\u0252\u0254\5n8\2\u0253\u0251"+
		"\3\2\2\2\u0253\u0252\3\2\2\2\u0254\u025c\3\2\2\2\u0255\u0256\f\3\2\2\u0256"+
		"\u0259\7\b\2\2\u0257\u025a\5r:\2\u0258\u025a\5n8\2\u0259\u0257\3\2\2\2"+
		"\u0259\u0258\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u024f\3\2\2\2\u025b\u0255"+
		"\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"k\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\5\u008eH\2\u0261\u0264\7>\2"+
		"\2\u0262\u0265\5r:\2\u0263\u0265\5n8\2\u0264\u0262\3\2\2\2\u0264\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7?\2\2\u0267\u0271\3\2\2\2\u0268"+
		"\u0269\5\u0090I\2\u0269\u026c\7>\2\2\u026a\u026d\5r:\2\u026b\u026d\5n"+
		"8\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\7?\2\2\u026f\u0271\3\2\2\2\u0270\u0260\3\2\2\2\u0270\u0268\3\2"+
		"\2\2\u0271m\3\2\2\2\u0272\u0273\b8\1\2\u0273\u0274\5r:\2\u0274\u0275\t"+
		"\3\2\2\u0275\u0276\5n8\17\u0276\u028d\3\2\2\2\u0277\u0278\5t;\2\u0278"+
		"\u0279\t\3\2\2\u0279\u027a\5n8\r\u027a\u028d\3\2\2\2\u027b\u027c\5v<\2"+
		"\u027c\u027d\7!\2\2\u027d\u027e\5n8\n\u027e\u028d\3\2\2\2\u027f\u0280"+
		"\5r:\2\u0280\u0281\t\4\2\2\u0281\u0282\5n8\b\u0282\u028d\3\2\2\2\u0283"+
		"\u0284\5t;\2\u0284\u0285\t\4\2\2\u0285\u0286\5n8\6\u0286\u028d\3\2\2\2"+
		"\u0287\u0288\7<\2\2\u0288\u0289\5n8\2\u0289\u028a\7=\2\2\u028a\u028d\3"+
		"\2\2\2\u028b\u028d\5p9\2\u028c\u0272\3\2\2\2\u028c\u0277\3\2\2\2\u028c"+
		"\u027b\3\2\2\2\u028c\u027f\3\2\2\2\u028c\u0283\3\2\2\2\u028c\u0287\3\2"+
		"\2\2\u028c\u028b\3\2\2\2\u028d\u02a5\3\2\2\2\u028e\u028f\f\f\2\2\u028f"+
		"\u0290\t\3\2\2\u0290\u02a4\5n8\r\u0291\u0292\f\5\2\2\u0292\u0293\t\4\2"+
		"\2\u0293\u02a4\5n8\6\u0294\u0295\f\20\2\2\u0295\u0296\t\3\2\2\u0296\u02a4"+
		"\5r:\2\u0297\u0298\f\16\2\2\u0298\u0299\t\3\2\2\u0299\u02a4\5t;\2\u029a"+
		"\u029b\f\13\2\2\u029b\u029c\7!\2\2\u029c\u02a4\5v<\2\u029d\u029e\f\t\2"+
		"\2\u029e\u029f\t\4\2\2\u029f\u02a4\5r:\2\u02a0\u02a1\f\7\2\2\u02a1\u02a2"+
		"\t\4\2\2\u02a2\u02a4\5t;\2\u02a3\u028e\3\2\2\2\u02a3\u0291\3\2\2\2\u02a3"+
		"\u0294\3\2\2\2\u02a3\u0297\3\2\2\2\u02a3\u029a\3\2\2\2\u02a3\u029d\3\2"+
		"\2\2\u02a3\u02a0\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6o\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ac\5\u008e"+
		"H\2\u02a9\u02ac\5<\37\2\u02aa\u02ac\5l\67\2\u02ab\u02a8\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ab\u02aa\3\2\2\2\u02acq\3\2\2\2\u02ad\u02ae\b:\1\2\u02ae"+
		"\u02af\7<\2\2\u02af\u02b0\5r:\2\u02b0\u02b1\7=\2\2\u02b1\u02b4\3\2\2\2"+
		"\u02b2\u02b4\5\u0088E\2\u02b3\u02ad\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u02bd\3\2\2\2\u02b5\u02b6\f\6\2\2\u02b6\u02b7\t\3\2\2\u02b7\u02bc\5r"+
		":\7\u02b8\u02b9\f\5\2\2\u02b9\u02ba\t\4\2\2\u02ba\u02bc\5r:\6\u02bb\u02b5"+
		"\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02bes\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\b;\1\2\u02c1"+
		"\u02c2\5r:\2\u02c2\u02c3\t\3\2\2\u02c3\u02c4\5t;\t\u02c4\u02cf\3\2\2\2"+
		"\u02c5\u02c6\5r:\2\u02c6\u02c7\t\4\2\2\u02c7\u02c8\5t;\6\u02c8\u02cf\3"+
		"\2\2\2\u02c9\u02ca\7<\2\2\u02ca\u02cb\5t;\2\u02cb\u02cc\7=\2\2\u02cc\u02cf"+
		"\3\2\2\2\u02cd\u02cf\5\u0086D\2\u02ce\u02c0\3\2\2\2\u02ce\u02c5\3\2\2"+
		"\2\u02ce\u02c9\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02de\3\2\2\2\u02d0\u02d1"+
		"\f\n\2\2\u02d1\u02d2\t\3\2\2\u02d2\u02dd\5t;\13\u02d3\u02d4\f\7\2\2\u02d4"+
		"\u02d5\t\4\2\2\u02d5\u02dd\5t;\b\u02d6\u02d7\f\b\2\2\u02d7\u02d8\t\3\2"+
		"\2\u02d8\u02dd\5r:\2\u02d9\u02da\f\5\2\2\u02da\u02db\t\4\2\2\u02db\u02dd"+
		"\5r:\2\u02dc\u02d0\3\2\2\2\u02dc\u02d3\3\2\2\2\u02dc\u02d6\3\2\2\2\u02dc"+
		"\u02d9\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02dfu\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2\b<\1\2\u02e2\u02e3"+
		"\5r:\2\u02e3\u02e4\7!\2\2\u02e4\u02e5\5v<\5\u02e5\u02e8\3\2\2\2\u02e6"+
		"\u02e8\5\u0084C\2\u02e7\u02e1\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02f1"+
		"\3\2\2\2\u02e9\u02ea\f\4\2\2\u02ea\u02eb\7\37\2\2\u02eb\u02f0\5v<\5\u02ec"+
		"\u02ed\f\6\2\2\u02ed\u02ee\7!\2\2\u02ee\u02f0\5r:\2\u02ef\u02e9\3\2\2"+
		"\2\u02ef\u02ec\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2w\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\5z>\2\u02f5\u02f6"+
		"\7\62\2\2\u02f6\u02f7\5x=\2\u02f7\u030a\3\2\2\2\u02f8\u02f9\5z>\2\u02f9"+
		"\u02fa\78\2\2\u02fa\u02fb\5x=\2\u02fb\u030a\3\2\2\2\u02fc\u02fd\5z>\2"+
		"\u02fd\u02fe\7\63\2\2\u02fe\u02ff\5x=\2\u02ff\u030a\3\2\2\2\u0300\u0301"+
		"\5z>\2\u0301\u0302\79\2\2\u0302\u0303\5x=\2\u0303\u030a\3\2\2\2\u0304"+
		"\u0305\7<\2\2\u0305\u0306\5x=\2\u0306\u0307\7=\2\2\u0307\u030a\3\2\2\2"+
		"\u0308\u030a\5z>\2\u0309\u02f4\3\2\2\2\u0309\u02f8\3\2\2\2\u0309\u02fc"+
		"\3\2\2\2\u0309\u0300\3\2\2\2\u0309\u0304\3\2\2\2\u0309\u0308\3\2\2\2\u030a"+
		"y\3\2\2\2\u030b\u030c\5|?\2\u030c\u030d\t\5\2\2\u030d\u030e\5|?\2\u030e"+
		"\u0314\3\2\2\2\u030f\u0310\5|?\2\u0310\u0311\t\6\2\2\u0311\u0312\5|?\2"+
		"\u0312\u0314\3\2\2\2\u0313\u030b\3\2\2\2\u0313\u030f\3\2\2\2\u0314{\3"+
		"\2\2\2\u0315\u031a\5> \2\u0316\u031a\5l\67\2\u0317\u031a\5\u008eH\2\u0318"+
		"\u031a\5\u0094K\2\u0319\u0315\3\2\2\2\u0319\u0316\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u0319\u0318\3\2\2\2\u031a}\3\2\2\2\u031b\u031f\5\u008eH\2\u031c"+
		"\u031f\5\u0090I\2\u031d\u031f\5\u0094K\2\u031e\u031b\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031e\u031d\3\2\2\2\u031f\177\3\2\2\2\u0320\u0321\bA\1\2\u0321"+
		"\u033b\5~@\2\u0322\u033b\5d\63\2\u0323\u033b\5f\64\2\u0324\u033b\5r:\2"+
		"\u0325\u033b\5t;\2\u0326\u033b\5v<\2\u0327\u033b\5\n\6\2\u0328\u033b\5"+
		"\b\5\2\u0329\u033b\5\\/\2\u032a\u033b\5b\62\2\u032b\u033b\5`\61\2\u032c"+
		"\u033b\5^\60\2\u032d\u033b\5Z.\2\u032e\u033b\5\60\31\2\u032f\u033b\5\u0084"+
		"C\2\u0330\u033b\5\u008aF\2\u0331\u033b\5\u0086D\2\u0332\u033b\5\u0088"+
		"E\2\u0333\u033b\5\u008cG\2\u0334\u0335\t\7\2\2\u0335\u033b\5\u0080A\f"+
		"\u0336\u0337\7<\2\2\u0337\u0338\5\u0080A\2\u0338\u0339\7=\2\2\u0339\u033b"+
		"\3\2\2\2\u033a\u0320\3\2\2\2\u033a\u0322\3\2\2\2\u033a\u0323\3\2\2\2\u033a"+
		"\u0324\3\2\2\2\u033a\u0325\3\2\2\2\u033a\u0326\3\2\2\2\u033a\u0327\3\2"+
		"\2\2\u033a\u0328\3\2\2\2\u033a\u0329\3\2\2\2\u033a\u032a\3\2\2\2\u033a"+
		"\u032b\3\2\2\2\u033a\u032c\3\2\2\2\u033a\u032d\3\2\2\2\u033a\u032e\3\2"+
		"\2\2\u033a\u032f\3\2\2\2\u033a\u0330\3\2\2\2\u033a\u0331\3\2\2\2\u033a"+
		"\u0332\3\2\2\2\u033a\u0333\3\2\2\2\u033a\u0334\3\2\2\2\u033a\u0336\3\2"+
		"\2\2\u033b\u0359\3\2\2\2\u033c\u033d\f\r\2\2\u033d\u033e\7$\2\2\u033e"+
		"\u0358\5\u0080A\16\u033f\u0340\f\13\2\2\u0340\u0341\t\3\2\2\u0341\u0358"+
		"\5\u0080A\f\u0342\u0343\f\n\2\2\u0343\u0344\t\4\2\2\u0344\u0358\5\u0080"+
		"A\13\u0345\u0346\f\t\2\2\u0346\u0347\t\b\2\2\u0347\u0358\5\u0080A\n\u0348"+
		"\u0349\f\b\2\2\u0349\u034a\7\62\2\2\u034a\u0358\5\u0080A\t\u034b\u034c"+
		"\f\7\2\2\u034c\u034d\t\t\2\2\u034d\u0358\5\u0080A\b\u034e\u034f\f\6\2"+
		"\2\u034f\u0350\t\5\2\2\u0350\u0358\5\u0080A\7\u0351\u0352\f\5\2\2\u0352"+
		"\u0353\t\6\2\2\u0353\u0358\5\u0080A\6\u0354\u0355\f\4\2\2\u0355\u0356"+
		"\t\n\2\2\u0356\u0358\5\u0080A\5\u0357\u033c\3\2\2\2\u0357\u033f\3\2\2"+
		"\2\u0357\u0342\3\2\2\2\u0357\u0345\3\2\2\2\u0357\u0348\3\2\2\2\u0357\u034b"+
		"\3\2\2\2\u0357\u034e\3\2\2\2\u0357\u0351\3\2\2\2\u0357\u0354\3\2\2\2\u0358"+
		"\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u0081\3\2"+
		"\2\2\u035b\u0359\3\2\2\2\u035c\u035d\7\27\2\2\u035d\u0083\3\2\2\2\u035e"+
		"\u035f\7\6\2\2\u035f\u0085\3\2\2\2\u0360\u0361\7G\2\2\u0361\u0087\3\2"+
		"\2\2\u0362\u0363\7F\2\2\u0363\u0089\3\2\2\2\u0364\u0365\t\13\2\2\u0365"+
		"\u008b\3\2\2\2\u0366\u0367\7B\2\2\u0367\u008d\3\2\2\2\u0368\u0369\7H\2"+
		"\2\u0369\u008f\3\2\2\2\u036a\u036b\7J\2\2\u036b\u0091\3\2\2\2\u036c\u036d"+
		"\7K\2\2\u036d\u0093\3\2\2\2\u036e\u036f\7I\2\2\u036f\u0095\3\2\2\2\u0370"+
		"\u0371\7L\2\2\u0371\u0097\3\2\2\2\u0372\u0373\bM\1\2\u0373\u0376\7\t\2"+
		"\2\u0374\u0376\5\u009cO\2\u0375\u0372\3\2\2\2\u0375\u0374\3\2\2\2\u0376"+
		"\u037d\3\2\2\2\u0377\u0378\f\6\2\2\u0378\u037c\7\t\2\2\u0379\u037a\f\5"+
		"\2\2\u037a\u037c\5\u009cO\2\u037b\u0377\3\2\2\2\u037b\u0379\3\2\2\2\u037c"+
		"\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0099\3\2"+
		"\2\2\u037f\u037d\3\2\2\2\u0380\u0381\7\22\2\2\u0381\u009b\3\2\2\2\u0382"+
		"\u0383\7\n\2\2\u0383\u009d\3\2\2\2G\u00a6\u00ae\u00bf\u00e5\u00e9\u00f2"+
		"\u0106\u010a\u0113\u011d\u0136\u013e\u0140\u014c\u0151\u0157\u015f\u0169"+
		"\u0170\u0178\u0183\u0189\u018e\u0197\u01a3\u01aa\u01c2\u01ce\u01d6\u01dc"+
		"\u01f9\u0206\u0208\u0213\u021d\u0227\u0231\u023b\u024d\u0253\u0259\u025b"+
		"\u025d\u0264\u026c\u0270\u028c\u02a3\u02a5\u02ab\u02b3\u02bb\u02bd\u02ce"+
		"\u02dc\u02de\u02e7\u02ef\u02f1\u0309\u0313\u0319\u031e\u033a\u0357\u0359"+
		"\u0375\u037b\u037d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}