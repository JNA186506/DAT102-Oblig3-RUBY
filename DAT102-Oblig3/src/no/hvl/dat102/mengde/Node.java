package no.hvl.dat102.mengde;

public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNode() {
        return next;
    }

    public void setNode(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (next == null) {
            return "[" + data + " | null ] ";
        }

        return "[" + data + " |  -]--> " + next;
    }
}
