import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        int num = Integer.parseInt(str.substring(0,2));
        
        if (num>=6&&num<8) {
            System.out.println("30 people");
        } else if (num>=8&&num<12) {
            System.out.println("50 people");
        } else if (num>=12&&num<18) {
            System.out.println("150 people");
        } else if (num>=18&&num<21) {
            System.out.println("100 people");
        }  else if (num>=21&&num<24||num>=0&&num<6) {
            System.out.println("CLOSED");
        }
    }
}
