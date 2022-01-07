
package practiceset.pkg2;

import java.util.Scanner;
public class Practiceset2 {

    public static void main(String[] args) {
        
        int a = 8/3*9/5+2-11;
        
        /*
        '/' and '*' having precidence more than '+' and '-'
        associativity = left to right
        
        8/3*9/5+2-11
        2*9/5+2-11
        18/5+2-11
        3+2-11
        5-11
        -6
        */
        System.out.println(a);
        
        // 4th question of 1st part
        
        int a2 = 9;
        System.out.println(a2); //print a2=9
        a2++;  
        // a2=9 
        // a2=10
        System.out.println(a2); // print a2=10
        a2--;
        // print a2=9
        ++a2;
        // a2=10
        --a2;
        // a2=9
        a2--;
        // a2=8
        System.out.println(a2); 
     
        
        // question 2nd 
        
        /*System.out.println("Enter the grade");
        Scanner ref=new Scanner(System.in);
        char Grade = ref.next().charAt(0);
        System.out.println("Your entered grade is "+Grade);
        // add 10 to it as encryption and then decrypt it
        int En = 10;
        int ER = En+Grade;  // 'A'+10=75
        char G=(char)ER;
        System.out.println("Encrypted Grade is "+G);
        int D=G-10;
        char DC=(char)D;
        System.out.println("Decrypted Grade is "+DC);
        */
        
        // question 3
        /*int integer=45;
        Scanner ref2=new Scanner(System.in);
        int USI=ref2.nextInt();
        System.out.println(USI>integer);
        */
        // question 5
        
        int I=7;
        // I=7 by default
        I+=10; 
        // I+=10 = I=I+10 I=7+10 = 17
        // I=17
        I-=2; 
       // I=I-2
       //I=17-2
       //I=15
        I++; 
        // first use then add 1
        // 16
        ++I;
        // 17
        --I;
        // 16
        I--;
        // 15
        I++;
        // 16
        I+=20;
        // 36
        System.out.println(I);
        
    }
    
}
