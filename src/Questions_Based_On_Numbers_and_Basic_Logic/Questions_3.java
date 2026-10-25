package Questions_Based_On_Numbers_and_Basic_Logic;

public class Questions_3 {
    public static void main(String[] args) {
        // prime --> 1 , 3 , 5 , 7 the numbers who divide by self or 1
        int number = 3;
        boolean prime=true;
        if(number==1){
            prime=false;
        }
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                prime=false;
            }
        }
        if(!prime) {
            System.out.println("number is not prime");
        }
        else {
            System.out.println("prime");
        }

        // Print all prime numbers from 1 to N.
        int number2=20;

        for (int i = 1; i <=30 ; i++) {
            boolean isprime=true;
            if(i<=1){
                isprime=false;

            }
            for (int j = 2; j <=i/2; j++) {
               if(i%j==0){
                   isprime=false;
               }
            }

            if(isprime){
                System.out.println(i);
            }
        }

    }
}
