package edu.escuelaing.arep.app;

import edu.escuelaing.arep.calculator.StandardDeviation;
import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Node;
import junit.framework.TestCase;

/**
 * 
 * @author Daniel
 *
 */
public class StandardDeviationTest extends TestCase{
	
	LinkedList<Node> list;
	
    /**
     * Create the test case
     */
    public StandardDeviationTest(){
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
    	StandardDeviation SD = new StandardDeviation();
    	SD.calculateStandardDeviation(list);
    	assertEquals(572.03, Math.round(SD.getResult()*100.0)/100.0);
	}
	
	/**
	 * Test that verifies the result of the statistical 
	 * mean. Data taken from table 1 - column 2 of the 
	 * stated pdf.
	 */
	public void testCalculateStandartDeviation2() {
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
    	StandardDeviation SD = new StandardDeviation();
    	SD.calculateStandardDeviation(list);
    	assertEquals(62.26, Math.round(SD.getResult()*100.0)/100.0);
	}
 
    /**
     * Test that verifies the result of the standard 
     * deviation.Data taken from table 3 of the stated 
     * pdf.
     */
    public void testCalculateStandardDeviation3() {
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
    	StandardDeviation SD = new StandardDeviation();
    	SD.calculateStandardDeviation(list);
    	assertEquals(625.633981, Math.round(SD.getResult()*1000000.0)/1000000.0);
    }
}
