package Task46;
/*
It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

9 = 7 + 2 * 1^2
15 = 7 + 2 * 2^2
21 = 3 + 2 * 3^2
25 = 7 + 2 * 3^2
27 = 19 + 2 * 2^2
33 = 31 + 2 * 1^2

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?


 */
import Task7.Task7;

import java.util.ArrayList;

public class Task46
{
    public static boolean isNumberDecompose(int number)
    {
        boolean flag = true;
        if (number == 0) return false;
        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= 40; j++) {
                if(j>i) break;
                if(!Task7.isPrime(i)) continue;
                if(number == (int) (i + 2 * Math.pow(j, 2)))
                {
                    flag = false ;
                    break;
                }
            }
            if(!flag) break;
        }
        return flag;
    }
    public static void main(String[] args)
    {
        int [] numbers = new int[5000];
        int index=0;
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 9; i < 10000; i = i+2) {
            if (!Task7.isPrime(i)) {
                list.add(i);
            }
        }

        for(int number : list)
        {
            if(isNumberDecompose(number)) {
                answer = number;
                break;
            }
        }
        System.out.println(answer);

    }
    }
