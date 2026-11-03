package String_Questions;

public class Remove_all_spaces_from_a_string {
    public static void main(String[] args) {
        String str= " hey i  m  alex!1 ";
        String newString="";
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (c == ' ') {
               continue;
            }
            newString += c;
        }
        System.out.println(newString);
    }
}
