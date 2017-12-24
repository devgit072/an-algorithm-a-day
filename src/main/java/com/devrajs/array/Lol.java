package com.devrajs.array;


public class Lol
{
    public static void main(String[] args) {
        B b=new B();
        B c=new B("Hello");
    }
}

class A{
    A(){
        System.out.println("A");
    }
    A(String a){
        System.out.println("AA");
    }
    void fun(){
        //Do nothing
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
    B(String s){
        System.out.println("C");
    }
}