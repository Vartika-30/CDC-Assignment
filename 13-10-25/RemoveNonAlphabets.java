package String;


public class RemoveNonAlphabets {

    
    public static String removeNonAlphabets(String s) {
        
        return s.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        String data = "Geeks4Geeks is the best@123";
        String result = removeNonAlphabets(data);
        System.out.println("Original: " + data);
        System.out.println("Cleaned: " + result);
    }
}
