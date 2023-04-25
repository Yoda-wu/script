// Generated from d:\school\github\scripts_util\ruby.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rubyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ESCAPED_QUOTE", "LITERAL", "COMMA", "ELLIPSIS", 
			"SEMICOLON", "CRLF", "REQUIRE", "BEGIN", "END", "DEF", "RETURN", "PIR", 
			"IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "THEN", 
			"IN", "UNTIL", "DO", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "HASH_OP", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "LEFT_BBRACKET", 
			"REFT_BBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
			"ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", "ID_FUNCTION"
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


	public rubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ruby.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u01f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00af\n\6\f\6\16\6\u00b2\13\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00b8\n\6\f\6\16\6\u00bb\13\6\3\6\5\6\u00be\n\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u00c8\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\58\u0179\n8\39\39\3"+
		"9\39\59\u017f\n9\3:\3:\3:\3:\5:\u0185\n:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3C\3C\7C\u019c\nC\fC\16C\u019f\13C\3C\5C"+
		"\u01a2\nC\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\7D\u01b0\nD\fD\16D\u01b3"+
		"\13D\3D\3D\3D\3D\3D\3D\5D\u01bb\nD\3D\3D\3D\3D\3E\6E\u01c2\nE\rE\16E\u01c3"+
		"\3E\3E\3F\6F\u01c9\nF\rF\16F\u01ca\3G\7G\u01ce\nG\fG\16G\u01d1\13G\3G"+
		"\3G\6G\u01d5\nG\rG\16G\u01d6\3H\3H\7H\u01db\nH\fH\16H\u01de\13H\3I\7I"+
		"\u01e1\nI\fI\16I\u01e4\13I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\5\u00b0\u00b9"+
		"\u01b1\2M\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16"+
		"\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\34"+
		"9\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65"+
		"k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008b"+
		"F\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\3\2\t\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2C\\\3\2AA\2\u0201\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
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
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099"+
		"\3\2\2\2\5\u009f\3\2\2\2\7\u00a6\3\2\2\2\t\u00a8\3\2\2\2\13\u00bd\3\2"+
		"\2\2\r\u00bf\3\2\2\2\17\u00c1\3\2\2\2\21\u00c4\3\2\2\2\23\u00c7\3\2\2"+
		"\2\25\u00cb\3\2\2\2\27\u00d3\3\2\2\2\31\u00d9\3\2\2\2\33\u00dd\3\2\2\2"+
		"\35\u00e1\3\2\2\2\37\u00e8\3\2\2\2!\u00ec\3\2\2\2#\u00ef\3\2\2\2%\u00f4"+
		"\3\2\2\2\'\u00fa\3\2\2\2)\u0101\3\2\2\2+\u0107\3\2\2\2-\u010d\3\2\2\2"+
		"/\u0113\3\2\2\2\61\u0117\3\2\2\2\63\u011c\3\2\2\2\65\u011f\3\2\2\2\67"+
		"\u0125\3\2\2\29\u0128\3\2\2\2;\u012d\3\2\2\2=\u0133\3\2\2\2?\u0135\3\2"+
		"\2\2A\u0137\3\2\2\2C\u0139\3\2\2\2E\u013b\3\2\2\2G\u013d\3\2\2\2I\u0140"+
		"\3\2\2\2K\u0143\3\2\2\2M\u0146\3\2\2\2O\u0148\3\2\2\2Q\u014a\3\2\2\2S"+
		"\u014d\3\2\2\2U\u0150\3\2\2\2W\u0152\3\2\2\2Y\u0155\3\2\2\2[\u0158\3\2"+
		"\2\2]\u015b\3\2\2\2_\u015e\3\2\2\2a\u0161\3\2\2\2c\u0165\3\2\2\2e\u0167"+
		"\3\2\2\2g\u0169\3\2\2\2i\u016b\3\2\2\2k\u016d\3\2\2\2m\u0170\3\2\2\2o"+
		"\u0178\3\2\2\2q\u017e\3\2\2\2s\u0184\3\2\2\2u\u0186\3\2\2\2w\u0189\3\2"+
		"\2\2y\u018b\3\2\2\2{\u018d\3\2\2\2}\u018f\3\2\2\2\177\u0191\3\2\2\2\u0081"+
		"\u0193\3\2\2\2\u0083\u0195\3\2\2\2\u0085\u0199\3\2\2\2\u0087\u01a7\3\2"+
		"\2\2\u0089\u01c1\3\2\2\2\u008b\u01c8\3\2\2\2\u008d\u01cf\3\2\2\2\u008f"+
		"\u01d8\3\2\2\2\u0091\u01e2\3\2\2\2\u0093\u01e7\3\2\2\2\u0095\u01ea\3\2"+
		"\2\2\u0097\u01ed\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7n\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7u\2\2\u009d\u009e\7u\2\2\u009e\4\3\2\2\2\u009f\u00a0"+
		"\7o\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7w\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\6\3\2\2\2\u00a6\u00a7\7\60\2\2"+
		"\u00a7\b\3\2\2\2\u00a8\u00a9\7^\2\2\u00a9\u00aa\7$\2\2\u00aa\n\3\2\2\2"+
		"\u00ab\u00b0\7$\2\2\u00ac\u00af\5\t\5\2\u00ad\u00af\n\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00be\7$"+
		"\2\2\u00b4\u00b9\7)\2\2\u00b5\u00b8\5\t\5\2\u00b6\u00b8\n\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\7)\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00b4\3\2\2\2\u00be\f\3\2\2\2"+
		"\u00bf\u00c0\7.\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3"+
		"\7\60\2\2\u00c3\20\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\22\3\2\2\2\u00c6\u00c8"+
		"\7\17\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00ca\7\f\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7"+
		"g\2\2\u00cd\u00ce\7s\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"\30\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc"+
		"\32\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"\34\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2\u00e7\36\3\2\2\2\u00e8"+
		"\u00e9\7r\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7t\2\2\u00eb \3\2\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7h\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3$\3\2\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7k\2\2"+
		"\u00f8\u00f9\7h\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7p\2"+
		"\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100"+
		"\7u\2\2\u0100(\3\2\2\2\u0101\u0102\7y\2\2\u0102\u0103\7j\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7n\2\2\u0105\u0106\7g\2\2\u0106*\3\2\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b"+
		"\u010c\7{\2\2\u010c,\3\2\2\2\u010d\u010e\7d\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7c\2\2\u0111\u0112\7m\2\2\u0112.\3\2\2\2\u0113"+
		"\u0114\7h\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116\60\3\2\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7j\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2"+
		"\u011b\62\3\2\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\64\3\2\2"+
		"\2\u011f\u0120\7w\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7n\2\2\u0124\66\3\2\2\2\u0125\u0126\7f\2\2\u0126\u0127"+
		"\7q\2\2\u01278\3\2\2\2\u0128\u0129\7v\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7w\2\2\u012b\u012c\7g\2\2\u012c:\3\2\2\2\u012d\u012e\7h\2\2\u012e\u012f"+
		"\7c\2\2\u012f\u0130\7n\2\2\u0130\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132"+
		"<\3\2\2\2\u0133\u0134\7-\2\2\u0134>\3\2\2\2\u0135\u0136\7/\2\2\u0136@"+
		"\3\2\2\2\u0137\u0138\7,\2\2\u0138B\3\2\2\2\u0139\u013a\7\61\2\2\u013a"+
		"D\3\2\2\2\u013b\u013c\7\'\2\2\u013cF\3\2\2\2\u013d\u013e\7,\2\2\u013e"+
		"\u013f\7,\2\2\u013fH\3\2\2\2\u0140\u0141\7?\2\2\u0141\u0142\7?\2\2\u0142"+
		"J\3\2\2\2\u0143\u0144\7#\2\2\u0144\u0145\7?\2\2\u0145L\3\2\2\2\u0146\u0147"+
		"\7@\2\2\u0147N\3\2\2\2\u0148\u0149\7>\2\2\u0149P\3\2\2\2\u014a\u014b\7"+
		">\2\2\u014b\u014c\7?\2\2\u014cR\3\2\2\2\u014d\u014e\7@\2\2\u014e\u014f"+
		"\7?\2\2\u014fT\3\2\2\2\u0150\u0151\7?\2\2\u0151V\3\2\2\2\u0152\u0153\7"+
		"-\2\2\u0153\u0154\7?\2\2\u0154X\3\2\2\2\u0155\u0156\7/\2\2\u0156\u0157"+
		"\7?\2\2\u0157Z\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7?\2\2\u015a\\\3"+
		"\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7?\2\2\u015d^\3\2\2\2\u015e\u015f"+
		"\7\'\2\2\u015f\u0160\7?\2\2\u0160`\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163"+
		"\7,\2\2\u0163\u0164\7?\2\2\u0164b\3\2\2\2\u0165\u0166\7(\2\2\u0166d\3"+
		"\2\2\2\u0167\u0168\7~\2\2\u0168f\3\2\2\2\u0169\u016a\7`\2\2\u016ah\3\2"+
		"\2\2\u016b\u016c\7\u0080\2\2\u016cj\3\2\2\2\u016d\u016e\7>\2\2\u016e\u016f"+
		"\7>\2\2\u016fl\3\2\2\2\u0170\u0171\7@\2\2\u0171\u0172\7@\2\2\u0172n\3"+
		"\2\2\2\u0173\u0174\7c\2\2\u0174\u0175\7p\2\2\u0175\u0179\7f\2\2\u0176"+
		"\u0177\7(\2\2\u0177\u0179\7(\2\2\u0178\u0173\3\2\2\2\u0178\u0176\3\2\2"+
		"\2\u0179p\3\2\2\2\u017a\u017b\7q\2\2\u017b\u017f\7t\2\2\u017c\u017d\7"+
		"~\2\2\u017d\u017f\7~\2\2\u017e\u017a\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"r\3\2\2\2\u0180\u0181\7p\2\2\u0181\u0182\7q\2\2\u0182\u0185\7v\2\2\u0183"+
		"\u0185\7#\2\2\u0184\u0180\3\2\2\2\u0184\u0183\3\2\2\2\u0185t\3\2\2\2\u0186"+
		"\u0187\7?\2\2\u0187\u0188\7@\2\2\u0188v\3\2\2\2\u0189\u018a\7*\2\2\u018a"+
		"x\3\2\2\2\u018b\u018c\7+\2\2\u018cz\3\2\2\2\u018d\u018e\7]\2\2\u018e|"+
		"\3\2\2\2\u018f\u0190\7_\2\2\u0190~\3\2\2\2\u0191\u0192\7}\2\2\u0192\u0080"+
		"\3\2\2\2\u0193\u0194\7\177\2\2\u0194\u0082\3\2\2\2\u0195\u0196\7p\2\2"+
		"\u0196\u0197\7k\2\2\u0197\u0198\7n\2\2\u0198\u0084\3\2\2\2\u0199\u019d"+
		"\7%\2\2\u019a\u019c\n\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a2\7\17\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\7\f\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\bC"+
		"\2\2\u01a6\u0086\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7d\2\2\u01a9\u01aa"+
		"\7g\2\2\u01aa\u01ab\7i\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2\2\u01ad"+
		"\u01b1\3\2\2\2\u01ae\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b5\7?\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7p\2"+
		"\2\u01b7\u01b8\7f\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\7\17\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\f\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\bD\2\2\u01bf\u0088\3\2\2\2\u01c0\u01c2\t\3"+
		"\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\bE\2\2\u01c6\u008a\3\2"+
		"\2\2\u01c7\u01c9\t\4\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u008c\3\2\2\2\u01cc\u01ce\t\4"+
		"\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\7\60"+
		"\2\2\u01d3\u01d5\t\4\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u008e\3\2\2\2\u01d8\u01dc\t\5"+
		"\2\2\u01d9\u01db\t\6\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u0090\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01df\u01e1\t\7\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01e6\5\u008fH\2\u01e6\u0092\3\2\2\2\u01e7\u01e8\7&\2\2\u01e8"+
		"\u01e9\5\u008fH\2\u01e9\u0094\3\2\2\2\u01ea\u01eb\7B\2\2\u01eb\u01ec\5"+
		"\u008fH\2\u01ec\u0096\3\2\2\2\u01ed\u01ee\5\u008fH\2\u01ee\u01ef\t\b\2"+
		"\2\u01ef\u0098\3\2\2\2\26\2\u00ae\u00b0\u00b7\u00b9\u00bd\u00c7\u0178"+
		"\u017e\u0184\u019d\u01a1\u01b1\u01ba\u01c3\u01ca\u01cf\u01d6\u01dc\u01e2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}