package com.alin.posorovaschi.list.traversal;

import com.alin.posorovaschi.list.LinkedList;

/**
 * Defines the operations for reversing a linked list.
 */
public interface ListReversal {

    /**
     * Reverse the input list and return it as the result
     *
     * @param list - The list to be reversed.
     * @param <T>  - The type of the elements in the list.
     * @return The reversed list.
     */
    <T> LinkedList<T> reverse(LinkedList<T> list);
}
