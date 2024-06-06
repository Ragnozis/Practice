package Task5;
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Task5
{
    public static boolean isEvenlyDivisible(int num)
    { int remainder = 0;
        for (int i = 11; i <= 20; i++)
        {
            remainder += num % i;

        }
        return (remainder == 0);
    }

    public static void main(String[] args) {
        int answer = 0;
        for (int i = 20;i<Integer.MAX_VALUE; i++)
        {
            if(isEvenlyDivisible(i))
            {
                answer = i;
                break;
            }

        }
        System.out.println(answer);
    }

}
