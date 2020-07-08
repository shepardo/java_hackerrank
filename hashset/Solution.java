// https://www.hackerrank.com/challenges/java-hashset/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
//Write your code here
        HashSet<String> left_set = new HashSet<>();
        HashSet<String> right_set = new HashSet<>();
        for (int i = 0; i < pair_left.length; i++) {
            left_set.add(pair_left[i]);
            right_set.add(pair_right[i]);
            if (left_set.size() > right_set.size()) {
                System.out.println(left_set.size());
            } else {
                System.out.println(right_set.size());
            }
        }
   }
}
