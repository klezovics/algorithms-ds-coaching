package com.klezovich.algodscoaching.ds.array.dynamic;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.*;

class DynamicArraySimpleTest {


    @Test
    void testCanAddNewElement() {
        var da = new DynamicArraySimple();
        da.add(3);

        var innerArr = da.getArray();
        assertEquals(1, innerArr.length);
        assertThat(innerArr, arrayContaining(3));
    }

    @Test
    void testCanAddNewElementAndResize() {
        var da = new DynamicArraySimple();
        da.add(3);
        da.add(2);

        var innerArr = da.getArray();
        assertEquals(2, innerArr.length);
        assertThat(innerArr, arrayContaining(3,2));
    }

}