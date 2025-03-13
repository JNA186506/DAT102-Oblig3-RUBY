package no.hvl.dat102.oppgave4;

import java.util.ArrayList;
import java.util.Arrays;

public class TabellMengde<T> implements MengdeADT<T> {
	
	/*
	 * Implementert:
	 * isEmpty
	 * contains
	 * isSubset
	 * isDisjunct
	 * addElement
	 * removeElement
	 * 
	 * Ikkje implementert:
	 * isEqual
	 * findUnion
	 * setMinus
	 * findDifference
	 */
	
    private static final int INITIAL_CAPACITY = 10;

    private T[] set;
    private int antall;

    public TabellMengde() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
	public TabellMengde(int capacity) {
        set = (T[]) new Object[capacity];
        antall = 0;
    }

    @Override
    public boolean isEmpty() {
        return antall == 0;
    }

    @Override
    public boolean contains(T anElement) { //O(n)
        for (int i = 0; i < antall; i++) {
            if (set[i].equals(anElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSubset(MengdeADT<T> set) {
    	
    	for(int i = 0; i < antall; i++) {
    		
    		if(!set.contains(this.set[i])) {
    			
    			return false;
    			
    		}
    		
    	}
    	
        return true;
        
    }
    // Ikkje implementert
    @Override
    public boolean isEqual(MengdeADT<T> otherSet) {
        T[] otherSetArray = otherSet.toArray();
        return Arrays.equals(set, otherSetArray);
    }
    
    @Override
    public boolean isDisjunct(MengdeADT<T> set) {
    	
    	for(int i = 0; i < antall; i++) {
    		
    		if(set.contains(this.set[i])) return false;
    		
    	}
    	
    	return true;

    }
    // Ikkje implementert
    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> otherSet) {
        return null;
    }
    // Ikkje implementert
    @Override
    public MengdeADT<T> setMinus(MengdeADT<T> otherSet) {
        return null;
    }
    // Ikkje implementert
    @Override
    public MengdeADT<T> findDifference(MengdeADT<T> otherSet) {
        return null;
    }

    @Override
    public void addElement(T newElement) {
        if (antall == INITIAL_CAPACITY) {
            set = Arrays.copyOf(set, set.length*2);
        }

        set[antall] = newElement;
        antall++;
    }

    @Override
    public T removeElement(T anElement) {
    	
    	for(int i = 0; i < antall; i++) {
    		
    		if(set[i].equals(anElement)) {
    			
    			for(int j = i; j < antall - 1; j++) {
    				
    				set[j] = set[j + 1];
    				
    			}
    			
    			set[antall - 1] = null;
    			antall--;
    			
    			return anElement;
    			
    		}
    		
    	}
    	
        return null;
    }

    @Override
    public T[] toArray() {
        T[] kopi = (T[]) new Object[this.INITIAL_CAPACITY];

        for (int i = 0; i < this.antall; i++) {
            kopi[i] = this.set[i];
        }
        return kopi;
    }
}
