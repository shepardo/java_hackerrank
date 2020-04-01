// https://www.hackerrank.com/challenges/java-date-and-time/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    private static Map<Integer, String> days = new HashMap<Integer, String>();

    static {
        days.put(Calendar.SUNDAY, "SUNDAY");
        days.put(Calendar.MONDAY, "MONDAY");
        days.put(Calendar.TUESDAY, "TUESDAY");
        days.put(Calendar.WEDNESDAY, "WEDNESDAY");
        days.put(Calendar.THURSDAY, "THURSDAY");
        days.put(Calendar.FRIDAY, "FRIDAY");
        days.put(Calendar.SATURDAY, "SATURDAY");
    }

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(year, month - 1, day - 1);
        c.setTime(d);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return days.get(dayOfWeek);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
