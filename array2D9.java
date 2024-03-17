import java.util.Scanner;

// to copy matrix into other 
public class array2D9 {
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
        System.out.println("copied array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("original array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
