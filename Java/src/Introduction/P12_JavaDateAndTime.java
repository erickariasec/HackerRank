// Problem: https://www.hackerrank.com/challenges/java-date-and-time/problem

package Introduction;

import java.time.*;
import java.util.Scanner;

public class P12_JavaDateAndTime {

    public static void main(String[] args){

        Scanner dataEntry = new Scanner(System.in);

        int month = dataEntry.nextInt();
        int day = dataEntry.nextInt();
        int year = dataEntry.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek().name());
    }

}
