package Task24;
/*
A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
The lexicographic permutations of 0, 1 and 2 are:
012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task24 {
    static long count = 0;
    public static void rec(String st, boolean[] visited, String current, ArrayList<String> list)
    {
        if(st.length() == current.length())
        {
            count++;
            list.add(current);
            return;
        }
        for (int i = 0; i < st.length(); i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                rec(st, visited, current + st.charAt(i), list);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        String st = "0123456789";
        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[st.length()];
        rec(st, visited, "",list);
        System.out.println(count);
        Collections.sort(list);
        System.out.println(list.get(999999));
    }
}
