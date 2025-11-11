package String;

public class CharacterFrequency {
    public static int calculateFrequency(String s, char target) {
        int count = 0;
        char lowerTarget = Character.toLowerCase(target);
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == lowerTarget) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String data = "Programming is Fun!";
        char target = 'g';
        int result = calculateFrequency(data, target);
        System.out.println(result);
    }
}
