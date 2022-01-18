// Problem: https://www.hackerrank.com/challenges/java-strings-introduction/problem

package Strings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class P14_JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        // 1. For the first line, sum the lengths of A and B.
        System.out.println(A.length() + B.length());

        // 2. For the second line.
        // Write Yes if A is alphabetically/lexicographically greater than B otherwise print No instead.
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // 3. When you capitalize the first letter of both A and B
        // and then print them separated by a space, you get "Hello Java".
        System.out.println(A.toUpperCase().charAt(0) + A.substring(1, A.length()) + " " +
                B.toUpperCase().charAt(0) + B.substring(1, B.length()));
    }

}
