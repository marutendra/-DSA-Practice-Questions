package Arrays_Questions;

public class One_time_Element {
    public static void main(String[] args) {
        int []arr={0,0,1,2,3,1,4,5,3,4,2};

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }
        // if exactly one time unique element is present
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];

        }
        System.out.println(ans);
    }
}
