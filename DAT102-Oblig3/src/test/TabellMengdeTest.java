package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.oppgave4.MengdeADT;
import no.hvl.dat102.oppgave4.TabellMengde;

class TabellMengdeTest<T> {
	
	MengdeADT<Integer> tabellMengde = new TabellMengde<Integer>(5);
	
	@Test
	void testIsEmpty() {
		
		assertTrue(tabellMengde.isEmpty());
		tabellMengde.addElement(12);
		assertFalse(tabellMengde.isEmpty());
		
	}
	
	@Test
	void testContains() {
		
		assertFalse(tabellMengde.contains(12));
		tabellMengde.addElement(12);
		assertTrue(tabellMengde.contains(12));
		
	}
	/* Metode ikkje implementert i TabellMengde enda
	@Test
	void testIsSubset() {
		
		tabellMengde.addElement(12);
		tabellMengde.addElement(13);
		tabellMengde.addElement(14);
		
		MengdeADT<Integer> tabellMengde2 = new TabellMengde<Integer>(5);
		tabellMengde2.addElement(12);
		
		assertTrue(tabellMengde.isSubset(tabellMengde2));
		
		tabellMengde2.addElement(4);
		
		assertFalse(tabellMengde.isSubset(tabellMengde2));
		
	}
	*/
}
