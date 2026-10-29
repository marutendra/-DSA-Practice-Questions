package Arrays_Questions;

public class Check_Array_is_Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr = {10, 90, 30, 40, 50};
        int temp=arr[0];
        boolean x=false;
        for (int i = 1; i < arr.length; i++) {

         if((temp <=arr[i])){
             temp=arr[i];
             x=true;
         }else {

             x=false;
             break;
         }
        }
        if (!x) {
            System.out.println("unsorted");
        }else{
            System.out.println("sorted");
        }
    }
}
