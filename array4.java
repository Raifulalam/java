import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter the marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
            if (marks[i] == 49) {
                System.out.println("the number you entered is found in index:" + " " + i);
                break;
            }
        }

    }
}
