import java.util.*;

public class array2D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int r = sc.nextInt();
        System.out.println("Enter colummn size:");
        int c = sc.nextInt();
        System.out.println("Enter the elements:");
        int n = 1;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        for (int i = 0; i < r + n - r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            n++;

        }
    }

}
