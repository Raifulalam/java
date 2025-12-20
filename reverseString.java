public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        String rev = "";
        for (int i = str.length(); i > 0; i--) {
            rev = rev + str.charAt(i - 1);
        }
        System.out.println("Reversed String: " + rev);
    }
}