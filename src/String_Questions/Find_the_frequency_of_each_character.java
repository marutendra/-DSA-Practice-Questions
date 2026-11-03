package String_Questions;

public class Find_the_frequency_of_each_character {
    public static void main(String[] args) {
        String str="alex jhonson beta ";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            boolean alreadyCount=false;
            for (int j = 0; j <i ; j++) {
                if (str.charAt(i) == str.charAt(j)|| str.charAt(i)==' ') {
                    alreadyCount = true;
                    break;
                }
            }
                if (alreadyCount){
                    continue;
                }
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(i)==str.charAt(k)){
                        count++;
                    }

                }
            System.out.println(str.charAt(i)+": "+count);
            }


        }
    }

