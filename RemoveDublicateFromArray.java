public class RemoveDublicateFromArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 3, 5, 7, 1, 6, 3 };
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[k++] = arr[i];

            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i]);
        }

    }
}
