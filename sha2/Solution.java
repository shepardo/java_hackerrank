// https://www.hackerrank.com/challenges/sha-256/problem
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        byte[] buf = s.getBytes();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(buf);
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(myHash);
    }
}
