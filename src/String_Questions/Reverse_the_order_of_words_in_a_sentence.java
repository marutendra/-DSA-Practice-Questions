package String_Questions;

public class Reverse_the_order_of_words_in_a_sentence {
    public static void main(String[] args) {
        String str="hey i am alex the gold";
        String []arr= str.split(" ");
        for (int i = arr.length-1; i >0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ///  ///////////////////////////////////////

        for (int i = arr.length-1; i >0 ; i--) {
            String resString="";
            String newstring=arr[i];
            for (int j = newstring.length()-1; j >=0; j--) {

                resString+=newstring.charAt(j);
            }
            System.out.print(resString+" ");
        }


    }
}
