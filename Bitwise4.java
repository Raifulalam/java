import java.util.*;

public class Bitwise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to perform:");
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int Bitmask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = Bitmask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitwise = ~(Bitmask);
            int newNumber = (newBitwise & n);
            System.out.println(newNumber);
        }
    }

}
