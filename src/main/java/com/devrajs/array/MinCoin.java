package com.devrajs.array;

public class MinCoin {

    private static int minCoin(int sum, int[] coins, int n, int numberOfCoins)
    {
        if(sum == 0) return numberOfCoins;
        if(sum < 0 || n < 0) return Integer.MAX_VALUE;
        int value1 = minCoin(sum-coins[n], coins, n, numberOfCoins+1);
        int value2 = minCoin(sum, coins, n-1, numberOfCoins);
        return Math.min(value1, value2);
    }

    public static void main(String[] args) {
        System.out.println(minCoin(40, new int[] {25,10,5}, 2, 0));
    }
}
