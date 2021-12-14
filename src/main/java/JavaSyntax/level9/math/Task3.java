package JavaSyntax.level9.math;

public class Task3 {
    /**
     * Есть много алгоритмов генерации последовательности псевдослучайных чисел
     * и почти все из них генерируют следующее случайное число на основе предыдущего
     * и еще каких-то вспомогательных чисел.
     *
     * Например, данная программа выведет на экран 1000 неповторяющихся чисел:
     */
    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static int getNextRandom()
    {
        seed = (a * seed + c);
        seed = seed % m;
        return seed;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(getNextRandom());
        }
    }
}
