package com.klezovich.algodscoaching.patterns.mergeintervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void testIntervalsSortedCorrectly() {
        var intervals = new ArrayList<Interval>();

        intervals.add(new Interval(10,11));
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,4));
        intervals.add(new Interval(0,1));

        MergeIntervals.sortByStart(intervals);
        assertEquals(0, intervals.get(0).start);
        assertEquals(1, intervals.get(1).start);
        assertEquals(3, intervals.get(2).start);
        assertEquals(10, intervals.get(3).start);
    }

}