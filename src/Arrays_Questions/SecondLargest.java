package Arrays_Questions;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr={30,49,1,0,-5,68};
        int temp=0;
        int temp2=0;
        for (int i = 0; i < arr.length; i++) {
            if (temp<arr[i]){
                temp2=temp;
                temp=arr[i];

            }
        }
        System.out.println(temp2);

    }
}
