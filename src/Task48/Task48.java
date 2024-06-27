package Task48;
/*
The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
import java.math.BigInteger;
import java.util.Arrays;

public class Task48
{
    public static void main(String[] args) {

        char[] digits = new char[10];
        BigInteger num = new BigInteger("0");
        BigInteger sum = new BigInteger("0");
        for(int i = 1; i <= 1000; i++)
        {
            num = BigInteger.valueOf(i);
            num = num.pow(i);
            sum = sum.add(num);
        }

        String num_st = sum.toString();
        num_st.getChars(num_st.length()-10,num_st.length(),digits,0);
        System.out.println(digits);
    }
}
