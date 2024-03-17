import java.util.*;

public class array2D7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int r = sc.nextInt();
        System.out.println("Enter the column size");
        int c = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

}
