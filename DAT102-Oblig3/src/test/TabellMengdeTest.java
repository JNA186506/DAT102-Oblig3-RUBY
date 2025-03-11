package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.oppgave4.MengdeADT;
import no.hvl.dat102.oppgave4.TabellMengde;

class TabellMengdeTest {
	
	MengdeADT tabellMengde;
	
	@BeforeEach
	void setUp() {
		
		tabellMengde = new TabellMengde(5);
		
	}
	
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
		assertFalse(tabellMengde.contains(12));
		
	}
	
	@Test
	void testIsSubset() {
		
		tabellMengde.addElement(12);
		tabellMengde.addElement(13);
		tabellMengde.addElement(14);
		
		MengdeADT tabellMengde2 = new TabellMengde(5);
		tabellMengde2.addElement(12);
		
		assertTrue(tabellMengde.isSubset(tabellMengde2));
		
		tabellMengde2.addElement(4);
		
		assertFalse(tabellMengde.isSubset(tabellMengde2));
		
	}
	
}
