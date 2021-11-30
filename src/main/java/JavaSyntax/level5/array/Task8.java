package JavaSyntax.level5.array;

import java.util.Scanner;

public class Task8 {
    /**
     * Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.
     *
     * Для этого реализуй метод main(String[]), который:
     *
     * Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
     * Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
     * Инициализирует двумерный массив multiArray:
     * количеством строк N;
     * строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
     * Пример:
     *
     * Введено число 5.
     * Введены числа 1, 7, 5, 9, 3.
     * Получаем такой массив:
     * []
     * [][][][][][][]
     * [][][][][]
     * [][][][][][][][][]
     * [][][]
     */
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[sc.nextInt()];
        }


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exampleOfDimensionalArray() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
        matrix[1] = new int[]{1, 2, 3};
        matrix[2] = new int[]{1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print( matrix[i][j] + " " );
            System.out.println();
        }
    }
}
