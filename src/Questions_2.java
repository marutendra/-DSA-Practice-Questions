public class Questions_2 {
    public static void main(String[] args) {
        // sum of digit
        int number = 559;
        int result = 0;
        while (number > 0) {
            int reminder = number % 10;
            result = result + reminder;
            number = number / 10;
        }
        System.out.println(result);

        // reverse
        int number1=897;
        int reverse = 0;
        while (number1 > 0) {
            int reminder = number1 % 10;
            reverse= reverse*10+ reminder;
            number1 = number1 / 10;
        }
        System.out.println(reverse);


//. Count the digits of a number.
        int number2=344;
        int count = 0;
        while (number2 > 0) {
            int reminder = number2 % 10;
            count++;
            number2 = number2 / 10;
        }
        System.out.println(count);
    }
}
