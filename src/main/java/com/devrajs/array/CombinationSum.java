package com.devrajs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    static public void sum(int sum, List<Integer> list, int k, int n)
    {
        if(sum<0) return;
        if(sum ==0)
        {
            list.stream().forEach(a-> System.out.print(a));
            System.out.println();
            return;
        }
        for(int i=k; i<= n;i++) {
            Integer integer = new Integer(i);
            list.add(integer);
            sum(sum-i, list, i, n);
            list.remove(integer);
        }
    }

    public static void main(String[] args) {
        sum(5, new ArrayList<>(Arrays.asList()), 1, 5);
    }
}
