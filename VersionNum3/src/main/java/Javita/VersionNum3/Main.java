
package Javita.VersionNum3;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "jav";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		JavitaLexer lexer = new JavitaLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JavitaParser parser = new JavitaParser(tokens);

		JavitaParser.ProgramaContext tree = parser.programa();

		JavitaCustomVisitor visitor = new JavitaCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
