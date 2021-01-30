package edu.escuelaing.arep.app;

import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Node;
import junit.framework.TestCase;

/**
 * 
 * @author Daniel
 *
 */
public class LinkedListTest extends TestCase{
	
	LinkedList<Node> list;
	
    /**
     * Create the test case
     */
    public LinkedListTest (){
    }

    /**
     * Test to confirm that the first item that matches 
     * the value is removed entered, if there is no such 
     * value in the list, no element is removed.
     */
    public void testRemoveLinkedList() {
    	list = new LinkedList<Node>();
    	list.add(100.0);
    	list.add(100.1);
    	list.add(100.2);
    	list.remove(100.0);
    	assertEquals(100.2, list.getValueHead());
    	assertEquals(100.1, list.getValueTail());
    }
    
    /**
     * Test that verifies the result of the statistical 
	 * mean. Data taken from table 3 of the stated pdf.
     */ 
    public void testAddLinkedList() {
    	list = new LinkedList<Node>();
    	list.add(100.0);
    	assertEquals(100.0, list.getValueHead());
    	assertEquals(100.0, list.getValueTail());
    	list.add(150.0);
    	assertEquals(150.0, list.getValueHead());
    	assertEquals(100.0, list.getValueTail());
    	list.add(300.0);
    	assertEquals(300.0, list.getValueHead());
    	assertEquals(100.0, list.getValueTail());
    }
    
    /**
     * Test that verifies the cycle "for" in the
     * implemented LinkedList.
     */
    @SuppressWarnings("unused")
	public void testIterator() {
    	list = new LinkedList<Node>();
    	list.add(186);
    	list.add(699);
    	list.add(132);
    	list.add(272);
    	list.add(291);
    	list.add(331);
    	list.add(199);
    	list.add(1890);
    	list.add(788);
    	list.add(1601);
    	boolean flag = true;
    	try {
    		for (Object x:list) {
    			continue;
    		}
		} catch (Exception e) {
			flag = false;
		}
    	assertEquals(true, flag);
    }
}
