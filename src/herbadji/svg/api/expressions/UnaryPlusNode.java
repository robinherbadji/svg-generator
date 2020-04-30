package herbadji.svg.api.expressions;

public class UnaryPlusNode extends ExpressionNode {
	private ExpressionNode right; 

	public UnaryPlusNode(ExpressionNode right) {
		this.right = right;
	}
	
	@Override
	public int getResult() {
		return this.right.getResult();
	}

}
