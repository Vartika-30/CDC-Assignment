package String;


public class VowelConsonantCount {

 
    public static int[] countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String data = "Hello World!";
        int[] counts = countVowelsAndConsonants(data);
        System.out.println("String: " + data);
        System.out.println("Vowels: " + counts[0]); 
        System.out.println("Consonants: " + counts[1]);
    }
}
