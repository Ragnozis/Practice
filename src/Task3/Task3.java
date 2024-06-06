package Task3;
/*
The prime factors of $13195$ are $5, 7, 13$ and $29$.
What is the largest prime factor of the number $600851475143$?
 */
import java.lang.Math;
public class Task3
{
    public static void main(String[] args)
    {
        long answer = 600851475143L;
        int div = 2;
        double end = Math.sqrt(answer) + 1;
        while (div < end)
        {
            for (div = 2; div < end; div++)
            {
                if(answer % div == 0)
                {
                    answer /= div;
                    end = Math.sqrt(answer) + 1;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
