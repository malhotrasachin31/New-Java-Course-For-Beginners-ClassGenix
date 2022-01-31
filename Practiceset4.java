
package practiceset.pkg4;
import java.util.Scanner;
public class Practiceset4 {

    public static void main(String[] args) {
        
        Scanner ref=new Scanner(System.in);
        
        // question 1 : 
        
        System.out.println("Enter the length :");
        int len=ref.nextInt();
        System.out.println("Enter the breadth :");
        int bre=ref.nextInt();
        
        if(len==bre){
            // if length is equal to breadth then execute here ...
            System.out.println("Both length and breadth are equal here , so its a square");
        }
        else{
            System.out.println("Its not a square ");
        }
        
        // question 2
        
        Scanner ref2=new Scanner(System.in);
        int var1=ref2.nextInt();
        int var2=ref.nextInt();
        
        if(var1>var2){
            System.out.printf("%d is greater than %d ",var1,var2);
        }
        else{
            System.out.printf("%d is smaller than %d ",var1,var2);
        }
        
        // question 3
        
        /*
            1 kg = 200 rs
            first hume quantity deni hai = 6kg
            5kg = 6*200 = 1200
            1200 ka 10% = 120rs
            1200-120=1080 = final bill
        */
        
       Scanner rerf3=new Scanner(System.in);
        int quantityofoneunit=200;
        int quantitypurchased=ref.nextInt();
        // calculation here ...
        int total=quantitypurchased*quantityofoneunit;
        if(total>1000){
            // then give discount of 10%
            int discount=total/10;
            int finaltotal=total-discount;
            System.out.println("Your discounted bill or grand total is "+finaltotal);
        }
        else{
            System.out.println("No discount your bill is "+total);
        }
       
        // question 4:
        
        Scanner ref4=new Scanner(System.in);
        int salary=ref4.nextInt();
        int yos=ref4.nextInt();
        int yearlysalary=12*salary;
        if(yos>5){
            int bonus=yearlysalary/100;
            int fbonus=bonus*5;
            System.out.printf("You got %d as bonus in this level\n",fbonus);
        }else{
            System.out.println("You Got no Bonus at this level!");
        }
        
       // question number 5:
       
       Scanner ref5=new Scanner(System.in);
       int Age1=ref5.nextInt();
       int Age2=ref5.nextInt();
       int Age3=ref5.nextInt();
       
       // ladder if else concept here...
       
       if(Age1>Age2 & Age1>Age3){
           // then execute here....
           System.out.printf("%d is oldest among all \n",Age1);
           if(Age2>Age3){
               // age2 = middle
               // age3=smallest
               System.out.printf("%d is middle among all \n",Age2);
               System.out.printf("%d is youngest among all \n",Age3);
           }
           else if(Age2<Age3){
               // age3=middle
               // age2=smallest
               System.out.printf("%d is middle among all \n",Age3);
               System.out.printf("%d is youngest among all \n",Age2);
           }
       }
       else if(Age2>Age1 & Age2>Age3){
           // then execute here....
           System.out.printf("%d is oldest among all \n",Age2);
           if(Age1>Age3){
               // Age1 = middle
               // Age3 = youngest
               System.out.printf("%d is middle among all \n",Age1);
               System.out.printf("%d is youngest among all \n",Age3);
           }
           else if(Age1<Age3){
               // Age3=middle
               // Age1=Youngest
               System.out.printf("%d is middle among all \n",Age3);
               System.out.printf("%d is youngest among all \n",Age1);
           }
       }
       else if(Age3>Age1 & Age3>Age2){
           // then execute here....
           System.out.printf("%d is oldest among all \n",Age3);
           if(Age2>Age1){
               // Age2 = middle
               // Age1 = youngest
               System.out.printf("%d is middle among all \n",Age2);
               System.out.printf("%d is youngest among all \n",Age1);
           }
           else if(Age2<Age1){
               // Age1=middle
               // Age2=Youngest
               System.out.printf("%d is middle among all \n",Age1);
               System.out.printf("%d is youngest among all \n",Age2);
           }
       }
       
       // question: 6
       // already done in the first video of if else please go and check it out...
       
       // question 7:
       
       Scanner ref7=new Scanner(System.in);
       int classH=ref7.nextInt();
       int classA=ref7.nextInt();
       float per=(classA/classH)*100;
       if(per>=75){
           System.out.println("You are allowed to sit in the exam!");
       }else{
           System.out.println("You are not allowed to sit in the exam!");
       }
       
       // question 8:
       
       int x=2;
       int y=5;
       int z=0;
       
       // answers of question 8
       
       // (a) x==2; = true
       // (b) x!=5; = true
       // (c) x!=5 && y>=5  = true
       // (d) z!=0 || x==2  = true
       // (e) !(y<10)  = false
       
       // question 9
       
       Scanner ref9=new Scanner(System.in);
       String Name=ref.next();
       if(Name==Name.toLowerCase()){
           // its in lower case
           System.out.println("Lower Case");
       }
       else if(Name==Name.toUpperCase()){
           // its in upper case
           System.out.println("Upper Case");
       }
       else{
           // its in mixed case\
           System.out.println("Mixed Case");
       }
       
       // question 10 and 12
       
       Scanner ref10=new Scanner(System.in);
       int num=ref.nextInt();
       
           if(num>0){
               if(num%2==0){
               System.out.println("Positive Even Number");
               }
               else{
                   System.out.println("Positive odd Number");
               }
           }
           else{
               System.out.println("negitive  Number");
           }
       
       
       // question  11
       
       /*
            leap year 4 saal me aik baar
            
            divisble by 4 
            year%4==0
       
            year%400==0
            
            not a leap year
            year%100==0
            year%4=!0
       */
       
       Scanner ref11=new Scanner(System.in);
       int year=ref11.nextInt();
       
       if((year%4==0) & (year%100!=0 || year%400==0)){
           System.out.println("Its a leap year");
       }
       else{
           System.out.println("Its not a leap year");
       }
       
       
    }
    
}
