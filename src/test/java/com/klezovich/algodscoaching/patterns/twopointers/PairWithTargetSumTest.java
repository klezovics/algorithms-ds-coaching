package com.klezovich.algodscoaching.patterns.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class PairWithTargetSumTest {

    @Test
    void test() {

        var list = Arrays.stream(PairWithTargetSum.search(new int[]{1,2,3,4,6},6))
                .boxed().collect(Collectors.toList());
        assertThat(list, containsInAnyOrder(1,3));
    }

}