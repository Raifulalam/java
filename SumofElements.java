public class SumofElements {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 78, 5, 6 };
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }

}
