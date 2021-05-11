package com.klezovich.algodscoaching.ds.array.dynamic;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArraySimpleTest {

    @Test
    void testSingleElementInsert() {
        var da = new DynamicArraySimple();
        da.add(1);

        assertEquals(1, da.length());
        assertThat(da, contains(1));
    }

    @Test
    void testInsertWithArrayExpansion() {
        var da = new DynamicArraySimple();
        da.add(1);
        da.add(2);

        assertEquals(2, da.length());
        assertThat(da, contains(1, 2));
    }

    @Test
    void testComplexInsert() {
        var da = new DynamicArraySimple();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);

        assertEquals(8, da.length());
        assertThat(da, contains(1, 2, 3, 4, 5));
    }

    @Test
    void testGetByIndex() {
        var da = new DynamicArraySimple();
        da.add(1);
        da.add(2);
        da.add(3);

        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
        assertEquals(3, da.get(2));
    }

    @Test
    void testFind() {
        var da = new DynamicArraySimple();
        da.add(1);
        da.add(2);
        da.add(3);

        assertEquals(2, da.find(3));
    }

    @Test
    void testDelete() {
        var da = new DynamicArraySimple();
        da.add(1);
        da.add(2);
        da.add(3);

        da.delete(1);
        assertThat(da, not(hasItem(1)));
        assertEquals(2, da.get(0));
        assertEquals(3, da.get(1));
    }

}