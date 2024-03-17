import java.util.*;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.next();
        s1 = s1.toLowerCase();
        int[] s2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s2[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length; i++) {
            // to print the frequency of character
            // if (s2[i] > 0) {
            // System.out.printf("%c=%d\n", i + 97, s2[i]);
            // }
            // to print the repeated/ dublicate charcter
            // if (s2[i] > 1) {
            // System.out.printf("%c=%d\n", i + 97, s2[i]);
            // }
            // to print all the character only once
            // if (s2[i] >= 1) {
            // System.out.printf("%c\n", i + 97);
            // }
            // to print unique elements only
            if (s2[i] == 1) {
                System.out.printf("%c\n", i + 97);
            }

        }

    }

}
