package Task43;
/*
The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order,
but it also has a rather interesting sub-string divisibility property.

Let d_1 be the 1-st digit, d_2 be the 2-nd digit, and so on. In this way, we note the following:

d_2d_3d_4=406 is divisible by 2
d_3d_4d_5=063 is divisible by 3
d_4d_5d_6=635 is divisible by 5
d_5d_6d_7=357 is divisible by 7
d_6d_7d_8=572 is divisible by 11
d_7d_8d_9=728 is divisible by 13
d_8d_9d_10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.

 */
import Task24.Task24;

import java.util.ArrayList;

public class Task43 {
    static long count = 0;
    public static void permutations(String st, boolean[] visited, String current, ArrayList<String> list)
    {
        char[] num_digits = current.toCharArray();
        if(st.length() == current.length())
        {
            count++;
            if (num_digits[0] != '0') list.add(current);
            return;
        }
        for (int i = 0; i < st.length(); i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                permutations(st, visited, current + st.charAt(i), list);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args)
    {
        String num_st = "0123456789";
        int [] prime_numbers = {0,2,3,5,7,11,13,17};
        char[] num_digits;
        long[] answers = new long[100];
        long answer = 0;
        int count = 0;
        int answer_position = 0;
        int num = 0;
        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[num_st.length()];
        permutations(num_st,visited,"",list);
        for (String s : list)
        {
            num_digits = s.toCharArray();
            for(int i=1;i<num_digits.length-2;i++)
            {
                num = num + (num_digits[i] - 48) * 100 + (num_digits[i+1] - 48) * 10 + (num_digits[i+2] - 48);
                if(num % prime_numbers[i] != 0) break;
                count++;
                if(count == 7)
                {
                    answers[answer_position] = Long.parseLong(s);
                    answer_position++;
                }
                num = 0;
            }
            num = 0;
            count = 0;
        }
        for(int j=0;j<answers.length;j++)
        {
            answer = answer + answers[j];
        }
        System.out.println(answer);

    }
}
