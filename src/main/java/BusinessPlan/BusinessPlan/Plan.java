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
	/**
	 * @param parent
	 * @return
	 */
	abstract public boolean addNode(Node parent);
	
	//remove given node from the children list in its parent node
	abstract public boolean removeNode(Node Node);
	
	abstract public Node getRoot();
	
	abstract public ArrayList<String> getList();

	abstract public String getName();

	abstract public void setName(String name);
	
	//set data for the given node
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}

	
	
	
}