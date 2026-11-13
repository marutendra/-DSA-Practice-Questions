package Sliding_Window;

public class Three_sum {
    public static void main(String[] args) {
        int size=3;
        int [] arr = {1,2,3,4,5,6,7,4,6,7};
        int  initialSum=0;
        for (int i = 0; i <size ; i++) {
            initialSum+=arr[i];
        }
        int tempSum=initialSum;
        for (int i = 1; i <=arr.length-size; i++) {
            initialSum=initialSum-arr[i-1]+arr[i+size-1];
            if (initialSum>tempSum){
                tempSum=initialSum;
            }

        }
        System.out.println(tempSum);
    }
}
