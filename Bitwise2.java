import java.util.*;

public class Bitwise2 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int Bitmask = 1 << pos;
        int newNumber = Bitmask | n;
        System.out.println(newNumber);
    }

}
