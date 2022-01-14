
package practice.set.pkg3;

import java.util.Scanner;
public class PracticeSet3 {

    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        
        String Str1 = "Hello"; // first string
        String Str2 = "World"; // second string
        
        // in order to concatenate we must use arithmetic operator.
        
        String Str3 = Str1+Str2;
        System.out.println(Str3);
        
        
        // second question
        
        String Name = "A Quick Brown Fox Jumps Over A Lazy Fox";
        String NameS=Name.replace(" ", "");
        // " " = Space
        // "" = No Space
        System.out.println(NameS);
        
        // question 4
        
        String Str4 = "Name on your adhaar card";
        int index=Str4.lastIndexOf("a");
        System.out.println(index);
        
        // question 6
        String Josh = "Hello World, My Name is Josh";
        String Josh2 = Josh.substring(3,9);
        // Hello World  , M y N a m e i s J o s h
        // 01234567891011 12.........
        //  print =lo Wor
        String Josh3 = Josh.substring(8);
        System.out.println(Josh2);
        System.out.println(Josh3);
    }
    
}
