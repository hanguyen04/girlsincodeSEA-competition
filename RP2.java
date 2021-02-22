import java.io.*;
import java.util.*;

public class Solution {
    public static int happy(int x, int o, int c) {
        char[] digits = String.valueOf(x).toCharArray();
        int sum = 0;
        for(int i = 0; i<digits.length; i++) {
            int calcu = Integer.parseInt(String.valueOf(digits[i]));
            sum += calcu*calcu;
        }
        if (c==1000){
            return o;
        }
        else if(sum==1) {
            return 1;
        }
        else if (sum == o) {
            return sum;
        }
        else {
            return happy(sum, o, c+1);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(happy(x,x, 0) == x) {
            System.out.println("unhappy");
        }
        else {
            System.out.println("happy");
        }
    }
}
