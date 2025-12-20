public class LosngestWord {
    public static void main(String[] args) {

        String str = "Find the longest word in this string";
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word is: " + longestWord);
    }

}
