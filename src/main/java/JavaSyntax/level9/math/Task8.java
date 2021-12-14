package JavaSyntax.level9.math;

public class Task8 {
    public static void main(String[] args) {
        /**
         * Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
         * Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
         */
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
//        int result = 2;
//        for(int i = 0; i < power - 1; i++) {
//            result = result << 1;
//        }
        //return result;

        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }

    }
}
