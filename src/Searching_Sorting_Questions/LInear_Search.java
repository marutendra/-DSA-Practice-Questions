package Searching_Sorting_Questions;

import java.util.Scanner;

public class LInear_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={10,40,20,40,39,58};
        System.out.println("Enter number to be search :");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if (num==arr[i]){
                System.out.println("Number found at positon :"+(i+1));
                break;
            }
        }
    }
}
