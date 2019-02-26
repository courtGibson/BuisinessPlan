/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.util.ArrayList;

/**
 * @author Courtney
 *
 */
public class Centre
{

	// probably a better way to do this but had a hard time
	//  getting it to work
	protected ArrayList<String> defaultNodes;
	protected Node root;	
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
	
	public Centre()
	{
		defaultNodes.clear();
		setDefaultStrings();
		Node Centre = addDefaultNodes(defaultNodes);
	}
	
	// addNode method from abstract Plan class
	// if trying to add Vision or Mission and they are already there
	// it returns false
	// Otherwise, makes and adds new node, returns true
	public boolean addNode(Node parent, String newNodeName)
	{
		if ((parent.getName() == "Mission" && parent.children.size()!=0))
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