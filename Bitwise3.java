import java.util.*;

// clear 
public class Bitwise3 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int Bitmask = 1 << pos;
        int NotBitmask = ~(Bitmask);
        int newNumber = NotBitmask & n;
        System.out.println(newNumber);
    }

}
