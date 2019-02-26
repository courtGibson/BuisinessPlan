/**
 * 
 */
package BusinessPlan.BusinessPlan;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Courtney and Jack
 *
 */
public class CentreTest
{
	@Test
	public void test()
	{
		// make a new VMOSA plan
		Plan CentrePlan = new Centre();
		
		//print out strings in the list
		for (int i = 0; i<CentrePlan.getList().size(); i++)
		{
			System.out.println(CentrePlan.getList().get(i));
		}
		
		//get root node
		Node rootNode = CentrePlan.getRoot();
		// try to add vision again and check to see that it wasn't added
		assertEquals(false, CentrePlan.addNode(null));
		assertEquals(false, rootNode.children.isEmpty());
		//add objective, and following, nodes
		Node goalNode = rootNode.children.get(0);
		//System.out.println(goalNode.children);
		assertEquals(true, CentrePlan.addNode(rootNode));
		assertEquals(2, rootNode.children.size());
		
		assertEquals(false, CentrePlan.removeNode(rootNode));
		
		Node rm = rootNode.children.get(0);
		
		assertEquals(true, CentrePlan.removeNode(rm));
		assertEquals(1, rootNode.children.size());
		
		goalNode.setData("hello");
		assertEquals("hello", goalNode.getData());
	
		Node rm2 = goalNode.children.get(0);
		
		assertEquals(false, CentrePlan.removeNode(rm2));
		
		

		
	}
	
	public void main(String[] args)
	{
		test();
	}

}
