// Problem: https://www.hackerrank.com/challenges/java-datatypes/problem

package Introduction;

import java.util.Scanner;

public class P8_JavaDatatypes {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); // Numbers to entry

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if((x>=-128) && (x<=127)){
                    System.out.println("* byte\n* short\n* int \n* long");
                }else if((x>=-32768) && (x<=32767)){
                    System.out.println("* short\n* int \n* long");
                }else if((x>=-Math.pow(2, 31)) && (x<=(Math.pow(2, 31)-1))){
                    System.out.println("* int \n* long");
                }else if((x>=-Math.pow(2, 63)) && (x<=(Math.pow(2, 63)-1))){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }
}
