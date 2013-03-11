package com.alin.posorovaschi.list;

/**
 * This is the container for the Linked List.
 */
public class LinkedList<T> {

    protected Node<T> head;

    public LinkedList() {
        this(null);
    }

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "[]";
        }

        StringBuffer buf = new StringBuffer("[");
        buf.append(head.getValue());

        Node<T> temp = head.getNext();
        while (temp != null) {
            buf.append(", ");
            buf.append(temp.getValue());
            temp = temp.getNext();
        }

        buf.append("]");

        return buf.toString();
    }

}
