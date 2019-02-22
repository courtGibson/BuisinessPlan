/**
 * 
 */
package BusinessPlan.BusinessPlan;

/**
 * @author Courtney
 *
 */
public abstract class Plan
{
	Node node;
	
	
	abstract boolean addNode(Node parent, String name);
	
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






