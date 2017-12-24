package com.devrajs.array;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/*
Find largest subarray in given array which contains all consecutive numbers and distinct
For example:
arr[] = {2, 0, 3, 2, 1, 4, 7 , 5}
largest subarray = {0,3,2,1,4}
 */
public class LargestSubArrayOfContinuosInteger {

    static Pair<Integer, Integer> getIndex(int[] arr) {
        int low = 0;
        int r_low = 0, r_high = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 0);
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            if (currentValue < min) {
                min = currentValue;
            }
            if (currentValue > max) {
                max = currentValue;
            }
            if (map.containsKey(currentValue)) {
                map.put(currentValue, map.get(currentValue)+1);
                low = map.get(currentValue);
                if(arr[low] < min) {
                    min = arr[low];
                }
                else if(arr[low] > max){
                    max = arr[low];
                }
            }
            int range = i - low;
            int diff = max - min;
            if (diff == range) {
                r_low = low;
                r_high = i;
            }
        }
        return new Pair<>(r_low, r_high);
    }

    public static void main(String[] args) {
        System.out.println(getIndex(new int[] {2, 0, 3, 2, 1, 4, 7, 5}));
    }
}
