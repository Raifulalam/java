import java.util.*;

public class array2D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rwo");
        int rs = sc.nextInt();
        System.out.println("Enter the size of column");
        int cs = sc.nextInt();
        System.out.println("Enter the elements");
        int[][] arr = new int[rs][cs];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

        }
        for (i = 0; i < arr.length; i++)
            for (j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
    }

}
