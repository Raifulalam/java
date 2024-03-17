import java.util.*;

public class StringB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("raiful");
        System.out.println(sb);
        // // charAt(indecx)
        // System.out.println(sb.charAt(3));
        // // set char at (index)
        // sb.setCharAt(3, 't');
        // System.out.println(sb);
        // // insert char at index
        // sb.insert(0, 'f');
        // System.out.println(sb);
        // // append char
        // sb.append('m');
        // System.out.println(sb);
        // // delete char from stringbuilder
        // sb.delete(0, 1);
        // System.out.println(sb);
        // sb.length
        // reverse the string
        for (int i = 0; i < sb.length() / 2; i++) {
            // index of character
            int front = i;
            int back = sb.length() - 1 - i;
            // set character at
            char frontChar = sb.charAt(front);
            char backhar = sb.charAt(back);

            // set the character at front and back
            sb.setCharAt(front, backhar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }

}
