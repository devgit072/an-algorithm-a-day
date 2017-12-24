package com.devrajs.array;

public class CountPossibleDecodings {
    private boolean validDecoding(int digit0, int digit1) {
        if ((10 * digit0 + digit1) >= 10 && ((10 * digit0 + digit1) < 27)) {
            return true;
        }

        return false;
    }

    public int countPossibleDecodings(int n, int[] digitSequence, int[] decodings) {

        if (n == digitSequence.length - 1 || n == digitSequence.length - 2) {

            if (n != -1) {
                decodings[n] = 1;
            }
            return 1;
        }

        int count = 0;

        if (digitSequence[n + 1] > 0) {
            count = (decodings[n + 1] != 0) ? decodings[n + 1] :
                    countPossibleDecodings(n + 1, digitSequence, decodings);
        }

        if (validDecoding(digitSequence[n + 1], digitSequence[n + 2])) {
            count += (decodings[n + 2] != 0) ? decodings[n + 2] :
                    countPossibleDecodings(n + 2, digitSequence, decodings);
        }

        if (n != -1) {
            decodings[n] = count;
        }

        return count;
    }

    public int countPossibleDecodings(int n, int[] digitSequence) {

        if (n == digitSequence.length - 1 || n == digitSequence.length - 2) {
            return 1;
        }

        int count = 0;

        if (digitSequence[n + 1] > 0) {
            count = countPossibleDecodings(n + 1, digitSequence);
        }

        if (validDecoding(digitSequence[n + 1], digitSequence[n + 2])) {
            count += countPossibleDecodings(n + 2, digitSequence);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] digit = {1, 2, 2, 3};

        CountPossibleDecodings solution = new CountPossibleDecodings();

        int[] decodings = new int[digit.length];
        System.out.println("number of possible decodings:\n" + solution.countPossibleDecodings(-1, digit, decodings));
    }
}
