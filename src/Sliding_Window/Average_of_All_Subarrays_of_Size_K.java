package Sliding_Window;

public class Average_of_All_Subarrays_of_Size_K {
    public static void main(String[] args) {
        int []arr = {1,3,2,6,-1,4,1,8,2};
        int k=5;
        float  sum=0;
        float avg=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
            avg=sum/k;
        }
        System.out.print(avg+" ");
        for (int i = 1; i <= arr.length-k; i++) {
            sum=sum-arr[i-1]+arr[i+k-1];
            avg=sum/k;
            System.out.print(avg+" ");
        }
    }
}
