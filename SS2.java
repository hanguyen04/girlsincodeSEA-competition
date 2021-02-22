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

        String Location = bufferedReader.readLine();

        // Put your code here, using "Location" as the variable representing the green area
        
        
       
        String Guess = bufferedReader.readLine();
        int count = 0;
        while (!Guess.equals(Location)||count == 0){
            if (Guess.equals(Location)){
                System.out.println("Found");
                break;
            }
            char LocaLetter = Location.charAt(0);
            String strNum = Location.substring(1);
            int LocaNum = Integer.parseInt(strNum);
            if (LocaNum>5||LocaNum<1){
                break;
            }
            if (LocaLetter>'E'||LocaLetter<'A'){
                break;
            }
                
            
            char GuessLetter = Guess.charAt(0);
            String strNum2 = Guess.substring(1);
            int GuessNum = Integer.parseInt(strNum2);
            if (GuessNum>5||GuessNum<1){
                break;
            }
            if (GuessLetter>'E'||GuessLetter<'A'){
                break;
            }
            
            
            if ((LocaLetter==GuessLetter||LocaLetter==GuessLetter-1||LocaLetter==GuessLetter+1)&&(LocaNum==GuessNum||LocaNum==GuessNum-1||LocaNum==GuessNum+1)){
                System.out.println("Close Signal");
            } else {
                System.out.println("No Signal");
            }
            Guess = bufferedReader.readLine();
            if (Guess.equals(Location)){
                System.out.println("Found");
                break;
            }
            count++;
        }

        bufferedReader.close();
    }
}
