package no.hvl.dat102.mengde;

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

    public int getAntall() {
        return antall;
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
    public boolean isSubset(MengdeADT<T> set) { //O(n)
    	
    	for(int i = 0; i < antall; i++) {
    		if(!set.contains(this.set[i])) {
    			return false;
    		}
    	}
    	
        return true;
        
    }
    
    @Override
    public boolean isEqual(MengdeADT<T> otherSet) {
    	
    	return (isSubset(otherSet) && otherSet.isSubset(this));
    	
    }
    
    @Override
    public boolean isDisjunct(MengdeADT<T> otherSet) { //O(n)
    	
    	for(int i = 0; i < antall; i++) {
    		
    		if(otherSet.contains(set[i])) return false;
    		
    	}
    	
    	return true;
    	
    }
    
    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> otherSet) {
        MengdeADT<T> union = new TabellMengde<T>();

        for (int i = 0; i < antall; i++) {
            union.addElement(set[i]);
        }

        for (T t : otherSet.toArray()) {
        	union.addElement(t);
        }

        return union;
    }
    
    @Override
    public MengdeADT<T> setIntersection(MengdeADT<T> otherSet) {
        MengdeADT<T> intersection = new TabellMengde<>();

        for (int i = 0; i < antall; i++) {
            if (otherSet.contains(set[i])) {
                intersection.addElement(set[i]);
            }
        }

        return intersection;
    }

    @Override
    public MengdeADT<T> findDifference(MengdeADT<T> otherSet) {
        MengdeADT<T> minus = new TabellMengde<>();

        for (int i = 0; i < antall; i++) {
            if (!otherSet.contains(set[i])) {
                minus.addElement(set[i]);
            }
        }

        return minus;
    }

    @Override
    public void addElement(T newElement) {

        if (this.contains(newElement) || newElement == null) {
            return;
        }

        if (antall == set.length) {
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
        @SuppressWarnings("unchecked")
		T[] kopi = (T[]) new Object[INITIAL_CAPACITY];

        for (int i = 0; i < this.antall; i++) {
            kopi[i] = this.set[i];
        }
        return kopi;
    }

    @Override
    public String toString() {
        return "TabellMengde{" +
                "set=" + Arrays.toString(set) +
                ", antall=" + antall +
                '}';
    }
}
