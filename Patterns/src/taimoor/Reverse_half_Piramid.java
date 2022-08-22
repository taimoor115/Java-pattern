package taimoor;
import java.util.Scanner;

public class Reverse_half_Piramid {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the rows:");
        int r= a.nextInt();
        for (int i=1; i<=r; i++){
            for (int j=r; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
