package Task20;
/*
n! means n * (n - 1) * ... * 3 * 2 * 1.
For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!.
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[500];
        array[0] = 1;
        int production = 2;
        int num = 0;
        int digit = 0;
        int sum = 0;
        while (production < 101) {
            for (int i = 0; i < array.length; i++) {
                num = array[i];
                num = production * num;
                num = num + digit;
                array[i] = num % 10;
                digit = num / 10;
            }
            digit = 0;
            production++;
        }
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
