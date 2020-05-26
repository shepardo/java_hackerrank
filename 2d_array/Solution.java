// https://www.hackerrank.com/challenges/java-2d-array/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static int getHourGlassSum(int x, int y, int[][] arr) {
        if (x + 2 >= arr[0].length) return Integer.MIN_VALUE;
        if (y + 2 >= arr.length) return Integer.MIN_VALUE;
        return 
            arr[y][x] + arr[y][x + 1] + arr[y][x + 2] +
            arr[y + 1][x + 1] +
            arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];
    }

    private static int calculateMaxHourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int n = getHourGlassSum(j, i, arr);
                if (n > max) max = n;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = calculateMaxHourglassSum(arr);
        System.out.println(max);
        scanner.close();
    }
}
