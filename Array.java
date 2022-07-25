
package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
       
        /*
        int age1 = 34;
        int age2 = 35;
        int age3 = 36;
        int age4 = 37;
        int age5 = 38;
        */
        
        int age[] = new int[5];
        // humne 100 bandon ki age store kara di
        age[0]=22;
        age[1]=23;
        age[2]=24;
        age[3]=25;
        age[4]=26;
        
        /*  0  1  2  3  4  
           22 23 24 25 26  
        */
        
        //System.out.println(age[1]);
        
        /*
        // first type for array implementation
        // initialize and allocate memory alag alag 
        
        int ID [];
        ID = new int[5];
        // ID is reference variable or name of the array
        
        ID[0]=22;
        ID[1]=23;
        ID[2]=24;
        ID[3]=25;
        ID[4]=26;
        
        for(int element:ID){
            System.out.println(element);
        }
        */
        
        // second way of implementing array
        // sath mein karenge memory allocation bhi or initialization bhi
        
        //int ID[] = new int[5];
        
        // third way : java khud pata lagaiga ki kitni values hai
        
        //int ID[]={2,4,6};
        //int length=ID.length;
        
        
        // for user input through array
        Scanner ref = new Scanner(System.in);
        int ID[] = new int[3];
        for(int i=0;i<ID.length;i++){
            ID[i]=ref.nextInt();
        }
        
        //System.out.println("length of array = "+length);
        for(int values:ID){
            System.out.println(values);
        }
        
        
        
        
        
        
    }
    
}
