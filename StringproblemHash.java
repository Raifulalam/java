public class StringproblemHash {
    public static void main(String[] ars) {
        String str = "abbacuaddgeeabbbccazhb";
        String capStr = str.toUpperCase();
        int start = 0;
        int end = 1;
        for (int i = 0; i < capStr.length() - 1; i++) {
            if (capStr.charAt(start) == capStr.charAt(end)) {
                System.out.println(capStr.charAt(start) + "1");
                end++;
            }
        }

    }

}
