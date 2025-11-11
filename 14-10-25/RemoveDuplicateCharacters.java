package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String s) {
        if (s == null || s.isEmpty()) return "";

        Set<Character> charSet = new LinkedHashSet<>();
        
        for (char ch : s.toCharArray()) {
            charSet.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String data = "Programming";
        String result = removeDuplicates(data);
        System.out.println(result);
    }
}
