package JavaSyntax.level9.math;

import java.util.Arrays;

public class Task9 {
    /**
     * Шифрование
     * Все дело в том, что оператор XOR, дважды примененный к числу, дает исходное число, независимо от пароля.
     *
     * Чтобы получить искомое число из зашифрованного, нужно просто выполнить операцию повторно:
     * @param data
     * @param password
     * @return
     */
    public static int[] cript(int[] data, int password)
    {
        int[] result = new int[data.length];
        for (int i = 0; i <  data.length; i++)
            result[i] = data[i] ^ password;
        return result;
    }

    public static void main(String[] args)
    {
        int[] data =  {1, 3, 5, 7, 9, 11};
        int password = 4;

        // зашифровываем массив данных
        int[] encrypted = cript(data, password) ;
        System.out.println(Arrays.toString(encrypted));

        // расшифровываем массив данных
        int[] decrypted = cript(encrypted, password) ;
        System.out.println(Arrays.toString(decrypted));
    }
}
