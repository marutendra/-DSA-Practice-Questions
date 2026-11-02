package String_Questions;

public class String_is_a_palindrome {
    public static void main(String[] args) {
        String str= "AAAA";
        String res="";
        for (int i = str.length()-1; i >=0 ; i--) {
            res+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(res)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome ");
        }
    }
}
