package Task39;
/*
If p is the perimeter of a right angle triangle with integral length sides, {a, b, c}, there are exactly three solutions for
p = 120.
{20,48,52}, {24,45,51}, {30,40,50}
For which value of p <= 1000, is the number of solutions maximised?
 */
import java.sql.SQLOutput;

public class Task39 {
    public static int countRightTriangles (int p)
    {
        int asq,bsq, count = 0;
        long csq = 0;
        long c = 0;
        double c_double = 0;
        String c_st = "";
        for(int b = 1; b < p; b++)
        {
            for (int a = 1; a < p - b; a++) {
                if(a+b > 1000) continue;
                asq = a * a;
                bsq = b * b;
                csq = (((long) a * a) + ((long) b * b));
                c_double = Math.sqrt(csq);
                c = (int) (c_double + 0.5);
                if (csq != c*c) continue;
                if (b < c && a < b && asq + bsq == csq && a + b + c == p) count++;
            }

        }
        return count;


    }
    public static void main(String[] args)
    {
        int count = 0;
        int max = 0;
        int answer = 0;
        for(int i = 12; i <= 1000; i++)
        {
            count = countRightTriangles(i);
            if (count > max) {
                max = count;
                answer = i;
            }
            count = 0;
        }
        System.out.println(answer);
    }
}
