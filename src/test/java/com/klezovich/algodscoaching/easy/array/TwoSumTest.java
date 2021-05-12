package com.klezovich.algodscoaching.easy.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    void test() {

        var result = twoSum.twoSum(new int[]{3, 7, 11, 15}, 10);
        var list = Arrays.stream(result).boxed().collect(Collectors.toList());
        assertThat(list, containsInAnyOrder(0, 1));
    }

}