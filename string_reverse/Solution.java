// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();
        int i = 0;
        boolean result = true;
        while (i < arr.length - i - 1) {
            if (arr[i] != arr[arr.length - i - 1]) {
                result = false;
                break;
            }
            i++;
        }
        System.out.println(result ? "Yes" : "No");
    }
}



