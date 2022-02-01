
package randomnumber;
import java.util.Random;
public class RandomNumber {

    public static void main(String[] args) {
        
        Random random=new Random();
        // nextInt(here limit is being set);
        int var=random.nextInt(10);
        float var2=random.nextFloat(20);
        double var3=random.nextDouble(30);
        long var4=random.nextLong(40);
        // random number is generated between 0 - 10
        System.out.println("Random number of integer datatype is "+var);
        System.out.printf("Random number of float datatype is %.2f \n",var2);
        System.out.printf("Random number of double datatype is %.2f \n",var3);
        System.out.println("Random number of long datatype is "+var4);
        
    }
    
}
