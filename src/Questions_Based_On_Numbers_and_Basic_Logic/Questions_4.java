package Questions_Based_On_Numbers_and_Basic_Logic;

public class Questions_4 {
    public static void main(String[] args) {
        int number = 4;
        int result=0;
        while(number>0){
            int reminder=number%10;
           result+=reminder;
           number=number/10;
        }
        System.out.println(result);

        // Check whether a number is a perfect number.
        // like 6 -- 1, 2, 3  then 1+2+3=6 perfect

        int number1=6;
        int res=0;
        for (int i = 1; i <=number1/2 ; i++) {
            if (number1%i==0){
                res+=i;
            }
            if(res==number1){
                System.out.println("perfect number!!!");
            }

        }






    }
}
