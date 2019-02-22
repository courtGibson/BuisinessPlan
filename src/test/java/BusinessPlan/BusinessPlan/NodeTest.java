package BusinessPlan.BusinessPlan;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest
{

	@Test
	public void test()
	{
		
		//make node +
		//add child +
		//remove child 
		//get name, data +
		//set name, data +
		//get child when no child
		//
		
		Node tree = new Node("TreeNode", "Desciption of mission goals.", null);
		
		assertEquals("TreeNode", tree.getName());
		tree.setName("Tree");
		assertEquals("Tree", tree.getName());
		assertEquals("Desciption of mission goals.", tree.getData());
		tree.setData("Description");
		assertEquals("Description", tree.getData());
		assertEquals(null, tree.getParent());
		assertEquals(true, tree.children.isEmpty());
		
		Node n1 = new Node("Vision", "Desciption", tree);
		
		assertEquals(tree, n1.getParent());
		assertEquals("Vision", n1.getName());
		
		
		tree.addChild(n1);
		assertEquals(true, tree.children.contains(n1));
		
		
		
		
		
		
		
		
	}
	
	public void main(String[] args)
	{
		test();
	}

}
