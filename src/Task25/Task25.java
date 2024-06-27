package Task25;
/*
The Fibonacci sequence is defined by the recurrence relation:
F_n = F_(n - 1) + F_(n - 2), where F_1 = 1 and F_2 = 1.
Hence the first 12 terms will be:
F_1 = 1
F_2 = 1
F_3 = 2
F_4 = 3
F_5 = 5
F_6 = 8
F_7 = 13
F_8 = 21
F_9 = 34
F_{10} = 55
F_{11} = 89
F_{12} = 144

The 12th term, F_12, is the first term to contain three digits.
What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

 */
import java.math.BigInteger;

public class Task25 {

    public static int fibonacci(BigInteger num1, BigInteger num2, int n)
    {
        int index = 2;
        while (num2.toString().length() < n )
        {
            BigInteger remember = num2;
            num2 = num2.add(num1);
            num1 = remember;
            index++;
        }
        return index;
    }
    public static void main(String[] args)
    {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        System.out.println(fibonacci(num1, num2, 1000));

    }
}
