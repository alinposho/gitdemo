package com.alin.posorovaschi.linkedlist;

/**
 * This is the container for the Linked List that implements reversing operations
 */
public abstract class LinkedList<T> {

    protected Node<T> first;
    protected Node<T> last;

    protected LinkedList() {
        this(null);
    }

    public LinkedList(Node<T> first) {
        this.first = first;
        if (first == null) {
            last = null;
        } else {
            Node<T> temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            last = temp;
        }

    }

    public abstract LinkedList<T> reverse();

    public boolean isEmpty() {
        return first == null;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "[]";
        }

        StringBuffer buf = new StringBuffer("[");
        buf.append(first.getValue());

        Node<T> temp = first.getNext();
        while (temp != null) {
            buf.append(", ");
            buf.append(temp.getValue());
            temp = temp.getNext();
        }

        buf.append("]");

        return buf.toString();
    }
}
