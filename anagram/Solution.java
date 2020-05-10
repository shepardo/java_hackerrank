//https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        java.util.Hashtable<Character, Integer> dic = new java.util.Hashtable<Character, Integer>();
        if (a.length() != b.length()) return false;
        char[] arr = a.toLowerCase().toCharArray();
        for (int i= 0; i < arr.length; i++) {
            int v = dic.getOrDefault(arr[i], 0);
            dic.put(arr[i], v + 1);
        }
        arr = b.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int v = dic.getOrDefault(arr[i], 0);
            dic.put(arr[i], v - 1);
        }
        java.util.Collection<Integer> coll = dic.values();
        java.util.Iterator<Integer> it = coll.iterator();
        while (it.hasNext()) {
            if (it.next() != 0) return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
