public class MargeString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";

        // Using '+' operator to concatenate two strings.
        System.out.println("Using + : " + str1 + " " + str2);

        // Using StringBuilder's append() method for concatenation.
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ");
    }

}
