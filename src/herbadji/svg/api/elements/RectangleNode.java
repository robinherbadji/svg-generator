package herbadji.svg.api.elements;

import herbadji.svg.api.SVGVisitor;
import herbadji.svg.api.expressions.ExpressionNode;

public class RectangleNode extends Node {	
	private String id;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public RectangleNode(Node parentNode, String id, ExpressionNode x, ExpressionNode y, ExpressionNode width, ExpressionNode height) {
		super(parentNode, id);
		this.id = id;
		this.x = x.getResult();
		this.y = y.getResult();
		this.width = width.getResult();
		this.height = height.getResult();
	}
	

	public String getId() {
		return id;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}



	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);		
	}
	
	
}
