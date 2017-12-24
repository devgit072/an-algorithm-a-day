package com.devrajs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumNumOfTrial {

    static Set<String> dictionary = new HashSet<>();
    static Set<String> globaMap = new HashSet<>();

    public MinimumNumOfTrial() {
        dictionary.addAll(Arrays.asList("BCCI", "AICC", "ICC", "CCI", "MCC", "MCA", "ACC"));
    }

    static boolean minimumTrial(String src, String dest) {
        if (src.equals(dest))
            return true;
        List<String> oneCharDiffWord = getListOfOneCharDiff(src);
        for(String str : oneCharDiffWord)
        {
            boolean res = minimumTrial(str, dest);
            if(res) return true;
        }
        return false;
    }

    private static List<String> getListOfOneCharDiff(String src) {
        List<String> list = new ArrayList<>();
        globaMap.add(src);
        for(String str : dictionary)
        {
            if(globaMap.contains(str)) continue;
            if(isOneCharAway(src, str))
            {
                list.add(str);
            }
        }
        return list;
    }

    static boolean isOneCharAway(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (char ch : arr1) {
            map1[ch]++;
        }
        for (char ch : arr2) {
            map2[ch]++;
        }
        int mismatch = 0;
        int allowedMM;
        if(arr1.length == arr2.length) allowedMM = 2;
        else if(arr1.length - arr2.length ==-1 || arr1.length - arr2.length ==1)
        {
            allowedMM = 1;
        }
        else return false;
        for (int i = 0; i < 256; i++) {
            int diff = map1[i] - map2[i];
            if (diff > 1) return false;
            if (diff < -1) return false;
            if (diff == 1 || diff == -1) {
                mismatch++;
                if (mismatch > allowedMM) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new MinimumNumOfTrial();
        System.out.println(minimumTrial("AICC","BCCI"));
    }
}
