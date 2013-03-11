package com.alin.posorovaschi.list.traversal;

import com.alin.posorovaschi.list.LinkedList;
import com.alin.posorovaschi.list.Node;
import com.alin.posorovaschi.list.traversal.ListReversal;

public class RecursiveListReversal implements ListReversal {

    @Override
    public <T> LinkedList<T> reverse(LinkedList<T> list) {

        Node<T> newHead = reverse(list.getHead());

        list.setHead(newHead);
        return list;
    }

    private <T> Node<T> reverse(Node<T> head) {

        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return head;
        }

        Node<T> tail = head.getNext();

        head.setNext(null);
        Node<T> reverseRest = reverse(tail);
        tail.setNext(head);

        return reverseRest;
    }
}
