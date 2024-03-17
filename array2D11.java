import java.util.Scanner;

public class array2D11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int r = sc.nextInt();
        System.out.println("Enter the column size");
        int c = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[][] = new int[r][c];
        int arr1[][] = new int[r][c];
        int sum[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                arr1[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
