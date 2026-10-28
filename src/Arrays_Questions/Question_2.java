package Arrays_Questions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //. Find the average of array elements.
        int []arr={10,20,30,40};
        Scanner sc= new Scanner(System.in);
        int []arrr = new int[5];
        for (int i = 0; i < 5; i++) {
           arrr[i]=sc.nextInt();
        }
        //-----------------------------------------//
        int sum=0;
        for (int i = 0; i < arrr.length; i++) {
            sum +=arrr[i];
        }
        float avg=sum/arrr.length;
        System.out.println(avg);
    }
}
