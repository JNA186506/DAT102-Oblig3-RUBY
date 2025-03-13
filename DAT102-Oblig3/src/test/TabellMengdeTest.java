package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.oppgave4.MengdeADT;
import no.hvl.dat102.oppgave4.TabellMengde;

class TabellMengdeTest<T> {
	
	MengdeADT<Integer> tabellMengde = new TabellMengde<Integer>();
	
	@BeforeEach
	void setUp() {
		
		tabellMengde.addElement(12);
		tabellMengde.addElement(13);
		tabellMengde.addElement(14);
		
	}
	
	@Test
	void testIsEmpty() {
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>();
		
		assertTrue(tabellMengde2.isEmpty());
		tabellMengde2.addElement(12);
		assertFalse(tabellMengde2.isEmpty());
		
	}
	
	@Test
	void testContains() {
		
		assertFalse(tabellMengde.contains(20));
		tabellMengde.addElement(20);
		assertTrue(tabellMengde.contains(20));
		
	}

	@Test
	void testIsSubset() {

		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>();
		tabellMengde2.addElement(12);

		assertTrue(tabellMengde.isSubset(tabellMengde2));

		tabellMengde2.addElement(4);

		assertFalse(tabellMengde.isSubset(tabellMengde2));

	}


	@Test
	void testIsEqual() {
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>();
		tabellMengde2.addElement(12);
		
		assertFalse(tabellMengde.isEqual(tabellMengde2));
		
		tabellMengde2.addElement(13);
		tabellMengde2.addElement(14);
		
		assertTrue(tabellMengde.isEqual(tabellMengde2));
		
	}

	/* Metode ikkje implementert i TabellMengde enda
	@Test
	void testIsDisjunct() {
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>(5);
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(3);
		
		assertTrue(tabellMengde.isDisjunct(tabellMengde2));
		
		tabellMengde2.addElement(12);
		
		assertFalse(tabellMengde.isDisjunct(tabellMengde2));
		
	}
	*//* Metode ikkje implementert i TabellMengde enda
	@Test
	void testSetMinus() {
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>(5);
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(12);
		
		MengdeADT<Integer> tabellMengde3 = new TabellMengde<Integer>(5);
		tabellMengde3.addElement(12);
		
		assertEquals(tabellMengde.setMinus(tabellMengde2), tabellMengde3);
		
	}
	*//* Metode ikkje implementert i TabellMengde enda
	@Test
	void testUnion() {
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>(5);
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(12);
		
		MengdeADT<Integer> tabellMengde3 = new TabellMengde<Integer>(5);
		tabellMengde3.addElement(12);
		tabellMengde3.addElement(13);
		tabellMengde3.addElement(14);
		tabellMengde3.addElement(1);
		tabellMengde3.addElement(1);
		
		assertEquals(tabellMengde.union(tabellMengde2), tabellMengde3);
		
	}
	*//* Difference, AddElement, RemoveElement
	
	*/
}
