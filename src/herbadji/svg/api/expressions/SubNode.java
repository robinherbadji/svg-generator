package herbadji.svg.api.expressions;

public class SubNode extends ExpressionNode {
	private ExpressionNode left;
	private ExpressionNode right; 

	public SubNode(ExpressionNode left, ExpressionNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int getResult() {
		return this.left.getResult() - this.right.getResult();
	}

}