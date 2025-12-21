public class StringProblem {
    public static void main(String[] args) {
        String str = "This apple is a good apple level ";
        String[] arr = str.split(" ");

        for (String word : arr) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println(word.length());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(word.charAt(0));
                sb.append(word.charAt(word.length() - 1));
                System.out.println(sb.toString());
            }

        }
    }
}