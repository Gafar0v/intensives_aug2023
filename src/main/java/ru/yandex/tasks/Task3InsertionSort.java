// Extra task https://leetcode.com/problems/find-the-value-of-the-partition/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        ArrayList<Integer> sortedList = new ArrayList<>();
        if (numbers.size() == 0) return numbers;
        sortedList.add(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            int addingNumber = numbers.get(i);
            int beforeSize = sortedList.size();
            for (int j = 0; j < sortedList.size(); j++) {
                if (addingNumber < sortedList.get(j)) {
                    sortedList.add(j, addingNumber);
                    break;
                }
            }
            if(sortedList.size() ==beforeSize){
                sortedList.add(addingNumber);
            }
        }
        return sortedList;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
