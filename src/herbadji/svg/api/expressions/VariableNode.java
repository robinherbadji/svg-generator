package herbadji.svg.api.expressions;

public class VariableNode extends ExpressionNode {
	private int value;
	
	public VariableNode(int value) {
		this.value = value;
	}

	@Override
	public int getResult() {
		return this.value;
	}

}