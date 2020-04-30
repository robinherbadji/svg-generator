package herbadji.svg.api;

import herbadji.svg.api.elements.Node;
import herbadji.svg.api.elements.RectangleNode;

public abstract class Visitor {

	public void visitNode(Node node) {
		if (node instanceof RectangleNode) {
			visit_Rect(node);
		}
	}
	
	/*
	public void visitNode(Node node) {
		switch (node.getType()) {
		case NODE_ROOT : visit_Root(node); break;
		case NODE_RECT : visit_Rect(node); break;
		case NODE_TEXT : visit_Text(node); break;
		case NODE_BLOCK : visit_Block(node); break;
		case NODE_PLUS : visit_Plus(node); break;
		case NODE_IF : visit_If(node); break;
		case NODE_CONST : visit_Const(node); break;
		case NODE_ID : visit_Id(node); break;
		}
	}
	*/

	protected abstract void visit_Root(Node node);

	protected abstract void visit_Id(Node node);

	protected abstract void visit_Const(Node node);

	protected abstract void visit_If(Node node);

	protected abstract void visit_Plus(Node node);

	protected abstract void visit_Block(Node node);

	protected abstract void visit_Text(Node node);

	protected abstract void visit_Rect(Node node);	
	
	
	
}
