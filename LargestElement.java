public class LargestElement {
    public static void main(String[] args) {
        int[] nums = { 34, 67, 23, 89, 2, 90, 11 };
        int largest = nums[0];
        // for (int num : nums) {
        // largest = Math.max(largest, num);
        // }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest element: " + largest);
    }

}
