package com.String_in_JAVA;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = sc.nextLine();
        int n = input.length();

        for (int k = 1; k <= n; k++) {
            System.out.println("\nReplacing " + k + " character(s):");

            int totalComb = nCr(n, k);
            int[][] combos = new int[totalComb][k];
            int[] data = new int[k];
            int[] counter = {0};

            generateCombinations(n, k, 0, data, combos, counter);

            for (int i = 0; i < totalComb; i++) {
                String modified = replaceWithOnes(input, combos[i]);
                String reduced = reduceAdjacentOnes(modified);
                System.out.println(reduced);
            }
        }
    }

    // Manually generate combinations using recursion (NO System.arraycopy)
    private static void generateCombinations(int n, int r, int start, int[] data, int[][] combos, int[] counter) {
        if (r == 0) {
            for (int i = 0; i < data.length; i++) {
                combos[counter[0]][i] = data[i];
            }
            counter[0]++;
            return;
        }

        for (int i = start; i <= n - r; i++) {
            data[data.length - r] = i;
            generateCombinations(n, r - 1, i + 1, data, combos, counter);
        }
    }

    // Replace selected indices with '1'
    private static String replaceWithOnes(String input, int[] indices) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = '1';
        }
        return new String(chars);
    }

    // Reduce only adjacent 1's to their total sum
    private static String reduceAdjacentOnes(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                count++;
            } else {
                if (count > 0) {
                    if (count == 1) sb.append('1');
                    else sb.append(count);
                    count = 0;
                }
                sb.append(c);
            }
        }

        if (count > 0) {
            if (count == 1) sb.append('1');
            else sb.append(count);
        }

        return sb.toString();
    }

    // Calculate nCr manually (helper)
    private static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Calculate factorial manually
    private static int factorial(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}


