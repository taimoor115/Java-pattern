package taimoor;
import java.util.Scanner;

public class Inverted_half_piramid {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter rows:");
        int r= a.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
