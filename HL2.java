import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        char [] array = {'0','0','0','0','0','0','0','0','0','0'};
        for (int i=0;i<10;i++){
            int pos = (i*2); 
            array[i]=str.charAt(pos);
        }
        
        int pos = 0;
        for (int i=0;i<10;i++){
            char c = array[i]; 
            int n = c - 48; 
            if (n==0){
                pos = i;
                break;
            }
        }
        
        System.out.println(pos);
        
        
            
    }
}
