package com.klezovich.algodscoaching.ds.array.dynamic;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void testInsertOperation() {
        var da = new DynamicArray<Integer>();

        da.put(1);
        assertThat(da, contains(1));
        assertEquals(1, da.getCapacity());

        da.put(2);
        assertThat(da, contains(1,2));
        assertEquals(2, da.getCapacity());

        da.put(3);
        assertThat(da, contains(1,2,3));
        assertEquals(4, da.getCapacity());

        da.put(4);
        assertThat(da, contains(1,2,3,4));
        assertEquals(4, da.getCapacity());

        da.put(5);
        assertThat(da, contains(1,2,3,4,5));
        assertEquals(8, da.getCapacity());

        da.put(6);
        assertThat(da, contains(1,2,3,4,5,6));
        assertEquals(8, da.getCapacity());

        da.put(7);
        assertThat(da, contains(1,2,3,4,5,6,7));
        assertEquals(8, da.getCapacity());

        da.put(8);
        assertThat(da, contains(1,2,3,4,5,6,7,8));
        assertEquals(8, da.getCapacity());

        da.put(9);
        assertThat(da, contains(1,2,3,4,5,6,7,8,9));
        assertEquals(16, da.getCapacity());

        da.put(10);
        assertThat(da, contains(1,2,3,4,5,6,7,8,9,10));
        assertEquals(16, da.getCapacity());
    }

    @Test
    void testGetOpeartion() {
        var da = get123DynamicArray();
        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
        assertEquals(3, da.get(2));
    }

    @Test
    void testFindOperation() {
        var da =get123DynamicArray();
        assertEquals(0, da.find(1));
        assertEquals(1, da.find(2));
        assertEquals(2, da.find(3));
    }

    @Test
    void testDeleteOperation() {
        var da = get123DynamicArray();
        da.delete(1);

        assertEquals(2, da.getSize());
        assertEquals(2, da.getCapacity());
        assertThat(da, contains(2,3));
    }


    private DynamicArray<Integer> get123DynamicArray() {
        var da = new DynamicArray<Integer>();
        da.put(1);
        da.put(2);
        da.put(3);
        return da;
    }
}