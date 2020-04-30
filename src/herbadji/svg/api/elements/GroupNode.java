package herbadji.svg.api.elements;

import java.util.ArrayList;

import herbadji.svg.api.SVGVisitor;

public class GroupNode extends Node {
	private ArrayList<Node> members;
	
	public GroupNode(Node parentNode, String nodeId, Node node) {
		super(parentNode, nodeId);
		this.members = new ArrayList<Node>();
	}
	
	
	public void addNode(Node node) {
		this.members.add(node);
	}
	
	
	@Override
	public void visit(SVGVisitor v) {
		v.visit(this);
	}

}
