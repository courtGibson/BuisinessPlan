/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney and Jack
 *
 */
public abstract class Plan
{
	
	abstract public boolean addNode(Node parent);
	
	//remove given node from the children list in its parent node
	abstract public boolean removeNode(Node x);
	
	abstract public Node getRoot();
	
	abstract public ArrayList<String> getList();
	
	//set data for the given node
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}
	

	
	
	
}