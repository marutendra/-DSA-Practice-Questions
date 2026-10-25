package Pattern_Based_Questions;

public class Question_8_to_12 {
    public static void main(String[] args) {
        //Floyd's triangle.
        int num=1;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }


        // repeated numbers triangle
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }

        // print diamond pattern
        int n=8;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
// hollow square
        for (int i = 1; i <=15 ; i++) {
            for (int j = 1; j <=15 ; j++) {
                if (i==1||j==1||i==15||j==15) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
// Hollow rectangle
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=50 ; j++) {
                if (i==1||j==1||i==5||j==50) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
