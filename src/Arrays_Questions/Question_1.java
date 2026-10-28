package Arrays_Questions;

public class Question_1 {
    public static void main(String[] args) {
        // Find the sum of all elements in an array.
        int []arr={10,20,30,40,50};
        int res=0;
        for (int i = 0; i < arr.length ; i++) {
            res=res+arr[i];

        }
        System.out.println(res);
    }



}
