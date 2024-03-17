import java.util.*;

public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                count = count + 1;
        System.out.println(count + " Negative numbers found");
    }

}
