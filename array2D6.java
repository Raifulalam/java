import java.util.*;

public class array2D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int r = sc.nextInt();
        System.out.println("Enter colummn size:");
        int c = sc.nextInt();
        System.out.println("Enter the elements:");
        // sum of each columns............................//
        int n = 1;
        int sum = 0;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        for (int j = 0; j < (c + n) - c; j++) {
            for (int i = 0; i < r; i++) {
                sum = sum + arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("=" + sum);
            sum = 0;
            n++;
        }

    }
}