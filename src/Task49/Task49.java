package Task49;
/*
The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways:
(i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other
4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?


 */
import Task24.Task24;
import Task7.Task7;

import java.util.ArrayList;

public class Task49
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[4];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int count = 0;
        String answer = "";
        for(int i=1;i<=9999;i++)
        {

                num1 = i;
                num2 = num1+3330;
                num3 = num2+3330;
                if(Task7.isPrime(num1))
                {
                    count++;
                    if(Task7.isPrime(num2))
                    {
                        count++;
                        if(Task7.isPrime(num3)) count++;
                        {
                            Task24.rec(String.valueOf(num1),visited,"",list);
                            if(list.contains(String.valueOf(num2)) && list.contains(String.valueOf(num3)) && count == 3) answer = String.valueOf(num1) + num2 + num3;
                        }
                    }
                }
                count = 0;
            }
        System.out.println(answer);

        }
    }

