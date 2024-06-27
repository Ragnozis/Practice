package Task51;
/*
By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values:
13, 23, 43, 53, 73, and 83, are all prime.

By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example having seven primes among
the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993.
Consequently 56003, being the first member of this family, is the smallest prime with this property.

Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit,
is part of an eight prime value family.


 */
import Task7.Task7;

public class Task51 {
    public static void main(String[] args)
    {
        int num = 0;
        String num_st = "";
        char[] num_digits;
        int digit = 1;
        int count = 0;
        int answer = 0;

        for (int k = 100000; k <= 999999; k++)
        {
            num_st = String.valueOf(k);
            num_digits = num_st.toCharArray();
            for(int i = 0; i<num_digits.length; i++)
            {

                for(int j =0; j<num_digits.length; j++) {
                    if(i==j) continue;
                    num_st = String.valueOf(k);
                    num_digits = num_st.toCharArray();
                    for(int p = 4; p<num_digits.length; p++)
                    { if(p == j || p == i) continue;
                    while (digit != 10) {
                        num_digits[i] = (char) (digit + 48);
                        num_digits[j] = (char) (digit + 48);
                        num_digits[p] = (char) (digit + 48);
                        num_st = String.valueOf(num_digits);
                        num = Integer.parseInt(num_st);
                        if (Task7.isPrime(num)) count++;
                        digit++;
                        if (count == 8) break;
                    }
                    digit = 0;
                    if (count == 8)
                    {
                        break;
                    }
                    count = 0;
                    num_st = String.valueOf(k);
                    num_digits = num_st.toCharArray();
                }
                }

            }
            if(count == 8)
            {
               if(Task7.isPrime(k)) {
                   answer = k;
                   break;
               }
            }
        }
        System.out.println(answer);
        
    }
}
