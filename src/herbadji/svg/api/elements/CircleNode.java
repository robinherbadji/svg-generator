package herbadji.svg.api.elements;

import herbadji.svg.api.SVGVisitor;
import herbadji.svg.api.expressions.ExpressionNode;

public class CircleNode extends Node{
	private String id;
	private int cx;
	private int cy;
	private int r;
	
	public CircleNode(Node parentNode, String id, ExpressionNode cx, ExpressionNode cy, ExpressionNode r) {
		super(parentNode, id);
		this.id = id;
		this.cx = cx.getResult();
		this.cy = cy.getResult();
		this.r = r.getResult();
	}
	

	public String getId() {
		return id;
	}

	public int getCX() {
		return cx;
	}


	public int getCY() {
		return cy;
	}


	public int getR() {
		return r;
	}


	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);		
	}
}
