package JavaSyntax.level9.math;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(checkFlag(10, 3));

    }
    public static int setFlag(int number, int flagPos) {
        int shift = 1 << flagPos; // 0b00010000 if input 4
        return number | shift;
       // return number | (1 << flagPos); // тут сразу все делаю
    }

    public static int resetFlag(int number, int flagPos) {
        //Чтобы сбросить определенный бит в 0 и не потревожить другие биты, нужно выполнить операцию & между числом, в котором нужно сбросить бит в 0 и специальным числом, где все биты равны 1, кроме заданного.
//        int shift = 1 << flagPos; // 0b00001000 if input 3
//        shift = ~shift; // 0b11110111 ~ is NOT
//        return number & shift;
        return number & ~(1 << flagPos); // короткий вариант
    }

    public static boolean checkFlag(int number, int flagPos) {
       //Кроме установки или сброса определенного флага, иногда бывает нужно просто проверить, установлен ли данный флаг – равен ли определенный бит 1. Это достаточно легко сделать с помощью побитовой операции &.
        //Например, вам нужно в числе 0b00001010 проверить, установлен ли 4-й бит в 1. Тогда нужно сделать так: if ( (0b00001010 & 0b00001000) == 0b00001000 )
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
