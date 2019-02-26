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
	
	ArrayList<String> defaultNodes = new ArrayList<String>(); 
	
	
	abstract public boolean addNode(Node parent);
	
	//remove given node from the children list in its parent node
	abstract public boolean removeNode(Node x);
	
	//set data for the given node
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}
	
	
}






