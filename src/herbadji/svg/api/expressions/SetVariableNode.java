package herbadji.svg.api.expressions;

import herbadji.svg.api.SVGContext;

public class SetVariableNode extends ExpressionNode {
	private String name;
	private ExpressionNode value;
	private SVGContext context;

	public SetVariableNode(SVGContext context, String name, ExpressionNode value) {
		this.name = name;
		this.value = value;
		this.context = context;		
		this.context.setVariable(name, value.getResult());
	}

	@Override
	public int getResult() {
		return value.getResult();
	}

}