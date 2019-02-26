/**
 * 
 */
package BusinessPlan.BusinessPlan;

import static org.junit.Assert.*;
import java.util.ArrayList;

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
		VMOSA VMOSAPlan = new VMOSA();
		
		//print out strings in the list
		for (int i = 0; i<VMOSAPlan.defaultNodes.size(); i++)
		{
			System.out.println(VMOSAPlan.defaultNodes.get(i));
		}
		
		//make a root node
		Node root = new Node(null, "Vision");
		
		// try to add vision again and check to see that it wasn't added
		assertEquals(false, VMOSAPlan.addNode(root));
		assertEquals(true, root.children.isEmpty());
		//add objective, and following, nodes
		assertEquals(true, VMOSAPlan.addNode(root));
		

		
		
		
	}
	
	public void main(String[] args)
	{
		test();
	}


}
