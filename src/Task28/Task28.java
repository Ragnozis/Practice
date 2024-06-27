package Task28;
/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class Task28 {
    public static void main(String[] args) {
        int[][] spiral = new int[1001][1001];
        int size = 1001 * 1001;
        int i = 0, j = 0;
        int count = 0;
        int sum = 0;
        while (size > 0) {
            i = count;
            j = 1000 - count;
            if (size == 0) break;
            for (j = 1000 - count; j >= count; j--) {
                spiral[i][j] = size;
                size--;
                if (size == 0) break;
            }
            if (size == 0) break;
            j = count;
            for (i = 1 + count; i < 1001 - count; i++) {
                spiral[i][j] = size;
                size--;
                if (size == 0) break;
            }
            if (size == 0) break;

            i = 1000 - count;
            for (j = 1 + count; j < 1001 - count; j++) {
                spiral[i][j] = size;
                size--;
                if (size == 0) break;
            }
            if (size == 0) break;

            j = 1000 - count;
            for (i = 999 - count; i >= 1 + count; i--) {
                spiral[i][j] = size;
                size--;
                if (size == 0) break;
            }
            count++;
        }

        for (i = 0; i < 1001; i++)
        {
            for(j = 0; j < 1001; j++)
            {
                if(i==j) sum += spiral[i][j];
                if(i == 1000-j) sum += spiral[i][j];
            }
        }
        sum = sum - 1;
        System.out.println(sum);



        }
    }

