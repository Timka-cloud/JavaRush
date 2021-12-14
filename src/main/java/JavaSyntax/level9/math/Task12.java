package JavaSyntax.level9.math;

public class Task12 {
    public static void main(String[] args) {
         // компьютер читает слева на права
//        int a = 3;
//        //       4  20 4  16  4  // в конце 4 а не 5 потому что a-- стало 4 и потом -- и стало 3 и к тому уже пришла ++a = 4
//        int b = ++a +(a-- * ++a);
//        System.out.println(b);

//        int a = 2;
//        //      2  2  12 2  5  3
//        int b = a + a * (a + ++a);
//        System.out.println(b);


      //  int number = 2;
        //                   2    6    2   4    2   9      3
        //System.out.println(number + number * number + ++number);
        //                  2     11   3     9    3   14   3
       // System.out.println(number + ++number * number + number);

        int a = 2;
        //      2    2     3
        int b = a * (a + ++a);
        // 2 * 5 = 10
        System.out.println("b=" + b);
        System.out.println("a=" + a);


        int a1 = 2;
         //            2    3
        int result1 = a1++ + a1;
        //    2 + 3 = 5;
        System.out.println("result1 = " + result1);
        System.out.println("a = " + a1);

        int n = 2;
        //             2     4
        int result2 = n++ + ++n;
        // 2 + 4 = 6
        System.out.println("result2 = " + result2);
        System.out.println("n = " + n);

        int m = 2;
        //            2      4     4    5
        int result3 = m++ + ++m + m++ + m;
        // 2 + 4 + 4 + 5 = 15
        System.out.println("result3 = " + result3);
        System.out.println("m = " + m);

        int p = 2;
        //             2    3    4    4       3    4    4
        int result4 = p++ + p + ++p + p-- + (p++ * p) + p--;
        // 2 + 3 + 4 + 4 + 12 + 4 = 29
        System.out.println("result4 = " + result4);
        System.out.println("p = " + p);
    }


}
