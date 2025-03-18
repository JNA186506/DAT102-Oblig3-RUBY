package no.hvl.dat102.mengde;

public class Node<T> {

    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    @Override
    public String toString() {
        if (next == null) {
            return "[" + data + " | null ] ";
        }

        return "[" + data + " |  -]--> " + next;
    }
}
