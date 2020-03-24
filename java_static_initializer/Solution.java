// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static boolean flag;
static int H;
static int B;

static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
    if (B <= 0 || H <= 0) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else {
        flag = true;
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class
