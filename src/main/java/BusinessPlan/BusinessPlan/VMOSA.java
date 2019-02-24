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
	ArrayList<String> defaultNodes = new ArrayList<String>(); 
	
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
		Node root = null;
				
		for (int i = 0; i<defaultNodes.size(); i++)
		{
			Node newNode = parent.addChild(defaultNodes.get(i), parent);
			parent = newNode;
				
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
		Node VMOSA = addNode(defaultNodes);
	}
	
	// addNode method from abstract Plan class
	// if trying to add Vision or Mission and they are already there
	// it returns false
	// Otherwise, makes and adds new node, returns true
	public boolean addNode(Node parent, String newNodeName)
	{
		if ((parent.getName() == "Vision" && parent.children.size()==0)
				|| (parent.getName() == "Mission" && parent.children.size()==0))
		{
			return false;
		}
		else
		{
			for (int i = (defaultNodes.indexOf(parent.getName()))+1; i > defaultNodes.size(); i++)
			{
				Node newNode = parent.addChild(defaultNodes.get(i), parent);
				parent = newNode;
			}
			
			return true;
		}
	}
}
