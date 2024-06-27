package Task21;
/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000.
 */
public class Task21 {
    public static void main(String[] args)
    {
        int n = 10000;
        long answer = 0;
        int[] sum = new int[n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= i/2; j++)
            {
                if(i % j == 0) sum[i] += j;
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (sum[i] == j && sum[j] == i && i != j) answer = answer + i + j;
            }
        }
        System.out.println(answer/2);
    }
}
