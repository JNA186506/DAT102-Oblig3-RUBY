package no.hvl.dat102.oppgave4;

import java.util.Arrays;

public class TabellMengde<T> implements MengdeADT<T> {

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
    public boolean contains(T anElement) {
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

    @Override
    public boolean isEqual(MengdeADT<T> set) {
        return false;
    }

    @Override
    public boolean isDisjunct(MengdeADT<T> set) {
    	
    	for(int i = 0; i < antall; i++) {
    		
    		if(set.contains(this.set[i])) return false;
    		
    	}
    	
    	return true;
    	
    }

    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> set) {
        return null;
    }

    @Override
    public MengdeADT<T> setMinus(MengdeADT<T> set) {
        return null;
    }

    @Override
    public MengdeADT<T> findDifference(MengdeADT<T> set) {
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
}
