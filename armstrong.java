import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, n, r, s = 0;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            s = s + (r * r * r);
            n /= 10;
        }
        if (s == temp) {
            System.out.println("Number is Armstrong:" + temp);
        } else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
