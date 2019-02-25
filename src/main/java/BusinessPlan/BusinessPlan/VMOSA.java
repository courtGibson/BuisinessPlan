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
		Node parent = null;
		
		
	
		boolean added = addNode(parent);
				
			
	}
	
	// constructor??
	public VMOSA()
	{
		defaultNodes.clear();
		setDefaultStrings();
		addDefaultNodes();
	}
	
	// addNode method from abstract Plan class
	// if trying to add Vision or Mission and they are already there
	// it returns false
	// Otherwise, makes and adds new node, returns true
	public boolean addNode(Node parent)
	{
		
		if ((parent!=null)&&
				((parent.getName() == "Vision" && parent.children.size()!=0)
					|| (parent.getName() == "Mission" && parent.children.size()!=0)))
		{
			return false;
		}
		else if(parent!=null)
		{
			addNodes(parent);
			
			return true;
		}
		else
		{
			Node newParent = new Node(null, defaultNodes.get(0));
			addNodes(newParent);
		}
		
		return false;
	}
	
	private void addNodes(Node parent)
	{
		for (int i = (defaultNodes.indexOf(parent.getName()))+1; i > defaultNodes.size(); i++)
		{
			
			Node newNode = new Node(parent, defaultNodes.get(i+1));
			
			parent.addChild(parent, newNode);
			parent = newNode;
			
		}
	}
}
