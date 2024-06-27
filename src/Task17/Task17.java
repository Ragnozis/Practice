package Task17;
/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and
115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Task17 {
    public static void main(String[] args)
    {
        String answer = "onethousand";
        for (int i = 1; i <= 999; i++) {
            if(i<10) {
                switch (i % 10) {
                    case 1:
                        answer = answer + "one";
                        break;
                    case 2:
                        answer = answer + "two";
                        break;
                    case 3:
                        answer = answer + "three";
                        break;
                    case 4:
                        answer = answer + "four";
                        break;
                    case 5:
                        answer = answer + "five";
                        break;
                    case 6:
                        answer = answer + "six";
                        break;
                    case 7:
                        answer = answer + "seven";
                        break;
                    case 8:
                        answer = answer + "eight";
                        break;
                    case 9:
                        answer = answer + "nine";
                        break;
                }
            }
            switch (i%100) {
                case 10:
                    answer = answer + "ten";
                    break;
                case 11:
                    answer = answer + "eleven";
                    break;
                case 12:
                    answer = answer + "twelve";
                    break;
                case 13:
                    answer = answer + "thirteen";
                    break;
                case 14:
                    answer = answer + "fourteen";
                    break;
                case 15:
                    answer = answer + "fifteen";
                    break;
                case 16:
                    answer = answer + "sixteen";
                    break;
                case 17:
                    answer = answer + "seventeen";
                    break;
                case 18:
                    answer = answer + "eighteen";
                    break;
                case 19:
                    answer = answer + "nineteen";
                    break;
            }
            if (i > 19) {
                if (i>99) {
                    if (i % 100 != 0) {
                        switch (i / 100) {
                            case 1:
                                answer = answer + "onehundredand";
                                break;
                            case 2:
                                answer = answer + "twohundredand";
                                break;
                            case 3:
                                answer = answer + "threehundredand";
                                break;
                            case 4:
                                answer = answer + "fourhundredand";
                                break;
                            case 5:
                                answer = answer + "fivehundredand";
                                break;
                            case 6:
                                answer = answer + "sixhundredand";
                                break;
                            case 7:
                                answer = answer + "sevenhundredand";
                                break;
                            case 8:
                                answer = answer + "eighthundredand";
                                break;
                            case 9:
                                answer = answer + "ninehundredand";
                                break;
                        }
                    }
                    if (i % 100 == 0) {
                        switch (i / 100) {
                            case 1:
                                answer = answer + "onehundred";
                                break;
                            case 2:
                                answer = answer + "twohundred";
                                break;
                            case 3:
                                answer = answer + "threehundred";
                                break;
                            case 4:
                                answer = answer + "fourhundred";
                                break;
                            case 5:
                                answer = answer + "fivehundred";
                                break;
                            case 6:
                                answer = answer + "sixhundred";
                                break;
                            case 7:
                                answer = answer + "sevenhundred";
                                break;
                            case 8:
                                answer = answer + "eighthundred";
                                break;
                            case 9:
                                answer = answer + "ninehundred";
                                break;
                        }
                    }
                }
                switch (i % 100 - i % 10) {
                    case 20:
                        answer = answer + "twenty";
                        break;
                    case 30:
                        answer = answer + "thirty";
                        break;
                    case 40:
                        answer = answer + "forty";
                        break;
                    case 50:
                        answer = answer + "fifty";
                        break;
                    case 60:
                        answer = answer + "sixty";
                        break;
                    case 70:
                        answer = answer + "seventy";
                        break;
                    case 80:
                        answer = answer + "eighty";
                        break;
                    case 90:
                        answer = answer + "ninety";
                        break;
                }
                if (i % 100 < 10 || i % 100 > 20) {
                    switch (i % 10) {
                        case 1:
                            answer = answer + "one";
                            break;
                        case 2:
                            answer = answer + "two";
                            break;
                        case 3:
                            answer = answer + "three";
                            break;
                        case 4:
                            answer = answer + "four";
                            break;
                        case 5:
                            answer = answer + "five";
                            break;
                        case 6:
                            answer = answer + "six";
                            break;
                        case 7:
                            answer = answer + "seven";
                            break;
                        case 8:
                            answer = answer + "eight";
                            break;
                        case 9:
                            answer = answer + "nine";
                            break;
                    }
                }

        }


    }
        System.out.println(answer.length());
            }
        }
