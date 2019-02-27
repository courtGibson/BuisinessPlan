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
		try {
		// make a new VMOSA plan
		Plan IowaStatePlan = new IowaState();
		
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
		// check if added
		Node missionNode = rootNode.children.get(0);
		assertEquals(true, IowaStatePlan.addNode(missionNode));
		assertEquals(2, missionNode.children.size());
		
		//try to remove root and mission
		assertEquals(false, IowaStatePlan.removeNode(rootNode));
		assertEquals(false, IowaStatePlan.removeNode(missionNode));
		
		//remove mission node and check if removed
		Node rm = missionNode.children.get(0);
		assertEquals(true, IowaStatePlan.removeNode(rm));
		assertEquals(1, missionNode.children.size());
		
		//set mission data and check
		missionNode.setData("hello");
		assertEquals("hello", missionNode.getData());
		
		//try to remove a core value node
		Node rm2 = missionNode.children.get(0).children.get(0);
		assertEquals(false, IowaStatePlan.removeNode(rm2));
		
		}catch(IllegalArgumentException e)
		
		{
		  e.getMessage();
		}

	}
	
	//test invalid arguments
	@Test
	public void invalidArguments() 
	{
		//make plan and set pointer to root
		Plan IowaStatePlan2 = new IowaState();
		Node r = IowaStatePlan2.getRoot();
		// try to remove root
		try 
		{
			IowaStatePlan2.removeNode(r);
		    fail( "My method didn't throw when I expected it to" );
		} 
		catch (IllegalArgumentException e)
		{
			  e.getMessage();
		}
		//try to add a vision node
		try 
		{
			
			IowaStatePlan2.addNode(r);
		    fail( "My method didn't throw when I expected it to" );
		} 
		catch (IllegalArgumentException e)
		{
			  e.getMessage();
		}
		
	    
	}
	
	public void main(String[] args)
	{
		test();
		invalidArguments();
	}


}
