// Generated from Javita.g4 by ANTLR 4.4
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
public class JavitaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, NUMERO=29, FLOAT=30, BOOL=31, CADENA=32, 
		IDENT=33, COMENTARIO=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "NUMERO", "FLOAT", "BOOL", "CADENA", "IDENT", 
		"LETRA", "DIGITO", "COMENTARIO", "WS"
	};


	public JavitaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Javita.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u00af"+
		"\n\36\r\36\16\36\u00b0\3\37\6\37\u00b4\n\37\r\37\16\37\u00b5\3\37\3\37"+
		"\6\37\u00ba\n\37\r\37\16\37\u00bb\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00c7"+
		"\n \3!\3!\7!\u00cb\n!\f!\16!\u00ce\13!\3!\3!\3\"\3\"\5\"\u00d4\n\"\3\""+
		"\3\"\3\"\7\"\u00d9\n\"\f\"\16\"\u00dc\13\"\3#\3#\3$\3$\3%\3%\3%\3%\7%"+
		"\u00e6\n%\f%\16%\u00e9\13%\3%\5%\u00ec\n%\3%\3%\3&\6&\u00f1\n&\r&\16&"+
		"\u00f2\3&\3&\3\u00cc\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I$K%\3\2\6\3\2\62;\4\2C\\c|\4\2"+
		"\f\f\17\17\5\2\13\f\17\17\"\"\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7V\3\2\2\2"+
		"\tY\3\2\2\2\13_\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2"+
		"\25m\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33w\3\2\2\2\35{\3\2\2\2\37}\3\2\2"+
		"\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0089\3"+
		"\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63"+
		"\u00a2\3\2\2\2\65\u00a7\3\2\2\2\67\u00a9\3\2\2\29\u00ab\3\2\2\2;\u00ae"+
		"\3\2\2\2=\u00b3\3\2\2\2?\u00c6\3\2\2\2A\u00c8\3\2\2\2C\u00d3\3\2\2\2E"+
		"\u00dd\3\2\2\2G\u00df\3\2\2\2I\u00e1\3\2\2\2K\u00f0\3\2\2\2MN\7\61\2\2"+
		"N\4\3\2\2\2OP\7t\2\2PQ\7g\2\2QR\7v\2\2RS\7w\2\2ST\7t\2\2TU\7p\2\2U\6\3"+
		"\2\2\2VW\7#\2\2WX\7?\2\2X\b\3\2\2\2YZ\7h\2\2Z[\7n\2\2[\\\7q\2\2\\]\7c"+
		"\2\2]^\7v\2\2^\n\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g\2\2"+
		"d\f\3\2\2\2ef\7}\2\2f\16\3\2\2\2gh\7=\2\2h\20\3\2\2\2ij\7?\2\2j\22\3\2"+
		"\2\2kl\7\177\2\2l\24\3\2\2\2mn\7n\2\2no\7k\2\2op\7d\2\2p\26\3\2\2\2qr"+
		"\7k\2\2rs\7h\2\2s\30\3\2\2\2tu\7>\2\2uv\7?\2\2v\32\3\2\2\2wx\7k\2\2xy"+
		"\7p\2\2yz\7v\2\2z\34\3\2\2\2{|\7*\2\2|\36\3\2\2\2}~\7,\2\2~ \3\2\2\2\177"+
		"\u0080\7.\2\2\u0080\"\3\2\2\2\u0081\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083"+
		"$\3\2\2\2\u0084\u0085\7>\2\2\u0085&\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088"+
		"\7?\2\2\u0088(\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7i\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7o\2\2\u0090\u0091\7c\2\2\u0091*\3\2\2\2\u0092\u0093\7@\2\2\u0093"+
		",\3\2\2\2\u0094\u0095\7d\2\2\u0095\u0096\7q\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7n\2\2\u0098.\3\2\2\2\u0099\u009a\7#\2\2\u009a\60\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\64"+
		"\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa"+
		"8\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac:\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1<\3\2\2\2\u00b2\u00b4\t\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\7\60\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc>\3\2\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c7\7g\2\2\u00c1"+
		"\u00c2\7h\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u\2\2"+
		"\u00c5\u00c7\7g\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7@\3\2"+
		"\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0B\3\2\2\2\u00d1\u00d4"+
		"\5E#\2\u00d2\u00d4\7a\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00da\3\2\2\2\u00d5\u00d9\5E#\2\u00d6\u00d9\5G$\2\u00d7\u00d9\7a\2\2"+
		"\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00dbD\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\t\3\2\2\u00deF\3\2\2\2\u00df\u00e0\t\2\2\2"+
		"\u00e0H\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7"+
		"\3\2\2\2\u00e4\u00e6\n\4\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00ec\7\17\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\7\f\2\2\u00eeJ\3\2\2\2\u00ef\u00f1\t\5\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b&\2\2\u00f5L\3\2\2\2\16\2\u00b0"+
		"\u00b5\u00bb\u00c6\u00cc\u00d3\u00d8\u00da\u00e7\u00eb\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}