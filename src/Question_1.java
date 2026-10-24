public class Question_1 {

    // through method
    public static int fact(int number ) {
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
       return result;
    }
    public static void main(String[] args) {
        // Factorial
        int number = 5;
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
        int fact = fact(5);
        System.out.println(fact);

    }
}
