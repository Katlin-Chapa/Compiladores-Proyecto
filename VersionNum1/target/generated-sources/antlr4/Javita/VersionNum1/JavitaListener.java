// Generated from Javita.g4 by ANTLR 4.4
package Javita.VersionNum1;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavitaParser}.
 */
public interface JavitaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavitaParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(@NotNull JavitaParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(@NotNull JavitaParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull JavitaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull JavitaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#codigo_programa}.
	 * @param ctx the parse tree
	 */
	void enterCodigo_programa(@NotNull JavitaParser.Codigo_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#codigo_programa}.
	 * @param ctx the parse tree
	 */
	void exitCodigo_programa(@NotNull JavitaParser.Codigo_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#lista_expr}.
	 * @param ctx the parse tree
	 */
	void enterLista_expr(@NotNull JavitaParser.Lista_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#lista_expr}.
	 * @param ctx the parse tree
	 */
	void exitLista_expr(@NotNull JavitaParser.Lista_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull JavitaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull JavitaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(@NotNull JavitaParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(@NotNull JavitaParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull JavitaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull JavitaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_return}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_return(@NotNull JavitaParser.Instruccion_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_return}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_return(@NotNull JavitaParser.Instruccion_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(@NotNull JavitaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(@NotNull JavitaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(@NotNull JavitaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(@NotNull JavitaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavitaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavitaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull JavitaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull JavitaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_asignacion(@NotNull JavitaParser.Instruccion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_asignacion(@NotNull JavitaParser.Instruccion_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(@NotNull JavitaParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(@NotNull JavitaParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#declaraciones_de_librerias}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones_de_librerias(@NotNull JavitaParser.Declaraciones_de_libreriasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#declaraciones_de_librerias}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones_de_librerias(@NotNull JavitaParser.Declaraciones_de_libreriasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(@NotNull JavitaParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(@NotNull JavitaParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_while}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_while(@NotNull JavitaParser.Instruccion_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_while}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_while(@NotNull JavitaParser.Instruccion_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_if(@NotNull JavitaParser.Instruccion_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#instruccion_if}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_if(@NotNull JavitaParser.Instruccion_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(@NotNull JavitaParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(@NotNull JavitaParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavitaParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void enterPrograma_principal(@NotNull JavitaParser.Programa_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavitaParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void exitPrograma_principal(@NotNull JavitaParser.Programa_principalContext ctx);
}