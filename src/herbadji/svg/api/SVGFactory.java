package herbadji.svg.api;

import herbadji.svg.api.elements.AnimateNode;
import herbadji.svg.api.elements.CircleNode;
import herbadji.svg.api.elements.RectangleNode;
import herbadji.svg.api.elements.StringNode;
import herbadji.svg.api.expressions.AddNode;
import herbadji.svg.api.expressions.DivNode;
import herbadji.svg.api.expressions.ExpressionNode;
import herbadji.svg.api.expressions.MultNode;
import herbadji.svg.api.expressions.SetVariableNode;
import herbadji.svg.api.expressions.SubNode;
import herbadji.svg.api.expressions.UnaryMinusNode;
import herbadji.svg.api.expressions.UnaryPlusNode;
import herbadji.svg.api.expressions.ValueNode;
import herbadji.svg.api.expressions.VariableNode;

public class SVGFactory {
	private SVGContext context;
	
	public SVGFactory() {}
	
	public SVGFactory(SVGContext context) {
		this.context = context;
	}
	
	public ValueNode createNodeConstantInteger(int n) {
		return new ValueNode(n);
	}
	
	public AddNode createNodeAdd(ExpressionNode e1, ExpressionNode e2) {
		return new AddNode(e1, e2);
	}
	
	public SubNode createNodeSub(ExpressionNode e1, ExpressionNode e2) {
		return new SubNode(e1, e2);
	}
	
	public MultNode createNodeMult(ExpressionNode e1, ExpressionNode e2) {
		return new MultNode(e1, e2);
	}
	
	public DivNode createNodeDiv(ExpressionNode e1, ExpressionNode e2) {
		return new DivNode(e1, e2);
	}
	
	public UnaryPlusNode createNodePlus(ExpressionNode e) {
		return new UnaryPlusNode(e);
	}
	
	public UnaryMinusNode createNodeMinus(ExpressionNode e) {
		return new UnaryMinusNode(e);
	}
	
	public SetVariableNode createNodeSetVariable(String var, ExpressionNode e) {
		return new SetVariableNode(context, var, e);
	}
	
	public StringNode createNodeConstantString (String text) {
		return new StringNode(context.getRootNode(), text);
	}
	
	public VariableNode createNodeGetVariable(String var) {
		return new VariableNode(context.getVariable(var));
	}
	
	public RectangleNode createRectangle(String id, ExpressionNode x, ExpressionNode y, ExpressionNode w, ExpressionNode h) {
		return new RectangleNode(context.getRootNode(), id, x, y, w, h);
	}
	
	public CircleNode createCircle(String id, ExpressionNode x, ExpressionNode y, ExpressionNode r) {
		return new CircleNode(context.getRootNode(), id, x, y, r);
	}
	
	
	/*
	public AnimateRectangleNode animateNodes(String id) {
		return new AnimateRectangleNode(context.getRootNode(), id);
	}
	*/
	
	public AnimateNode animateNodes(String id, ExpressionNode fromX, ExpressionNode fromY, ExpressionNode toX, ExpressionNode toY, ExpressionNode time) {
		return new AnimateNode(context.getRootNode(), id, fromX, fromY, toX, toY, time);
	}
	
	
}
