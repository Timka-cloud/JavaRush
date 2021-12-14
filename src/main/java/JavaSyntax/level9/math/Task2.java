package JavaSyntax.level9.math;

import java.util.Scanner;

public class Task2 {
    /**
     * Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
     * Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
     * В методе min(int[]) обязательно используй метод Math.min(int, int).
     */

    public static void main(String[] args) {

        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = ints.length - 1; i > 0; i--) {
            min = Math.min(min,ints[i]);

        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
