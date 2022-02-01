
package andorexaplin;
import java.util.Scanner;
public class ANDORExaplin {

    public static void main(String[] args) {
        
        // AND and OR Operators
        /*
            0 == galat/false
            1 == sahi/true
        
        */
        Scanner ref=new Scanner(System.in);
        int bf=ref.nextInt();
        int gf=ref.nextInt();
        // AND operation = '&'
        // you can change the sign of OR and AND operator to change the result...
        int result=(bf|gf);
        
        if(result==0){
            System.out.println("Boyfriend is wrong....");
        }
        else{
            System.out.println("Girlfriend is right..");
        }
    }
    
}
