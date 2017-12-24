package com.devrajs.array;

/*
Given an array of size n, generate and print all possible combinations of r elements in array.
For example, if input array is {1, 2, 3, 4} and r is 2,
then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
*/

import java.util.ArrayList;
import java.util.List;

public class Combination {

    private static void combinationUtil(char[] arr, int l, int r, List<Character> list)
    {
        if(list.size() == r)
        {
            list.forEach(System.out::print);
            System.out.println();
        }
        for(int i=l;i<arr.length;i++)
        {
            Character ch = arr[i];
            list.add(ch);
            combinationUtil(arr, i+1, r, list);
            list.remove(ch);
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[] {'1','2','3','4','5','6'};
        combination(arr, 3);
    }

    private static void combination(char[] arr, int r) {
        combinationUtil(arr, 0,r, new ArrayList<>());
    }
}
