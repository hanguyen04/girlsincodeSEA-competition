import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        String T = bufferedReader.readLine();

        int Tscore = T.length();
        for (int i=0;i<T.length();i++){
            char charT = T.charAt(i); 
                char charS = S.charAt(i);
                if (charT==charS){
                    Tscore--;
                }
        }
        System.out.println(Tscore);

        bufferedReader.close();
    }
}
