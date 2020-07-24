// https://www.hackerrank.com/challenges/java-dequeue/problem
    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            Integer[] a = new Integer[0];
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
            }
            a = deque.toArray(a);

            int max = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n - m; j++) {
                map.clear();
                for (int i = 0; i < m; i++) {
                    map.put(a[i + j], 1);
                }
                int max_local = map.size();
                if (max < max_local) {
                    max = max_local;
                }
            }
            System.out.println(max);
        }
    }



