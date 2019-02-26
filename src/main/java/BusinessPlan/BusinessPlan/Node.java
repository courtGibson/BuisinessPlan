
/**
 * 
 */
package BusinessPlan.BusinessPlan;
import java.util.ArrayList;
/**
 * @author Courtney and Jack
 *
 */
public class Node
{
	Node parent;
	String name;
	String data;
	ArrayList<Node> children = new ArrayList<Node>();
	
	/**
	 * @param name
	 * @param data
	 * @param parent
	 * @param children
	 */
	//constructor 
	/*public Node(String name, String data, Node parent)
	{
		this.name = name;
		this.data = data;
		this.parent = parent;
		//this.children = children;
	}*/
	
	//constructor is data is not known	
	public Node(Node parent, String name, String data, ArrayList<Node> child)
	{
		this.name = name;
		this.parent = parent;
		this.data = data;
		
		
		
	}
	
	//empty constructor for XML


	//Getter and setters
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
	
	//
	
	//add a child, a node, to another node
	public void addChild(Node child)
	{
		this.children.add(child);
	}
	
	
	//remove child from a node's children list
	public void removeChild(Node child)
	{
		this.children.remove(child);
	}
	

}
