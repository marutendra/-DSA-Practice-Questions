package Sliding_Window;

import java.util.LinkedList;
import java.util.Queue;

public class First_Negative_Number_in_Every_Window_of_Size_K {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        Queue<Integer> queue = new LinkedList<>();

        // First window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
        }

        // Process all windows
        for (int i = k; i <= arr.length; i++) {

            // Print first negative of current window
            if (!queue.isEmpty()) {
                System.out.print(arr[queue.peek()] + " ");
            } else {
                System.out.print(0 + " ");
            }

            // Remove index that is outside next window
            if (!queue.isEmpty() && queue.peek() == i - k) {
                queue.poll();
            }

            // Add new element's index
            if (i < arr.length && arr[i] < 0) {
                queue.add(i);
            }
        }


//        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
//        int k = 3;
//        // -1 -1 -7 -15 -15 0
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i <k ; i++) {
//            queue.add(arr[i]);
//        }
//        for (Integer num:queue ) {
//            if (num < 0) {
//                System.out.print(num+" ");
//                break;
//            }
//        }
//
//        for (int i = 1; i <=arr.length-k; i++) {
//            int index=0;
//            queue.poll();
//            queue.add(arr[i+k-1]);
//
//            for (Integer num:queue ) {
//                if(index== queue.size()-1){
//                    System.out.println(0);
//                }
//                if (num <=0 ) {
//                    System.out.print(num+" ");
//                    break;
//                }
//                index++;
//            }
//        }
    }
}
