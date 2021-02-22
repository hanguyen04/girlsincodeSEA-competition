import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        String emotion = input.nextLine(); 
        
        if (emotion.equals("Happy")){
            System.out.println("That's nice!");
        } else if (emotion.equals("Sad"))  {
            System.out.println("That's unfortunate.");
        }
    }
}
