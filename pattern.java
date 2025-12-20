import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("please enter od number");

        } else {
            int mid = n * 2 - 1;
            // top pyramid
            for (int i = 1; i < n; i++) {
                for (int s = 0; s < n - i; s++) {
                    System.out.print(" ");
                }
                for (int st = 0; st < (i * 2 - 1); st++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // mid
            for (int i = 1; i <= n; i++) {

                for (int s = 0; s < n - 1; s++)
                    System.out.print(" ");

                System.out.print("@");

                for (int s = 0; s < mid; s++)
                    System.out.print(" ");

                System.out.print("@");

                System.out.println();
            }

            // ---------------- BOTTOM FIRST ROW ----------------
            for (int st = 0; st < n; st++)
                System.out.print("*");
            System.out.print("@");
            for (int st = 0; st < n; st++)
                System.out.print("*");
            System.out.println();

            // ---------------- INVERTED DOUBLE PYRAMID ----------------
            for (int i = n; i > 1; i--) {

                for (int st = 0; st < i; st++)
                    System.out.print("*");

                for (int s = 0; s < mid + 1; s++)
                    System.out.print(" ");

                for (int st = 0; st < i; st++)
                    System.out.print("*");

                System.out.println();
            }
        }

    }
}
