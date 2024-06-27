package Task23;
/*
A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant
numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two
abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is
known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

 */
public class Task23
{
    public static boolean isAbundant(int num)
    {
        int sum = 1;
        int limit = (int) (Math.sqrt(num) + 1);

        for (int i = 2; i < limit; i++)
        {
            if (num % i == 0)
            {
                if( i != num / i)
                {
                    sum += i;
                    sum += num / i;
                }
                else
                {
                    sum += i;
                }
            }
        }
        return sum > num;
    }
    public static boolean isSumAbundants(boolean [] abundants, int num)
    {
        if(num > 28123) return true;
        for (int i = 3; i < num; i++)
        {
            if(abundants[i] && abundants[num-i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 28124;
        long answer = 0;
        boolean[] abundants = new boolean[n];
        for (int i = 3; i < n; i++)
        {
            abundants[i] = isAbundant(i);
        }
        for(int i = 0; i < n; i++)
        {
            if(!isSumAbundants(abundants, i)) answer += i;
        }
        System.out.println(answer);
    }
}
