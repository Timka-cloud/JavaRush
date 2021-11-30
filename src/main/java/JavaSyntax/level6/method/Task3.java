package JavaSyntax.level6.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange"};
        char[] arr = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        char[] randChars = randomWord.toCharArray();
        System.out.println(randomWord);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if(input.equals(randomWord)){
                System.out.println("You won!");
                break;
            }
            char[] chars = input.toCharArray();
            for (int i = 0; i < randChars.length; i++) {
                if(chars[i] == randChars[i]) {
                    arr[i] = chars[i];
            }

            }
            System.out.println(Arrays.toString(arr));

        }

    }
}
