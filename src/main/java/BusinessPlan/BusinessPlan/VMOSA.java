/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney
 *
 */
public class VMOSA extends Plan
{
	// probably a better way to do this but had a hard time
	//  getting it to work
	protected ArrayList<String> defaultNodes = new ArrayList<String>(); 
	protected Node root;
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
		Node root = new Node(null, defaultNodes.get(0));
		
		
	
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

		
		
		Node newParent = new Node(start, defaultNodes.get(1));
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
			for (int i = (defaultNodes.indexOf(parent.getName()))+1; i > defaultNodes.size(); i++)
			{
			
				Node newNode = new Node(parent, defaultNodes.get(i));
			
				parent.addChild(newNode);
				parent = newNode;
			
			}
			return true;
		}
	}
	
	public boolean removeNode(Node x)
	{
		if (x.getName() == root.getName() || x.getName() == defaultNodes.get(1))
		{
		
			System.out.println("error");
			return false;
		
	    }
		else
		{
			x.parent.removeChild(x);
			x.setParent(null);
			return true;

		}
	}
}
