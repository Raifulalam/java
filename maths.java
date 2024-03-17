import java.util.*;

public class maths {
    static double circle(double r) {
        double area = (3.14 * r * r);
        return area;

    }

    void areaofrectangle(int l, int b) {
        System.out.println("area of Rectangle:" + l * b);
        System.out.println(circle(7));
    }

    public static void main(String args[]) {
        maths m = new maths();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        double k = circle(5.755);
        System.out.println("area of circle:" + k);
        m.areaofrectangle(l, b);
        double p = maths.circle(10);
        System.out.println(p);
    }
}