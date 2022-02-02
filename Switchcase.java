
package switchcase;
import java.util.Random;
public class Switchcase {

    public static void main(String[] args) {
        
        // Random object 
        Random random=new Random();
        int value=random.nextInt(50);
        
        
        // switch case implementation
        switch(value){
            case 0:{
                System.out.println("Output is 0");
                break;
            }
            case 1:{
                System.out.println("Output is 1");
                break;
            }
            case 2:{
                System.out.println("Output is 2");
                break;
            }
            case 3:{
                System.out.println("Output is 3");
                break;
            }
            case 4:{
                System.out.println("Output is 4");
                break;
            }
            case 5:{
                System.out.println("Output is 5");
                break;
            }
            default:{
                System.out.printf("Output is %d\n",value);   
                break;    
            }
        }
        
        
    }
    
}
