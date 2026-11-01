package Arrays_Questions;

public class Rotate_an_array_to_the_right_by_K_positions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

// Last k elements ko temp mein store karo
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n-k+i];
        }

// Remaining elements ko temp mein store karo
        for (int i = 0; i < n-k; i++) {
            temp[k+i] = arr[i];
        }

// Temp ko original array mein copy karo
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
