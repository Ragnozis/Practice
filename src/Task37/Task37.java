package Task37;

import Task7.Task7;

import java.util.Scanner;

/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right,
and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

 */
public class Task37
{
    public static void main(String[] args)
    {
        int num = 11;
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        int answer = 0;
        int counter = 0;
        char[] num_digits;
        String num_st = "";
        while (count < 11)
        {
            num1 = num;
            num_st = String.valueOf(num);
            num_digits = num_st.toCharArray();
            if(Task7.isPrime(num) && num_digits[0] != '1' && num_digits[num_digits.length-1] != '1')
            {
                counter++;
                while(counter != num_st.length())
                {
                    num1 = num1 / 10;
                    if (counter < num_st.length()) num2 = num % (int) Math.pow(10, counter);
                    if(!Task7.isPrime(num2) || !Task7.isPrime(num1)) break;
                    counter++;
                }
                if(counter == num_st.length())
                {
                    answer += num;
                    count++;
                }
            }
            counter = 0;
            num++;
        }
        System.out.println(answer);
    }
}
