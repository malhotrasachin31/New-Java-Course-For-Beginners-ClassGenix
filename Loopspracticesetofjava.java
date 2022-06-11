package loopspracticesetofjava;

public class Loopspracticesetofjava {

    public static void main(String[] args) {

        // question one
        /*int triangle=5;
         for(int i=0;i<triangle;i++){
         for(int j=triangle;j>i;j--){
         System.out.print(" x ");
         }
         System.out.print("\n");
         }
         */
        // question two
        // print n even numbers and their sum
        // 1 2 3 4 5 = 15
        // 1*2+2*2+3*2+4*2+5*2=2+4+6+8+10=30
        /*int numbers=5;
         int sum=0;
         for(int i=1;i<=5;i++){
         sum=sum+2*i;
         }
         System.out.println(sum);
         */
        // question number 3
        // WAP to generate multiplication table of any number
        /*int number=18;
         for(int i=1;i<=10;i++){
         System.out.println(number+" x "+i+" = "+number*i);
         }
         */
        // question number 4th
        // 4! = 1*2*3*4 = 24
        // factorial= 5! = 5*4*3*2*1 = 120
        // 6! = 
        /*int number=6;
         int fact=1;
         while(number>0){
         fact=fact*number;
         number--;
         System.out.println(fact);
         }*/
        // question number 5th
        /*
         x x x x x
         x x x x
         x x x
         x x 
         x
        
         */
        /*int number=5;
         while(number>0){
         int num=0;
         while(num<number){
         System.out.print(" x ");
         num++;
         }
         System.out.print("\n");
         number--;
         }*/
        // question number 8th
        // WAP to reverse a number
        /*
         56789
                
         56789%10 = remainder
        
                
                    
         */
        int number = 11451;
        int number2=number;
        int remainder=0;
        int rev=0;
        
        while (number != 0) {
            remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number/10;
            System.out.println(rev);
        }
        System.out.println("orignal number is "+number2);
        if(number2==rev){
            System.out.println("palindrome number hai yeh");
        }
        else{
            System.out.println("palindrome number nahi hai yeh");
        }
        
        
        // fibbonoccai series
        //     3 5 8 13 .......
        
        
        /*
            c=a+b = 1
            b=c
            a=b
        */
        
    }

}
