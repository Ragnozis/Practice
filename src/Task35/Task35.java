package Task35;

import Task7.Task7;

/*
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

 */
public class Task35 {
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        int num = 0;
        int max = 1000000;
        String num_str = "";
        char[] num_digits;
        int count = 0;
        int answer = 4;
        for(int i = 11; i <= max; i++)
        {
            num = i;
            num_str = String.valueOf(i);
            if(Task7.isPrime(i) && !num_str.contains("0")) {
                count++;
                while (count !=num_str.length()) {
                    num1 = num / (int) Math.pow(10,num_str.length()-1);
                    num2 = num % (int) Math.pow(10,num_str.length()-1);
                    num = num2 * 10 + num1;
                    if (!Task7.isPrime(num)) break;
                    count++;
                }
                if (count == num_str.length()) {
                    System.out.println(i);
                    answer++;
                }
            }
            count = 0;

        }
        System.out.println(answer);

    }
}
