// Generated from Javita.g4 by ANTLR 4.4
package Javita.VersionNum1;
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
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'return'", "'!='", "'float'", "'while'", "'{'", "';'", 
		"'='", "'}'", "'lib'", "'if'", "'<='", "'int'", "'('", "'*'", "','", "'>='", 
		"'<'", "'=='", "'programa'", "'>'", "'bool'", "'!'", "'string'", "'else'", 
		"')'", "'+'", "'-'", "NUMERO", "FLOAT", "BOOL", "CADENA", "IDENT", "COMENTARIO", 
		"WS"
	};
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

	@Override
	public String getGrammarFileName() { return "Javita.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); declaraciones_de_librerias();
			setState(41); programa_principal();
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
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(JavitaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(JavitaParser.IDENT); }
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
	}

	public final Declaraciones_de_libreriasContext declaraciones_de_librerias() throws RecognitionException {
		Declaraciones_de_libreriasContext _localctx = new Declaraciones_de_libreriasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones_de_librerias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(43); match(T__18);
				setState(44); tipo();
				setState(45); match(IDENT);
				setState(46); match(T__14);
				setState(47); parametros();
				setState(48); match(T__2);
				setState(49); match(T__21);
				}
				}
				setState(55);
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
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
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
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); parametro();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(57); match(T__12);
				setState(58); parametro();
				}
				}
				setState(63);
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
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); tipo();
			setState(65); match(IDENT);
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
		public Codigo_programaContext codigo_programa() {
			return getRuleContext(Codigo_programaContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
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
	}

	public final Programa_principalContext programa_principal() throws RecognitionException {
		Programa_principalContext _localctx = new Programa_principalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programa_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(T__8);
			setState(68); tipo();
			setState(69); match(IDENT);
			setState(70); match(T__22);
			setState(71); codigo_programa();
			setState(72); match(T__19);
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public Instruccion_returnContext instruccion_return(int i) {
			return getRuleContext(Instruccion_returnContext.class,i);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public List<Instruccion_asignacionContext> instruccion_asignacion() {
			return getRuleContexts(Instruccion_asignacionContext.class);
		}
		public Instruccion_ifContext instruccion_if(int i) {
			return getRuleContext(Instruccion_ifContext.class,i);
		}
		public List<Instruccion_ifContext> instruccion_if() {
			return getRuleContexts(Instruccion_ifContext.class);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public List<Instruccion_returnContext> instruccion_return() {
			return getRuleContexts(Instruccion_returnContext.class);
		}
		public Declaracion_variableContext declaracion_variable(int i) {
			return getRuleContext(Declaracion_variableContext.class,i);
		}
		public List<Declaracion_variableContext> declaracion_variable() {
			return getRuleContexts(Declaracion_variableContext.class);
		}
		public List<Instruccion_whileContext> instruccion_while() {
			return getRuleContexts(Instruccion_whileContext.class);
		}
		public Instruccion_whileContext instruccion_while(int i) {
			return getRuleContext(Instruccion_whileContext.class,i);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public Instruccion_asignacionContext instruccion_asignacion(int i) {
			return getRuleContext(Instruccion_asignacionContext.class,i);
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
	}

	public final Codigo_programaContext codigo_programa() throws RecognitionException {
		Codigo_programaContext _localctx = new Codigo_programaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_codigo_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__24) | (1L << T__23) | (1L << T__17) | (1L << T__15) | (1L << T__6) | (1L << T__4) | (1L << IDENT) | (1L << COMENTARIO))) != 0)) {
				{
				setState(81);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(74); declaracion_variable();
					}
					break;
				case 2:
					{
					setState(75); instruccion_asignacion();
					}
					break;
				case 3:
					{
					setState(76); instruccion_if();
					}
					break;
				case 4:
					{
					setState(77); instruccion_while();
					}
					break;
				case 5:
					{
					setState(78); instruccion_return();
					}
					break;
				case 6:
					{
					setState(79); llamada_funcion();
					}
					break;
				case 7:
					{
					setState(80); comentario();
					}
					break;
				}
				}
				setState(85);
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
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); tipo();
			setState(87); match(IDENT);
			setState(88); match(T__21);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
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
	}

	public final Instruccion_asignacionContext instruccion_asignacion() throws RecognitionException {
		Instruccion_asignacionContext _localctx = new Instruccion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccion_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(IDENT);
			setState(91); match(T__20);
			setState(92); expresion(0);
			setState(93); match(T__21);
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
		public Codigo_programaContext codigo_programa(int i) {
			return getRuleContext(Codigo_programaContext.class,i);
		}
		public List<Codigo_programaContext> codigo_programa() {
			return getRuleContexts(Codigo_programaContext.class);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
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
	}

	public final Instruccion_ifContext instruccion_if() throws RecognitionException {
		Instruccion_ifContext _localctx = new Instruccion_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__17);
			setState(96); match(T__14);
			setState(97); expresion_logica();
			setState(98); match(T__2);
			setState(99); match(T__22);
			setState(100); codigo_programa();
			setState(101); match(T__19);
			setState(107);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(102); match(T__3);
				setState(103); match(T__22);
				setState(104); codigo_programa();
				setState(105); match(T__19);
				}
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
		public Codigo_programaContext codigo_programa() {
			return getRuleContext(Codigo_programaContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
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
	}

	public final Instruccion_whileContext instruccion_while() throws RecognitionException {
		Instruccion_whileContext _localctx = new Instruccion_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__23);
			setState(110); match(T__14);
			setState(111); expresion_logica();
			setState(112); match(T__2);
			setState(113); match(T__22);
			setState(114); codigo_programa();
			setState(115); match(T__19);
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
	}

	public final Instruccion_returnContext instruccion_return() throws RecognitionException {
		Instruccion_returnContext _localctx = new Instruccion_returnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruccion_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(T__26);
			setState(118); expresion(0);
			setState(119); match(T__21);
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
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
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
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(IDENT);
			setState(122); match(T__14);
			setState(124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << NUMERO) | (1L << FLOAT) | (1L << BOOL) | (1L << CADENA) | (1L << IDENT))) != 0)) {
				{
				setState(123); lista_expr();
				}
			}

			setState(126); match(T__2);
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
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(JavitaParser.IDENT, 0); }
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129); literal();
				}
				break;
			case 2:
				{
				setState(130); match(IDENT);
				}
				break;
			case 3:
				{
				setState(131); llamada_funcion();
				}
				break;
			case 4:
				{
				setState(132); match(T__14);
				setState(133); expresion(0);
				setState(134); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(138);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139); operador_aritmetico();
					setState(140); expresion(3);
					}
					} 
				}
				setState(146);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_logicaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_logica);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case T__14:
			case NUMERO:
			case FLOAT:
			case BOOL:
			case CADENA:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); expresion(0);
				setState(148); operador_logico();
				setState(149); expresion(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(T__5);
				setState(152); expresion_logica();
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
	}

	public final Lista_exprContext lista_expr() throws RecognitionException {
		Lista_exprContext _localctx = new Lista_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); expresion(0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(156); match(T__12);
				setState(157); expresion(0);
				}
				}
				setState(162);
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
		public TerminalNode BOOL() { return getToken(JavitaParser.BOOL, 0); }
		public TerminalNode NUMERO() { return getToken(JavitaParser.NUMERO, 0); }
		public TerminalNode CADENA() { return getToken(JavitaParser.CADENA, 0); }
		public TerminalNode FLOAT() { return getToken(JavitaParser.FLOAT, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << FLOAT) | (1L << BOOL) | (1L << CADENA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__15) | (1L << T__6) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__13) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__16) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode COMENTARIO() { return getToken(JavitaParser.COMENTARIO, 0); }
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
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(COMENTARIO);
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
		case 12: return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7T"+
		"\n\7\f\7\16\7W\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\177\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0091\n\16\f\16\16\16\u0094\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u009c\n\17\3\20\3\20\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\3\32\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\37\"\6\2\6\6\17\17\30\30\32"+
		"\32\5\2\3\3\21\21\35\36\6\2\5\5\16\16\23\25\27\27\u00ac\2*\3\2\2\2\4\67"+
		"\3\2\2\2\6:\3\2\2\2\bB\3\2\2\2\nE\3\2\2\2\fU\3\2\2\2\16X\3\2\2\2\20\\"+
		"\3\2\2\2\22a\3\2\2\2\24o\3\2\2\2\26w\3\2\2\2\30{\3\2\2\2\32\u008a\3\2"+
		"\2\2\34\u009b\3\2\2\2\36\u009d\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2"+
		"$\u00a9\3\2\2\2&\u00ab\3\2\2\2(\u00ad\3\2\2\2*+\5\4\3\2+,\5\n\6\2,\3\3"+
		"\2\2\2-.\7\f\2\2./\5\"\22\2/\60\7#\2\2\60\61\7\20\2\2\61\62\5\6\4\2\62"+
		"\63\7\34\2\2\63\64\7\t\2\2\64\66\3\2\2\2\65-\3\2\2\2\669\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:?\5\b\5\2;<\7\22\2\2<>\5\b"+
		"\5\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\5"+
		"\"\22\2CD\7#\2\2D\t\3\2\2\2EF\7\26\2\2FG\5\"\22\2GH\7#\2\2HI\7\b\2\2I"+
		"J\5\f\7\2JK\7\13\2\2K\13\3\2\2\2LT\5\16\b\2MT\5\20\t\2NT\5\22\n\2OT\5"+
		"\24\13\2PT\5\26\f\2QT\5\30\r\2RT\5(\25\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2"+
		"SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\r\3\2\2\2WU\3\2\2\2XY\5\"\22\2YZ\7#\2\2Z[\7\t\2\2[\17\3\2\2\2\\]\7#"+
		"\2\2]^\7\n\2\2^_\5\32\16\2_`\7\t\2\2`\21\3\2\2\2ab\7\r\2\2bc\7\20\2\2"+
		"cd\5\34\17\2de\7\34\2\2ef\7\b\2\2fg\5\f\7\2gm\7\13\2\2hi\7\33\2\2ij\7"+
		"\b\2\2jk\5\f\7\2kl\7\13\2\2ln\3\2\2\2mh\3\2\2\2mn\3\2\2\2n\23\3\2\2\2"+
		"op\7\7\2\2pq\7\20\2\2qr\5\34\17\2rs\7\34\2\2st\7\b\2\2tu\5\f\7\2uv\7\13"+
		"\2\2v\25\3\2\2\2wx\7\4\2\2xy\5\32\16\2yz\7\t\2\2z\27\3\2\2\2{|\7#\2\2"+
		"|~\7\20\2\2}\177\5\36\20\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\34\2\2\u0081\31\3\2\2\2\u0082\u0083\b\16\1\2\u0083\u008b\5 \21"+
		"\2\u0084\u008b\7#\2\2\u0085\u008b\5\30\r\2\u0086\u0087\7\20\2\2\u0087"+
		"\u0088\5\32\16\2\u0088\u0089\7\34\2\2\u0089\u008b\3\2\2\2\u008a\u0082"+
		"\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008b"+
		"\u0092\3\2\2\2\u008c\u008d\f\4\2\2\u008d\u008e\5$\23\2\u008e\u008f\5\32"+
		"\16\5\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\33\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0096\5\32\16\2\u0096\u0097\5&\24\2\u0097\u0098\5\32\16\2\u0098"+
		"\u009c\3\2\2\2\u0099\u009a\7\31\2\2\u009a\u009c\5\34\17\2\u009b\u0095"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\35\3\2\2\2\u009d\u00a2\5\32\16\2\u009e"+
		"\u009f\7\22\2\2\u009f\u00a1\5\32\16\2\u00a0\u009e\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\37\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6!\3\2\2\2\u00a7\u00a8\t\3\2\2"+
		"\u00a8#\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa%\3\2\2\2\u00ab\u00ac\t\5\2\2"+
		"\u00ac\'\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae)\3\2\2\2\f\67?SUm~\u008a\u0092"+
		"\u009b\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}