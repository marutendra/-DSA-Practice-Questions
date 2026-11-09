package String_Questions;

public class Count_uppercase_letters_lowercase_letters_digits_and_special_characters {
    public static void main(String[] args) {

        String str = "Hello@123World!";

                int upper = 0;
                int lower = 0;
                int digits = 0;
                int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }

}
