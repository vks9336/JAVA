package com.Queue_in_JAVA.Queue_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class GokuVsMe {
    public static int minBombs(int N, int R, int D, int[] X, int[] H) {
        int[][] clones = new int[N][2];
        for (int i = 0; i < N; i++) {
            clones[i][0] = X[i];
            clones[i][1] = H[i];
        }
        Arrays.sort(clones, Comparator.comparingInt(a -> a[0]));

        Queue<int[]> damageQueue = new LinkedList<>();
        int totalDamage = 0, bombs = 0;
        int i = 0;

        while (i < N) {
            while (!damageQueue.isEmpty() && damageQueue.peek()[0] < clones[i][0]) {
                totalDamage -= damageQueue.poll()[1];
            }

            if (clones[i][1] > totalDamage) {
                bombs++;
                int bombPos = clones[i][0] + R;
                damageQueue.add(new int[]{bombPos + R, D});
                totalDamage += D;
            }

            i++;
        }

        return bombs;
    }

    public static void main(String[] args) {
        int N = 5, R = 3, D = 3;
        int[] X = {1,2,3, 5, 9};
        int[] H = {2,5,6, 3, 2};

        System.out.println(minBombs(N, R, D, X, H)); // Output: 2
    }
}
