// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String line;
       int i = 1;
       while ((line = in.readLine()) != null) {
           System.out.printf("%d %s\n", i++, line);
       }
    }
}
