package com.alin.posorovaschi.linkedlist;

public class IterativeRevertingList<T> extends LinkedList<T> {

    public IterativeRevertingList() {
        super();
    }

    public IterativeRevertingList(Node<T> first) {
        super(first);
    }

    @Override
    public LinkedList<T> reverse() {

        if (isEmpty()) {
            return this;
        } else if (first.getNext() == null) {
            return this;
        }

        Node<T> previous = first;
        Node<T> current = first.getNext();
        first.setNext(null);

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
            current.setNext(previous);
        }

        last = first;
        first = current;


        return this;
    }
}
