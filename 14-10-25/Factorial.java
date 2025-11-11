package Recursion;

public class Factorial {
    public static long findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return (long)n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}
