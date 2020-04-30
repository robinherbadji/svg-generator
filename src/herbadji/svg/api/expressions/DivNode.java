package herbadji.svg.api.expressions;

public class DivNode extends ExpressionNode {
	private ExpressionNode left;
	private ExpressionNode right; 

	public DivNode(ExpressionNode left, ExpressionNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int getResult() {
		if (this.right.getResult() != 0) {
			return this.left.getResult() / this.right.getResult();
		}
		return 0;
	}

}