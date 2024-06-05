// Generated from Javita\VersionNum3\Javita.g4 by ANTLR 4.5.1
package Javita.VersionNum3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavitaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavitaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavitaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(JavitaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#declaraciones_de_librerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones_de_librerias(JavitaParser.Declaraciones_de_libreriasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(JavitaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(JavitaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#programa_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma_principal(JavitaParser.Programa_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#codigo_programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo_programa(JavitaParser.Codigo_programaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#declaracion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variable(JavitaParser.Declaracion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#instruccion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_asignacion(JavitaParser.Instruccion_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#instruccion_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_if(JavitaParser.Instruccion_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#instruccion_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_while(JavitaParser.Instruccion_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#instruccion_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_return(JavitaParser.Instruccion_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(JavitaParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(JavitaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(JavitaParser.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#lista_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_expr(JavitaParser.Lista_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavitaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(JavitaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_aritmetico(JavitaParser.Operador_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(JavitaParser.Operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavitaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(JavitaParser.ComentarioContext ctx);
}