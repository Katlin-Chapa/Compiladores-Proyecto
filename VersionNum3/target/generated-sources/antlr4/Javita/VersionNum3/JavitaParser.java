// Generated from Javita\VersionNum3\Javita.g4 by ANTLR 4.5.1
package Javita.VersionNum3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavitaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NUMERO=29, FLOAT=30, BOOL=31, 
		CADENA=32, IDENT=33, COMENTARIO_LINEA=34, COMENTARIO_BLOQUE=35, WS=36;
	public static final int
		RULE_programa = 0, RULE_declaraciones_de_librerias = 1, RULE_parametros = 2, 
		RULE_parametro = 3, RULE_programa_principal = 4, RULE_codigo_programa = 5, 
		RULE_declaracion_variable = 6, RULE_instruccion_asignacion = 7, RULE_instruccion_if = 8, 
		RULE_instruccion_while = 9, RULE_instruccion_return = 10, RULE_llamada_funcion = 11, 
		RULE_expresion = 12, RULE_expresion_logica = 13, RULE_lista_expr = 14, 
		RULE_literal = 15, RULE_tipo = 16, RULE_operador_aritmetico = 17, RULE_operador_logico = 18, 
		RULE_comentario = 19;
	public static final String[] ruleNames = {
		"programa", "declaraciones_de_librerias", "parametros", "parametro", "programa_principal", 
		"codigo_programa", "declaracion_variable", "instruccion_asignacion", "instruccion_if", 
		"instruccion_while", "instruccion_return", "llamada_funcion", "expresion", 
		"expresion_logica", "lista_expr", "literal", "tipo", "operador_aritmetico", 
		"operador_logico", "comentario"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'lib'", "'('", "')'", "';'", "','", "'programa'", "'{'", "'}'", 
		"'='", "'if'", "'else'", "'while'", "'return'", "'!'", "'int'", "'float'", 
		"'bool'", "'string'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>'", 
		"'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUMERO", "FLOAT", "BOOL", "CADENA", "IDENT", 
		"COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Javita.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavitaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Declaraciones_de_libreriasContext declaraciones_de_librerias() {
			return getRuleContext(Declaraciones_de_libreriasContext.class,0);
		}
		public Programa_principalContext programa_principal() {
			return getRuleContext(Programa_principalContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			declaraciones_de_librerias();
			setState(41);
			programa_principal();
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

	public static class Declaraciones_de_libreriasContext extends ParserRuleContext {
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(JavitaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(JavitaParser.IDENT, i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public Declaraciones_de_libreriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones_de_librerias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterDeclaraciones_de_librerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitDeclaraciones_de_librerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitDeclaraciones_de_librerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaraciones_de_libreriasContext declaraciones_de_librerias() throws RecognitionException {
		Declaraciones_de_libreriasContext _localctx = new Declaraciones_de_libreriasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones_de_librerias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(43);
				comentario();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(49);
				match(T__0);
				setState(50);
				tipo();
				setState(51);
				match(IDENT);
				setState(52);
				match(T__1);
				setState(53);
				parametros();
				setState(54);
				match(T__2);
				setState(55);
				match(T__3);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
					{
					{
					setState(56);
					comentario();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			parametro();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(68);
				match(T__4);
				setState(69);
				parametro();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			tipo();
			setState(76);
			match(IDENT);
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

	public static class Programa_principalContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public Codigo_programaContext codigo_programa() {
			return getRuleContext(Codigo_programaContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Programa_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterPrograma_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitPrograma_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitPrograma_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Programa_principalContext programa_principal() throws RecognitionException {
		Programa_principalContext _localctx = new Programa_principalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programa_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			tipo();
			setState(80);
			match(IDENT);
			setState(81);
			match(T__6);
			setState(82);
			codigo_programa();
			setState(83);
			match(T__7);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(84);
				comentario();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Codigo_programaContext extends ParserRuleContext {
		public List<Declaracion_variableContext> declaracion_variable() {
			return getRuleContexts(Declaracion_variableContext.class);
		}
		public Declaracion_variableContext declaracion_variable(int i) {
			return getRuleContext(Declaracion_variableContext.class,i);
		}
		public List<Instruccion_asignacionContext> instruccion_asignacion() {
			return getRuleContexts(Instruccion_asignacionContext.class);
		}
		public Instruccion_asignacionContext instruccion_asignacion(int i) {
			return getRuleContext(Instruccion_asignacionContext.class,i);
		}
		public List<Instruccion_ifContext> instruccion_if() {
			return getRuleContexts(Instruccion_ifContext.class);
		}
		public Instruccion_ifContext instruccion_if(int i) {
			return getRuleContext(Instruccion_ifContext.class,i);
		}
		public List<Instruccion_whileContext> instruccion_while() {
			return getRuleContexts(Instruccion_whileContext.class);
		}
		public Instruccion_whileContext instruccion_while(int i) {
			return getRuleContext(Instruccion_whileContext.class,i);
		}
		public List<Instruccion_returnContext> instruccion_return() {
			return getRuleContexts(Instruccion_returnContext.class);
		}
		public Instruccion_returnContext instruccion_return(int i) {
			return getRuleContext(Instruccion_returnContext.class,i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Codigo_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterCodigo_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitCodigo_programa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitCodigo_programa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Codigo_programaContext codigo_programa() throws RecognitionException {
		Codigo_programaContext _localctx = new Codigo_programaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_codigo_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << IDENT) | (1L << COMENTARIO_LINEA) | (1L << COMENTARIO_BLOQUE))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(90);
					declaracion_variable();
					}
					break;
				case 2:
					{
					setState(91);
					instruccion_asignacion();
					}
					break;
				case 3:
					{
					setState(92);
					instruccion_if();
					}
					break;
				case 4:
					{
					setState(93);
					instruccion_while();
					}
					break;
				case 5:
					{
					setState(94);
					instruccion_return();
					}
					break;
				case 6:
					{
					setState(95);
					llamada_funcion();
					}
					break;
				case 7:
					{
					setState(96);
					comentario();
					}
					break;
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Declaracion_variableContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterDeclaracion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitDeclaracion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitDeclaracion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tipo();
			setState(103);
			match(IDENT);
			setState(104);
			match(T__3);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					comentario();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Instruccion_asignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Instruccion_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterInstruccion_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitInstruccion_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitInstruccion_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_asignacionContext instruccion_asignacion() throws RecognitionException {
		Instruccion_asignacionContext _localctx = new Instruccion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccion_asignacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENT);
			setState(112);
			match(T__8);
			setState(113);
			expresion(0);
			setState(114);
			match(T__3);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					comentario();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Instruccion_ifContext extends ParserRuleContext {
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public List<Codigo_programaContext> codigo_programa() {
			return getRuleContexts(Codigo_programaContext.class);
		}
		public Codigo_programaContext codigo_programa(int i) {
			return getRuleContext(Codigo_programaContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Instruccion_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterInstruccion_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitInstruccion_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitInstruccion_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_ifContext instruccion_if() throws RecognitionException {
		Instruccion_ifContext _localctx = new Instruccion_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__9);
			setState(122);
			match(T__1);
			setState(123);
			expresion_logica();
			setState(124);
			match(T__2);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(125);
				comentario();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__6);
			setState(132);
			codigo_programa();
			setState(133);
			match(T__7);
			setState(144);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(134);
				match(T__10);
				setState(135);
				match(T__6);
				setState(136);
				codigo_programa();
				setState(137);
				match(T__7);
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						comentario();
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
			}

			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					comentario();
					}
					} 
				}
				setState(151);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Instruccion_whileContext extends ParserRuleContext {
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Codigo_programaContext codigo_programa() {
			return getRuleContext(Codigo_programaContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Instruccion_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterInstruccion_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitInstruccion_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitInstruccion_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_whileContext instruccion_while() throws RecognitionException {
		Instruccion_whileContext _localctx = new Instruccion_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(153);
			match(T__1);
			setState(154);
			expresion_logica();
			setState(155);
			match(T__2);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				{
				setState(156);
				comentario();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__6);
			setState(163);
			codigo_programa();
			setState(164);
			match(T__7);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					comentario();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Instruccion_returnContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Instruccion_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterInstruccion_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitInstruccion_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitInstruccion_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_returnContext instruccion_return() throws RecognitionException {
		Instruccion_returnContext _localctx = new Instruccion_returnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruccion_return);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__12);
			setState(172);
			expresion(0);
			setState(173);
			match(T__3);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					comentario();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamada_funcion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IDENT);
			setState(181);
			match(T__1);
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NUMERO) | (1L << FLOAT) | (1L << BOOL) | (1L << CADENA) | (1L << IDENT))) != 0)) {
				{
				setState(182);
				lista_expr();
				}
			}

			setState(185);
			match(T__2);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					comentario();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ExpresionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(193);
				literal();
				}
				break;
			case 2:
				{
				setState(194);
				match(IDENT);
				}
				break;
			case 3:
				{
				setState(195);
				llamada_funcion();
				}
				break;
			case 4:
				{
				setState(196);
				match(T__1);
				setState(197);
				expresion(0);
				setState(198);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(202);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(203);
					operador_aritmetico();
					setState(204);
					expresion(3);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_logica);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case T__1:
			case NUMERO:
			case FLOAT:
			case BOOL:
			case CADENA:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				expresion(0);
				setState(212);
				operador_logico();
				setState(213);
				expresion(0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__13);
				setState(216);
				expresion_logica();
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

	public static class Lista_exprContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Lista_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterLista_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitLista_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitLista_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_exprContext lista_expr() throws RecognitionException {
		Lista_exprContext _localctx = new Lista_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			expresion(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(220);
				match(T__4);
				setState(221);
				expresion(0);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JavitaParser.NUMERO, 0); }
		public TerminalNode FLOAT() { return getToken(JavitaParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(JavitaParser.BOOL, 0); }
		public TerminalNode CADENA() { return getToken(JavitaParser.CADENA, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << FLOAT) | (1L << BOOL) | (1L << CADENA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitOperador_aritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitOperador_aritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Operador_logicoContext extends ParserRuleContext {
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitOperador_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitOperador_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(JavitaParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(JavitaParser.COMENTARIO_BLOQUE, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavitaListener ) ((JavitaListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavitaVisitor ) return ((JavitaVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) ) {
			_errHandler.recoverInline(this);
			} else {
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
		case 12:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\7\3A\n\3\f"+
		"\3\16\3D\13\3\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t"+
		"\3\t\3\t\3\t\3\t\7\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n"+
		"\f\n\16\n\u0091\13\n\5\n\u0093\n\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13\3\f\3\f\3\f\3\f"+
		"\7\f\u00b2\n\f\f\f\16\f\u00b5\13\f\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\7"+
		"\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00cb\n\16\3\16\3\16\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\7"+
		"\20\u00e1\n\20\f\20\16\20\u00e4\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\2\3\32\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\7\3\2\37\"\3\2\21\24\3\2\25\30\3\2\31\36\3\2$%\u00f8\2*\3"+
		"\2\2\2\4\60\3\2\2\2\6E\3\2\2\2\bM\3\2\2\2\nP\3\2\2\2\fe\3\2\2\2\16h\3"+
		"\2\2\2\20q\3\2\2\2\22{\3\2\2\2\24\u009a\3\2\2\2\26\u00ad\3\2\2\2\30\u00b6"+
		"\3\2\2\2\32\u00ca\3\2\2\2\34\u00db\3\2\2\2\36\u00dd\3\2\2\2 \u00e5\3\2"+
		"\2\2\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00eb\3\2\2\2(\u00ed\3\2\2\2*+\5"+
		"\4\3\2+,\5\n\6\2,\3\3\2\2\2-/\5(\25\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61B\3\2\2\2\62\60\3\2\2\2\63\64\7\3\2\2\64\65\5\"\22"+
		"\2\65\66\7#\2\2\66\67\7\4\2\2\678\5\6\4\289\7\5\2\29=\7\6\2\2:<\5(\25"+
		"\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@\63\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EJ\5\b\5\2FG\7"+
		"\7\2\2GI\5\b\5\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ"+
		"\3\2\2\2MN\5\"\22\2NO\7#\2\2O\t\3\2\2\2PQ\7\b\2\2QR\5\"\22\2RS\7#\2\2"+
		"ST\7\t\2\2TU\5\f\7\2UY\7\n\2\2VX\5(\25\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z\13\3\2\2\2[Y\3\2\2\2\\d\5\16\b\2]d\5\20\t\2^d\5\22\n\2_d\5"+
		"\24\13\2`d\5\26\f\2ad\5\30\r\2bd\5(\25\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2"+
		"\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2f\r\3\2\2\2ge\3\2\2\2hi\5\"\22\2ij\7#\2\2jn\7\6\2\2km\5(\25\2lk\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qr\7#\2\2rs\7"+
		"\13\2\2st\5\32\16\2tx\7\6\2\2uw\5(\25\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\7\f\2\2|}\7\4\2\2}~\5\34\17\2~\u0082"+
		"\7\5\2\2\177\u0081\5(\25\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7\t\2\2\u0086\u0087\5\f\7\2\u0087\u0092\7\n\2\2\u0088"+
		"\u0089\7\r\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\f\7\2\u008b\u008f\7\n"+
		"\2\2\u008c\u008e\5(\25\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0088\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094"+
		"\u0096\5(\25\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\7\16\2\2\u009b\u009c\7\4\2\2\u009c\u009d\5\34\17\2\u009d\u00a1\7\5\2"+
		"\2\u009e\u00a0\5(\25\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\t\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00aa\7\n\2\2\u00a7\u00a9\5("+
		"\25\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\17\2"+
		"\2\u00ae\u00af\5\32\16\2\u00af\u00b3\7\6\2\2\u00b0\u00b2\5(\25\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\27\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b9"+
		"\7\4\2\2\u00b8\u00ba\5\36\20\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bf\7\5\2\2\u00bc\u00be\5(\25\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\31\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\16\1\2\u00c3\u00cb\5 \21"+
		"\2\u00c4\u00cb\7#\2\2\u00c5\u00cb\5\30\r\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8"+
		"\5\32\16\2\u00c8\u00c9\7\5\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c2\3\2\2\2"+
		"\u00ca\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00d2"+
		"\3\2\2\2\u00cc\u00cd\f\4\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\5\32\16\5"+
		"\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5\32\16\2\u00d6\u00d7\5&\24\2\u00d7\u00d8\5\32\16\2\u00d8\u00dc"+
		"\3\2\2\2\u00d9\u00da\7\20\2\2\u00da\u00dc\5\34\17\2\u00db\u00d5\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00e2\5\32\16\2\u00de\u00df"+
		"\7\7\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8\t\3\2\2\u00e8"+
		"#\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea%\3\2\2\2\u00eb\u00ec\t\5\2\2\u00ec"+
		"\'\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee)\3\2\2\2\30\60=BJYcenx\u0082\u008f"+
		"\u0092\u0097\u00a1\u00aa\u00b3\u00b9\u00bf\u00ca\u00d2\u00db\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}