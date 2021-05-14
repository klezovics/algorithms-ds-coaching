package com.klezovich.algodscoaching.patterns.mergeintervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class MergeIntervals {

  public static List<Interval> merge(List<Interval> intervals) {
    List<Interval> mergedIntervals = new LinkedList<Interval>();
    intervals.sort(new Comparator<Interval>() {
      @Override
      public int compare(Interval o1, Interval o2) {
        return o1.start < o2.start ? -1 : 1;
      }
    });

    int pointer = -1;
    while (pointer < intervals.size() - 2) {
      Interval i1 = mergedIntervals.get(pointer+1);
      Interval i2 = mergedIntervals.get(pointer+2);

      if(doOverlap(i1, i2)) {
        Interval result = mergeOverlappingIntervals(i1,i2);
        intervals.remove(0);
        intervals.remove(1);
        intervals.add(result);
      }

      pointer++;

    }
    //Sort the intervals by start position
    //A pointer variable exists
    //All intervals before the pointers are already non-intersecting
    //All intervals after the pointer need to be merged one by one



    return intervals;
  }

  //We know that i1.start <= i2.start
  static boolean  doOverlap(Interval i1, Interval i2) {
     if(i1.end < i2.start) {
       return false;
     }

     if(i1.end == i2.start) {
       return true;
     }

     return true;
  }

  //We know that i1.start < i2.start
  static Interval mergeOverlappingIntervals(Interval i1, Interval i2) {
    return new Interval(i1.start, i2.end);
  }

  public static void sortByStart(List<Interval> intervals) {
    intervals.sort(new Comparator<Interval>() {
      @Override
      public int compare(Interval o1, Interval o2) {
        return o1.start < o2.start ? -1 : 1;
      }
    });
  }

  public static void main(String[] args) {
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
  }
}