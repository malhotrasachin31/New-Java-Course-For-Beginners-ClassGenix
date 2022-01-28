
package ladderifelse;
import java.util.Scanner;
public class Ladderifelse {

    public static void main(String[] args) {
        
        Scanner ref=new Scanner(System.in);
        int var = ref.nextInt();
        
        // for educational concept i will make it into comment
        
        /*
        // noramal if-else
        if(var>0){
            // if number >0 then execute here..
            if(var<=10){
            System.out.println("True 10");
            }
            else{
                if(var<=20){
                    System.out.println("True 20");
                }
                else{
                    if(var<=30){
                        System.out.println("True 30");
                    }
                }
            }
        }
        else{
            // if number < 0 then execute here...
            System.out.println("False");
        }*/
        
        // else-f ladder concept
        // else if = next level
        // else = end of all levels
        
        if(var>0 & var<=10){
            // execute if var > 10
            System.out.println("True 0-10");
        }
        else if(var>10 & var<=20){
            // execute if var < = 20
            System.out.println("True 11-20");
        }
        else if(var>20 & var<=30){
            // execute if var <=30
            System.out.println("True 20-30");
        }
        else{
            // execute if all above conditions don't satisfy
            System.out.println("True 100");
        }
        
    }
    
}
