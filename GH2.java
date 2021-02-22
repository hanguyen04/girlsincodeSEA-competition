import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        
        int speed = Integer.parseInt(str.substring(0,4));
        int angle = Integer.parseInt(str.substring(5));
        boolean run = true;
        
        if(speed>4500||speed<2500||angle>90&&angle<0){
            run=false;
        }
        
        if(run){
            double x = Math.toRadians(angle);
            double sinValue = (Math.sin(x)); 
            double v = speed*sinValue;

            double cosValue = (Math.cos(x)); 
            double h = speed*cosValue;

            int i = (int)v+(int)h;
            double d = v+h;
            int total=0;
            if (d-i>=0.5){
                total=i+1;
            }else{
                total=i;
            }
            System.out.println(total);
        }
    }
}
