package com.alin.posorovaschi.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class LinkedListTest {

    private Node<Integer> first;
    private  LinkedList<Integer> cut;

    public abstract LinkedList<Integer> instantiateList(Node<Integer> first);

    @Test
    public void reverse_should_not_raise_an_exception_for_an_empty_list(){
        
        cut = initializeEmptyList();

        assertTrue(cut.isEmpty());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse();

        // Verify
        assertEquals(cut, resultList);

    }

    protected abstract LinkedList<Integer> initializeEmptyList();

    @Test
    public void reverse_should_not_raise_an_exception_for_a_one_element_list(){

        // Prepare
        cut = instantiateList(new Node<Integer>(18728, null));

        assertFalse(cut.isEmpty());
        assertNull(cut.getFirst().getNext());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse();

        // Verify
        assertEquals(cut, resultList);

    }

    @Test
    public void reverse_should_reverse_position_of_the_two_elements_in_the_list(){

        // Prepare
        int secondElementValue = 167;
        Node<Integer> second = new Node<Integer>(secondElementValue,null);

        int firstElementValue = 172671;
        first = new Node<Integer>(firstElementValue, second);

        cut = instantiateList(first);

        // Precondition checks
        assertFalse(cut.isEmpty());
        assertNotNull(cut.getFirst().getNext());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse();

        // Verify
        assertEquals(cut, resultList);
        assertTrue(cut.getFirst().getNext().equals(cut.getLast()));
        assertEquals(secondElementValue, cut.getFirst().getValue().intValue());
        assertEquals(firstElementValue, cut.getLast().getValue().intValue());

    }
}
