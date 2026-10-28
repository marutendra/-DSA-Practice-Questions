package Arrays_Questions;

public class SecondSmallest {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int temp=0;
        int temp2=0;
        for(int i = 0; i < arr.length; i++) {
            if (temp>arr[i]){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
