package herbadji.svg.api;

import java.util.Map;
import java.util.TreeMap;

import hassen.logo.factory.LogoFactory;
import herbadji.svg.api.elements.Node;

public class SVGContext {
	private Node rootNode;
	private SVGFactory factory;
	private Map<String,Integer> variables;
	private Map<String,Node> nodes;
	private Map<String,Node> nodegroups;
	
	
	public SVGContext() {
		super();
		this.factory = new SVGFactory(this);
		this.variables = new TreeMap<String,Integer>();
		this.nodes = new TreeMap<String,Node>();
		this.nodegroups = new TreeMap<String,Node>();
	}
	
	public void setRoot(Node node) throws Exception {
		this.rootNode = node;
	}
	
	public Node getRootNode() {
		return rootNode;
	}

	public SVGFactory getFactory() {
		return this.factory;
	}
	
	
	
	public void setNodeGroup(String nodeId, Node node) {
		this.nodes.put(nodeId, node);		
	}
	
	public Node getNodeGroup(String nodeId) {
		return this.nodes.get(nodeId);
	}
	
	public void setNode(String nodeId, Node node) {
		this.nodes.put(nodeId, node);		
	}
	
	public Node getNode(String nodeId) {
		return this.nodes.get(nodeId);
	}
	
	public void setVariable(String var, int val) {
		this.variables.put(var, val);
	}
	
	public int getVariable(String var) {
		return this.variables.get(var);
	}

}
