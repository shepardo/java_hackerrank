// https://www.hackerrank.com/challenges/java-string-compare/problem
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.ArrayList<String> l = new java.util.ArrayList<String>();
        for(int i = 0; i + 2 < s.length(); i++) {
            String chunk = s.substring(i, i + k);
            l.add(chunk);
        }
        String[] arr = new String[l.size()];
        l.toArray(arr);
        java.util.Arrays.sort(arr);
        smallest = arr[0];
        largest = arr[arr.length - 1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
