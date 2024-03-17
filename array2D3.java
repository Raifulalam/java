import java.util.*;

public class array2D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int row = sc.nextInt();
        System.out.println("Enter column size");
        int col = sc.nextInt();
        System.out.println("Enter elements of row and column");
        int sum = 0;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                sum = sum + arr[i][j];
        System.out.println("sum of all the elements of array is:" + sum);

    }

}
