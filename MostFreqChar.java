public class MostFreqChar {
    public static void main(String[] args) {
        String str = "mohammed raiful alam";
        int len = str.length();
        int[] freq = new int[256];
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                System.out.println("The most frequent char is : " + (char) i + " repeated " + max + " times");
            }
        }

    }

}
