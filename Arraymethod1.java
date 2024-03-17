import java.util.*;

public class Arraymethod1 {
    static int get(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements odf arrray:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        // System.out.println(get(arr));
        int a = get(arr);
        System.out.println(a);
    }

}
