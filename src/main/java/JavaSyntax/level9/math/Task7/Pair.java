package JavaSyntax.level9.math.Task7;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
//        int temp = x; first variant
//        x = y;
//        y = temp;

//        int temp = x ^ y;  second variant
//        y = y ^ temp;
//        x = x ^ temp;

//        x ^= y;  third variant
//        y ^= x;
//        x ^= y;


    }
}
