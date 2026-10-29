package Arrays_Questions;

public class Find_Missing_number {
    public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5};

            int n = 5;
            int sum = n * (n + 1) / 2;

            int actualSum = 0;

            for (int i = 0; i < arr.length; i++) {
                actualSum = actualSum + arr[i];
            }

            int missing = sum - actualSum;

            System.out.println("Missing number" + missing);
        }
    }

