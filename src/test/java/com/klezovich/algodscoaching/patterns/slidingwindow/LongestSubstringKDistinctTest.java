package com.klezovich.algodscoaching.patterns.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
 */
class LongestSubstringKDistinctTest {

    @Test
    void test1() {
        assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi",3));
    }
}