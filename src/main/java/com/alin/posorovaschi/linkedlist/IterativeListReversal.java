package com.alin.posorovaschi.linkedlist;

public class IterativeListReversal implements ListReversal{

    @Override
    public <T> LinkedList<T> reverse(LinkedList<T> list) {

        if (list.isEmpty()) {
            return list;
        }

        Node<T> previous = list.getHead();
        Node<T> current = previous.getNext();
        previous.setNext(null);

        while (current != null) {
            Node<T> temp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = temp;
        }

        list.setHead(previous);

        return list;
    }
}
