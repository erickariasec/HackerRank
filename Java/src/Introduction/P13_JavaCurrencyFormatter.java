// Problem: https://www.hackerrank.com/challenges/java-currency-formatter/problem

package Introduction;

import java.text.NumberFormat;
import java.util.*;

public class P13_JavaCurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // NOTE: India does not have a built-in Locale.
        // So you must construct one where the language is en (i.e., English).
        Locale indiaLocale = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
