package Task30;
/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4

As 1 = 1^4 is not a sum it is not included.
The sum of these numbers is 1634 + 8208 + 9474 = 19316.
Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Task30 {
    public static void main(String[] args)
    {
        int answer = 0;
        String num_st = "";
        char[] num_digits;
        int sum = 0;

        int max = (int) (Math.pow(9,5)*6); // т.к. сумма максимального 7-значного числа является 6-значным
        for (int i = 2; i <= max; i++)
        {
            num_st = String.valueOf(i);
            num_digits = num_st.toCharArray();
            for (int j = 0; j < num_digits.length; j++)
            {
                int digit = (int) Math.pow((num_digits[j] - 48),5);
                sum = sum + digit;

            }
            if (sum == i) answer = answer + i;
            sum = 0;

        }
        System.out.println(answer);
    }
}
