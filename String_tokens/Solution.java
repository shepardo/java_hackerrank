// https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] parts = s.split("[ !,?._'@]+");
        System.out.println(parts.length);
        for(String p: parts) {
            System.out.println(p);
        }
        scan.close();
    }
}

