public class RotationOfString {
    public static boolean isRotaion(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {
        boolean ans = isRotaion("aman", "alam");
        System.out.println(ans);

    }

}
