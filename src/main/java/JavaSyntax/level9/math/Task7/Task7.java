package JavaSyntax.level9.math.Task7;

public class Task7 {
    public static void main(String[] args) {
        /**
         * В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
         * Можно использовать только операции:
         *
         * Исключающее или.
         * Присваивание.
         * Исключающее или с присваиванием.
         */
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(6, 3);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
