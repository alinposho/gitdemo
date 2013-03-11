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
        }

        Node<T> previous = first;
        Node<T> current = first.getNext();
        first.setNext(null);

        while (current != null) {
            Node<T> temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }

        last = first;
        first = previous;


        return this;
    }
}
