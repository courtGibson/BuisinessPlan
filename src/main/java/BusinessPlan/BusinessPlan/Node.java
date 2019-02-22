
/**
 * 
 */
package BusinessPlan.BusinessPlan;
import java.util.ArrayList;
/**
 * @author Courtney
 *
 */
public class Node
{
	String name;
	String data;
	Node parent;
	ArrayList<Node> children = new ArrayList<Node>();
	
	/**
	 * @param name
	 * @param data
	 * @param parent
	 * @param children
	 */
	public Node(String name, String data, Node parent/*, Node[] children*/)
	{
		this.name = name;
		this.data = data;
		this.parent = parent;
		this.children = children;
		/*this.children = children;*/
	}
	
	public Node()
	{
		this("Title", "Description of goals", null);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public Node getParent()
	{
		return parent;
	}

	public void setParent(Node parent)
	{
		this.parent = parent;
	}
	
	public ArrayList<Node> getChildren()
	{
		return children;
	}
	
	public void addChild(Node child)
	{
		this.children.add(child);
	}
	
	public void removeChild(Node child)
	{
		this.children.remove(child);
	}
	
	
	
	
}
