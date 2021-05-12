package com.klezovich.algodscoaching.ds.linkedlist.singlelink;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.emptyIterable;
import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void testAddingElemnts() {
        var l = new MyLinkedList<Integer>();
        assertThat(l, emptyIterable());

        l.add(1);
        assertThat(l, contains(1));
        assertEquals(1, l.getSize());

        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        assertThat(l, contains(1,2,3,4,5));
        assertEquals(5, l.getSize());
    }

    @Test
    void testFindElement() {
        var l = get12345List();

        assertEquals(0, l.find(1));
        assertEquals(1, l.find(2));
        assertEquals(2, l.find(3));
        assertEquals(3, l.find(4));
        assertEquals(4, l.find(5));

    }

    @Test
    void testRemoveElement() {
        var l = get12345List();

       l.delete(2);
       assertThat(l, contains(1,3,4,5));
       assertEquals(4, l.getSize());

        l.delete(1);
        assertThat(l, contains(3,4,5));
        assertEquals(3, l.getSize());

        l.delete(4);
        assertThat(l, contains(3,5));
        assertEquals(2, l.getSize());

        l.delete(5);
        assertThat(l, contains(3));
        assertEquals(1, l.getSize());

        l.delete(3);
        assertThat(l, emptyIterable());
        assertEquals(0, l.getSize());
    }


    private MyLinkedList<Integer> get12345List() {
        var l = new MyLinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        return l;
    }

}