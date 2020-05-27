// https://www.hackerrank.com/challenges/java-arraylist/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int line_n = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            while (line_n-- > 0) {
                line.add(scanner.nextInt());
            }
            arr.add(line);
        }

        int nq = scanner.nextInt();
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        while (nq-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(x); tmp.add(y);
            queries.add(tmp);
        }
        for (ArrayList<Integer> query : queries) {
            int xi = query.get(0), yi = query.get(1);
            ArrayList<Integer> a = arr.get(xi - 1);
            if (a.size() >= yi) {
                System.out.println(a.get(yi - 1));
            } else {
                System.out.println("ERROR!");
            }
            
        }
    }
}
