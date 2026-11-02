package String_Questions;

public class Find_the_length_of_a_string_without_using_the_length {
    public static void main(String[] args) {
        String str= "Alex Denim ";
        int count=0;
        for (char s:str.toCharArray()){
            // if we did not include space
            if(s==' '){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
