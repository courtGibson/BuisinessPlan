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
	
	public void removeNode(Node node)
	{
		node.getParent().removeChild(node);
	}
	
	public void setNodeData(Node node, String data)
	{
		node.setData(data);
	}
}






