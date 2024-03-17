import java.util.*;

public class Bitwise1 {
    public static void main(String[] args) {
        int n = 5;// 5=(0101)base 2
        int pos = 3;// 3 times left shift
        int Bitmask = 1 << pos;// 1=(0001)<<3 and become (1000) base2
        if ((Bitmask & n) == 0) { // & operation for both value are true (0001) & (1000)=(0000)
            System.out.println("Bit was zero");
        } else
            System.out.println("Bit was one");
    }
}
