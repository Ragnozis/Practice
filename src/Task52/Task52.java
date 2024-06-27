package Task52;
/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */

import java.util.Arrays;

public class Task52 {
    public static boolean isPermuted(int num, int num2)
    {
        String num_st = String.valueOf(num);
        char[] num_digits = num_st.toCharArray();
        String num2_st = String.valueOf(num2);
        char[] num_digits2 = num2_st.toCharArray();
        Arrays.sort(num_digits);
        Arrays.sort(num_digits2);
        return Arrays.equals(num_digits, num_digits2);
    }
    public static void main(String[] args)
    {
        int num = 0;
        int answer = 0;
        for(num = 1; num <= 999999; num++)
        {
            if(isPermuted(num, num*2) && isPermuted(num, num*3)
                    && isPermuted(num, num*4) && isPermuted(num, num*5) && isPermuted(num, num*6)) answer = num;
        }
        System.out.println(answer);
    }
}
