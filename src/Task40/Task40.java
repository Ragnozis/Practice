package Task40;
/*
An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12-th digit of the fractional part is 1.

If d_n represents the n-th digit of the fractional part, find the value of the following expression.

d_1 * d_10 * d_100 * d_1000 * d_10000 * d_100000 * d_1000000
 */
public class Task40 {
    public static int findNumber(int n, int[] digits_size)
    {
        int target_number = 0;
        int target_digits = 0;
        int i = 1;
        while(n > digits_size[i])
        {
            target_digits = target_digits + digits_size[i];
            target_number = target_number + (digits_size[i]/i);
            i++;
        }

        target_number = (n - target_digits)/i + target_number;
        return target_number;
    }
    public static int findDigit(int n, int[] digits_size)
    {
        int target_digits = 0;
        int target_number_remainder = 0;
        int i = 1;
        while(n > digits_size[i])
        {
            target_digits = target_digits + digits_size[i];
            i++;
        }

        target_number_remainder = (n - target_digits)%i;
        return target_number_remainder;
    }
    public static void main(String[] args)
    {
        int[] digits_size = new int[8];
        digits_size[0] = 0;
        String num_st = "9";
        int num = Integer.parseInt(num_st);
        String asda = "";
        char[] asda_char;
        for(int i = 1; i < 8; i++)
        {
            digits_size[i] = num * i;
            num_st = num_st + 0;
            num = Integer.parseInt(num_st);
        }

        int d100 = findNumber(100, digits_size);
        asda = String.valueOf(d100);
        asda_char = asda.toCharArray();
        System.out.println(asda_char);
        d100 = asda_char[findDigit(100,digits_size)-1] - 48;
        int d1000 = findNumber(1000, digits_size);
        asda = String.valueOf(d1000);
        asda_char = asda.toCharArray();
        System.out.println(asda_char);
        d1000 = asda_char[findDigit(1000,digits_size)-1] - 48;
        int d10000 = findNumber(10000, digits_size);
        asda = String.valueOf(d10000);
        asda_char = asda.toCharArray();
        System.out.println(asda_char);
        d10000 = asda_char[findDigit(10000,digits_size)-1] - 48;
        int d100000 = findNumber(100000, digits_size);
        asda = String.valueOf(d100000);
        asda_char = asda.toCharArray();
        System.out.println(asda_char);
        d100000 = asda_char[findDigit(100000,digits_size)-1] - 48;
        int d1000000 = findNumber(1000000, digits_size);
        asda = String.valueOf(d1000000);
        asda_char = asda.toCharArray();
        System.out.println(asda_char);
        d1000000 = asda_char[findDigit(1000000,digits_size)-1] - 48;
        System.out.println(d100*d1000*d10000*d100000*d1000000);
     }
}
