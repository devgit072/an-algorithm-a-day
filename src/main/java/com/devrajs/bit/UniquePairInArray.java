package com.devrajs.bit;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

/*
Given an array where every element appears twice except a pair (two elements). Find the elements of this unique pair.

Examples:

Input  : 6, 1, 3, 5, 1, 3, 7, 6
Output : 5 7
All elements appear twice except 5 and 7

Input  : 1 3 4 1
Output : 3 4
 */
public class UniquePairInArray {

    public static Pair<Integer, Integer> getUniquePair(List<Integer> arr)
    {
        int xor=0;
        for(int a : arr)
        {
            xor ^= a;
        }
        int rightMostSetBit = xor & ~(xor-1);
        int m=0, n=0;
        for(int a: arr)
        {
            if((a & rightMostSetBit) == 0)
            {
                m ^= a;
            }
            else
            {
                n ^=a;
            }
        }
        System.out.println("M=" + m + ", n="+n);
        return new Pair<>(m,n);
    }

    public static void main(String[] args) {
        System.out.println(getUniquePair(Arrays.asList(6, 1, 3, 5, 1, 3, 7, 6)));
        System.out.println(getUniquePair(Arrays.asList(1,3,4,1)));
    }
}
