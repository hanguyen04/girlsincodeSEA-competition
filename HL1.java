import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        char [] array = {'0','0','0','0','0','0'};
        for (int i=0;i<6;i++){
            int pos = (i*2); 
            array[i]=str.charAt(pos);
        }
        
        boolean wifi = false;
        
        for (int i=0;i<6;i++){
            char c = array[i];
            int num = c - 48;
            if (num>=3){
                wifi = true;
                break;
            }
        }
        
        if (wifi){
            System.out.println("Strong Wi-Fi.");
        } else if (!wifi) {
             System.out.println("No Wi-Fi.");
        }
        
        
            
    }
}
