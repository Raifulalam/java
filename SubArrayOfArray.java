import java.util.*;

public class SubArrayOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("");
            }
        }
    }

}
