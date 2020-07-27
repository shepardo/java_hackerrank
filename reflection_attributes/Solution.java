// https://www.hackerrank.com/challenges/java-reflection-attributes/problem?h_r=next-challenge&h_v=zen
public class Solution {

        public static void main(String[] args){
            Class student = Student.class;
            Method[] methods = student.getMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
