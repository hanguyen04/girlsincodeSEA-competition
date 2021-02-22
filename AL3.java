import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner input = new Scanner (System.in);
        String crypt = input.nextLine();
        Scanner input2 = new Scanner (System.in);
        String message = input.nextLine();
        Scanner input3 = new Scanner (System.in);
        int shift = input.nextInt();
        char[] ch=message.toCharArray();  
        if (crypt.equals("ENCODE")){
            for (int i=0;i<ch.length;i++){
                if (ch[i]!=' '){
                    int index = 0;
                    for (int j=0;j<26;j++){
                        if (ch[i]==alphabet[j]){
                            index = j;
                        }
                    }
                    index = index + shift;
                    if (index>25){
                        index = index-26;
                    }
                    ch[i] = alphabet[index];
                }
            }
        } else if (crypt.equals("DECODE")){
            for (int i=0;i<ch.length;i++){
                if (ch[i]!=' '){
                    int index = 0;
                    for (int n=0;n<26;n++){
                        if (ch[i]==alphabet[n]){
                            index = n;
                        }
                    }
                    index = index - shift;
                    if (index<0){
                        index = index+26;
                    }
                    ch[i] = alphabet[index];
                }
            }
        }
        
        System.out.println(String.valueOf(ch)); 
    }
}
