package Questions_Based_On_Numbers_and_Basic_Logic;

public class Questions_6 {
    // fibonacci series up to N
    // Generate the Fibonacci series up to N terms.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
    static void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
    public static void primeFactors(int number) {

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args) {
        
        // prime factors of any number
        primeFactors(24);

        System.out.println("");
        // calling fibonacci
        fibonacci(10);
    }
}
