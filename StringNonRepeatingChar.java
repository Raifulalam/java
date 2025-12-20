public class StringNonRepeatingChar {
    public static void main(String[] args) {
        String str = "amanaplanacanalpanama";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non repeating character in a string is : " + ch);
                break;
            }
        }
    }

}
