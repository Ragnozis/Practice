package Task53;
/*
There are exactly ten ways of selecting three from five, 12345:

123, 124, 125, 134, 135, 145, 234, 235, 245, and 345

In combinatorics, we use the notation, (5 3) = 10.

In general, (n r) = (n!)/(r!(n-r)!, where n! = n * (n-1) * ... * 3 * 2 * 1, and 0! = 1.

It is not until n = 23, that a value exceeds one-million: (23 10) = 1144066.

How many, not necessarily distinct, values of (n r) for 1 <= n <= 100, are greater than one-million?
 */
import Task15.Task15;

public class Task53
{
    static int limit = 1000000;
    public static int Combination(int n)
    {
        int count = 0;
        for(int r = 1; r <= n; r++)
        {
            if(Task15.factorial(n) / (Task15.factorial(r)*Task15.factorial(n-r)) > limit) count++ ;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int answer = 0;
        for(int n = 1; n <= 100; n++)
        {
            answer += (int) Combination(n);
        }
        System.out.println(answer);
    }
}
