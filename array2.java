import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((arr[i][j]));
            }
            System.out.println();
        }

    }
}
