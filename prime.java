import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, flag = 0;
        System.out.println("Enter the number");
        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Not prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not prime");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag != 1 && n > 1) {
            System.out.println(n + " is a prime number");
        }

    }
}
