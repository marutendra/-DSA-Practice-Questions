package String_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Check_whether_one_string_is_a_rotation_of_another {
    public static void main(String[] args) {
        // s1= ABCD
        // s2 = CDBA check if second can make from first
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string :");

        String s1= sc.nextLine();
        System.out.println("Enter Second string :");
        String s2=sc.nextLine();
        if(s1.length()==s2.length()){
            String snew= s1+s1;
            if(snew.contains(s2)){
                System.out.println("yes");
            }
        }
    }
}
