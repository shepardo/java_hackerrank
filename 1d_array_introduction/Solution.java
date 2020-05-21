
// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        while (n-- > 0) {
            a[a.length - n - 1] = scan.nextInt();
        }
        
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
