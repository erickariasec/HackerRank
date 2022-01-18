// Problem: https://www.hackerrank.com/challenges/java-static-initializer-block/problem

package Introduction;

import java.util.*;

public class P10_JavaStaticInitializerBlock {

    static Scanner dataEntry = new Scanner(System.in);

    static int B = dataEntry.nextInt();
    static int H = dataEntry.nextInt();
    static boolean flag = true;

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
