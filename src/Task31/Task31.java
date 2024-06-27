package Task31;
/*
In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?

 */
import java.util.Arrays;

public class Task31 {
    public static void main(String[] args)
    {
        int sum = 0;
        int answer = 200;
        int counter = 1;
       for(int i1=0;i1<=200;i1++)
       {
           for(int i2=0;i2<=100;i2++)
           {
               if (i1 + i2*2 > 200)
               {
                   break;

               }
               for(int i5=0;i5<=40;i5++)
               {
                   if (i1 + i2*2 + i5*5 > 200)
                   {
                       break;

                   }

                   for(int i10=0;i10<=20;i10++)
                   {
                       if (i1 + i2*2 + i5*5 + i10*10 > 200)
                       {
                           break;

                       }
                       for(int i20=0;i20<=10;i20++)
                       {
                           if (i1 + i2*2 + i5*5 + i10*10 + i20*20 > 200)
                           {
                               break;

                           }

                           for(int i50=0;i50<=4;i50++)
                           {
                               if (i1 + i2*2 + i5*5 + i10*10 + i20*20 + i50* 50 > 200)
                               {
                                   break;

                               }

                               for(int i100 =0;i100<=2;i100++)
                               {

                                   sum = i1 + i2*2 + i5*5 + i10*10 + i20*20 + i50* 50 + i100 * 100;
                                   if(sum == answer) counter++;
                               }
                           }
                       }
                   }
               }
           }
       }
       System.out.println(counter);
    }
}
