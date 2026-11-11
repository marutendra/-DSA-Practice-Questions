package String_Questions;

public class Find_the_longest_common_prefix_among_an_array_of_strings {
    public static void main(String[] args) {
        String s1= "Hey I am Divya Ranjan";
        String s2="man m made mankind";
        String prefix="";
        String []arr=s2.split(" ");
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (ch != arr[j].charAt(i)||i >= arr[j].length()) {
                    System.out.println(prefix);
                    return;
                }
            }

            prefix += ch;
        }

        System.out.println(prefix);
    }

        }


