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
		// make a new VMOSA plan
		VMOSA planV = new VMOSA();
		
		//print out strings in the list
		for (int i = 0; i<planV.defaultNodes.size(); i++)
		{
			System.out.println(planV.defaultNodes.get(i));
		}
		
		//make a root node
		Node root = new Node(null, "Vision");
		
		// try to add vision again and check to see that it wasn't added
		assertEquals(false, planV.addNode(root, "Vision"));
		assertEquals(true, root.children.isEmpty());
		//add objective, and following, nodes
		assertEquals(true, planV.addNode(root, "Objective"));
		

		
		
		
	}
	
	public void main(String[] args)
	{
		test();
	}


}
