package no.hvl.dat102.mengde;

public interface MengdeADT<T> {

	int getAntall();

	boolean isEmpty();
	
	boolean contains(T anElement);
	
	boolean isSubset(MengdeADT<T> set);
	
	boolean isEqual(MengdeADT<T> set);

	boolean isDisjunct(MengdeADT<T> set);
	
	MengdeADT<T> findUnion(MengdeADT<T> set);
	
	MengdeADT<T> findDifference(MengdeADT<T> set);

	MengdeADT<T> setIntersection(MengdeADT<T> set);

	void addElement(T newElement);
	
	T removeElement(T anElement);

	T[] toArray();

	String toString();
	
}
