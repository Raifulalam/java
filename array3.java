import java.util.*;

public class array3 {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        int arr[] = new int[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
