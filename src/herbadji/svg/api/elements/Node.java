package herbadji.svg.api.elements;

import java.util.ArrayList;

import herbadji.svg.api.SVGContext;
import herbadji.svg.api.SVGVisitor;

public abstract class Node extends SVGContext{
	private ArrayList<Node> children;
	
	public Node(Node parentNode) {
		if (parentNode != null) {
			parentNode.addChildren(this);
		}
	}
	
	public Node(Node parentNode, String nodeId) {
		if (parentNode != null) {
			parentNode.addChildren(this);
		}
		this.setNode(nodeId, this);
	}
	
	public void addChildren(Node node) {
		if (this.children == null) {
			this.children = new ArrayList<Node>();
		}
		this.children.add(node);
	}
	
	public ArrayList<Node> getChildren() {
		return this.children;
	}
	
	public abstract void visit(SVGVisitor v);

}
