public class stringPalindrome {
    public static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(r) != str.charAt(l)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ramar"));

    }

}
