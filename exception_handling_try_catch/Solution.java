// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s_x = scanner.next();
        String s_y = scanner.next();
        try { 
            int x = Integer.parseInt(s_x);
            int y = Integer.parseInt(s_y);
            int z = x / y;
            System.out.println(z);
        } catch(ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch(InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch(NumberFormatException nfe) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
