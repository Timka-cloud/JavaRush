package JavaSyntax.level5.array;

import java.util.Arrays;

public class Task2 {
    /**
     * Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
     * Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
     */
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {

        resultArray = new int[firstArray.length + secondArray.length];
//        System.out.println(resultArray.length);
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] += firstArray[i];
//        }
//        for (int i = 0; i < secondArray.length; i++) {
//            resultArray[i + firstArray.length] += secondArray[i];
//        }

        System.arraycopy(firstArray,0,resultArray,0,firstArray.length); // another variant
        System.arraycopy(secondArray,0,resultArray,10,secondArray.length);

        for (int i = 0; i < resultArray.length; i++) {
            if(i == resultArray.length - 1) {
                System.out.print(resultArray[i] + ".");
                break;
            }
            System.out.print(resultArray[i] + ", ");
        }
    }
}
