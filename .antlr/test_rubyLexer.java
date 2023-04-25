// Generated from d:\school\github\scripts_util\test_ruby.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class test_rubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STRING_LITERAL_START=3, STRING_LITERAL_END=4, STRING_LITERAL_CONTENT=5, 
		ESCAPE_SEQUENCE=6, LITERAL=7, EXPRESSION_SUBSTITUTION_START=8, EXPRESSION_SUBSTITUTION_END=9, 
		COMMA=10, ELLIPSIS=11, SEMICOLON=12, CRLF=13, REQUIRE=14, BEGIN=15, END=16, 
		DEF=17, RETURN=18, PIR=19, IF=20, ELSE=21, ELSIF=22, UNLESS=23, WHILE=24, 
		RETRY=25, BREAK=26, FOR=27, THEN=28, IN=29, UNTIL=30, DO=31, RAISE=32, 
		TRUE=33, FALSE=34, RESCUE=35, ENSURE=36, PLUS=37, MINUS=38, MUL=39, DIV=40, 
		MOD=41, EXP=42, EQUAL=43, NOT_EQUAL=44, GREATER=45, LESS=46, LESS_EQUAL=47, 
		GREATER_EQUAL=48, ASSIGN=49, PLUS_ASSIGN=50, MINUS_ASSIGN=51, MUL_ASSIGN=52, 
		DIV_ASSIGN=53, MOD_ASSIGN=54, EXP_ASSIGN=55, BIT_AND=56, BIT_OR=57, BIT_XOR=58, 
		BIT_NOT=59, BIT_SHL=60, BIT_SHR=61, AND=62, OR=63, NOT=64, HASH_OP=65, 
		LEFT_RBRACKET=66, RIGHT_RBRACKET=67, LEFT_SBRACKET=68, RIGHT_SBRACKET=69, 
		LEFT_BBRACKET=70, REFT_BBRACKET=71, NIL=72, SL_COMMENT=73, ML_COMMENT=74, 
		WS=75, INT=76, FLOAT=77, ID=78, CONST_ID=79, ID_GLOBAL=80, ID_INSTANCE=81, 
		ID_FUNCTION=82, DOT=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ESCAPED_QUOTE", "STRING_LITERAL_START", "STRING_LITERAL_END", 
			"STRING_LITERAL_CONTENT", "ESCAPE_SEQUENCE", "LITERAL", "EXPRESSION_SUBSTITUTION_START", 
			"EXPRESSION_SUBSTITUTION_END", "COMMA", "ELLIPSIS", "SEMICOLON", "CRLF", 
			"REQUIRE", "BEGIN", "END", "DEF", "RETURN", "PIR", "IF", "ELSE", "ELSIF", 
			"UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "THEN", "IN", "UNTIL", "DO", 
			"RAISE", "TRUE", "FALSE", "RESCUE", "ENSURE", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "HASH_OP", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "LEFT_BBRACKET", 
			"REFT_BBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
			"ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", "ID_FUNCTION", "DOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'module'", null, null, null, null, null, null, null, 
			"','", "'..'", "';'", null, "'require'", "'begin'", "'end'", "'def'", 
			"'return'", "'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", 
			"'retry'", "'break'", "'for'", "'then'", "'in'", "'until'", "'do'", "'raise'", 
			"'true'", "'false'", "'rescue'", "'ensure'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", 
			"'<<'", "'>>'", null, null, null, "'=>'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'nil'", null, null, null, null, null, null, null, null, 
			null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "STRING_LITERAL_START", "STRING_LITERAL_END", "STRING_LITERAL_CONTENT", 
			"ESCAPE_SEQUENCE", "LITERAL", "EXPRESSION_SUBSTITUTION_START", "EXPRESSION_SUBSTITUTION_END", 
			"COMMA", "ELLIPSIS", "SEMICOLON", "CRLF", "REQUIRE", "BEGIN", "END", 
			"DEF", "RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
			"BREAK", "FOR", "THEN", "IN", "UNTIL", "DO", "RAISE", "TRUE", "FALSE", 
			"RESCUE", "ENSURE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", 
			"NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
			"AND", "OR", "NOT", "HASH_OP", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
			"RIGHT_SBRACKET", "LEFT_BBRACKET", "REFT_BBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", 
			"ID_FUNCTION", "DOT"
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


	public test_rubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test_ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u0227\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\6\7\u00c1\n\7\r\7\16\7\u00c2\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t\3\t\3\t\3\t\7\t\u00d4\n\t\f"+
		"\t\16\t\u00d7\13\t\3\t\5\t\u00da\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\5\17\u00e9\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@"+
		"\3@\3@\3@\3@\5@\u01ae\n@\3A\3A\3A\3A\5A\u01b4\nA\3B\3B\3B\3B\5B\u01ba"+
		"\nB\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3J\3K\3K\7K"+
		"\u01d1\nK\fK\16K\u01d4\13K\3K\5K\u01d7\nK\3K\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\7L\u01e5\nL\fL\16L\u01e8\13L\3L\3L\3L\3L\3L\3L\5L\u01f0\nL\3L"+
		"\3L\3L\3L\3M\6M\u01f7\nM\rM\16M\u01f8\3M\3M\3N\6N\u01fe\nN\rN\16N\u01ff"+
		"\3O\7O\u0203\nO\fO\16O\u0206\13O\3O\3O\6O\u020a\nO\rO\16O\u020b\3P\3P"+
		"\7P\u0210\nP\fP\16P\u0213\13P\3Q\7Q\u0216\nQ\fQ\16Q\u0219\13Q\3Q\3Q\3"+
		"R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\5\u00cc\u00d5\u01e6\2V\3\3\5\4\7\2\t\5"+
		"\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23"+
		"\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I"+
		"%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}"+
		"?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I"+
		"\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5"+
		"S\u00a7T\u00a9U\3\2\13\4\2$$))\6\2\f\f\17\17$$^^\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2C\\\3\2AA\2\u0239\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab"+
		"\3\2\2\2\5\u00b1\3\2\2\2\7\u00b8\3\2\2\2\t\u00bb\3\2\2\2\13\u00bd\3\2"+
		"\2\2\r\u00c0\3\2\2\2\17\u00c4\3\2\2\2\21\u00d9\3\2\2\2\23\u00db\3\2\2"+
		"\2\25\u00de\3\2\2\2\27\u00e0\3\2\2\2\31\u00e2\3\2\2\2\33\u00e5\3\2\2\2"+
		"\35\u00e8\3\2\2\2\37\u00ec\3\2\2\2!\u00f4\3\2\2\2#\u00fa\3\2\2\2%\u00fe"+
		"\3\2\2\2\'\u0102\3\2\2\2)\u0109\3\2\2\2+\u010d\3\2\2\2-\u0110\3\2\2\2"+
		"/\u0115\3\2\2\2\61\u011b\3\2\2\2\63\u0122\3\2\2\2\65\u0128\3\2\2\2\67"+
		"\u012e\3\2\2\29\u0134\3\2\2\2;\u0138\3\2\2\2=\u013d\3\2\2\2?\u0140\3\2"+
		"\2\2A\u0146\3\2\2\2C\u0149\3\2\2\2E\u014f\3\2\2\2G\u0154\3\2\2\2I\u015a"+
		"\3\2\2\2K\u0161\3\2\2\2M\u0168\3\2\2\2O\u016a\3\2\2\2Q\u016c\3\2\2\2S"+
		"\u016e\3\2\2\2U\u0170\3\2\2\2W\u0172\3\2\2\2Y\u0175\3\2\2\2[\u0178\3\2"+
		"\2\2]\u017b\3\2\2\2_\u017d\3\2\2\2a\u017f\3\2\2\2c\u0182\3\2\2\2e\u0185"+
		"\3\2\2\2g\u0187\3\2\2\2i\u018a\3\2\2\2k\u018d\3\2\2\2m\u0190\3\2\2\2o"+
		"\u0193\3\2\2\2q\u0196\3\2\2\2s\u019a\3\2\2\2u\u019c\3\2\2\2w\u019e\3\2"+
		"\2\2y\u01a0\3\2\2\2{\u01a2\3\2\2\2}\u01a5\3\2\2\2\177\u01ad\3\2\2\2\u0081"+
		"\u01b3\3\2\2\2\u0083\u01b9\3\2\2\2\u0085\u01bb\3\2\2\2\u0087\u01be\3\2"+
		"\2\2\u0089\u01c0\3\2\2\2\u008b\u01c2\3\2\2\2\u008d\u01c4\3\2\2\2\u008f"+
		"\u01c6\3\2\2\2\u0091\u01c8\3\2\2\2\u0093\u01ca\3\2\2\2\u0095\u01ce\3\2"+
		"\2\2\u0097\u01dc\3\2\2\2\u0099\u01f6\3\2\2\2\u009b\u01fd\3\2\2\2\u009d"+
		"\u0204\3\2\2\2\u009f\u020d\3\2\2\2\u00a1\u0217\3\2\2\2\u00a3\u021c\3\2"+
		"\2\2\u00a5\u021f\3\2\2\2\u00a7\u0222\3\2\2\2\u00a9\u0225\3\2\2\2\u00ab"+
		"\u00ac\7e\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7u\2\2"+
		"\u00af\u00b0\7u\2\2\u00b0\4\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7q"+
		"\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\6\3\2\2\2\u00b8\u00b9\7^\2\2\u00b9\u00ba\7$\2\2\u00ba\b"+
		"\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\n\3\2\2\2\u00bd\u00be\t\2\2\2\u00be"+
		"\f\3\2\2\2\u00bf\u00c1\n\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\16\3\2\2\2\u00c4\u00c5"+
		"\7^\2\2\u00c5\u00c6\13\2\2\2\u00c6\20\3\2\2\2\u00c7\u00cc\7$\2\2\u00c8"+
		"\u00cb\5\7\4\2\u00c9\u00cb\n\4\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00da\7$\2\2\u00d0\u00d5\7)\2"+
		"\2\u00d1\u00d4\5\7\4\2\u00d2\u00d4\n\4\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7)\2\2\u00d9\u00c7\3\2"+
		"\2\2\u00d9\u00d0\3\2\2\2\u00da\22\3\2\2\2\u00db\u00dc\7%\2\2\u00dc\u00dd"+
		"\5\u008fH\2\u00dd\24\3\2\2\2\u00de\u00df\5\u0091I\2\u00df\26\3\2\2\2\u00e0"+
		"\u00e1\7.\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7\60\2"+
		"\2\u00e4\32\3\2\2\2\u00e5\u00e6\7=\2\2\u00e6\34\3\2\2\2\u00e7\u00e9\7"+
		"\17\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\7\f\2\2\u00eb\36\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7s\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7g\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\"\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"$\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7h\2\2\u0101"+
		"&\3\2\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105\7v\2\2\u0105"+
		"\u0106\7w\2\2\u0106\u0107\7t\2\2\u0107\u0108\7p\2\2\u0108(\3\2\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7k\2\2\u010b\u010c\7t\2\2\u010c*\3\2\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7h\2\2\u010f,\3\2\2\2\u0110\u0111\7g\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114.\3\2\2\2\u0115"+
		"\u0116\7g\2\2\u0116\u0117\7n\2\2\u0117\u0118\7u\2\2\u0118\u0119\7k\2\2"+
		"\u0119\u011a\7h\2\2\u011a\60\3\2\2\2\u011b\u011c\7w\2\2\u011c\u011d\7"+
		"p\2\2\u011d\u011e\7n\2\2\u011e\u011f\7g\2\2\u011f\u0120\7u\2\2\u0120\u0121"+
		"\7u\2\2\u0121\62\3\2\2\2\u0122\u0123\7y\2\2\u0123\u0124\7j\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127\64\3\2\2\2\u0128\u0129"+
		"\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c"+
		"\u012d\7{\2\2\u012d\66\3\2\2\2\u012e\u012f\7d\2\2\u012f\u0130\7t\2\2\u0130"+
		"\u0131\7g\2\2\u0131\u0132\7c\2\2\u0132\u0133\7m\2\2\u01338\3\2\2\2\u0134"+
		"\u0135\7h\2\2\u0135\u0136\7q\2\2\u0136\u0137\7t\2\2\u0137:\3\2\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7j\2\2\u013a\u013b\7g\2\2\u013b\u013c\7p\2\2"+
		"\u013c<\3\2\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f>\3\2\2\2\u0140"+
		"\u0141\7w\2\2\u0141\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143\u0144\7k\2\2"+
		"\u0144\u0145\7n\2\2\u0145@\3\2\2\2\u0146\u0147\7f\2\2\u0147\u0148\7q\2"+
		"\2\u0148B\3\2\2\2\u0149\u014a\7t\2\2\u014a\u014b\7c\2\2\u014b\u014c\7"+
		"k\2\2\u014c\u014d\7u\2\2\u014d\u014e\7g\2\2\u014eD\3\2\2\2\u014f\u0150"+
		"\7v\2\2\u0150\u0151\7t\2\2\u0151\u0152\7w\2\2\u0152\u0153\7g\2\2\u0153"+
		"F\3\2\2\2\u0154\u0155\7h\2\2\u0155\u0156\7c\2\2\u0156\u0157\7n\2\2\u0157"+
		"\u0158\7u\2\2\u0158\u0159\7g\2\2\u0159H\3\2\2\2\u015a\u015b\7t\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7u\2\2\u015d\u015e\7e\2\2\u015e\u015f\7w\2\2"+
		"\u015f\u0160\7g\2\2\u0160J\3\2\2\2\u0161\u0162\7g\2\2\u0162\u0163\7p\2"+
		"\2\u0163\u0164\7u\2\2\u0164\u0165\7w\2\2\u0165\u0166\7t\2\2\u0166\u0167"+
		"\7g\2\2\u0167L\3\2\2\2\u0168\u0169\7-\2\2\u0169N\3\2\2\2\u016a\u016b\7"+
		"/\2\2\u016bP\3\2\2\2\u016c\u016d\7,\2\2\u016dR\3\2\2\2\u016e\u016f\7\61"+
		"\2\2\u016fT\3\2\2\2\u0170\u0171\7\'\2\2\u0171V\3\2\2\2\u0172\u0173\7,"+
		"\2\2\u0173\u0174\7,\2\2\u0174X\3\2\2\2\u0175\u0176\7?\2\2\u0176\u0177"+
		"\7?\2\2\u0177Z\3\2\2\2\u0178\u0179\7#\2\2\u0179\u017a\7?\2\2\u017a\\\3"+
		"\2\2\2\u017b\u017c\7@\2\2\u017c^\3\2\2\2\u017d\u017e\7>\2\2\u017e`\3\2"+
		"\2\2\u017f\u0180\7>\2\2\u0180\u0181\7?\2\2\u0181b\3\2\2\2\u0182\u0183"+
		"\7@\2\2\u0183\u0184\7?\2\2\u0184d\3\2\2\2\u0185\u0186\7?\2\2\u0186f\3"+
		"\2\2\2\u0187\u0188\7-\2\2\u0188\u0189\7?\2\2\u0189h\3\2\2\2\u018a\u018b"+
		"\7/\2\2\u018b\u018c\7?\2\2\u018cj\3\2\2\2\u018d\u018e\7,\2\2\u018e\u018f"+
		"\7?\2\2\u018fl\3\2\2\2\u0190\u0191\7\61\2\2\u0191\u0192\7?\2\2\u0192n"+
		"\3\2\2\2\u0193\u0194\7\'\2\2\u0194\u0195\7?\2\2\u0195p\3\2\2\2\u0196\u0197"+
		"\7,\2\2\u0197\u0198\7,\2\2\u0198\u0199\7?\2\2\u0199r\3\2\2\2\u019a\u019b"+
		"\7(\2\2\u019bt\3\2\2\2\u019c\u019d\7~\2\2\u019dv\3\2\2\2\u019e\u019f\7"+
		"`\2\2\u019fx\3\2\2\2\u01a0\u01a1\7\u0080\2\2\u01a1z\3\2\2\2\u01a2\u01a3"+
		"\7>\2\2\u01a3\u01a4\7>\2\2\u01a4|\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6\u01a7"+
		"\7@\2\2\u01a7~\3\2\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ae"+
		"\7f\2\2\u01ab\u01ac\7(\2\2\u01ac\u01ae\7(\2\2\u01ad\u01a8\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u0080\3\2\2\2\u01af\u01b0\7q\2\2\u01b0\u01b4\7t\2"+
		"\2\u01b1\u01b2\7~\2\2\u01b2\u01b4\7~\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u0082\3\2\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01ba\7v\2\2\u01b8\u01ba\7#\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b8\3\2\2"+
		"\2\u01ba\u0084\3\2\2\2\u01bb\u01bc\7?\2\2\u01bc\u01bd\7@\2\2\u01bd\u0086"+
		"\3\2\2\2\u01be\u01bf\7*\2\2\u01bf\u0088\3\2\2\2\u01c0\u01c1\7+\2\2\u01c1"+
		"\u008a\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3\u008c\3\2\2\2\u01c4\u01c5\7_\2"+
		"\2\u01c5\u008e\3\2\2\2\u01c6\u01c7\7}\2\2\u01c7\u0090\3\2\2\2\u01c8\u01c9"+
		"\7\177\2\2\u01c9\u0092\3\2\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc\7k\2\2\u01cc"+
		"\u01cd\7n\2\2\u01cd\u0094\3\2\2\2\u01ce\u01d2\7%\2\2\u01cf\u01d1\n\4\2"+
		"\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\7\17\2\2"+
		"\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\7\f\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\bK\2\2\u01db\u0096\3\2\2\2\u01dc"+
		"\u01dd\7?\2\2\u01dd\u01de\7d\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7i\2\2"+
		"\u01e0\u01e1\7k\2\2\u01e1\u01e2\7p\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5"+
		"\13\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e7\3\2\2\2"+
		"\u01e6\u01e4\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea"+
		"\7?\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7p\2\2\u01ec\u01ed\7f\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01f0\7\17\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\7\f\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\bL\2\2\u01f4\u0098\3\2\2\2\u01f5\u01f7\t\5\2\2\u01f6\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\bM\2\2\u01fb\u009a\3\2\2\2\u01fc\u01fe\t\6"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u009c\3\2\2\2\u0201\u0203\t\6\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\7\60\2\2\u0208\u020a\t"+
		"\6\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u009e\3\2\2\2\u020d\u0211\t\7\2\2\u020e\u0210\t\b"+
		"\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u00a0\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\t\t"+
		"\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\5\u009f"+
		"P\2\u021b\u00a2\3\2\2\2\u021c\u021d\7&\2\2\u021d\u021e\5\u009fP\2\u021e"+
		"\u00a4\3\2\2\2\u021f\u0220\7B\2\2\u0220\u0221\5\u009fP\2\u0221\u00a6\3"+
		"\2\2\2\u0222\u0223\5\u009fP\2\u0223\u0224\t\n\2\2\u0224\u00a8\3\2\2\2"+
		"\u0225\u0226\7\60\2\2\u0226\u00aa\3\2\2\2\27\2\u00c2\u00ca\u00cc\u00d3"+
		"\u00d5\u00d9\u00e8\u01ad\u01b3\u01b9\u01d2\u01d6\u01e6\u01ef\u01f8\u01ff"+
		"\u0204\u020b\u0211\u0217\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}