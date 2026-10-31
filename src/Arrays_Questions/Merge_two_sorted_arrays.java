package Arrays_Questions;

public class Merge_two_sorted_arrays {
    public static void main(String[] args) {

    int[] arr1 = {1, 3, 5};
    int[] arr2 = {2, 4, 6, 8, 10};

    int[] arr3 = new int[arr1.length + arr2.length];

    int i = 0, j = 0, k = 0;

    // Step 1: Dono arrays ke elements compare karo
    while (i < arr1.length && j < arr2.length) {

        if (arr1[i] <= arr2[j]) {
            arr3[k] = arr1[i];
            i++;
        } else {
            arr3[k] = arr2[j];
            j++;
        }

        k++;
    }

    // Step 2: Agar arr1 mein elements bach gaye
    while (i < arr1.length) {
        arr3[k] = arr1[i];
        i++;
        k++;
    }

    // Step 3: Agar arr2 mein elements bach gaye
    while (j < arr2.length) {
        arr3[k] = arr2[j];
        j++;
        k++;
    }

    // Step 4: Final array print karo
    for (int x = 0; x < arr3.length; x++) {
        System.out.print(arr3[x] + " ");
    }
}

}
