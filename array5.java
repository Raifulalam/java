import java.util.*;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] matrix = {
        // { 10, 20, 30, 40, 50 },
        // { 60, 70, 80, 90, 100 }
        // };
        int matrix[][] = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}
