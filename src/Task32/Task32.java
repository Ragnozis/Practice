package Task32;
/*
We shall say that an $n$-digit number is pandigital if it makes use of all the digits 1 to n exactly once;
for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 * 186 = 7254, containing multiplicand, multiplier, and product
is 1$ through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 */

import java.nio.charset.Charset;
import java.util.HashSet;

public class Task32 {
    public static int countUnique(String str) {
        int count = 0;
        for (int i = 1; i<10; i++)
        {
            if ((str.length() - str.replace(String.valueOf(i), "").length()) == 1)
            {
                count++;
            }

        }

        return count;
    }
        public static void main (String[]args)
        {
            String str = "";
            String str2 = "";
            int production = 0;
            int answer = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 2; i < 10000; i++)
            {
                for(int j = 2; j < 100; j++)
                {

                    str = Integer.toString(j);
                    str = str + i;
                    production = i * j;
                    str = str + production;
                    if(countUnique(str) != str.length() || countUnique(str) != 9 ) continue;
                    set.add(production);
                }
                str = "";
            }
            for (Integer num : set)
            {
                answer += num;
            }
            System.out.println(answer);
        }
    }

