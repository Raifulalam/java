public class ReplaceSpaceWithChar {

    public static void main(String[] args) {
        String str = "mohammed raiful alam";
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                sb.append("20%");
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

}
