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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ESCAPED_QUOTE", "LITERAL", "COMMA", 
			"ELLIPSIS", "SEMICOLON", "CRLF", "REQUIRE", "BEGIN", "END", "DEF", "RETURN", 
			"PIR", "RAISE", "ENSURE", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
			"BREAK", "FOR", "THEN", "IN", "DO", "RESCUE", "TRUE", "FALSE", "YIELD", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", 
			"LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", 
			"BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "HASH_OP", 
			"LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
			"LEFT_BBRACKET", "RIGHT_BBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", 
			"WS", "INT", "FLOAT", "ID", "CONST_ID", "ID_GLOBAL", "ID_INSTANCE", "ID_FUNCTION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\7\3\7\3\7\3\7\7\7\u00c3\n\7\f\7"+
		"\16\7\u00c6\13\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\5"+
		"\13\u00d3\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;"+
		"\3;\3;\3<\3<\3<\3<\3<\5<\u0198\n<\3=\3=\3=\3=\5=\u019e\n=\3>\3>\3>\3>"+
		"\5>\u01a4\n>\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F"+
		"\3G\3G\7G\u01bb\nG\fG\16G\u01be\13G\3G\5G\u01c1\nG\3G\3G\3G\3G\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\7H\u01cf\nH\fH\16H\u01d2\13H\3H\3H\3H\3H\3H\3H\5H\u01da"+
		"\nH\3H\3H\3H\3H\3I\6I\u01e1\nI\rI\16I\u01e2\3I\3I\3J\6J\u01e8\nJ\rJ\16"+
		"J\u01e9\3K\7K\u01ed\nK\fK\16K\u01f0\13K\3K\3K\6K\u01f4\nK\rK\16K\u01f5"+
		"\3L\3L\7L\u01fa\nL\fL\16L\u01fd\13L\3M\7M\u0200\nM\fM\16M\u0203\13M\3"+
		"M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\5\u00bb\u00c4\u01d0\2Q\3\3\5\4\7\5\t\6"+
		"\13\2\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23"+
		"\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I"+
		"%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}"+
		"?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I"+
		"\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\3\2\t\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2C\\\3\2AA\2\u0220"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1"+
		"\3\2\2\2\5\u00a7\3\2\2\2\7\u00ae\3\2\2\2\t\u00b0\3\2\2\2\13\u00b3\3\2"+
		"\2\2\r\u00c8\3\2\2\2\17\u00ca\3\2\2\2\21\u00cc\3\2\2\2\23\u00cf\3\2\2"+
		"\2\25\u00d2\3\2\2\2\27\u00d6\3\2\2\2\31\u00de\3\2\2\2\33\u00e4\3\2\2\2"+
		"\35\u00e8\3\2\2\2\37\u00ec\3\2\2\2!\u00f3\3\2\2\2#\u00f7\3\2\2\2%\u00fd"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0107\3\2\2\2+\u010c\3\2\2\2-\u0112\3\2\2\2"+
		"/\u0119\3\2\2\2\61\u011f\3\2\2\2\63\u0125\3\2\2\2\65\u012b\3\2\2\2\67"+
		"\u012f\3\2\2\29\u0134\3\2\2\2;\u0137\3\2\2\2=\u013a\3\2\2\2?\u0141\3\2"+
		"\2\2A\u0146\3\2\2\2C\u014c\3\2\2\2E\u0152\3\2\2\2G\u0154\3\2\2\2I\u0156"+
		"\3\2\2\2K\u0158\3\2\2\2M\u015a\3\2\2\2O\u015c\3\2\2\2Q\u015f\3\2\2\2S"+
		"\u0162\3\2\2\2U\u0165\3\2\2\2W\u0167\3\2\2\2Y\u0169\3\2\2\2[\u016c\3\2"+
		"\2\2]\u016f\3\2\2\2_\u0171\3\2\2\2a\u0174\3\2\2\2c\u0177\3\2\2\2e\u017a"+
		"\3\2\2\2g\u017d\3\2\2\2i\u0180\3\2\2\2k\u0184\3\2\2\2m\u0186\3\2\2\2o"+
		"\u0188\3\2\2\2q\u018a\3\2\2\2s\u018c\3\2\2\2u\u018f\3\2\2\2w\u0197\3\2"+
		"\2\2y\u019d\3\2\2\2{\u01a3\3\2\2\2}\u01a5\3\2\2\2\177\u01a8\3\2\2\2\u0081"+
		"\u01aa\3\2\2\2\u0083\u01ac\3\2\2\2\u0085\u01ae\3\2\2\2\u0087\u01b0\3\2"+
		"\2\2\u0089\u01b2\3\2\2\2\u008b\u01b4\3\2\2\2\u008d\u01b8\3\2\2\2\u008f"+
		"\u01c6\3\2\2\2\u0091\u01e0\3\2\2\2\u0093\u01e7\3\2\2\2\u0095\u01ee\3\2"+
		"\2\2\u0097\u01f7\3\2\2\2\u0099\u0201\3\2\2\2\u009b\u0206\3\2\2\2\u009d"+
		"\u0209\3\2\2\2\u009f\u020c\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7n\2"+
		"\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7u\2\2\u00a6\4\3"+
		"\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7f\2\2\u00aa"+
		"\u00ab\7w\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\6\3\2\2\2\u00ae"+
		"\u00af\7\60\2\2\u00af\b\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\u00b2\7<\2\2"+
		"\u00b2\n\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\7$\2\2\u00b5\f\3\2\2\2"+
		"\u00b6\u00bb\7$\2\2\u00b7\u00ba\5\13\6\2\u00b8\u00ba\n\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c9\7$"+
		"\2\2\u00bf\u00c4\7)\2\2\u00c0\u00c3\5\13\6\2\u00c1\u00c3\n\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c9\7)\2\2\u00c8\u00b6\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c9\16\3\2\2\2"+
		"\u00ca\u00cb\7.\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce"+
		"\7\60\2\2\u00ce\22\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0\24\3\2\2\2\u00d1\u00d3"+
		"\7\17\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\7\f\2\2\u00d5\26\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7"+
		"g\2\2\u00d8\u00d9\7s\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\30\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7i\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\32\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7f\2\2\u00e7"+
		"\34\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7h\2\2\u00eb"+
		"\36\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\u00f0\7w\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7p\2\2\u00f2 \3\2\2\2\u00f3"+
		"\u00f4\7r\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7t\2\2\u00f6\"\3\2\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2"+
		"\u00fb\u00fc\7g\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2"+
		"\2\u00ff\u0100\7u\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103"+
		"\7g\2\2\u0103&\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106(\3"+
		"\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7n\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7g\2\2\u010b*\3\2\2\2\u010c\u010d\7g\2\2\u010d\u010e\7n\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u0110\7k\2\2\u0110\u0111\7h\2\2\u0111,\3\2\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\7p\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2"+
		"\u0116\u0117\7u\2\2\u0117\u0118\7u\2\2\u0118.\3\2\2\2\u0119\u011a\7y\2"+
		"\2\u011a\u011b\7j\2\2\u011b\u011c\7k\2\2\u011c\u011d\7n\2\2\u011d\u011e"+
		"\7g\2\2\u011e\60\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7{\2\2\u0124\62\3\2\2\2\u0125\u0126"+
		"\7d\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7m\2\2\u012a\64\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7q\2\2\u012d"+
		"\u012e\7t\2\2\u012e\66\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7j\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7p\2\2\u01338\3\2\2\2\u0134\u0135\7k\2\2\u0135"+
		"\u0136\7p\2\2\u0136:\3\2\2\2\u0137\u0138\7f\2\2\u0138\u0139\7q\2\2\u0139"+
		"<\3\2\2\2\u013a\u013b\7t\2\2\u013b\u013c\7g\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013e\7e\2\2\u013e\u013f\7w\2\2\u013f\u0140\7g\2\2\u0140>\3\2\2\2\u0141"+
		"\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7w\2\2\u0144\u0145\7g\2\2"+
		"\u0145@\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148\7c\2\2\u0148\u0149\7n\2"+
		"\2\u0149\u014a\7u\2\2\u014a\u014b\7g\2\2\u014bB\3\2\2\2\u014c\u014d\7"+
		"{\2\2\u014d\u014e\7k\2\2\u014e\u014f\7g\2\2\u014f\u0150\7n\2\2\u0150\u0151"+
		"\7f\2\2\u0151D\3\2\2\2\u0152\u0153\7-\2\2\u0153F\3\2\2\2\u0154\u0155\7"+
		"/\2\2\u0155H\3\2\2\2\u0156\u0157\7,\2\2\u0157J\3\2\2\2\u0158\u0159\7\61"+
		"\2\2\u0159L\3\2\2\2\u015a\u015b\7\'\2\2\u015bN\3\2\2\2\u015c\u015d\7,"+
		"\2\2\u015d\u015e\7,\2\2\u015eP\3\2\2\2\u015f\u0160\7?\2\2\u0160\u0161"+
		"\7?\2\2\u0161R\3\2\2\2\u0162\u0163\7#\2\2\u0163\u0164\7?\2\2\u0164T\3"+
		"\2\2\2\u0165\u0166\7@\2\2\u0166V\3\2\2\2\u0167\u0168\7>\2\2\u0168X\3\2"+
		"\2\2\u0169\u016a\7>\2\2\u016a\u016b\7?\2\2\u016bZ\3\2\2\2\u016c\u016d"+
		"\7@\2\2\u016d\u016e\7?\2\2\u016e\\\3\2\2\2\u016f\u0170\7?\2\2\u0170^\3"+
		"\2\2\2\u0171\u0172\7-\2\2\u0172\u0173\7?\2\2\u0173`\3\2\2\2\u0174\u0175"+
		"\7/\2\2\u0175\u0176\7?\2\2\u0176b\3\2\2\2\u0177\u0178\7,\2\2\u0178\u0179"+
		"\7?\2\2\u0179d\3\2\2\2\u017a\u017b\7\61\2\2\u017b\u017c\7?\2\2\u017cf"+
		"\3\2\2\2\u017d\u017e\7\'\2\2\u017e\u017f\7?\2\2\u017fh\3\2\2\2\u0180\u0181"+
		"\7,\2\2\u0181\u0182\7,\2\2\u0182\u0183\7?\2\2\u0183j\3\2\2\2\u0184\u0185"+
		"\7(\2\2\u0185l\3\2\2\2\u0186\u0187\7~\2\2\u0187n\3\2\2\2\u0188\u0189\7"+
		"`\2\2\u0189p\3\2\2\2\u018a\u018b\7\u0080\2\2\u018br\3\2\2\2\u018c\u018d"+
		"\7>\2\2\u018d\u018e\7>\2\2\u018et\3\2\2\2\u018f\u0190\7@\2\2\u0190\u0191"+
		"\7@\2\2\u0191v\3\2\2\2\u0192\u0193\7c\2\2\u0193\u0194\7p\2\2\u0194\u0198"+
		"\7f\2\2\u0195\u0196\7(\2\2\u0196\u0198\7(\2\2\u0197\u0192\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198x\3\2\2\2\u0199\u019a\7q\2\2\u019a\u019e\7t\2\2\u019b"+
		"\u019c\7~\2\2\u019c\u019e\7~\2\2\u019d\u0199\3\2\2\2\u019d\u019b\3\2\2"+
		"\2\u019ez\3\2\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a4\7"+
		"v\2\2\u01a2\u01a4\7#\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"|\3\2\2\2\u01a5\u01a6\7?\2\2\u01a6\u01a7\7@\2\2\u01a7~\3\2\2\2\u01a8\u01a9"+
		"\7*\2\2\u01a9\u0080\3\2\2\2\u01aa\u01ab\7+\2\2\u01ab\u0082\3\2\2\2\u01ac"+
		"\u01ad\7]\2\2\u01ad\u0084\3\2\2\2\u01ae\u01af\7_\2\2\u01af\u0086\3\2\2"+
		"\2\u01b0\u01b1\7}\2\2\u01b1\u0088\3\2\2\2\u01b2\u01b3\7\177\2\2\u01b3"+
		"\u008a\3\2\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7n\2"+
		"\2\u01b7\u008c\3\2\2\2\u01b8\u01bc\7%\2\2\u01b9\u01bb\n\2\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\7\17\2\2\u01c0\u01bf\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\f\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\bG\2\2\u01c5\u008e\3\2\2\2\u01c6\u01c7\7?\2"+
		"\2\u01c7\u01c8\7d\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7i\2\2\u01ca\u01cb"+
		"\7k\2\2\u01cb\u01cc\7p\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7?\2\2\u01d4"+
		"\u01d5\7g\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d9\3\2\2"+
		"\2\u01d8\u01da\7\17\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\7\f\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\bH"+
		"\2\2\u01de\u0090\3\2\2\2\u01df\u01e1\t\3\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\bI\2\2\u01e5\u0092\3\2\2\2\u01e6\u01e8\t\4\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u0094\3\2\2\2\u01eb\u01ed\t\4\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\7\60\2\2\u01f2\u01f4\t\4\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u0096\3\2\2\2\u01f7\u01fb\t\5\2\2\u01f8\u01fa\t\6\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u0098\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\t\7\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\5\u0097L\2\u0205"+
		"\u009a\3\2\2\2\u0206\u0207\7&\2\2\u0207\u0208\5\u0097L\2\u0208\u009c\3"+
		"\2\2\2\u0209\u020a\7B\2\2\u020a\u020b\5\u0097L\2\u020b\u009e\3\2\2\2\u020c"+
		"\u020d\5\u0097L\2\u020d\u020e\t\b\2\2\u020e\u00a0\3\2\2\2\26\2\u00b9\u00bb"+
		"\u00c2\u00c4\u00c8\u00d2\u0197\u019d\u01a3\u01bc\u01c0\u01d0\u01d9\u01e2"+
		"\u01e9\u01ee\u01f5\u01fb\u0201\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}