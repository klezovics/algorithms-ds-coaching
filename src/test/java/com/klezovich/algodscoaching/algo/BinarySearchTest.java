package com.klezovich.algodscoaching.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testNotFound() {
        assertEquals(-1, BinarySearch.search(new int[]{1,2,3,5,6},4));
        assertEquals(-1, BinarySearch.search(new int[]{1,2,3,5,6},10));
        assertEquals(-1, BinarySearch.search(new int[]{1,2,3,5,6},-50));
    }

    @Test
    void testFound1() {
        assertEquals(0, BinarySearch.search(new int[]{1,2,3,5,6},1));
        assertEquals(1, BinarySearch.search(new int[]{1,2,3,5,6},2));
        assertEquals(2, BinarySearch.search(new int[]{1,2,3,5,6},3));
        assertEquals(3, BinarySearch.search(new int[]{1,2,3,5,6},5));
        assertEquals(4, BinarySearch.search(new int[]{1,2,3,5,6},6));
    }
}