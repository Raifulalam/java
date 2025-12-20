public class noOfVC {
    public static int countVowelsAndConsonants(String str) {
        int VowelsCount = 0, ConsonantsCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    VowelsCount++;
                } else {
                    ConsonantsCount++;
                }
            }
        }
        System.out.println("Vowels: " + VowelsCount);
        System.out.println("Consonants: " + ConsonantsCount);
        return VowelsCount + ConsonantsCount;
    }

    public static void main(String[] args) {
        String str = "Mohammed raiful Alam=";
        int total = countVowelsAndConsonants(str);
        System.out.println("Total Vowels and Consonants: " + total);
    }
}
