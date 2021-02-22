import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        
        if (str.equals("Keyboard")){
            System.out.println("A panel of keys that operate a computer or typewriter.");
        } else if (str.equals("Braille")){
            System.out.println("A form of written language for blind people, in which characters are represented by dots.");
        } else if (str.equals("Computer")){
            System.out.println("An electronic device for storing and processing data, typically in binary.");
        } else if (str.equals("Assistive")){
            System.out.println("Designed to help a person with a disability.");
        } else if (str.equals("Browser")){
            System.out.println("A computer program for displaying and navigating between web pages.");
        }
    }
}
