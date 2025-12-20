public class StrignOccuranceofEachChar {
    public static void main(String[] args) {
        String str = "mohammed raiful alam";
        int len = str.length();
        int[] freq = new int[256];
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Frequency of " + (char) i + " is :" + freq[i]);
            }
        }
    }

}
