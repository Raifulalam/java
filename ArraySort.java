import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 1, 4, 2 };
        System.out.println("Before Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.println("\nAfter Sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }

}
