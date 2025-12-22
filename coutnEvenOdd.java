public class coutnEvenOdd {
    public static void main(String[] args) {
        int[] nums = { 14, 17, 12, 35, 65, 48, 15, 16, 19, 32, 5, 4, 96, 102, 99, 75, 56, 18, 12, 3, 39 };
        int Ecount = 0;
        int Ocount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                Ecount++;
            } else {
                Ocount++;
            }
        }
        System.out.println("Total Odd numbers are : " + Ocount);
        System.out.println("Total Even numbers are : " + Ecount);

    }

}
