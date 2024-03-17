import java.util.Scanner;

//scaler metrix......................................
public class array2D10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int r = sc.nextInt();
        System.out.println("Enter the column size");
        int c = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[][] = new int[r][c];
        int arr1[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                arr1[i][j] = arr[i][j];
            }
        }
        // System.out.println("Scalar matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print("1" + " ");
                } else
                    System.out.print("0" + " ");
            }
            System.out.println();
        }
    }
}
