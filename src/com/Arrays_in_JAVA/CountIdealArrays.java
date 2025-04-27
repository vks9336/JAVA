package com.Arrays_in_JAVA;

public class CountIdealArrays {
    private static final int MOD = (int) 1e9 + 7;
    private long[] options;

    // method to count the total unique array sequences
    private void countUniqueSequences(int curr, int idx, int maxValue) {
        options[idx]++;
        for (int j = 2; curr * j <= maxValue; ++j) {
            countUniqueSequences(curr * j, idx + 1, maxValue);
        }
    }

    //main ideal array function
    public int idealArrays(int n, int maxValue) {
        //count arrays for storing the count of total arrays
        long[][] count = new long[15][10005];
        //prefixSum array to store the previous sum
        long[][] prefixSum = new long[15][10005];
        // main options array which stores the options that is used to calculate
        // the ideal arrays
        options = new long[15];

        //pre-store all the starting value at initial index
        for (int i = 1; i <= 10000; ++i) {
            count[1][i] = 1;
            prefixSum[1][i] = i;
        }

        // calculating the next count and storing them to prefixSum and count array
        for (int i = 2; i <= 14; ++i) {
            for (int j = i; j <= 10000; ++j) {
                count[i][j] = prefixSum[i - 1][j - 1];
                prefixSum[i][j] = (count[i][j] + prefixSum[i][j - 1]) % MOD;
                count[i][j] %= MOD;
            }
        }

        // counting the total number of sequences by using countUniqueSequences method
        for (int i = 1; i <= maxValue; ++i) {
            countUniqueSequences(i, 1, maxValue);
        }
        long ans = 0;

        // modding the values such that the answer could not reach the integer limit
        for (int i = 1; i <= 14; ++i) {
            long ways = (count[i][n] * options[i]) % MOD;
            ans = (ans + ways) % MOD;
        }
        return (int) ans;
    }
}
