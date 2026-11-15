package Searching_Sorting_Questions;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={10,20,30,40,50,60,70};
        int first=0;
        int last= arr.length+1;
        System.out.println("Enter number to be search :");
        int num = sc.nextInt();
        boolean gotnumber=false;
      while(first<=last){
          int mid=(first+last)/2;
          if(arr[mid]==num){
              System.out.println("Number found at positon :"+(mid+1));
              gotnumber=true;
              break;
          }else if(arr[mid]>num){
              last=mid-1;
          } else if(arr[mid]<num){
              first=mid+1;
          }
      }
      if(!gotnumber){
          System.out.println("number is not present in the list");
      }
    }
}
