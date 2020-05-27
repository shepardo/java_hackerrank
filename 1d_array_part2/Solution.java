// https://www.hackerrank.com/challenges/java-1d-array/problem
import java.util.*;

public class Solution {

    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static boolean doCanWin(int leap, int pos, int[] game) {
        return isSolvable(leap, game, pos);
        /*int i = pos;
        if (i >= game.length) return true;
        while (i < game.length) {
            if (game[i] == 0) {
                if (doCanWin(leap, i + leap, game)) return true;
                else i++;
            } else {
                return false;
            }
        }
        return false;*/
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return doCanWin(leap, 0, game);
        /*
        int cnt = 0;
        int max = 0;
        int j = 0;
        while (j < game.length && game[j] == 0) {
            j++;
        }
        j--;
        for (int i = 0; i < game.length; i++) {
            if (game[i] == 1) cnt++;
            else {
                if (cnt > max) max = cnt;
                cnt = 0;
            }
        }
        if (cnt != 0 && cnt > max) return cnt < leap && j + leap >= game.length;
        return max < leap && j + leap >= game.length;*/
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
