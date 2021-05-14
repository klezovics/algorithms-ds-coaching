package com.klezovich.algodscoaching.patterns.subsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {

    @Test
    void testCanFindSubsets() {
        var subsets = FindSubsets.findSubsets(new int[]{1,2,3});

        for(var subset : subsets) {
            System.out.println(subset);
        }
    }
}