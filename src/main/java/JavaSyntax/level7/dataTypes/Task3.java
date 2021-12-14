package JavaSyntax.level7.dataTypes;

public class Task3 {
    public static void main(String[] args) {
        long a = 109 + 15;
        int b = (int) a * 2;
        short c = (short) (a / b);
        byte d = (byte) (a + b - c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //124
        //248
        //0
        //116
    }
}
