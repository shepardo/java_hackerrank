// https://www.hackerrank.com/challenges/java-primality-test/problem
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        BigInteger bi1 = new BigInteger(n1);
        BigInteger bi2 = new BigInteger(n2);
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
    }
}
