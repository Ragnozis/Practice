package Task34;
/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: As 1! = 1 and 2! = 2 are not sums they are not included.

 */
import Task15.Task15;

public class Task34
{

    public static void main(String[] args)
    {
        int[] factorial_digits = new int[10];
        for (int i = 0; i < factorial_digits.length; i++)
        {
            factorial_digits[i] = (int) Task15.factorial(i);
        }
        int num = 0;
        int sum = 0;
        int answer = 0;
        int max = (int) Task15.factorial(9) * 7;
        String num_st = "";
        char[] digits;
        for (int n = 3; n <= max; n++)
        {
            num_st = String.valueOf(n);
            digits = num_st.toCharArray();
            for(char d : digits)
            {
                sum += factorial_digits[d-48];
            }

            if (sum == n) answer += n;
            sum = 0;
        }
        System.out.println(answer);

    }
}
