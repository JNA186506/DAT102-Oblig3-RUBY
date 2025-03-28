package test;

import static org.junit.jupiter.api.Assertions.*;

import no.hvl.dat102.mengde.LenketMengde;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.JavaSetToMengde;
import no.hvl.dat102.mengde.MengdeADT;
import no.hvl.dat102.mengde.TabellMengde;

class TabellMengdeTest<T> {
	
	MengdeADT<Integer> tabellMengde = new JavaSetToMengde<Integer>();
	MengdeADT<Integer> tabellMengde2 = new JavaSetToMengde<Integer>();
	MengdeADT<Integer> tabellMengde3 = new JavaSetToMengde<Integer>();
	
	@BeforeEach
	void setUp() {
		
		tabellMengde.addElement(12);
		tabellMengde.addElement(13);
		tabellMengde.addElement(14);
		
	}
	
	@Test
	void testIsEmpty() {
		
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
		
		tabellMengde2.addElement(12);
		tabellMengde2.addElement(13);
		tabellMengde2.addElement(14);
		tabellMengde2.addElement(15);
		
		assertTrue(tabellMengde.isSubset(tabellMengde2));
		
		tabellMengde.addElement(4);
	
		assertFalse(tabellMengde.isSubset(tabellMengde2));
	
	}
	
	@Test
	void testIsEqual() {
		
		tabellMengde2.addElement(12);
		
		assertFalse(tabellMengde.isEqual(tabellMengde2));
		
		tabellMengde2.addElement(13);
		tabellMengde2.addElement(14);
		
		assertTrue(tabellMengde.isEqual(tabellMengde2));
		
		tabellMengde2.addElement(15);
		
		assertFalse(tabellMengde.isEqual(tabellMengde2));
		
	}
	
	@Test
	void testIsDisjunct() {
		
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(3);
		
		assertTrue(tabellMengde.isDisjunct(tabellMengde2));
		
		tabellMengde2.addElement(12);
		
		assertFalse(tabellMengde.isDisjunct(tabellMengde2));
		
	}
	
	@Test
	void testSetIntersection() {
		
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(12);
		
		tabellMengde3.addElement(12);
		
		assertTrue(tabellMengde.setIntersection(tabellMengde2).isEqual(tabellMengde3));
		
	}
	
	@Test
	void testUnion() {
		
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(12);
		
		tabellMengde3.addElement(12);
		tabellMengde3.addElement(13);
		tabellMengde3.addElement(14);
		tabellMengde3.addElement(1);
		tabellMengde3.addElement(2);

		assertTrue(tabellMengde.findUnion(tabellMengde2).isEqual(tabellMengde3));
		
	}
	
	@Test
	void testFindDifference() {
		
		tabellMengde2.addElement(1);
		tabellMengde2.addElement(2);
		tabellMengde2.addElement(12);
		
		tabellMengde3.addElement(13);
		tabellMengde3.addElement(14);
		
		assertTrue(tabellMengde.findDifference(tabellMengde2).isEqual(tabellMengde3));
		
	}
	
	@Test
	void testAddElement() {
		
		for(int i = 0; i < 20; i++) {
			
			tabellMengde2.addElement(i);
			
		}
		
		tabellMengde2.addElement(1);
		
		assertEquals(tabellMengde2.getAntall(), 20);
		
		for(int i = 0; i < 20; i++) {
			
			assertTrue(tabellMengde2.contains(i));
			
		}
		
	}
	
	@Test
	void testRemoveElement() {
		
		tabellMengde2.addElement(13);
		tabellMengde2.addElement(14);
		
		assertTrue(tabellMengde.contains(12));
		assertEquals(12, tabellMengde.removeElement(12));
		assertFalse(tabellMengde.contains(12));
		
	}
	
}
