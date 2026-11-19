package Searching_Sorting_Questions;

public class Find_the_first_occurrence_of_an_element_in_a_sorted_array {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4,5,5,5,6,9, 9};
    int target = 6;
    // O(log n) complexity
        int result=0;
    int first =0;
    int last= arr.length;
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==target){
                result=mid+1;
            }
            if(arr[mid]>=target){
                last=mid-1;
            } else{
                first=mid+1;
            }
        }
        System.out.println(result);

}}
