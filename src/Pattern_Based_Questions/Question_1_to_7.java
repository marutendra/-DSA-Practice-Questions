package Pattern_Based_Questions;

public class Question_1_to_7 {
    public static void main(String[] args) {

        // Print a square star pattern (for example, 4 x 4 stars)

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        //2. Print a right-angled triangle of stars.
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        //Print an inverted right-angled triangle of stars.
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }


        System.out.println("---------------------------------------------");
        //. Print a number triangle: 1 / 12 / 123 / 1234.
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        //Print a centered pyramid of stars.
        //      *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//***************



        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        //Print a centered pyramid of stars with equal rows star .

        int m= 8;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m- i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        // Print an inverted pyramid of stars.
        int x=8;
        for (int i = x; i >=1 ; i--) {
            for (int j = x; j >=i ; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
