package Task38;

import Task32.Task32;

/*
Take the number 192 and multiply it by each of 1, 2, and 3:

192 * 1 = 192
192 * 2 = 384
192 * 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of
192 and (1,2,3).

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital,
918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with
(1,2, ... , n) where n > 1.


 */
public class Task38
{
    public static void main(String[] args)
    {
        String num_str = "";
        int counter = 1;
        long answer = 0;
        for(int i = 90; i <= 9999; i++)
        {
            if(i == 100) i = 900;
            if(i == 1000) i = 9000;
            while (String.valueOf(num_str).length() < 8 )
            {

                num_str = num_str + String.valueOf( i * counter);
                counter++;
            }
            if(Task32.countUnique(num_str) == 9)
            {
                if(Long.parseLong(String.valueOf(num_str)) > answer) answer = Long.parseLong(String.valueOf(num_str));
            }
            num_str = "";
            counter = 1;
        }
        System.out.println(answer);
    }

}
