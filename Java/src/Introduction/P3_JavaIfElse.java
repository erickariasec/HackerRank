// Problem: https://www.hackerrank.com/challenges/java-if-else/problem

package Introduction;

import java.util.*;

public class P3_JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N >= 1 && N <= 100){
            if(N%2 != 0 || (N >= 6 && N<=20)){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
