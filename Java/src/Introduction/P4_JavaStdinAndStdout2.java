// Problem: https://www.hackerrank.com/challenges/java-stdin-stdout/problem

package Introduction;

import java.util.*;

public class P4_JavaStdinAndStdout2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume newline left-over
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
