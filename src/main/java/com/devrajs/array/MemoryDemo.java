package com.devrajs.array;

public class MemoryDemo {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
    }
}
