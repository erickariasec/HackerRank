// Problem: https://www.hackerrank.com/challenges/java-loops-i/problem

package Introduction;

import java.io.*;

public class P6_JavaLoops1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N >= 2 && N <= 20){
            for(int i = 1; i <= 10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
        }

        bufferedReader.close();
    }
}
