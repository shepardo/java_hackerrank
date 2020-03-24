// https://www.hackerrank.com/challenges/java-stdin-stdout/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        StringBuffer bf = new StringBuffer();
        while (scan.hasNext()) {
            bf.append(scan.next()).append(" ");
        }
        String s = bf.toString();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
