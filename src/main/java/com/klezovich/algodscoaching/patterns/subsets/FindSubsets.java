package com.klezovich.algodscoaching.patterns.subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindSubsets {

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(int ii=0;ii<nums.length; ii++) {
            ArrayList<List<Integer>> newFullSubsetList = new ArrayList<List<Integer>>();

            for( List<Integer> subset : subsets) {
                newFullSubsetList.add(subset);
                List<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);

                newSubset.add(nums[ii]);
                newFullSubsetList.add(newSubset);
            }

            subsets = newFullSubsetList;
        }

        return subsets;
    }

}
