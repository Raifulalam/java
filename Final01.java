import java.util.*;

public class Final01 {
    int a = 5;
    final int b = 7;

    void sum() {
        a = 3 + a;
        // b = 5+5;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Final01 s = new Final01();
        s.sum();
    }

}
