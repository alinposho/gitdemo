package com.alin.posorovaschi.linkedlist;

public class RecursiveListReversal implements ListReversal {

    @Override
    public <T> LinkedList<T> reverse(LinkedList<T> list) {

        Node<T> newHead = reverse(list.head);

        list.setHead(newHead);
        return list;
    }

    private <T> Node<T> reverse(Node<T> element) {

        if (element.getNext() == null) {
            return element;
        } else {
            Node<T> reversed = reverse(element);
            reversed.setNext(element);
            return element;
        }
    }
}
