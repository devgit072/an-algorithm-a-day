package com.devrajs.array;

public class StaticFinalDemo {
    public static void main(String[] args) {
        int a =5;
        int b =5;
        Integer c = new Integer(5);
        Integer d = new Integer(5);

        if(a==b) System.out.println("true1");
        if(c==d) System.out.println("true2");
        if(c.equals(d)) System.out.println("true3");
        if(a==d) System.out.println("true4");
    }
}

class T {
    public static final int var = 100;
    public static int var1 = 100;

    static {
        System.out.println("Hello world");
    }
}
