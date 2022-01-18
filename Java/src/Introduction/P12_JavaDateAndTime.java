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

/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.*;
import java.text.*;

class Result {


//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year


    // ***********  SOLUTION ON HACKERRANK  **************** //
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }
    // ***********  SOLUTION ON HACKERRANK  **************** //

}
*/
