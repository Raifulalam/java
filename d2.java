public class d2 {
    public static void main(String[] args) {
        int[][] aar1 = new int[5][6];
        aar1[1][3] = 10;
        aar1[1][2] = 15;
        System.out.println(aar1[1][3]);
        System.out.println(aar1[2][3]);
        for (int i = 0; i < aar1.length; i++) {
            for (int j = 0; j < aar1.length; j++) {
                System.out.print(aar1[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println(aar1.length);
        System.out.println(aar1[0].length);
    }
}
