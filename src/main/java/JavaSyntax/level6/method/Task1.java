package JavaSyntax.level6.method;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);



    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { // 1
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
//        int[] arr = Arrays.copyOf(array,array.length); // 2
//        for (int i = arr.length - 1; i >= 0; i--) {
//            array[array.length - i - 1] = arr[i];
//        }

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
