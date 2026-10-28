package Arrays_Questions;

public class NumberOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4, 3};

      int [] arrr= new int[8];
        for (int i = 0; i < arr.length; i++) {
            arrr[i]=arr[i];

        }
        for (int i = 0; i <arrr.length ; i++) {
            System.out.println(arrr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyCount = false;

            // Check if element was already counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCount = true;
                    break;
                }
            }

            if (alreadyCount) {
                continue;
            }

            // Count frequency
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + "occurs" + count + "times");
        }
    }
}
