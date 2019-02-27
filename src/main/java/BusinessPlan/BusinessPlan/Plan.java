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
	//abstract methods addNode, removeNode, getRoot, getList 
	//   to be implemented in concrete classes
	abstract public boolean addNode(Node parent);
	
	//remove given node from the children list in its parent node
	abstract public boolean removeNode(Node Node);
	
	abstract public Node getRoot();
	
	abstract public ArrayList<String> getList();

	
	//set data for the given node
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}
	

	
	
	
}