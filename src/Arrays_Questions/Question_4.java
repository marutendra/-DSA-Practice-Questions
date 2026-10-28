package Arrays_Questions;

public class Question_4 {
    public static void main(String[] args) {

        //Count even and odd elements in an array.

        int[] arr = {10, 20, 43, 35,2, 67};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.println("Even :"+arr[i]);
            }else {
                System.out.println("Odd :"+arr[i]);
            }

        }

    }
}
