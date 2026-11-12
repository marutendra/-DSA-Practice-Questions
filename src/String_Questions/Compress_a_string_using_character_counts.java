package String_Questions;

public class Compress_a_string_using_character_counts {
    public static void main(String[] args) {
        String str = "aaabbbbccc";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                sb.append(str.charAt(i)).append(count);
            }
        }

        System.out.println(sb);
    }
}
