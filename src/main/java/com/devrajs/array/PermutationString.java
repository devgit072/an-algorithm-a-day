package com.devrajs.array;

public class PermutationString {

    static void perm(char[] arr, int l, int r) {
        if (l == r) System.out.println(arr);
        else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                perm(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    static private void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

    public static void main(String[] args) {
        perm(new char[]{'a','b','c', 'd'}, 0, 3);
    }
}
