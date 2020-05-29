
// https://www.hackerrank.com/challenges/java-list/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(scanner.nextInt());
        }
        n = scanner.nextInt();
        while (n-- > 0) {
            String op = scanner.next();
            if (op.equals("Insert")) {
                int idx = scanner.nextInt();
                int v = scanner.nextInt();
                a.add(idx, v);
            } else if (op.equals("Delete")) {
                a.remove(scanner.nextInt());
            }
        }
        for (Integer i : a) {
            System.out.printf("%d ", i);
        }
    }
}
