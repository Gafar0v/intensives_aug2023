// Extra task https://leetcode.com/problems/sort-vowels-in-a-string/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        for (int i = 0; i < numbers.size(); i++) {
            int counter = 0;
            for (int j = 0; j < numbers.size() - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int tmp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tmp);
                    counter++;
                }
            }
            if (counter == 0) {
                return numbers;
            }
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
