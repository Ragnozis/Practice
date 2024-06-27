package Task7;
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
 */
import java.lang.Math;
public class Task7
{
    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int answer = 0;
        int counter = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++)
        {
            if(isPrime(i)) counter++;
            if (counter == 10001)
            {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        System.out.println(isPrime(1));
    }

}
