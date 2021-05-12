package com.klezovich.algodscoaching.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
public class ArrayIntersection {

    public int[] intersect(int[] nums1, int[] nums2) {
        var numCountMap1 = getNumberToCountMap(nums1);
        var numCountMap2 = getNumberToCountMap(nums2);
        var intersectionMap = getIntersectionNumberToNumberCountMap(numCountMap1,numCountMap2);

        return numCountMapToArray(intersectionMap);
    }

    int[] numCountMapToArray(Map<Integer, Integer> map) {
        var list = new ArrayList<Integer>();

        for(var key : map.keySet() ) {
            var numCount = map.get(key);

            while (numCount>0) {
                list.add(key);
                numCount--;
            }
        }

        return Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }

    Map<Integer, Integer> getIntersectionNumberToNumberCountMap(
            Map<Integer, Integer> map1, Map<Integer, Integer> map2) {

        var intersectionMap = new HashMap<Integer, Integer>();
        var maps1Keys = map1.keySet();

        for(var key : maps1Keys) {
            var map1Count = map1.getOrDefault(key, 0);
            var map2Count = map2.getOrDefault(key, 0);

            if(map1Count == 0 || map2Count == 0) {
                continue;
            }

            var minCount = Math.min(map1Count, map2Count);
            intersectionMap.put(key, minCount);
        }

        return intersectionMap;
    }

    Map<Integer, Integer> getNumberToCountMap(int[] nums) {

        var map = new HashMap<Integer, Integer>();
        for(var num: nums) {
            var currentCount = map.getOrDefault(num,0);
            currentCount++;
            map.put(num, currentCount);
        }

        return map;
    }
}
