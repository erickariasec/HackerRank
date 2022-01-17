// Problem: https://www.hackerrank.com/challenges/java-output-formatting/problem

package Introduction;

import java.util.Scanner;

public class P5_JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);

            // EXPLANATION STRING FORMAT
            //  "%" to give format
            //  "-" left alignment
            //  "15" establish string length (if String length is <= 15, white spaces are added)
            //  "s" to specify String format


            // EXPLANATION INTEGER FORMAT
            //  "%" to give format
            //  "0" fill character
            //  "3" establish number of digits allowed
            //  "d" to specify Integer format

        }
        System.out.println("================================");

    }
}
