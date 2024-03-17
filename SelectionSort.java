import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // [2 0 -1 3 5 7 9] n=7
        for (int i = 0; i < arr.length - 1; i++) {
            int minval = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minval > arr[j]) {
                    minval = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("The sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
/*
 * in selection sort we need to find the minimum element from
 * unsorted part and put it at the beginning of that part.
 * ex:- we have array
 * [2 0 -1 3 5 7 9] with length n=7
 * first time loop will run from i=0 to i=6, so in this loop
 * it will find the minimum value which is 0 and its index is 1
 * then it will swap 0 with 0 itself as there is no smaller number than 0
 * now our array becomes [2 0 -1 3 5 7 9] and next time loop will start from i=1
 * and again it will find the minimum value which is -1 and place it at the
 * begining of second part
 * [-1 0 -1 3 5 7 9]
 * after that it will take 3 as a smallest number from third part and place it
 * at the beginning of fourth part
 * after complete one round all elements are placed in their correct positions
 * but they are not sorted yet.
 * so we continue like this until we reach last element.
 */
