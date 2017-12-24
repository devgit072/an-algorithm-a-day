package com.devrajs.array;

public class StringCompress {

    static String compressString(String str)
    {
        char[] arr = str.toCharArray();
        String newStr="";
        int i=0, wp=0;
        while (i<arr.length){
            char ch = arr[i];
            int count=1;
            i++;
            while (i< arr.length && arr[i]==ch)
            {
                count++;
                i++;
            }
            newStr = newStr+String.valueOf(ch)+count;
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(compressString("hello"));
    }
}
