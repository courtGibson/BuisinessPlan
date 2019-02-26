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
public class IowaStateTest
{
	
	@Test
	public void test()
	{
		// make a new VMOSA plan
		Plan IowaStatePlan = new VMOSA();
		
		//print out strings in the list
		for (int i = 0; i<IowaStatePlan.getList().size(); i++)
		{
			System.out.println(IowaStatePlan.getList().get(i));
		}
		
		//get root node
		Node rootNode = IowaStatePlan.getRoot();
		// try to add vision again and check to see that it wasn't added
		assertEquals(false, IowaStatePlan.addNode(rootNode));
		assertEquals(false, rootNode.children.isEmpty());
		//add objective, and following, nodes
		Node missionNode = rootNode.children.get(0);
		//System.out.println(missionNode.children);
		assertEquals(true, IowaStatePlan.addNode(missionNode));
		assertEquals(2, missionNode.children.size());
		
		assertEquals(false, IowaStatePlan.removeNode(rootNode));
		assertEquals(false, IowaStatePlan.removeNode(missionNode));
		
		Node rm = missionNode.children.get(0);
		
		assertEquals(true, IowaStatePlan.removeNode(rm));
		assertEquals(1, missionNode.children.size());
		
		missionNode.setData("hello");
		assertEquals("hello", missionNode.getData());
		
		Node rm2 = missionNode.children.get(0).children.get(0);
		
		assertEquals(false, IowaStatePlan.removeNode(rm2));
		
		

		
		
		
	}
	
	public void main(String[] args)
	{
		test();
	}


}
