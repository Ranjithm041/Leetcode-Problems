package com.mergeintervalcount;
import java.util.*;
public class Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 3, 1));
        intervals.add(Arrays.asList(2, 5, 1));
        intervals.add(Arrays.asList(7, 9, 1));
        intervals.add(Arrays.asList(8, 10, 1));

        List<List<Integer>> result = mergeIntervals(intervals);
        for (List<Integer> interval : result) {
            System.out.println(interval);
        }
	}
	public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> next = intervals.get(i);
            if (next.get(0) <= prev.get(1)) { 
                prev.set(1, Math.max(prev.get(1), next.get(1))); 
                prev.set(2, prev.get(2) + next.get(2));
            } else {
                list.add(prev);
                prev = new ArrayList<>(next);
            }
        }
        list.add(prev);
        return list;
    }
}
