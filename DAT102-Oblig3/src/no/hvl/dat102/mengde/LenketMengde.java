package no.hvl.dat102.mengde;

public class LenketMengde<T> implements MengdeADT<T> {

    private int antall;
    private Node node;


    @Override
    public int getAntall() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T anElement) {
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
    public boolean isDisjunct(MengdeADT<T> set) {
        return false;
    }

    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> set) {
        return null;
    }

    @Override
    public MengdeADT<T> findDifference(MengdeADT<T> set) {
        return null;
    }

    @Override
    public MengdeADT<T> setIntersection(MengdeADT<T> set) {
        return null;
    }

    @Override
    public void addElement(T newElement) {

    }

    @Override
    public T removeElement(T anElement) {
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
