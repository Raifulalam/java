public class StringRemoveDubliChar {
    public static void main(String[] args) {
        String str = "mohammed raiful alam";
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (!seen[str.charAt(i)]) {
                seen[str.charAt(i)] = true;
                sb.append(str.charAt(i));
            }
        }

        // for (int i = 0; i < str.length(); i++) {
        // if (sb.toString().contains(String.valueOf(str.charAt(i)))) {
        // continue;
        // } else {
        // sb.append(str.charAt(i));
        // }
        // }
        System.out.println(sb);
    }
}