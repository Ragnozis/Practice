package Task4;
/*
A palindromic number reads the same both ways. The largest palindrome made from the product
of two 2-digit numbers is 9009 = 91 * 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Task4
{

    public static boolean isPalindrom(int num)
    {
        int true_num = num;
        int reverse_num = 0;
        while (num > 0)
        {
            reverse_num = reverse_num * 10;
            reverse_num += num % 10;
            num /= 10;
        }
        return reverse_num == true_num;
    }
    public static void main(String[] args)
    {
        int answer = 0;
        for ( int i = 999; i > 99; i--)
        {
            for (int j = 999; j > 99; j--)
            {
                int product = i * j;
                if(isPalindrom(product) && answer < product)
                {
                    answer = product;
                }
            }
        }
        System.out.println(answer);
    }
}
