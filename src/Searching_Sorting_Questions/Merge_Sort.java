package Searching_Sorting_Questions;

public class Merge_Sort {

        public static void mergeSort(int[] arr, int low, int high) {

            if (low < high) {

                int mid = low + (high - low) / 2;

                // Divide array into two halves
                mergeSort(arr, low, mid);
                mergeSort(arr, mid + 1, high);

                // Merge both sorted halves
                merge(arr, low, mid, high);
            }
        }

        public static void merge(int[] arr, int low, int mid, int high) {

            int[] temp = new int[high - low + 1];

            int i = low;
            int j = mid + 1;
            int k = 0;

            // Compare elements of both halves
            while (i <= mid && j <= high) {

                if (arr[i] <= arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }

                k++;
            }

            // Copy remaining elements from left half
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }

            // Copy remaining elements from right half
            while (j <= high) {
                temp[k] = arr[j];
                j++;
                k++;
            }

            // Copy sorted elements back to original array
            for (int x = 0; x < temp.length; x++) {
                arr[low + x] = temp[x];
            }
        }

        public static void main(String[] args) {

            int[] arr = {38, 27, 43, 10, 9, 82};

            mergeSort(arr, 0, arr.length - 1);

            System.out.println("Sorted Array:");

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

