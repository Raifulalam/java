import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        // Lentgt of string
        int n = str.length();
        System.out.println(n);

        // uppercase
        String us = str.toUpperCase();
        System.out.println(us);

        // lower case
        String ls = str.toLowerCase();
        System.out.println(ls);

        // trim
        String trs = str.trim();
        System.out.println(trs);

        System.out.println(str);

        // substring
        String subs = str.substring(7);
        System.out.println(subs);

        if (str.startsWith("a")) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
        if (str.endsWith("a")) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        String[] words = trs.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String fname = words[0];
        System.out.println(fname);

        // charArray
        char[] arr = fname.toCharArray();
        System.out.println(arr[0]);
        for (char ch : arr) {
            System.out.println(ch);
        }
        

    }

}
