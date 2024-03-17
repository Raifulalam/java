public class arraymethod {
    static void get(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 9;
        a[1] = 5;
        a[2] = 7;
        a[3] = 6;
        a[4] = 11;
        get(a);
    }

}
