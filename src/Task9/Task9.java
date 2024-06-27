package Task9;
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.

 */
import java.lang.Math;
import java.sql.SQLOutput;

public class Task9 {
    public static void main(String[] args)
    {
        double a,b,c,csq,asq,bsq,product =0;


        for ( b = 1; b < 1000; b++)
        {
            for (a = 1; a < 1000; a++)
            {
                asq = a*a;
                bsq = b*b;
                csq = (a * a) + (b * b);
                c = Math.sqrt(csq);

                if (a<b && b<c && asq + bsq == csq && a+b+c == 1000)
                {
                    product = a*b*c;
                    System.out.println((int) product);
                    break;
                }
            }
        }

    }
}
