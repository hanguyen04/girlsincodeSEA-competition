import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        char C = bufferedReader.readLine().charAt(0);

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        
        char[] chars = S.toCharArray();
        if (N<=chars.length){
        chars[N] = C;
        System.out.println(String.valueOf(chars)); 
        }
        
        bufferedReader.close();
    }
}
