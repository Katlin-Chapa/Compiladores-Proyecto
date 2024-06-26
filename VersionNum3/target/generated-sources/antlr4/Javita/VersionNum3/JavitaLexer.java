// Generated from Javita\VersionNum3\Javita.g4 by ANTLR 4.5.1
package Javita.VersionNum3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavitaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NUMERO=30, FLOAT=31, 
		BOOL=32, CADENA=33, IDENT=34, COMENTARIO_LINEA=35, COMENTARIO_BLOQUE=36, 
		WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "NUMERO", "FLOAT", "BOOL", "CADENA", 
		"IDENT", "LETRA", "DIGITO", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'lib'", "'('", "')'", "';'", "','", "'programa'", "'{'", "'}'", 
		"'='", "'if'", "'else'", "'while'", "'return'", "'print'", "'!'", "'int'", 
		"'float'", "'bool'", "'string'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
		"'>'", "'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NUMERO", "FLOAT", "BOOL", "CADENA", 
		"IDENT", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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


	public JavitaLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\6\37\u00b9\n\37\r\37\16\37\u00ba"+
		"\3 \6 \u00be\n \r \16 \u00bf\3 \3 \6 \u00c4\n \r \16 \u00c5\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u00d1\n!\3\"\3\"\7\"\u00d5\n\"\f\"\16\"\u00d8\13\""+
		"\3\"\3\"\3#\3#\5#\u00de\n#\3#\3#\3#\7#\u00e3\n#\f#\16#\u00e6\13#\3$\5"+
		"$\u00e9\n$\3%\3%\3&\3&\3&\3&\7&\u00f1\n&\f&\16&\u00f4\13&\3&\5&\u00f7"+
		"\n&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00ff\n\'\f\'\16\'\u0102\13\'\3\'\3\'\3"+
		"\'\3(\6(\u0108\n(\r(\16(\u0109\3(\3(\4\u00d6\u0100\2)\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2"+
		"K%M&O\'\3\2\6\3\2\62;\20\2C\\c|\u00c3\u00c3\u00cb\u00cb\u00cf\u00cf\u00d3"+
		"\u00d3\u00d5\u00d5\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3"+
		"\u00f3\u00f5\u00f5\u00fc\u00fc\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0117"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27"+
		"o\3\2\2\2\31t\3\2\2\2\33z\3\2\2\2\35\u0081\3\2\2\2\37\u0087\3\2\2\2!\u0089"+
		"\3\2\2\2#\u008d\3\2\2\2%\u0093\3\2\2\2\'\u0098\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa"+
		"\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b2\3\2\2\2;\u00b4\3\2\2"+
		"\2=\u00b8\3\2\2\2?\u00bd\3\2\2\2A\u00d0\3\2\2\2C\u00d2\3\2\2\2E\u00dd"+
		"\3\2\2\2G\u00e8\3\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00fa\3\2\2\2O"+
		"\u0107\3\2\2\2QR\7n\2\2RS\7k\2\2ST\7d\2\2T\4\3\2\2\2UV\7*\2\2V\6\3\2\2"+
		"\2WX\7+\2\2X\b\3\2\2\2YZ\7=\2\2Z\n\3\2\2\2[\\\7.\2\2\\\f\3\2\2\2]^\7r"+
		"\2\2^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc\7c\2\2cd\7o\2\2de\7c\2\2e\16"+
		"\3\2\2\2fg\7}\2\2g\20\3\2\2\2hi\7\177\2\2i\22\3\2\2\2jk\7?\2\2k\24\3\2"+
		"\2\2lm\7k\2\2mn\7h\2\2n\26\3\2\2\2op\7g\2\2pq\7n\2\2qr\7u\2\2rs\7g\2\2"+
		"s\30\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7k\2\2wx\7n\2\2xy\7g\2\2y\32\3\2\2\2"+
		"z{\7t\2\2{|\7g\2\2|}\7v\2\2}~\7w\2\2~\177\7t\2\2\177\u0080\7p\2\2\u0080"+
		"\34\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\36\3\2\2\2\u0087\u0088\7#\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092$\3\2\2\2\u0093\u0094\7d\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2\u009e(\3\2\2\2\u009f\u00a0\7-\2"+
		"\2\u00a0*\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7,\2\2"+
		"\u00a4.\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7?\2"+
		"\2\u00a8\u00a9\7?\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\66\3\2\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0\u00b1\7?\2\2\u00b18\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3:\3"+
		"\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7?\2\2\u00b6<\3\2\2\2\u00b7\u00b9"+
		"\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb>\3\2\2\2\u00bc\u00be\t\2\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c4\t\2\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6@\3"+
		"\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00d1\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7u\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cb"+
		"\3\2\2\2\u00d1B\3\2\2\2\u00d2\u00d6\7$\2\2\u00d3\u00d5\13\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7$\2\2\u00da"+
		"D\3\2\2\2\u00db\u00de\5G$\2\u00dc\u00de\7a\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e4\3\2\2\2\u00df\u00e3\5G$\2\u00e0\u00e3\5I%\2"+
		"\u00e1\u00e3\7a\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"F\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9H\3\2\2\2\u00ea\u00eb\t\2\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7\61\2"+
		"\2\u00ed\u00ee\7\61\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\n\4\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\17\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\f"+
		"\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7,\2\2\u00fc\u0100"+
		"\3\2\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7\61\2\2\u0105N\3\2\2\2\u0106"+
		"\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b(\2\2\u010c"+
		"P\3\2\2\2\20\2\u00ba\u00bf\u00c5\u00d0\u00d6\u00dd\u00e2\u00e4\u00e8\u00f2"+
		"\u00f6\u0100\u0109\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}