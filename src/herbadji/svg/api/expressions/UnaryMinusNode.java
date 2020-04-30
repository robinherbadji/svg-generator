package herbadji.svg.api.expressions;

public class UnaryMinusNode extends ExpressionNode {
	private ExpressionNode right; 

	public UnaryMinusNode(ExpressionNode right) {
		this.right = right;
	}
	
	@Override
	public int getResult() {
		return -this.right.getResult();
	}

}