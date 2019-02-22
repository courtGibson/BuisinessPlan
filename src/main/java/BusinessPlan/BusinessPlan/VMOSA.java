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
	ArrayList<String> defaultNodes = new ArrayList<String>(); 
	
	private void setDefaultStrings()
	{
		defaultNodes.add("Vision");
		defaultNodes.add("Mission");
		defaultNodes.add("Objective");
		defaultNodes.add("Strategy");
		defaultNodes.add("Action Plan");
		defaultNodes.add("Assessment");
	}
	
	private void addDefaultNodes(ArrayList<String> defaultNodes)
	{
		Node parent = null;
		
		for (int i = 0; i<defaultNodes.size(); i++)
		{
			Node newNode = parent.addChild(defaultNodes.get(i), parent);
			parent = newNode;
		}
	
		
	}
	
	
	public VMOSA()
	{
		this.node = node;
		defaultNodes.clear();
		setDefaultStrings();
		addDefaultNodes(defaultNodes);
	}
	
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
