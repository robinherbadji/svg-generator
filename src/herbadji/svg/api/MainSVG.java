package herbadji.svg.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import herbadji.svg.api.elements.Node;
import herbadji.svg.api.elements.RectangleNode;
import herbadji.svg.api.elements.RootNode;
import java_cup.runtime.SimpleSymbolFactory;
import java_cup.runtime.SymbolFactory;

public class MainSVG {

	public static void main(String[] args) throws Exception {
		Node rootNode = new RootNode(1500,1000);
		//Node node = new RectangleNode(rootNode, 0,0,300,100);
		
		SymbolFactory ssf = new SimpleSymbolFactory();
		Lexer lexer = null;
		
		lexer = new Lexer(new FileReader("instructions_svg.txt"));
		
		lexer.setSymbolFactory(ssf);
		Parser parser = new Parser(lexer, ssf);
		SVGContext context = new SVGContext();
		context.setRoot(rootNode);
		parser.setContext(context);
		parser.parse();
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("generated_SVG_API.svg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		SVGVisitor svgVis = new SVGVisitor(writer);
		svgVis.visit(context.getRootNode());
		
		writer.flush();
		writer.close();
		System.out.println("File generated");
		
	}

}
