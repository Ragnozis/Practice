package Task41;

import Task24.Task24;
import Task32.Task32;
import Task7.Task7;

import java.util.ArrayList;
import java.util.Scanner;

/*
We shall say that an $n$-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

 */
public class Task41 {
    public static int PandigitalPrime(String num_st, ArrayList<String> list, boolean[] visited)
    {
        int answer = 0;
        visited = new boolean[num_st.length()];
        Task24.rec(num_st,visited,"", list);

        for (int i = 0; i < list.size(); i++)
        {
            int num = Integer.parseInt(list.get(i));
            if(Task32.countUnique(list.get(i)) == num_st.length() && Task7.isPrime(num) && num > answer) answer = num;

        }
        return answer;
    }
    public static void main(String[] args)
    {
        int num = 0;
        String num_st9 = "123456789";
        String num_st8= "12345678";
        String num_st7 = "1234567";
        String num_st6 = "123456";
        String num_st5 = "12345";

        int answer = 0;
        boolean[] visited = new boolean[num_st9.length()];
        ArrayList<String> list = new ArrayList<>();
        if(answer < PandigitalPrime(num_st9,list, visited)) answer = PandigitalPrime(num_st9,list, visited);
        if(answer < PandigitalPrime(num_st8,list, visited)) answer = PandigitalPrime(num_st8,list, visited);
        if(answer < PandigitalPrime(num_st7,list, visited)) answer = PandigitalPrime(num_st7,list, visited);
        if(answer < PandigitalPrime(num_st6,list, visited)) answer = PandigitalPrime(num_st6,list, visited);
        if(answer < PandigitalPrime(num_st5,list, visited)) answer = PandigitalPrime(num_st5,list, visited);

        System.out.println(answer);
    }
}
