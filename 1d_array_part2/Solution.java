// https://www.hackerrank.com/challenges/java-1d-array/problem
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] == 1) cnt++;
            else {
                if (cnt > max) max = cnt;
                cnt = 0;
            }
        }
        return max < leap;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
