package com.devrajs.array;

public class MinCoins {

    public static int minCoins(int[] coins, int pos, int sum, int[] mem) {
        if(sum<0) return 100000;
        if(pos>coins.length) return 100000;
        if(sum==0) return 0;
        if(mem[sum] != 0) return mem[sum];
        int min = 100000;
        for(int i=pos;i<coins.length;i++) {
            int count=1+minCoins(coins, i, sum-coins[i], mem);
            if(count < min){
                min = count;
            }
        }
        mem[sum]=min;
        return min;
    }

    public static void main(String[] args) {
        int[] coins = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        long t1 = System.currentTimeMillis();
        int sum=2456;
        int[] mem=new int[sum+1];
        System.out.println(minCoins(coins, 0, sum, mem));
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
