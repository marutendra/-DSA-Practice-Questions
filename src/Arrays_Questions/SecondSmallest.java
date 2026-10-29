package Arrays_Questions;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {-10, -20, -30, -40, -50};

        int temp = Integer.MAX_VALUE;
        int temp2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < temp) {
                temp2 = temp;
                temp = arr[i];
            }
            else if (arr[i] < temp2 && arr[i] != temp) {
                temp2 = arr[i];
            }
        }

        System.out.println(temp2);
    }}
