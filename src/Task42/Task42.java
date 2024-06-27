package Task42;
/*
The n-th term of the sequence of triangle numbers is given by, t_n = n/2(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word
value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t_10. If the word value is a triangle number then we shall
call the word a triangle word.

Using words.txt, a 16K text file containing nearly two-thousand common English words, how many are triangle words?
 */
import Task22.Task22;

public class Task42 {
    public static void main(String[] args)
    {
        int [] triangle_numbers = new int[30];
        int answer = 0;
        for(int i=1;i<triangle_numbers.length;i++)
        {
            triangle_numbers[i-1]= (int) (0.5 * i * (i+1)) ;
        }
        String words = "";
        String file_name = "C:\\Users\\admin\\Downloads\\0042_words.txt";
        words = Task22.readFile(file_name);
        String[] words_array = words.split(",");
        int [] word_values = new int[words_array.length];
        for(int i=0;i<words_array.length;i++)
        {
            char [] word_digits = words_array[i].toCharArray();
            for(int j=1;j<word_digits.length-1;j++)
            {
                word_values[i] = word_values[i] + (word_digits[j]-64);
            }
        }
        for(int i=0;i<word_values.length;i++)
        {
            for(int j=0;j<triangle_numbers.length;j++)
            {
                if(triangle_numbers[j]==word_values[i]) answer++;
            }
        }
        System.out.println(answer);
    }
}
