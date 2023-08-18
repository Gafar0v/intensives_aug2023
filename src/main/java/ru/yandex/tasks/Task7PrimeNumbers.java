// Extra task https://leetcode.com/problems/prime-in-diagonal/

package ru.yandex.tasks;

import java.util.Arrays;

public class Task7PrimeNumbers {
    public static int[] findPrimes(int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        boolean[] numbers = new boolean[N + 1];

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!numbers[i]) {
                for (int j = 2; (j * i) <= N; j++) {
                    numbers[j * i] = true;
                }
            }
        }
        int n = 0;
        for (int i = 2; i <= N; i++) {
            if (!numbers[i]) {
                n++;
            }
        }
        int[] primes = new int[n];
        int indx = 0;
        for (int i = 2; i <= N; i++) {
            if (!numbers[i]) {
                primes[indx] = i;
                indx++;
            }
        }
        return primes;
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
