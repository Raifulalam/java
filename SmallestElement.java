public class SmallestElement {
    public static void main(String[] args) {
        int[] nums = { 52, 45, 35, 8, 42, 75, 15, 15, 12, 5, 45 };
        int small = nums[0];
        for (int num : nums) {
            if (num < small) {
                small = num;
            }
        }
        System.out.println("The smallest number is : " + small);
    }

}
