package Task27;
/*
Euler discovered the remarkable quadratic formula:
n^2 + n + 41
It turns out that the formula will produce 40 primes for the consecutive integer values 0 <= n <= 39.
However, when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41^2 + 41 + 41
is clearly divisible by 41.
The incredible formula n^2 - 79n + 1601 was discovered, which produces 8 primes for the consecutive values 0 <= n <= 79.
The product of the coefficients, -79 and 1601, is -126479.

Considering quadratics of the form:

n^2 + an + b, where |a| < 1000 and |b| <= 1000 where |n| is the modulus/absolute value of n, e.g. |11| = 11 and |-4| = 4

Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number
of primes for consecutive values of n, starting with n = 0.
 */
public class Task27 {
    public static boolean isPrime(int n)
    {
        boolean flag = true;
        for(int i=2;i<=n/2;i++)
        {
         if(n%i ==0) {
             flag = false;
             break;
         }
        }
        if(n==1 || n < 0) flag = false;

        return flag;
    }
    public static void main(String[] args)
    {
        int num = 0;
        int n = 0;
        int a = 0;
        int b = -1000;
        int count = 0;
        int max_count = 0;
        int max_a = 0;
        int max_b = 0;
        int answer = 0;
        for (a = -1000; a <= 1000; a++) {
            for (b = -1000; b <= 1000; b++) {

                while (isPrime((n*n) + a*n + b))
                {
                    n++;
                    count++;
                    if(count>max_count) {
                        max_count = count;
                        max_a = a;
                        max_b = b;
                    }
                }
                count = 0;
                n = 0;



                }
            }
        System.out.println(max_count);
        System.out.println(max_a);
        System.out.println(max_b);
        answer = max_a * max_b;
        System.out.println(answer);
        }
    }


