package String_Questions;

public class Count_the_occurrences_of_a_particular_character {
    public static void main(String[] args) {
        String str= "oaoloexo jhonsono";
        //String []arr=str.split("o");
        //int len= arr.length-1;
        //System.out.println(len);
        int count=0;
        char particularChar='o';
        for (int i = 0; i <str.length() ; i++) {
            char c= str.charAt(i);
            if (c==particularChar){
                count++;
            }
        }
        System.out.println(count);
    }
}
