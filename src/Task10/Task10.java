package Task10;
import Task7.Task7;
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class Task10 {


    public static void main(String[] args)
    {
        long sum = 0;
        for (int i = 2; i < 2000000; i++)
        {
            if(Task7.isPrime(i)) sum = sum + i;

        }
        System.out.println(sum);
    }
}
