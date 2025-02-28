package com.DynamicProgramming_in_JAVA;

import java.util.Scanner;

public class StringDecoding {
    public static int stringDecoding(String str){
        if (str == null || str.isEmpty() || str.charAt(0) == '0') {
            return 0;
        }

        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != '0') {
                dp[i + 1] = dp[i];
            }

            int twoDigit = Integer.parseInt(str.substring(i - 1, i + 1));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i + 1] += dp[i - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string that you want to decode : ");
        String str = sc.nextLine();
        int ans = stringDecoding(str);
        System.out.printf("The total number decoded string is : %d", ans);
    }
}
