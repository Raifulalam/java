public class stringbasic {
    public static void main(String[] args) {
        String str = "Abc def Ghi";
        System.out.println("Original String: " + str);

        int n = str.hashCode();
        System.out.println("Hash Code: " + n);

        str.concat("str");
        System.out.println("After concat: " + str);
    }

}
