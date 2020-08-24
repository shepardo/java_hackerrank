// https://www.hackerrank.com/challenges/java-priority-queue/problem
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student> {

  private int id;
  private String name;
  private double cgpa;
  
  public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  public int getId() { return id; }
  public String getName() { return name; }
  public double getCgpa() { return cgpa; }

  public String toString() {
      return String.format("%s %g %d\n", name, cgpa, id);
  }

  public int compareTo(Student s) {
    if (this.cgpa < s.cgpa) return -1;
    else if (this.cgpa > s.cgpa) return 1;
    else {
      int result = -this.name.compareTo(s.name);
      if (result != 0) return result;
      if (this.id < s.id) return 1; 
      else if (this.id > s.id) return -1;
      return 0;
    }
  }
}

class Priorities {
   private Student[] a;
   private int n = 0;
   
   List<Student> getStudents(List<String> events) {
     a = new Student[events.size() + 1];
     n = 0;
     return process(events);
   }

   private List<Student> process(List<String> events) {
     for (String e: events) {
       if (e.startsWith("ENTER")) {
         String[] data = e.split(" ");
         Student st = new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2]));
         insert(st);
       } else if (e.equals("SERVED")) {
         extract();
       } else {
          //throw new Exception("Bad instruction: " + e);
       }
     }
     return dumpReverse();
   }

   private List<Student> dumpReverse() {
       List<Student> result = new ArrayList<>();
       for (int i = n; i >= 1; i--) {
           result.add(a[i]);
       }
       return result;

   }

   private void dump() {
       System.out.println("Dump ****");
       for (int i = 1; i <= n; i++) {
           System.out.println(a[i]);
           //a[i].toString();
       }
       System.out.println("End dump ***");
   }

   private void insert(Student s) {
     //a[++n] = s;
     int k = ++n;
     a[k] = s;
     while (k > 1 && s.compareTo(a[k / 2]) <= 0) {
       a[k] = a[k/2];
       k = k / 2;
     }
     a[k] = s;
     if (n % 2 == 1 && n != 1) {
         if (a[n].compareTo(a[n - 1]) < 0)
         {
             Student tmp = a[n];
             a[n] = a[n - 1];
             a[n - 1] = tmp;
         }
     }
     //dump();
   }

   private void extract() {
     if (n > 0 ) {
        Student s = a[n--];
       }
   }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
