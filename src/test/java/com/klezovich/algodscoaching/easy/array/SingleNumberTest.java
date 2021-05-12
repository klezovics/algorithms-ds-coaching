package com.klezovich.algodscoaching.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void testSolution() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{1,2,3,3,2}));
    }

}