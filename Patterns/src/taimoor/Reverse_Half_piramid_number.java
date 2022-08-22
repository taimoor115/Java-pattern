package taimoor;

import java.lang.reflect.Array;

public class Reverse_Half_piramid_number {
    public static void main(String[] args) {
        int m=5;
        /*for (int i=m;i>=1;i--){
            for (int j = 1; j<=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }*/
        //Alternative

        for (int i=1;i<=m; i++){
            for (int j=1;j<=m-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
