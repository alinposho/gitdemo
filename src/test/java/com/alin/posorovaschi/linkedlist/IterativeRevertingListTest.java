package com.alin.posorovaschi.linkedlist;

public class IterativeRevertingListTest extends LinkedListTest {

    @Override
    public LinkedList<Integer> instantiateList(Node<Integer> first) {
        return new IterativeRevertingList<Integer>(first);
    }

    @Override
    protected LinkedList<Integer> initializeEmptyList() {
        return new IterativeRevertingList<Integer>();
    }
}
