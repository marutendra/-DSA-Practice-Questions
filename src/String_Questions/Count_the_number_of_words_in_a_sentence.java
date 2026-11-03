package String_Questions;

import java.util.Objects;

public class Count_the_number_of_words_in_a_sentence {
    public static void main(String[] args) {
        String str= "   Hey my name    is alex delon ";
        String []arr= str.trim().split("\\s+");
        int count = arr.length;
        System.out.println(count);
    }
}
