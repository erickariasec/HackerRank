// Problem: https://www.hackerrank.com/challenges/java-end-of-file/problem

package Introduction;

import java.util.Scanner;

public class P9_JavaEndOfFile {
    public static void main(String[] args){

        Scanner dataEntry = new Scanner(System.in);

        // ONE WAY USING FOR LOOP
        for(int i = 1; dataEntry.hasNext(); i++){
            System.out.println(i + " " + dataEntry.nextLine());
        }


        // hasNextLine is a boolean, it only returns true or false


        /* ANOTHER WAY USING WHILE LOOP
        int i = 1;
        while(dataEntry.hasNextLine()){
            System.out.println(i++ + " " + dataEntry.nextLine());
        }
        */

    }
}
