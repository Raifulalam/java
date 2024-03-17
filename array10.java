import java.util.*;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
        // int arr1[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            // arr1[i] = arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

}
