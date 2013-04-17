package com.alin.posorovaschi.list.traversal;

import com.alin.posorovaschi.list.LinkedList;
import com.alin.posorovaschi.list.Node;
import com.alin.posorovaschi.list.traversal.ListReversal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class ListReversalTest {

    protected ListReversal cut;
    private LinkedList list;

    @Before
    public abstract void setUp();

    //THis line has changes in rebase_conflict1
    @Test
    public void reverse_should_not_raise_an_exception_for_an_empty_list() {

        // Prepare
        list = initializeEmptyList();

        // Preconditions checks
        assertTrue(list.isEmpty());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse(list);

        // Verify
        assertEquals(list, resultList);

    }

    private LinkedList<Integer> initializeEmptyList() {
        return new LinkedList<Integer>();
    }

    @Test
    public void reverse_should_not_raise_an_exception_for_a_one_element_list() {
        // Prepare
        list = instantiateList(new Node<Integer>(18728, null));

        // Precondition checks
        assertFalse(list.isEmpty());
        assertNull(list.getHead().getNext());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse(list);

        // Verify
        assertEquals(list, resultList);

    }

    @Test
    public void reverse_should_reverse_positions_of_the_two_elements_in_the_list() {
        // Prepare
        int secondElementValue = 167;
        Node<Integer> second = new Node<Integer>(secondElementValue, null);

        int firstElementValue = 172671;
        Node<Integer> first = new Node<Integer>(firstElementValue, second);

        list = instantiateList(first);

        // Precondition checks
        assertFalse(list.isEmpty());
        assertNotNull(list.getHead().getNext());

        // Exercise
        LinkedList<Integer> resultList = cut.reverse(list);

        // Verify
        assertEquals(list, resultList);
        assertEquals(secondElementValue, list.getHead().getValue());
        assertEquals(firstElementValue, list.getHead().getNext().getValue());

    }

    @Test
    public void reverse_should_reverse_all_the_elements_in_the_list() {
        // Prepare
        Node<Integer> first = generateList(8);
        list = instantiateList(first);

        // Precondition checks
        assertIntegerElementsInDescendingOrder(first);

        // Exercise
        LinkedList<Integer> resultList = cut.reverse(list);

        // Verify
        assertEquals(list, resultList);
        assertIntegerElementsInAscendingOrder(resultList.getHead());
    }

    private LinkedList<Integer> instantiateList(Node<Integer> first) {
        return new LinkedList<Integer>(first);
    }

    private void assertIntegerElementsInAscendingOrder(Node<Integer> element) {
        while (element.getNext() != null) {
            assertTrue(element.getValue() < element.getNext().getValue());
            element = element.getNext();
        }
    }

    private void assertIntegerElementsInDescendingOrder(Node<Integer> element) {
        while (element.getNext() != null) {
            assertTrue(element.getValue() > element.getNext().getValue());
            element = element.getNext();
        }
    }

    private Node<Integer> generateList(int noOfElementInList) {
        Node<Integer> element;
        Node<Integer> previous = new Node<Integer>(0, null);

        for (int i = 1; i < noOfElementInList; i++) {
            element = new Node<Integer>(i, previous);
            previous = element;
        }

        return previous;

    }
}
