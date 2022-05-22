
package pkgfor.loops;


public class BreakandContinue {
    public static void main(String args[]){
        
        // for loop
        
        for(int a=1;a<=6;a++){
            if(a==1){
                continue;
            }
            System.out.println("i am in loop with value "+a);
        }
        // a==1 2 3 4 5 
        
        /*int b=1;
        while(b<6){
            if(b==5){
                break;
            }
           System.out.println("i am in loop with value "+b);
           b++;
        }*/
        
        int c=0;
        do{
            if(c==2){
                continue;
            }
           System.out.println("i am in loop with value "+c);
           c++;
        }while(c<6);
        
        
          //  a == 3 3<=6 true
        
        
    }
}
