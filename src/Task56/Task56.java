package Task56;
/*
A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large:
one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?

 */
import java.math.BigInteger;

public class Task56 {
     public static void main(String[] args)
     {
         BigInteger num = new BigInteger("0");
         String num_st ="";
         char[] num_digits;
         int sum = 0;
         int max = 0;
         for(int i = 1 ; i < 100 ; i++)
         {
             for(int j = 1; j < 100; j++)
             {
                 num = BigInteger.valueOf(i);
                 num = num.pow(j);
                 num_st = num.toString();
                 num_digits = num_st.toCharArray();
                 for(int k = 0; k < num_digits.length; k++)
                 {
                     sum = sum + (num_digits[k] - 48);
                 }
                 if(sum > max) max = sum;
                 sum = 0;
             }
         }
         System.out.println(max);
     }
}
