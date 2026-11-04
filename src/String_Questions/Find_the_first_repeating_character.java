package String_Questions;

public class Find_the_first_repeating_character {
    public static void main(String[] args) {
        String str="zllmanmohan";
        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            boolean alreadyCount = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j) || str.charAt(i) == ' ') {
                    alreadyCount = true;
                    break;
                }
            }
            if (alreadyCount) {
                continue;
            }
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i)==str.charAt(k)){
                    count++;
                }
            }
            if (count>1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
