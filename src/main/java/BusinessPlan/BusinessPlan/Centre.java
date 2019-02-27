/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney and Jack
 *
 */
public class Centre extends Plan
{
		public String name;
		public ArrayList<String> defaultNodes = new ArrayList<String>(); 
		public Node root;
		//set strings for default stages VMOSA plan

	private void setDefaultStrings()
	{
		defaultNodes.add("Mission");
		defaultNodes.add("Goal");
		defaultNodes.add("Learning Objective");
		defaultNodes.add("Assement Process");
		defaultNodes.add("Results");
	}
	
	// make nodes for all of the strings in defaultNodes
	// Create pointer for tree called root
	private void addDefaultNodes()
	{
		root = new Node(null, defaultNodes.get(0), null, null);
		Node newNode = new Node(root, defaultNodes.get(1), null, null);
		root.addChild(newNode);
		addNode(newNode);		
	}
	
	// constructor
	public Centre()
	{
		defaultNodes.clear();
		setDefaultStrings();
		addDefaultNodes();
	}
	
	
	
	// addNode method from abstract Plan class
	// if trying to add Mission and they are already there
	// makes node and sets to parent, uses for loop to iterate through the list of names
	public boolean addNode(Node parent)
	{	
		// throw an exception here
		if (parent == null)
		{
			throw new IllegalArgumentException("Cannot add to this parent");
		}
		else
		{
		// check math
			for (int i = (defaultNodes.indexOf(parent.getName()))+1; i < defaultNodes.size(); i++)
			{
			
				Node newNode = new Node(parent, defaultNodes.get(i), null, null);
			
				parent.addChild(newNode);
				parent = newNode;
			
			}
			return true;
		}
	}
	
	public boolean removeNode(Node nodeRemove)
	{
		if ((nodeRemove.getName() == root.getName()) 
				|| nodeRemove.getParent().children.size()==1)
		{
		
			throw new IllegalArgumentException("Cannot remove this node");
		
	    }
		else
		{
			nodeRemove.parent.removeChild(nodeRemove);
			nodeRemove.setParent(null);
			return true;

		}
	}
	
	//Getter and setters
	public Node getRoot()
	{
		return root;
	}
	
	public ArrayList<String> getList()
	{
		return defaultNodes;
	}
	
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}