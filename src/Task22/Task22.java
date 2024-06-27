package Task22;
/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
is the 938th name in the list. So, COLIN would obtain a score of 938 * 53 = 49714.

What is the total of all the name scores in the file?


 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task22 {
    public static String readFile(String file_name)
    {
        String st_text = "";
        try(FileReader reader = new FileReader(file_name))
        {
            int count;
            char[] text = new char[1000000];
            while ((count = reader.read(text)) > 0)
            {
                if(count < text.length)
                {
                    text = Arrays.copyOf(text,count);
                }

            }
            st_text = new String(text);

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return st_text;
    }
    public static void main(String[] args) {

        String st_text = "";
        String[] array_string;
        long answer = 0;
        int production = 0;
        int name_int = 0;
        String  file_name = "C:\\Users\\admin\\Downloads\\0022_names.txt";
        st_text = readFile(file_name);
        System.out.println(st_text);
        array_string = st_text.split(",");
        System.out.println(array_string.length);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array_string));
        System.out.println(list.size());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
        {
            int j = i+1;
            char[] name;
            name = list.get(i).toCharArray();
            for (int k = 1; k < name.length-1; k++)
            {
                name_int =  name_int + (name[k] - 64);
            }
            production = j * name_int;
            name_int = 0;
            answer = answer + production;

        }
        System.out.println(answer);

    }
}
