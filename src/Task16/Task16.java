package Task16;
/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[500];
        array[0] = 2;
        int num = 0;
        int answer = 0;
        int degree = 1000;
        int digit = 0;
        int count = 1;
        while (count < degree) {
            for (int i = 0; i < array.length; i++) {
                num = array[i];
                num = num * 2;
                num = num + digit;
                array[i] = num % 10;
                digit = num / 10;
            }
            digit = 0;
            count++;
        }
        for (int i = 0; i < array.length; i++)
        {
            answer = answer + array[i];
        }
        System.out.println(answer);
    }
}
