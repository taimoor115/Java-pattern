package taimoor;

public class Butterfly_pattern {
    public static void main(String[] args) {
        int m = 4;
      //For upper Portion
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (m - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

       //For lower Portion
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            int space=2*(m-i);
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            }

        }







        }


            

        
        
        
        
        
        







