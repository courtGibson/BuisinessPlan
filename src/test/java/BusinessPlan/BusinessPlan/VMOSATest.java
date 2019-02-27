/**
 * 
 */
package BusinessPlan.BusinessPlan;

import static org.junit.Assert.*;
//import java.util.ArrayList;

import org.junit.Test;


/**
 * @author Courtney and Jack
 *
 */
public class VMOSATest
{

	@Test
	public void test()
	{
		try{
		// make a new VMOSA plan
		VMOSA VMOSAPlan = new VMOSA();
		
		//print out strings in the list
		for (int i = 0; i<VMOSAPlan.getList().size(); i++)
		{
			System.out.println(VMOSAPlan.getList().get(i));
		}
		
		
		//get root node
		Node rootNode = VMOSAPlan.getRoot();
		// try to add vision again and check to see that it wasn't added
		assertEquals(false, VMOSAPlan.addNode(rootNode));
		assertEquals(false, rootNode.children.isEmpty());

		//add objective, and following, nodes

		Node missionNode = rootNode.children.get(0);
		//System.out.println(missionNode.children);
		assertEquals(true, VMOSAPlan.addNode(missionNode));
		assertEquals(2, missionNode.children.size());
		
		assertEquals(false, VMOSAPlan.removeNode(rootNode));
		assertEquals(false, VMOSAPlan.removeNode(missionNode));
		
		Node rm = missionNode.children.get(0);
		
		assertEquals(true, VMOSAPlan.removeNode(rm));
		assertEquals(1, missionNode.children.size());
		
		missionNode.setData("hello");
		assertEquals("hello", missionNode.getData());
		
		Node rm2 = missionNode.children.get(0).children.get(0);
		
		assertEquals(false, VMOSAPlan.removeNode(rm2));
	
		}catch(IllegalArgumentException e)
		
		{
		  e.getMessage();
		}

	}
	
	public void main(String[] args)
	{
		test();
	}


}