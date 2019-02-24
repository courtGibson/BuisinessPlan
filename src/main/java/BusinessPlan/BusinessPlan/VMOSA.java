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
	public ArrayList<String> defaultNodes = new ArrayList<String>(); 
	Node root;
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
	private Node addDefaultNodes(ArrayList<String> defaultNodes)
	{
		Node parent = null;
		
		
		for (int i = 0; i<defaultNodes.size(); i++)
		{
			boolean added = addNode(parent, defaultNodes.get(i));
				
			if (i==0)
			{
				root = newNode;
			}
		}
		return root;
		
	}
	
	// constructor??
	public VMOSA()
	{
		defaultNodes.clear();
		setDefaultStrings();
		Node VMOSA = addDefaultNodes(defaultNodes);
	}
	
	// addNode method from abstract Plan class
	// if trying to add Vision or Mission and they are already there
	// it returns false
	// Otherwise, makes and adds new node, returns true
	public boolean addNode(Node parent)
	{
		
		if ((root!=null)
				||(parent.getName() == "Vision" && parent.children.size()!=0)
				|| (parent.getName() == "Mission" && parent.children.size()!=0))
		{
			return false;
		}
		else if(root==null)
		{
			for (int i = (defaultNodes.indexOf(parent.getName()))+1; i > defaultNodes.size(); i++)
			{
				Node newNode = Node(parent, defaultNodes.indexOf(i+1));
				parent.addChild(parent, defaultNodes.get(i));
				parent = newNode;
			}
			
			return true;
		}
	}
}
