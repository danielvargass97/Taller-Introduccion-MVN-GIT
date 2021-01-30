package edu.escuelaing.arep.app;

import edu.escuelaing.arep.calculator.Mean;
import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Node;
import junit.framework.TestCase;

/**
 * 
 * @author Daniel
 *
 */
public class MeanTest extends TestCase{
	
	LinkedList<Node> list;
	
	/**
	 * Create a test case.
	 */
	public MeanTest() {
	}
	
	/**
	 * Test that verifies the result of the statistical 
	 * mean. Data taken from table 1 - column 1 of the 
	 * stated pdf.
	 */
	public void testCalculateMean1() {
		list = new LinkedList<Node>();
		list.add(160);
    	list.add(591);
    	list.add(114);
    	list.add(229);
    	list.add(230);
    	list.add(270);
    	list.add(128);
    	list.add(1657);
    	list.add(624);
    	list.add(1503);
    	Mean mean = new Mean();
    	mean.calculateMean(list);
    	assertEquals(550.6, mean.getResult());
	}
	
	/**
	 * Test that verifies the result of the statistical 
	 * mean. Data taken from table 1 - column 2 of the 
	 * stated pdf.
	 */
	public void testCalculateMean2() {
		list = new LinkedList<Node>();
		list.add(15.0);
    	list.add(69.9);
    	list.add(6.5);
    	list.add(22.4);
    	list.add(28.4);
    	list.add(65.9);
    	list.add(19.4);
    	list.add(198.7);
    	list.add(38.8);
    	list.add(138.2);
    	Mean mean = new Mean();
    	mean.calculateMean(list);
    	assertEquals(60.32, Math.round(mean.getResult()*100.0)/100.0);
	}
	
	/**
	 * Test that verifies the result of the statistical 
	 * mean. Data taken from table 3 of the stated pdf.
	 */
	public void testCalculateMean3() {
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
    	Mean media = new Mean();
    	media.calculateMean(list);
    	assertEquals(638.9, media.getResult());
    }  
}
