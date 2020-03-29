// https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;
            for (int j = 0; j < n; j++) {
                result = a;
                for (int k = 0; k <= j; k++) {
                    result += Math.pow(2, k) * b;
                }
                System.out.printf("%d ", result);
            }
            System.out.println("");

        }
        in.close();
    }
}
