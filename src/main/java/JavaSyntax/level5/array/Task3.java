package JavaSyntax.level5.array;

import java.util.Scanner;

public class Task3 {
    /**
     * Считывает с консоли целое число N.
     * Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
     * Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
     * Каждое число выводить с новой строки. Число N выводить не нужно.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) {
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

    }
}
