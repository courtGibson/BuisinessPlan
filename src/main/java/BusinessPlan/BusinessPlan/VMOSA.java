/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney and Jack
 *
 */
public class VMOSA extends Plan
{
	
	// probably a better way to do this but had a hard time
	//  getting it to work
	public ArrayList<String> defaultNodes = new ArrayList<String>(); 
	public Node root;
	//set strings for default stages VMOSA plan
	private void setDefaultStrings()
	{
		defaultNodes.add("Vision");
		defaultNodes.add("Mission");
		defaultNodes.add("Objective");
		defaultNodes.add("Strategy");
		defaultNodes.add("Action Plan");
		defaultNodes.add("Assessment");
	}
	

	// make nodes for all of the strings in defaultNodes
	// Create pointer for tree called root
	private void addDefaultNodes()
	{
		Node first = new Node(null, defaultNodes.get(0), null, null);
		root = first;
		addRoot(root);
				
			
	}
	
	// constructor??
	public VMOSA()
	{
		defaultNodes.clear();
		setDefaultStrings();
		addDefaultNodes();
	}
	

	private void addRoot(Node start)
	{

		
		
		Node newParent = new Node(start, defaultNodes.get(1), null, null);
		start.addChild(newParent);
		addNode(newParent);
		
		
		
	}
	
	
	// addNode method from abstract Plan class
	// if trying to add Vision or Mission and they are already there
	// makes node and sets to parent, uses for loop to iterate through the list of names
	public boolean addNode(Node parent)
	{	
		// throw an exception here
		if (parent.getName() == "Vision" || parent == null)
		{
			System.out.println("error wrong");
			return false;
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
		if (nodeRemove.getName() == root.getName()
				|| nodeRemove.getParent().children.size()==1)
		{
		
			System.out.println("error");
			return false;
		
	    }
		else
		{
			nodeRemove.parent.removeChild(nodeRemove);
			nodeRemove.setParent(null);
			return true;

		}
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public ArrayList<String> getList()
	{
		return defaultNodes;
	}
}