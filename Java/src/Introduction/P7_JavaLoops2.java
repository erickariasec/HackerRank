// Problem: https://www.hackerrank.com/challenges/java-loops/problem

package Introduction;

import java.util.Scanner;

public class P7_JavaLoops2 {
    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int solution = a;
            for(int j = 0; j < n; j++){
                solution += Math.pow(2, j) * b;
                System.out.print(solution + " ");
            }
            System.out.println("\n");
        }
        in.close();

    }
}
