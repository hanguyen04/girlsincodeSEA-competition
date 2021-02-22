import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char [] vowels = {'a','e','i','o','u'};
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        
        boolean b = true;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
            b = false; 
         }
        }  
        
        if (b){
            String lc = str.toLowerCase();
            char first = lc.charAt(0);
            
            boolean isVowel = false;
            for (int e=0;e<5;e++){
                if (first==vowels[e]){
                    isVowel = true;
                }
            }
            
            
            int vIndex = 0;
            for (int j=0;j<lc.length();j++){
                for (int m=0;m<5;m++){
                if (lc.charAt(j)==vowels[m]){
                    if (vIndex>j||vIndex==0){
                    vIndex = j;       
                }
                }
              }
  
        }
            if (isVowel) {
                lc = lc + "yay";
            } else {
                String f = lc.substring(0,vIndex);  
                lc = lc.replace(f, ""); 
                lc = lc + f + "ay";
            }
            
            System.out.println(lc);
    
        } 
    }
}
