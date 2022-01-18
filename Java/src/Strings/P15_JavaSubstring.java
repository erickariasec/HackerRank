// Problem: https://www.hackerrank.com/challenges/java-substring/problem

package Strings;

import java.util.Scanner;

public class P15_JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));    // This is the solution
    }

}
