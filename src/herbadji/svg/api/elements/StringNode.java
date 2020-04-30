package herbadji.svg.api.elements;

import herbadji.svg.api.SVGVisitor;

public class StringNode extends Node {
	String text;
	
	public StringNode(Node parentNode, String text) {
		super(parentNode);
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}

	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);		
	}
}