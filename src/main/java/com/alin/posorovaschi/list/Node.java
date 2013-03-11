package com.alin.posorovaschi.list;

/**
 * This is the Linked List element - a node in the list.
 */
public class Node<T> {

    private final T value;

    private Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

}
