package String_Questions;

public interface Check_whether_a_string_contains_only_digits {
    public static void main(String[] args) {
                String str = "123456";

                boolean onlyDigit = true;

                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        onlyDigit = false;
                        break;
                    }
                }

                System.out.println(onlyDigit);
            }
        }

