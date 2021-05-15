package com.klezovich.algodscoaching.freestyle;

import com.klezovich.algodscoaching.util.ArrayMother;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void testGetSum() {
        assertEquals(0, MyArrays.getSum(ArrayMother.getArrayWithZeroElements()));
        assertEquals(1, MyArrays.getSum(ArrayMother.get1Array()));
        assertEquals(10, MyArrays.getSum(ArrayMother.get01234Array()));
    }

    @Test
    void testGetWindowSum() {
        assertEquals(0,
                MyArrays.getWindowSum(ArrayMother.getArrayWithZeroElements(),0,1));
        assertEquals(1,
                MyArrays.getWindowSum(ArrayMother.get1Array(),0,0));


        assertEquals(0,
                MyArrays.getWindowSum(ArrayMother.get01234Array(),0,0));
        assertEquals(1,
                MyArrays.getWindowSum(ArrayMother.get01234Array(),0,1));
        assertEquals(3,
                MyArrays.getWindowSum(ArrayMother.get01234Array(),0,2));
        assertEquals(6,
                MyArrays.getWindowSum(ArrayMother.get01234Array(),0,3));
        assertEquals(10,
                MyArrays.getWindowSum(ArrayMother.get01234Array(),0,4));
    }

    @Test
    void testGetAllSubarray() {
        var subarrays = MyArrays.getAllSubarraysOfSizeK(ArrayMother.get01234Array(),2);
        System.out.println(subarrays);
    }
}