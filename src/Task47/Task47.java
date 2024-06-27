package Task47;
/*
The first two consecutive numbers to have two distinct prime factors are:

14 = 2 * 7
15 = 3 * 5.

The first three consecutive numbers to have three distinct prime factors are:

644 = 2^2 * 7 * 23
645 = 3 * 5 * 43
646 = 2 * 17 * 19.


Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?

 */
import Task7.Task7;

import java.util.HashSet;

public class Task47 {
    public static HashSet<Integer> countPrimeFactors(int n)
    {
        int i =2;
        HashSet<Integer> factors = new HashSet<>();
        while (i*i<=n)
        {
            if(n%i!=0) i++;
            else
            {
                n/=i;
                factors.add(i);
            }

        }
        if(n>1) factors.add(n);
        return factors;
    }
    public static void main(String[] args)
    {
        int answer = 0;
        for(int i = 7000; i<700000; i++)
        {
            if(countPrimeFactors(i).size() >= 4 && countPrimeFactors(i+1).size() >= 4
                    && countPrimeFactors(i+2).size() >= 4 && countPrimeFactors(i+3).size() >= 4)
            {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
