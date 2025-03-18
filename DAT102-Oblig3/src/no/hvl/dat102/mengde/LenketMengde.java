package no.hvl.dat102.mengde;

public class LenketMengde<T> implements MengdeADT<T> {

    private int antall;
    private Node<T> node;


    @Override
    public int getAntall() {
        return antall;
    }

    @Override
    public boolean isEmpty() {
        return antall == 0;
    }

    @Override
    public boolean contains(T anElement) {
        Node<T> n = node;
        while (n != null) {
            if (n.equals(anElement)) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    @Override
    public boolean isSubset(MengdeADT<T> set) {
        Node<T> n = node;
        while (n != null) {
            if (set.contains(n.data)) { return true; }
            n = n.next;
        }
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
        Node<T> n = new Node<>(newElement);

        if (this.contains(newElement) || newElement == null) {
            return;
        }

        n.next = node;
        node = n;
        antall++;

    }

    @Override
    public T removeElement(T anElement) {
        Node<T> n = node;

        while (n != null) {
            if (n.equals(anElement)) {
                node = n.next;
                return anElement;
            }
            n = n.next;
        }
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
