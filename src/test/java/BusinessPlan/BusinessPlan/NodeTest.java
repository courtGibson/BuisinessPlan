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
		
		//make tree node and test data methods
		Node tree = new Node("TreeNode", "Desciption of mission goals.", null);
		assertEquals("TreeNode", tree.getName());
		tree.setName("Tree");
		assertEquals("Tree", tree.getName());
		assertEquals("Desciption of mission goals.", tree.getData());
		tree.setData("Description");
		assertEquals("Description", tree.getData());
		assertEquals(null, tree.getParent());
		assertEquals(true, tree.children.isEmpty());
		
		
		//make child nodes for tree, test addChild and getParent
		Node n1 = new Node("Vision", "Desciption", tree);
		tree.addChild(n1);
		assertEquals(tree, n1.getParent());
		assertEquals("Vision", n1.getName());
		assertEquals(true, tree.children.contains(n1));
		
		Node n2 = new Node("node", "description", tree);
		tree.addChild(n2);
		assertEquals(true, tree.children.contains(n2));
		assertEquals(tree, n2.getParent());
		
		//add child to n2
		Node n3 = new Node("node3", "descr", n2);
		n2.addChild(n3);
		assertEquals(true, n2.children.contains(n3));
		assertEquals(n2, n3.getParent());
		
		// add child to n3
		Node n4 = new Node("node3", "descr", n3);
		n3.addChild(n4);
		
		//get grandparent
		assertEquals(n2, n4.getParent().getParent());
		
		//remove child from tree with no other children
		tree.removeChild(n1);
		assertEquals(false, tree.children.contains(n1));
		
		//remove child that has children
		tree.removeChild(n2);
		assertEquals(false, tree.children.contains(n2));
				
		
	}
	
	public void main(String[] args)
	{
		test();
	}

}