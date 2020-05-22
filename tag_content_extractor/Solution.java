// https://www.hackerrank.com/challenges/tag-content-extractor/problem?h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String rx = "<(.+)>([^<]+)</\\1>";
        //String rx = "<[^>]*>(?<meat>[^<]+)</\\1>";
        while (testCases-- > 0) {
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile(rx);
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
	}
}



