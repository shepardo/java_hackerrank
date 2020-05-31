
// https://www.hackerrank.com/challenges/java-stack/problem
import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		while (sc.hasNext()) {
            boolean result = true;
            stack.clear();
			String input=sc.next();
            //Complete the code
            char[] a = input.toCharArray();
            int i = 0;
            loop:
            while (i < a.length) {
                switch (a[i]) {
                    case '[': stack.push("["); break;
                    case '{': stack.push("{"); break;
                    case '(': stack.push("("); break;
                    case ']': 
                        if (!stack.pop().equals("[")) {
                            result = false; 
                            break loop;
                        }
                        break;
                    case ')': 
                        if (!stack.pop().equals("(")) {
                            result = false;
                            break loop;
                        }
                        break;
                    case '}':
                        if (!stack.pop().equals("{")) {
                            result = false;
                            break loop;
                        }
                        break;
                    default:
                        break;
                }
                i++;
            }
            if (stack.size() != 0) result = false;
            System.out.println(result);
		}
	}
}
