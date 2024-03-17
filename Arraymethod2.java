import java.util.*;

public class Arraymethod2 {
    static int[] get(int a[]) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return (b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        int c[] = get(a);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }

}
