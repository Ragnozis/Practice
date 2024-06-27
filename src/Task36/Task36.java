package Task36;
/*
The decimal number, 585 = 1001001001_2 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

Please note that the palindromic number, in either base, may not include leading zeros.

 */
public class Task36 {
    public static void main(String[] args)
    {
        int num = 0;
        int max = 1000000;
        String num_st = "";
        String reverse_num_st = "";
        String binary_num_st = "";
        String reverse_binary_num_st = "";
        int answer = 0;
        for(int i = 1; i <= max; i++)
        {
            num_st = String.valueOf(i);
            reverse_num_st = new StringBuilder(num_st).reverse().toString();
            binary_num_st = Integer.toBinaryString(i);
            reverse_binary_num_st = new StringBuilder(binary_num_st).reverse().toString();
            if(binary_num_st.equals(reverse_binary_num_st) && num_st.equals(reverse_num_st))
            {
                answer += i;
            }

        }
        System.out.println(answer);
    }
}
