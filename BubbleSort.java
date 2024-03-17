import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // [4 6 8 3 9 1 5 2]
        // first loop start with zero index
        for (int i = 0; i < n - 1; i++) {
            // second loop start from first index
            for (int j = 0; j < n - 1 - i; j++) {
                // comparision of 0th element with(i+1)th element
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
