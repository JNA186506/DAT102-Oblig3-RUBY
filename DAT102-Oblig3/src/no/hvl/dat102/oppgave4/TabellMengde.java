package no.hvl.dat102.oppgave4;

import java.util.Arrays;

public class TabellMengde<T> implements MengdeADT<T> {


    private static final int INITIAL_CAPACITY = 10;

    T[] set;
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
        return false;
    }

    @Override
    public boolean isEqual(MengdeADT<T> set) {
        return false;
    }

    @Override
    public MengdeADT<T> isDisjunct(MengdeADT<T> set) {
        return null;
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
        return null;
    }
}
