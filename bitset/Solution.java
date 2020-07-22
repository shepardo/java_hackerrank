// https://www.hackerrank.com/challenges/java-bitset/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, q;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n)
        while (n-- > 0) {
            String cmd = scanner.next();
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.printf("%s %d %d\n", cmd, x, y);
        }
    }
}
