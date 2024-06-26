// Generated from Javita\VersionNum1\Javita.g4 by ANTLR 4.5.1
package Javita.VersionNum1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavitaPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NUMERO=32, FLOAT=33, BOOL=34, CADENA=35, IDENT=36, COMENTARIO=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "NUMERO", "FLOAT", 
		"BOOL", "CADENA", "IDENT", "LETRA", "DIGITO", "COMENTARIO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'lib'", "'('", "')'", "';'", "','", "'programa'", "'{'", "'}'", 
		"'='", "'['", "']'", "'if'", "'else'", "'while'", "'return'", "'!'", "'int'", 
		"'float'", "'bool'", "'string'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "';}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "NUMERO", "FLOAT", "BOOL", 
		"CADENA", "IDENT", "COMENTARIO", "WS"
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


	public JavitaPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Javita.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\6!\u00bc\n!\r!\16!\u00bd"+
		"\3\"\6\"\u00c1\n\"\r\"\16\"\u00c2\3\"\3\"\6\"\u00c7\n\"\r\"\16\"\u00c8"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00d4\n#\3$\3$\7$\u00d8\n$\f$\16$\u00db"+
		"\13$\3$\3$\3%\3%\5%\u00e1\n%\3%\3%\3%\7%\u00e6\n%\f%\16%\u00e9\13%\3&"+
		"\3&\3\'\3\'\3(\3(\3(\3(\7(\u00f3\n(\f(\16(\u00f6\13(\3(\5(\u00f9\n(\3"+
		"(\3(\3)\6)\u00fe\n)\r)\16)\u00ff\3)\3)\3\u00d9\2*\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2"+
		"O\'Q(\3\2\6\3\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u010c\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t["+
		"\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25"+
		"n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35z\3\2\2\2\37\u0080\3\2"+
		"\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008d\3\2\2\2\'\u0093\3\2\2\2)\u0098"+
		"\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2"+
		"\63\u00a7\3\2\2\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b2"+
		"\3\2\2\2=\u00b4\3\2\2\2?\u00b7\3\2\2\2A\u00bb\3\2\2\2C\u00c0\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d5\3\2\2\2I\u00e0\3\2\2\2K\u00ea\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00ee\3\2\2\2Q\u00fd\3\2\2\2ST\7n\2\2TU\7k\2\2UV\7d\2\2V\4\3\2\2"+
		"\2WX\7*\2\2X\6\3\2\2\2YZ\7+\2\2Z\b\3\2\2\2[\\\7=\2\2\\\n\3\2\2\2]^\7."+
		"\2\2^\f\3\2\2\2_`\7r\2\2`a\7t\2\2ab\7q\2\2bc\7i\2\2cd\7t\2\2de\7c\2\2"+
		"ef\7o\2\2fg\7c\2\2g\16\3\2\2\2hi\7}\2\2i\20\3\2\2\2jk\7\177\2\2k\22\3"+
		"\2\2\2lm\7?\2\2m\24\3\2\2\2no\7]\2\2o\26\3\2\2\2pq\7_\2\2q\30\3\2\2\2"+
		"rs\7k\2\2st\7h\2\2t\32\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\34"+
		"\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177\36\3\2\2"+
		"\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086 \3\2\2\2\u0087\u0088"+
		"\7#\2\2\u0088\"\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7v\2\2\u008c$\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092&\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097"+
		"(\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2\u009e*\3\2\2\2\u009f"+
		"\u00a0\7-\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2.\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\62\3\2\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\u00a9\7?\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0\u00b1\7?\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3<\3"+
		"\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7?\2\2\u00b6>\3\2\2\2\u00b7\u00b8"+
		"\7=\2\2\u00b8\u00b9\7\177\2\2\u00b9@\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00beB\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\7\60\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9D\3\2\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00d4\7g\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2"+
		"\u00d2\u00d4\7g\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4F\3\2"+
		"\2\2\u00d5\u00d9\7$\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00ddH\3\2\2\2\u00de\u00e1"+
		"\5K&\2\u00df\u00e1\7a\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e7\3\2\2\2\u00e2\u00e6\5K&\2\u00e3\u00e6\5M\'\2\u00e4\u00e6\7a\2\2"+
		"\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8J\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\t\3\2\2\u00ebL\3\2\2\2\u00ec\u00ed\t\2\2\2"+
		"\u00edN\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f4"+
		"\3\2\2\2\u00f1\u00f3\n\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f9\7\17\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7\f\2\2\u00fbP\3\2\2\2\u00fc\u00fe\t\5\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b)\2\2\u0102R\3\2\2\2\16\2\u00bd"+
		"\u00c2\u00c8\u00d3\u00d9\u00e0\u00e5\u00e7\u00f4\u00f8\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}