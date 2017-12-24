package com.devrajs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    static void findPowerSet(int[] array, int index, List<Integer> createdSet, List<List<Integer>> powerSet) {
        if(index > array.length)
            return;
        if (index == array.length) {
            List<Integer> set = new ArrayList<>(createdSet);
            powerSet.add(set);
            return;
        }
        findPowerSet(array, index+1, createdSet, powerSet);
        createdSet.add(array[index]);
        findPowerSet(array, index+1, createdSet, powerSet);
        createdSet.remove(new Integer(array[index]));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList());
        List<List<Integer>> powerset = new ArrayList<>();
        findPowerSet(new int[] {1,2,3}, 0, list, powerset);

        for(List<Integer> set : powerset)
        {
            System.out.println(set.toString());
        }
    }
}
