// https://www.hackerrank.com/challenges/java-bitset/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static int cnt = 0;
    public static long getBitSetValue(BitSet bs, int n) {
        /*
        byte[] buf = bs.toByteArray();
        int result = 0;
        System.out.println(cnt++ % 2 == 0 ? "a:" : "b:");
        for (int i = 0; i < buf.length; i++) {
            System.out.print(buf[i]);
            result = result * 2 + buf[i];
        }
        System.out.println("had " + buf.length + " elements.");
        return result;
        */
        return bs.cardinality();
        /*
        long result = 0;
        //System.out.println(cnt++ % 2 == 0 ? "a:" : "b:");
        //for( int i = bs.size() - 1; i > -1;  i-- )
        for( int i = 0; i < n;  i++ )
        {
            result = (result << 1) | (bs.get( i )? 1L : 0L);
        }
        //System.out.println("had " + bs.size() + " elements.");
        return result;*/
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, q;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n);
        while (q-- > 0) {
            String cmd = scanner.next();
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (cmd.equals("AND")) {
                BitSet op1 = (x == 1)? a : b, op2 = (y == 1)? a : b;
                op1.and(op2);
            } else if (cmd.equals("SET")) {
                BitSet op1 = (x == 1)? a : b;
                op1.set(y);
            } else if (cmd.equals("FLIP")) {
                BitSet op1 = (x == 1)? a : b;
                op1.flip(y);
            } else if (cmd.equals("OR")) {
                BitSet op1 = (x == 1)? a : b, op2 = (y == 1)? a : b;
                op1.or(op2);
            }
            System.out.printf("%d %d\n", getBitSetValue(a, n), getBitSetValue(b, n));
            //System.out.printf("%s %d %d\n", cmd, x, y);
        }
    }
}
