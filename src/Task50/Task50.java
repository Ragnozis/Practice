package Task50;
/*
The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13.

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */
import Task7.Task7;

import java.util.ArrayList;

public class Task50 {
    public static void main(String[] args)
    {
        int count = 0;
        int sum = 0;
        int max_count = 0;
        int answer = 0;
        int step = 0;
        ArrayList<Integer> prime_nums = new ArrayList<Integer>();
        for(int i = 2; i<= 1000000;i++)
        {
            if(Task7.isPrime(i)) prime_nums.add(i);
        }
        for(int p = 0; p <= 5; p++) {
            for (int k = 1000; k <= 1000000; k++) {
                if (!Task7.isPrime(k)) continue;
                for (int j = 0; j <= prime_nums.size(); j++) {
                    sum = sum + prime_nums.get(j);
                    count++;
                    if (sum > k) break;
                    if (sum == k && count > max_count) {
                        max_count = count;
                        answer = k;
                    }
                }
                count = 0;
                sum = 0;
            }
            prime_nums.removeFirst();
            step++;
        }
        System.out.println(answer);
    }
}
