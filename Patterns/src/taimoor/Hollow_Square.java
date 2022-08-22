package taimoor;
import java.util.Scanner;
public class Hollow_Square {
    public static void main(String[] args) {

    Scanner a=new Scanner(System.in);
        System.out.println("\"Square Have equal Rows And Columns\"");
        System.out.print("Enter the Rows:");
        int r=a.nextInt();
        System.out.print("Enter the Columns:");
        int c=a.nextInt();

     for (int i=1; i<=r; i++){
        for (int j=1; j<=c; j++){
            if (i==1||j==1||i==r||j==c){
                System.out.print("*");
            }else
            System.out.print(" ");
        }
        System.out.println();
}}
    }
