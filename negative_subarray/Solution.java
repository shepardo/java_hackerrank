// https://www.hackerrank.com/challenges/java-negative-subarray/problem
import java.io.*;
import java.util.*;

public class Solution {

    
    public static int getCountNegSums(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int k = i;
                int sum = 0;
                while (k <= j) {
                    sum += arr[k];
                    k++;
                }
                if (sum < 0) cnt++;
            }
        }
        //return Integer.MIN_VALUE;
        return cnt;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        while (n-- > 0) {
            arr[arr.length - n - 1] = scanner.nextInt();
        }
        int result = getCountNegSums(arr);
        System.out.println(result);
    }
}
