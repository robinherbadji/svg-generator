package herbadji.svg.api.expressions;

public class MultNode extends ExpressionNode {
	private ExpressionNode left;
	private ExpressionNode right; 

	public MultNode(ExpressionNode left, ExpressionNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int getResult() {
		return this.left.getResult() * this.right.getResult();
	}

}