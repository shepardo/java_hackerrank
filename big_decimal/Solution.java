// https://www.hackerrank.com/challenges/java-bigdecimal/problem
import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        class ComparatorBigDecimals implements Comparator<String> {
            public int compare(String s1, String s2) {
                try {
                    return -(new BigDecimal(s1)).compareTo(new BigDecimal(s2));
                } catch( Exception e) {
                    System.out.printf("Error at %s %s", s1, s2);
                    throw e;
                }
            }
        }
        s = Arrays.copyOf(s, n);
        Arrays.sort(s, new ComparatorBigDecimals());

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
