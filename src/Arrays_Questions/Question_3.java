package Arrays_Questions;

public class Question_3 {
    public static void main(String[] args) {
        //. Find the maximum element in an array
        int []arr={12,3,45,0,1,6,78};
        int temp=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);


        //. Find the minimum element in an array.

        for (int i = 0; i < arr.length ; i++) {
            if (temp>arr[i]){
               temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
