package com.devrajs.array;

public class Alive {

    static int dead=0, alive=0;
    public static void aliveProbablity(int i, int j, int m, int n, int steps)
    {
        System.out.print("["+i +"," + j+"]  ");
        if(i>=m || j >=n || i<0 || j<0)
        {
            dead++;
            return;
        }
        if(steps==0){
            alive++;
            return;
        }
        System.out.print("["+i +"," + j+"]  ");

        aliveProbablity(i, j+1, m, n, steps-1);
        System.out.println();
        aliveProbablity(i-1, j, m, n, steps-1);
        System.out.println();
        aliveProbablity(i, j-1, m, n, steps-1);
        System.out.println();
        aliveProbablity(i+1, j, m, n, steps-1);
    }

    public static void main(String[] args) {
        aliveProbablity(0, 0, 3, 3, 3);
        double prob = (double) alive/(alive+dead);
        System.out.println(alive);
        System.out.println(dead);
        System.out.println(prob);
    }
}
