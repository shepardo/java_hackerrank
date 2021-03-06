import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public static int[] primes = new int [] {
      2,      3,      5,      7,     11,     13,     17,     19,     23,     29, 
     31,     37,     41,     43,     47,     53,     59,     61,     67,     71, 
     73,     79,     83,     89,     97,    101,    103,    107,    109,    113, 
    127,    131,    137,    139,    149,    151,    157,    163,    167,    173, 
    179,    181,    191,    193,    197,    199,    211,    223,    227,    229, 
    233,    239,    241,    251,    257,    263,    269,    271,    277,    281, 
    283,    293,    307,    311,    313,    317,    331,    337,    347,    349,
    353,    359,    367,    373,    379,    383,    389,    397,    401,    409, 
    419,    421,    431,    433,    439,    443,    449,    457,    461,    463, 
    467,    479,    487,    491,    499,    503,    509,    521,    523,    541, 
    547,    557,    563,    569,    571,    577,    587,    593,    599,    601, 
    607,    613,    617,    619,    631,    641,    643,    647,    653,    659, 
    661,    673,    677,    683,    691,    701,    709,    719,    727,    733, 
    739,    743,    751,    757,    761,    769,    773,    787,    797,    809, 
    811,    821,    823,    827,    829,    839,    853,    857,    859,    863, 
    877,    881,    883,    887,    907,    911,    919,    929,    937,    941,
    947,    953,    967,    971,    977,    983,    991,    997 
    };
    public int divisor_sum(int n) {
        int original_n = n;
        HashMap<Integer, Integer> divisors = new HashMap<Integer, Integer>();
        divisors.put(1, 1);
        divisors.put(n, 1);
        int i = 0;
        while (i < primes.length)
        {
            int prime = primes[i];
            while (n >= 1 && n % prime == 0) {
                if (divisors.containsKey(prime)) {
                    divisors.put(prime, divisors.get(prime) + 1);
                } else {
                    divisors.put(prime, 1);
                }
                n = n / prime;
                divisors.put(n, 1);
            }
            i++;
        }
        HashMap<Integer, Integer> nonPrimeDivisors = new HashMap<Integer, Integer>();
        for (Integer i1 : divisors.keySet()) {
            int cnt = divisors.get(i1);
            int acc = 0;
            while (cnt-- > 0) {
                acc += i1;
                if (original_n % acc == 0 && !nonPrimeDivisors.containsKey(acc)) {
                    nonPrimeDivisors.put(acc, 1);
                }
            }
        }
        for (Integer i1 : nonPrimeDivisors.keySet()) {
            if (!divisors.containsKey(i1)) {
                divisors.put(i1, 1);
            }
        }
        /*
        // Calculate non prime divisors
        HashMap<Integer, Integer> nonPrimeDivisors = new HashMap<Integer, Integer>();
        for (Integer i1 : divisors.keySet()) {
            for (Integer i2 : divisors.keySet()) {

            }
        }*/
        // Calculate sum
        int sum = 0;
        for (Integer j : divisors.keySet()) {
            //System.out.printf("%d %d\n", j, divisors.get(j));
            sum += j.intValue();
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

