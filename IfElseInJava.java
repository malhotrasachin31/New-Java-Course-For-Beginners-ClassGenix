
package pkgif.pkgelse.in.java;
import java.util.Scanner;
public class IfElseInJava {

    public static void main(String[] args) {
       
        /*
        if - else
        
        
        
        */
        
        // driving age licence
        /*int var = 12;
        if(var<18){
            // if condition is true
            System.out.println("You are not eligible for driving any vehicle");
        }
        else{
            // if condition is false
            System.out.println("You are eligible for driving a vehicle");
        }*/
        
        // nested if-else code
        
        // scanner class object creation
        Scanner ref= new Scanner(System.in);
        
        
        
        System.out.println("Enter the marks of english");
        int english=ref.nextInt();
        System.out.println("Enter the marks of hindi");
        int hindi=ref.nextInt();
        System.out.println("Enter the marks of maths");
        int maths=ref.nextInt();
        System.out.println("Enter the marks of science");
        int science=ref.nextInt();
        System.out.println("Enter the marks of java");
        int java=ref.nextInt();
        
        int sum = english+hindi+maths+science+java;
        System.out.printf("\nYour total marks is %d ",sum);
        
        double percentage = sum/5;
        System.out.printf("\nYour total percentage is %.2f \n",percentage);
        
        // nested if else conditions here...
        
        if(percentage>33){ // if per=63%
            // the exceute this code
            if(percentage<50 | percentage>=33){
                // code excecute for first if's first
                System.out.println("My per is between 33 to 50% ");
            }
            else{
                if(percentage>50 | percentage<=75){
                    System.out.println("My per is between 50 to 75% ");
                }
                else{
                    System.out.println("You have got more than 75%");
                }
            }
        }
        else{
            System.out.println("Sorry! Better luck next time");
        }
        
    }
    
    
    
}
