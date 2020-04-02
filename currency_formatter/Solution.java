// https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale locale = Locale.US;
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        Currency currency = Currency.getInstance(locale);
        format.setCurrency(currency);
        String us = format.format(payment);

        locale = Locale.FRANCE;
        format = NumberFormat.getCurrencyInstance(locale);
        currency = Currency.getInstance(locale);
        format.setCurrency(currency);
        String france = format.format(payment);

        locale = Locale.CHINA;
        format = NumberFormat.getCurrencyInstance(locale);
        currency = Currency.getInstance(locale);
        format.setCurrency(currency);
        String china = format.format(payment);

        locale = new Locale("EN", "IN");
        format = NumberFormat.getCurrencyInstance(locale);
        currency = Currency.getInstance(locale);
        format.setCurrency(currency);
        String india = format.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
