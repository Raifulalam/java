/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 7, 1, 3 };
        sorted(array);
    }

    public static void sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        // print the sorted array
        System.out.println("The sorted array is: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
    }

}