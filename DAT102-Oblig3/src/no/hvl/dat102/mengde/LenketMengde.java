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
            if (n.data.equals(anElement)) {
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
            if (!set.contains(n.data)) { return false; }
            n = n.next;
        }
        return true;
    }

    @Override
    public boolean isEqual(MengdeADT<T> set) {
        return isSubset(set) && set.isSubset(this);
    }

    @Override
    public boolean isDisjunct(MengdeADT<T> set) {
        Node<T> n = node;

        while (n != null) {
            if (set.contains(n.data)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }

    @Override
    public MengdeADT<T> findUnion(MengdeADT<T> set) {
        MengdeADT<T> unionLList = new LenketMengde<>();
        Node<T> n = node;

        while (n != null) {
            unionLList.addElement(n.data);
            n = n.next;
        }

        for (T element : set.toArray()) {
            if (!unionLList.contains(element)) {
                unionLList.addElement(element);
            }
        }

        return unionLList;
    }

    @Override
    public MengdeADT<T> setIntersection(MengdeADT<T> set) {
        MengdeADT<T> nyMengde = new LenketMengde<>();
        Node<T> n = node;

        while (n != null) {
            if (set.contains(n.data)) nyMengde.addElement(n.data);
            n = n.next;
        }

        return nyMengde;
    }

    @Override
    public MengdeADT<T> findDifference(MengdeADT<T> set) {
        MengdeADT<T> nyMengde = new LenketMengde<>();
        Node<T> n = node;

        while (n != null) {
            if (!set.contains(n.data)) nyMengde.addElement(n.data);
            n = n.next;
        }

        return nyMengde;
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
            if (n.data.equals(anElement)) {
                node = n.next;
                antall--;
                return anElement;
            }
            n = n.next;
        }
        return null;
    }

    @Override
    public T[] toArray() {
        Node<T> n = node;
        T[] arr = (T[]) new Object[antall];

        int i = 0;
        while (n != null) {
            arr[i] = n.data;
            i++;
            n = n.next;
        }

        return arr;
    }
}
