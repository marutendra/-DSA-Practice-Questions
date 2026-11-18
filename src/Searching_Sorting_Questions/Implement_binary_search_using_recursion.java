package Searching_Sorting_Questions;

import java.util.Scanner;

public class Implement_binary_search_using_recursion {
   public static int binarySearch(int arr[], int low, int high, int target) {

        // Base condition
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search in left half
        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        }

        // Search in right half
        return binarySearch(arr, mid + 1, high, target);
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
