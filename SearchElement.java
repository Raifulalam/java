public class SearchElement {
    public static int Search(int target, int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 45, 78, 14, 25, 35, 45, 0, 4, 42, 98, 23, 45, 12 };
        int ans = Search(0, arr);
        System.out.println("The elememt is found at index : " + ans);

    }

}
