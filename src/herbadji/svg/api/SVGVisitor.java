package herbadji.svg.api;

import java.io.PrintWriter;

import herbadji.svg.api.elements.AnimateNode;
import herbadji.svg.api.elements.CircleNode;
import herbadji.svg.api.elements.GroupNode;
import herbadji.svg.api.elements.Node;
import herbadji.svg.api.elements.RectangleNode;
import herbadji.svg.api.elements.RootNode;
import herbadji.svg.api.elements.StringNode;

public class SVGVisitor {
	private PrintWriter pw;
	
	public SVGVisitor(PrintWriter pw) {
		this.pw = pw;
	}
	
	public void visitNode(Node node) {
		if (node instanceof RootNode) {
			visit(node);
		}
		else if (node instanceof RectangleNode) {
			visit(node);
		}
	}
	
	
	public void visit(Node node) {
		this.pw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\"\r\n" + 
				"  \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\r\n" + 
				"<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\"" + 
				" width=\"1500\" height=\"500\">"+ 
				" <title>SVG - API Herbadji</title>"
				);
		
		for (Node child : node.getChildren()) {
			//this.pw.write("\t");
			child.visit(this);
		}
		
		this.pw.write("\n</svg>");
		
	}

	public void visit(StringNode node) {
		String str = /*" \""+*/node.getText()/*+"\" "*/;
		this.pw.write(str);
	}
	
	public void visit(RectangleNode node) {
		String str = "\n\t<rect id=\""+node.getId()+"\" x=\""+node.getX()+"\" y=\""+node.getY()+"\" width=\""+node.getWidth()+"\" height=\""+node.getHeight()+"\" style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\" />";
		this.pw.write(str);
	}
	
	public void visit(CircleNode node) {
		String str = "\n\t<circle id=\""+node.getId()+"\" cx=\""+node.getCX()+"\" cy=\""+node.getCY()+"\" r=\""+node.getR()+"\" style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\" />";
		this.pw.write(str);
	}
	
	public void visit(AnimateNode node) {
		String str = "\n<animateTransform xlink:href=\"#"+node.getId()+"\" attributeName=\"transform\" type=\"translate\" from=\""+node.getFromX()+" "+node.getFromY()+"\" to=\""+node.getToX()+" "+node.getToY()+"\" begin=\"0s\" dur=\""+node.getDur()+"\" fill=\"freeze\" repeatCount=\"0\" />";
		this.pw.write(str);
	}

	public void visit(GroupNode node) {
		this.visit(node);
	}
	
	
	
	

}
