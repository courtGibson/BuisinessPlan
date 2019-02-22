/**
 * 
 */
package BusinessPlan.BusinessPlan;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Courtney
 *
 */
public class VMOSATest
{

	@Test
	public void test()
	{
		VMOSA planV = new VMOSA();
		
		for (int i = 0; i<planV.defaultNodes.size(); i++)
		{
			System.out.println(planV.defaultNodes.get(i));
		}
		
		Node root = new Node(null, "Vision");
		
		assertEquals(false, planV.addNode(root, "Vision"));
		assertEquals(true, root.children.isEmpty());
		
		
		
		
	}
	
	public void main(String[] args)
	{
		test();
	}


}
