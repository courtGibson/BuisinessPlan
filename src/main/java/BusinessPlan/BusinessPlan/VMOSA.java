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
	
	private void setDefaults()
	{
		defaultNodes.add("Vision");
		defaultNodes.add("Mission");
		defaultNodes.add("Objective");
		defaultNodes.add("Strategy");
		defaultNodes.add("Action Plan");
		defaultNodes.add("Assessment");
	}
	
	
	
	public VMOSA()
	{
		defaultNodes.clear();
		setDefaults();
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
				Node newNode = new Node(parent, defaultNodes.get(i));
				parent.addChild(newNode);
				parent = newNode;
			}
			
			return true;
			
		}
	}
}
