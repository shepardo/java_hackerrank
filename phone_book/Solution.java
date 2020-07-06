// https://www.hackerrank.com/challenges/phone-book/problem
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            map.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            Integer phone = map.get(s);
            if (phone != null) {
                System.out.printf("%s=%d\n", s, phone);
            } else {
                System.out.println("Not found");
            }
		}
	}
}
