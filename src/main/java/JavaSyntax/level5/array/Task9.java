package JavaSyntax.level5.array;

public class Task9 {
    public static void main(String[] args) {
//        int[][][][] matrix;
//        matrix = new int[2][][][];                // создаем массив «ссылок на ссылки на ссылки» длины 2
//        for (int i = 0; i < matrix.length; i++)
//        {
//            matrix[i] = new int[3][][];             // создаем массив «ссылок на ссылки» длины 3
//            for (int j = 0; j < matrix[i].length; j++)
//            {
//                matrix[i][j] = new int[4][];          // создаем массив ссылок длины 4
//                for (int k = 0; k < matrix[i][j].length; k++)
//                    matrix[i][j][k] = new int[5];       // создаем массивы целых чисел длины 5
//            }
//        }
        int[][][][] matrix = new int[2][3][4][5];
        matrix[0][1][3][0] = 10;
        matrix[1][2][3][2] = 15;
        matrix[0][0][0][0] = 20;
        matrix[1][2][1][3] = 25;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    for (int l = 0; l < matrix[i][j][k].length; l++) {
                        System.out.print(matrix[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }

    }
}
