package String;

public class CountWordsInString {
    public static int countWordsManual(String s) {
        if (s == null || s.isEmpty()) return 0;

        int count = 0;
        boolean inWord = false;
        
        for (char ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String data1 = "  Java is awesome   ";
        System.out.println(countWordsManual(data1));
    }
}
