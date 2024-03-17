import java.util.*;

public class array1 {

    public static void main(String args[]) {
        // int[] arr = new int[5];
        // arr[0] = 6;
        // arr[1] = 6;
        // // System.out.println(arr[4]);
        // int[] arr1 = { 5, 6, 7, 55, 75, 98, 76, 980, 78, 236, 51, 81 };
        // System.out.println(arr1[5]);
        // for (int i = 0; i <= arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }
        // int[] arr2 = new int[100];
        // System.out.println("Enter the elements of array");
        // for (int i = 0; i <= 5; i++) {
        // Scanner sc = new Scanner(System.in);

        // arr2[i] = sc.nextInt();

        // }
        // for (int j = 0; j <= 5; j++) {
        // System.out.print(arr2[j]);
        // }
        // 2darrays
        // int[][] arr3 = new int[3][];
        // int[][] arr = {
        // { 1, 2, 3 },
        // { 2, 3, 4 },
        // { 3, 4, 5 }
        // };
        // System.out.println(arr3);
        int[][] arr = new int[3][3];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
            System.out.println();
        }
    }

}
