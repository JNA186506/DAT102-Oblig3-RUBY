package no.hvl.dat102.mengde;

import java.util.HashSet;
import java.util.Set;

public class JavaSetToMengde<T> implements MengdeADT<T> {
	
	private static final int INITIAL_CAPACITY = 10;
	
	private Set<T> set;
	
	public JavaSetToMengde() {
		
		this(INITIAL_CAPACITY);
		
	}
	
	public JavaSetToMengde(int capacity) {
		
		set = new HashSet<T>(capacity);
		
	}
	
	@Override
	public int getAntall() {
		
		return set.size();
		
	}
	
	@Override
	public boolean isEmpty() {
		
		return set.isEmpty();
		
	}
	
	@Override
	public boolean contains(T anElement) {
		
		return set.contains(anElement);
		
	}
	
	@Override
	public boolean isSubset(MengdeADT<T> set) {
		
		for(T t : this.set) {
			
			if(!set.contains(t)) return false;
			
		}
		
		return true;
		
	}
	
	@Override
	public boolean isEqual(MengdeADT<T> set) {
		
		return (isSubset(set) && set.isSubset(this));
		
	}
	
	@Override
	public boolean isDisjunct(MengdeADT<T> set) {
		
		for(T t : this.set) {
			
			if(set.contains(t)) return false;
			
		}
		
		return true;
	}
	
	@Override
	public MengdeADT<T> findUnion(MengdeADT<T> set) {
		
		MengdeADT<T> temp = new JavaSetToMengde<T>();
		T[] tList = set.toArray();
		
		for(T t : tList) {
			
			temp.addElement(t);
			
		}
		
		tList = toArray();
		
		for(T t : tList) {
			
			temp.addElement(t);
			
		}
		
		return temp;
	}
	
	@Override
	public MengdeADT<T> findDifference(MengdeADT<T> set) {
		
		MengdeADT<T> temp = new JavaSetToMengde<T>();
		
		for(T t : this.set) {
			
			if(!set.contains(t)) temp.addElement(t);
			
		}
		
		return temp;
	}
	
	@Override
	public MengdeADT<T> setIntersection(MengdeADT<T> set) {
		
		MengdeADT<T> temp = new JavaSetToMengde<T>();
		
		for(T t : this.set) {
			
			if(set.contains(t)) temp.addElement(t);
			
		}
		
		return temp;
	}
	
	@Override
	public void addElement(T newElement) {
		
		set.add(newElement);
		
	}
	
	@Override
	public T removeElement(T anElement) {
		
		if(set.remove(anElement)) {
			
			return anElement;
			
		}
		
		return null;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		
		return (T[]) set.toArray();
		
	}
	
}
