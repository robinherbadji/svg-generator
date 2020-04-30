package herbadji.svg.api.elements;

import herbadji.svg.api.SVGVisitor;
import herbadji.svg.api.expressions.ExpressionNode;

public class AnimateNode extends Node{
	
	private String id;
	private int fromX;
	private int fromY;
	private int toX;
	private int toY;
	private String dur;
	
	public AnimateNode(Node parentNode, String id, ExpressionNode fromX, ExpressionNode fromY, ExpressionNode toX, ExpressionNode toY, ExpressionNode time) {
		super(parentNode);
		this.id = id;
		this.fromX = fromX.getResult();
		this.fromY = fromY.getResult();
		this.toX = toY.getResult();
		this.toX = toY.getResult();
		this.dur = String.valueOf(time.getResult())+"s";
	}
	
	/*
	public AnimateNode(Node parentNode, String id, String attribute, int from, int to) {
		super(parentNode);
		this.id =id;
		this.attribute = attribute;
		this.from = from;
		this.to = to;
		this.begin = "0s";
		this.dur = "10s";
	}
	*/

	public String getId() {
		return id;
	}

	public int getFromX() {
		return fromX;
	}

	public int getFromY() {
		return fromY;
	}

	public int getToX() {
		return toX;
	}

	public int getToY() {
		return toY;
	}

	public String getDur() {
		return dur;
	}	
	
	
	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);		
	}

}
