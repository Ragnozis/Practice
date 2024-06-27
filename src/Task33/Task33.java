package Task33;
/*
The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify
it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value,
and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task33 {
    public static void main(String[] args)
    {
            int numerator = 11;
            int num1 = 0;
            int num2 = 0;
            int numerator_production = 1;
            int denominator_production = 1;
            int answer = 0;
            int digit1 = 0;
            int digit2 = 0;
            BigDecimal quotient1 = new BigDecimal(0);
            BigDecimal quotient2 = new BigDecimal(0);
        int denominator = 12;
            for(numerator=11;numerator<=98;numerator++)
            {
                for(denominator=12;denominator<=99;denominator++)
                {
                    if(numerator == denominator || numerator> denominator || (numerator % 10 == 0 && denominator %10 == 0) ||
                            (numerator % 11 == 0 && denominator % 11 == 0) ) continue;
                    num1 = numerator;
                    num2 = denominator;
                    quotient1 = new BigDecimal(num1).divide(new BigDecimal(num2),4, RoundingMode.CEILING);
                    for(int k = 1;k<=4;k++)
                    {
                        switch(k)
                        {
                            case 1:
                            {
                                digit1 = num1 / 10;
                                digit2 = num2 / 10;
                                if(digit1 != 0 && digit2 != 0 && num1 % 10 == num2 % 10) {
                                    quotient2 = new BigDecimal(digit1).divide(new BigDecimal(digit2), 4, RoundingMode.CEILING);
                                    break;
                                }
                                continue;
                            }
                            case 2:
                            {
                                digit1 = num1 / 10;
                                digit2 = num2 % 10;
                                if(digit1 != 0 && digit2 != 0  && num1 % 10 == num2 / 10) {
                                    quotient2 = new BigDecimal(digit1).divide(new BigDecimal(digit2), 4, RoundingMode.CEILING);
                                    break;
                                }
                                continue;

                            }
                            case 3:
                            {
                                digit1 = num1 % 10;
                                digit2 = num2 / 10;
                                if(digit1 != 0 && digit2 != 0  && num1 / 10 == num2 % 10)
                                {quotient2 = new BigDecimal(digit1).divide(new BigDecimal(digit2),4, RoundingMode.CEILING);
                                    break;
                                }
                                continue;
                            }
                            case 4:
                            {
                                digit1 = num1 % 10;
                                digit2 = num2 % 10;
                                if(digit1 != 0 && digit2 != 0 && num1 / 10 == num2 / 10) {
                                    quotient2 = new BigDecimal(digit1).divide(new BigDecimal(digit2), 4, RoundingMode.CEILING);
                                    break;
                                }
                                continue;

                            }
                        }
                        if (quotient1.equals(quotient2) && !quotient1.equals(new BigDecimal(0)) && !quotient2.equals(new BigDecimal(0)))
                        {
                            numerator_production *= numerator;
                            denominator_production *= denominator;
                        }



                    }
                }
            }
            answer = denominator_production / numerator_production;
            System.out.println(answer);
    }
}
