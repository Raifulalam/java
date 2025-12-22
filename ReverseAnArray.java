public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 9, 8, 4, 6, 3, 1 };
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int num : nums) {
            System.out.print(num);
        }

    }

}
