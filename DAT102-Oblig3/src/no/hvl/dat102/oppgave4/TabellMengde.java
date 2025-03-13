package no.hvl.dat102.oppgave4;

import java.util.ArrayList;
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
    public boolean contains(T anElement) { //O(n)
        for (int i = 0; i < antall; i++) {
            if (set[i].equals(anElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSubset(MengdeADT<T> otherSet) { //Brute force O(n^2)
        T[] arr = otherSet.toArray();
        for (T s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < antall; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(set[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEqual(MengdeADT<T> otherSet) {
        T[] otherSetArray = otherSet.toArray();
        return Arrays.equals(set, otherSetArray);
    }

    @Override
    public MengdeADT<T> isDisjunct(MengdeADT<T> otherSet) {
        return null;
    }

    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> otherSet) {
        return null;
    }

    @Override
    public MengdeADT<T> setMinus(MengdeADT<T> otherSet) {
        return null;
    }

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
