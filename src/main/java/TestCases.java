package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestCases {
	// Testing the method Power
   	@Test
	public void Power() {
	Group tst1 = new Group();
	double output_mul = tst2.divide(5, 2);
	assertEquals(25, output_mul, 0.01);
	} 

	// Testing the method multiply
	@Test
	public void multiply() {
	Group tst2 = new Group();
	double output_mul = tst2.divide(10, 2);
	assertEquals(20, output_mul, 0.01);
	}

	// Testing the method intDivision
	@Test
	public void intDivision() {
	Group tst3 = new Group();
	double output_div = tst2.divide(10, 2);
	assertEquals(5, output_div, 0.01);
	}

	// Testing the methods getAnthonysName
	@Test
	void testReturnAnthony() {
		String result = Group.getAnthonysName();
		assertEquals("Anthony Smith", result);
	}
	
	// testing the method eliAmeshie
	@Test
	void testReturnEli() {
		Group eli = new Group();
		String expected = "Eli Ameshie";
		String result = eli.eliAmeshie();
		assertEquals(expected, result);
	}
	
	// testing the method kaylaKeplinger
	@Test
	void testReturnKayla() {
		Group kayla = new Group();
		String expected = "Kayla Keplinger";
		String result = kayla.kaylaKeplinger();
		assertEquals(expected, result);
	}
	
	// Testing the method AssaadAlAssaad
	@Test
	void testReturnAssaad() {
		Group assaad = new Group();
		String expected = "Assaad AlAssaad";
		String result = assaad.AssaadAlAssaad();
		assertEquals(expected, result);
	}
	
	/* WARNING: FAILING TEST
 	 * Testing the method getGroupMembers. This test is currently failing due to Trevor's 
	 * name not being added. Either we add him in for him, or we have to make the array
	 * smaller and accept he isn't available for this step in the project
	 */
	@Test
	void testReturnsAllGroupMembers() {
		Group everyone = new Group();
		String[] expected = {"Kayla Keplinger", "Anthony Smith", "Eli Ameshie", "Assaad AlAssaad"};
		String[] result = everyone.getGroupMembers();
		assertEquals(expected, result);
	}

}
