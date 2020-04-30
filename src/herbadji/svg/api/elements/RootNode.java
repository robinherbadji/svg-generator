package herbadji.svg.api.elements;

import herbadji.svg.api.SVGVisitor;

public class RootNode extends Node {
	int width, height;
	
	public RootNode(int width, int height) {
		super(null);
		this.width = width;
		this.height = height;
	}

	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);		
	}

	
}