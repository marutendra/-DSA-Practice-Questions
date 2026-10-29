package Arrays_Questions;

public class Move_All_Zero_In_the_End {
    public static void main(String[] args) {

            int[] arr = {0,2,4,0,6,8,0,0,7,6,0, 1, 0, 3, 12};

            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index] = arr[i];
                    index++;
                }
            }

            while (index < arr.length) {
                arr[index] = 0;
                index++;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}
