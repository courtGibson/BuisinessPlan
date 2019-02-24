/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney
 *
 */
public abstract class Plan
{
	Node node;
	ArrayList<String> defaultNodes = new ArrayList<String>(); 
	
	
	abstract boolean addNode(Node parent);
	
	//remove given node from the children list in its parent node
	public void removeNode(Node node)
	{
		node.getParent().removeChild(node);
	}
	
	//set data for the given node
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}
	
	
}






