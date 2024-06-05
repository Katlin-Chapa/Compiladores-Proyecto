// Generated from Javita\VersionNum2\Javita.g4 by ANTLR 4.5.1
package Javita.VersionNum2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavitaParser}.
 */
public interface JavitaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavitaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JavitaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JavitaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#declaraciones_de_librerias}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones_de_librerias(JavitaParser.Declaraciones_de_libreriasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#declaraciones_de_librerias}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones_de_librerias(JavitaParser.Declaraciones_de_libreriasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(JavitaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(JavitaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(JavitaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(JavitaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void enterPrograma_principal(JavitaParser.Programa_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void exitPrograma_principal(JavitaParser.Programa_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#codigo_programa}.
	 * @param ctx the parse tree
	 */
	void enterCodigo_programa(JavitaParser.Codigo_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#codigo_programa}.
	 * @param ctx the parse tree
	 */
	void exitCodigo_programa(JavitaParser.Codigo_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(JavitaParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(JavitaParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_asignacion(JavitaParser.Instruccion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_asignacion(JavitaParser.Instruccion_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_if(JavitaParser.Instruccion_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_if(JavitaParser.Instruccion_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_while}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_while(JavitaParser.Instruccion_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_while}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_while(JavitaParser.Instruccion_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_return}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_return(JavitaParser.Instruccion_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_return}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_return(JavitaParser.Instruccion_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(JavitaParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(JavitaParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(JavitaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(JavitaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(JavitaParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(JavitaParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#lista_expr}.
	 * @param ctx the parse tree
	 */
	void enterLista_expr(JavitaParser.Lista_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#lista_expr}.
	 * @param ctx the parse tree
	 */
	void exitLista_expr(JavitaParser.Lista_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavitaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavitaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(JavitaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(JavitaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(JavitaParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(JavitaParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(JavitaParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(JavitaParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(JavitaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(JavitaParser.ComentarioContext ctx);
}