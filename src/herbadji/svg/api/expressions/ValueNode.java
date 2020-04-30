package herbadji.svg.api.expressions;

public class ValueNode extends ExpressionNode {
	private int value;
	
	public ValueNode(int value) {
		this.value = value;
	}

	@Override
	public int getResult() {
		return this.value;
	}

}
