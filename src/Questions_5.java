public class Questions_5 {
    public static void main(String[] args) {

        ///  check number armstrong or not
        int number=153;
        int temp=number;
        double result=0;
        while (number>0){
            int  digit=number%10;
            double pow = Math.pow(digit,3);
            result+= pow;
            number=number/10;
        }

        if(temp==result){
            System.out.println("armmstrong !!");
        }

        // armstrong in given range
        int range=200;
        for (int i = 1; i <=range; i++) {
            int temp1=i;
            int num=i;
            double result1=0;
            while (num>0){
                int  digit1=num%10;
                double pow1= Math.pow(digit1,3);
                result1+= pow1;
                num=num/10;
            }
            if(temp1==result1){
                System.out.println("armmstrong !!" + temp1);
            }

        }
    }
}
