package Arrays_Questions;

public class Rotate_an_array_to_the_right_by_one_position {
    public static void main(String[] args) {
// left shift
        int[] arr = {1,2,3,4,5}; // 5,1,2,3,4
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // left shift

        int temp2=arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0] = temp2;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
