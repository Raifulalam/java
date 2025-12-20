public class CountWord {
    public static void main(String[] args) {
        String str = "Count the number of words in this string";
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }

}
