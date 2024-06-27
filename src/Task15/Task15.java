package Task15;
/*
Starting in the top left corner of a 2x2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.
<p>How many such routes are there through a 20x20 grid?

 */
public class Task15 {
    public static double factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static double numberOfCombinations(int k,int n)
    {
            return factorial(n) / (factorial(k) * factorial(n - k));
    }
    public static void main(String[] args)
    {
        System.out.println(factorial(40));
        int n = 40; // сетка 20x20, нижний правый угол имеет координат (20;20), k - первое число; n - сумма первого и второго
        int k = 20;
        long answer = (long) numberOfCombinations(20, 40);
        System.out.println(answer);
        System.out.println();
    }
}
