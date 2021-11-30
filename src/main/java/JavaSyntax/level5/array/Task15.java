package JavaSyntax.level5.array;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        /**
         * сортировка массива самому
         * с большего к маленькому
         */

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
