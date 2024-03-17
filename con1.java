public class con1 {
    int a;
    int b;

    con1() {
        System.out.println("This is non parametrised");
    }

    con1(int x, int y) {
        a = x;
        b = y;
        System.out.println(a + b);
    }

    con1(con1 d) {
        a = d.a;
        b = d.b;
        System.out.println(a + b);

    }

    public static void main(String args[]) {
        con1 c = new con1();
        con1 d = new con1(5, 8);
        con1 e = new con1(d);

    }

}
