package String;


public class CheckPalindrome {

    
    public static boolean isPalindrome(String s) {
     
        if (s == null || s.length() == 0) return true;
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println("'" + s1 + "' is palindrome: " + isPalindrome(s1));
        System.out.println("'" + s2 + "' is palindrome: " + isPalindrome(s2));
    }
}
