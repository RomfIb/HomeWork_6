import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int[] consoleArray = new int[9];
//
//        for (int i = 0; i <= array.length - 1; i++)
//            array[i] = scanner.nextInt();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Главная диагональ
//        for (int i = 0; i <= array.length - 1; i++) {
//            if ((i % 4) == 0)
//                System.out.print(array[i] + " ");
//            else
//                System.out.print(" ");
//            if (((i + 1) % 3) == 0)
//                System.out.println();
//        }


//
        int [][] consoleMatrix = new int[3][3];
//
//        for (int i = 0; i <= consoleMatrix.length - 1; i++)
//            for (int j = 0; j <= consoleMatrix[0].length - 1; j++)
//                consoleMatrix[i][j] = scanner.nextInt();
//
//        for (int i = 0; i <= consoleMatrix.length - 1; i++)
//            for (int j = 0; j <= consoleMatrix[0].length - 1; j++) {
//                System.out.print(consoleMatrix[i][j]);
//                if (j == consoleMatrix[0].length - 1)
//                    System.out.println();
//            }
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //главная диагональ
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (i == j)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //побочная диагональ
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if ((i + j) == 2)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (i >= j)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (i <= j)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if ((i + j) > 1)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if ((i + j) < 3)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}