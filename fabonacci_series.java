import java.util.*;

public class fabonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr number");
        int n1 = 0, n2 = 1, n = 1;
        n = sc.nextInt();
        System.out.print(0 + " " + 1);
        for (int i = 2; i <= n; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
