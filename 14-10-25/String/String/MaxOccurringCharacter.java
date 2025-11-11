package String;

public class MaxOccurringCharacter {
    private static final int ASCII_SIZE = 256;

    public static char getMaxOccurringChar(String s) {
        if (s == null || s.isEmpty()) return ' ';

        int[] count = new int[ASCII_SIZE];

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                count[ch]++;
            }
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < ASCII_SIZE; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String data = "Hello, world! I am a coder.";
        char result = getMaxOccurringChar(data);
        System.out.println(result);
    }
}
