package com.devrajs.array;

public class KthPermutation {
    static String getKthPermutation(String str, int i, int k) {
        if (k == 0) return str;
        int n = str.length() - i;
        int fact = factorial(n - 1);
        int block = k / fact;
        int mod = k % fact;
        if (block != 0) {
            str = reconstruct(str, block, i);
        }
        return getKthPermutation(str, i+1, mod);
    }

    static private String reconstruct(String str, int block, int i) {
        String str1 = str.substring(0, i);
        String str2 = str.substring(i);
        String ch = str2.charAt(block)+"";
        str2 = str2.replace(ch , "");
        return str1 + ch + str2;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(getKthPermutation("1234", 0, 2));
    }
}
