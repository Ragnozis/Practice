package Task45;
/*
Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:

Triangle    T_n=n(n+1)/2        1, 3, 6, 10, 15, ...
Pentagonal  P_n=n(3n - 1)/2     1, 5, 12, 22, 35, ...
Hexagonal   H_n=n(2n - 1)       1, 6, 15, 28, 45, ....

It can be verified that T_285 = P_165 = H_143 = 40755.

Find the next triangle number that is also pentagonal and hexagonal.

 */
import java.util.ArrayList;

public class Task45 {
    public static void main(String[] args) {
        long triangle_number = 40755;
        long pentagon_number = 40755;
        long hexagon_number = 40755;
        long triangle_step = (286*(286+1)/2) - 40755;
        long pentagon_step = (166*(3*166-1)/2) - 40755;
        long hexagon_step = (144*(2*144-1)) - 40755;
        long answer = 0;
        triangle_number = triangle_number + triangle_step;
        triangle_step += 1;
        pentagon_number = pentagon_number + pentagon_step;
        pentagon_step += 3;
        hexagon_number = hexagon_number + hexagon_step;
        hexagon_step += 4;
        while (triangle_number != pentagon_number || pentagon_number != hexagon_number) {
            hexagon_number = hexagon_number + hexagon_step;
            hexagon_step += 4;
            while (triangle_number < hexagon_number) {
                triangle_number = triangle_number + triangle_step;
                triangle_step += 1;
            }
            while (pentagon_number < hexagon_number) {
                pentagon_number = pentagon_number + pentagon_step;
                pentagon_step += 3;
            }
        }
        answer = triangle_number;
        System.out.println(answer);
    }
}
