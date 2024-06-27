package Task19;
/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


 */
public class Task19 {
    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0);
    }
    public static void main(String[] args)
    {
        int year = 1901;
        int day = 2;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int counter = 0;
        for (year = 1901; year <= 2000; year++)
        {
            for (int month = 0; month < months.length; month++)
            {
                if(month % 2 == 0 && isLeapYear(year))
                {
                    day++;
                }
                day = day + months[month];

                if(day % 7 == 0)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
