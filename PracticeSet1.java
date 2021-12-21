package practice.set1;

import java.util.Scanner;
public class PracticeSet1 {

    public static void main(String[] args) {
       
        // Scanner class for all questions
        Scanner ref=new Scanner(System.in);
        
        // first question: Sum of 4 numbers
        
        System.out.println("Enter 4 numbers ");
        
        int firstnum = ref.nextInt();
        int secondnum = ref.nextInt();
        int thirdnum = ref.nextInt();
        int fourthnum = ref.nextInt();
        
        int totalsum = firstnum+secondnum+thirdnum+fourthnum;
        System.out.println("The Sum of "+firstnum+","+secondnum+","+thirdnum+","+fourthnum+" is :"+totalsum);
        
        
        
        // second question (Kilometer to miles and miles to kilometers)
        
        // 1 kilometer = 0.62 miles
        // 1 mile = 1.60 kilometers
        
        
        System.out.println("Enter your input in Kilometers");
        int kilometers = ref.nextInt();
        
        // to miles conversion
        float convert = kilometers*0.62f;
        System.out.println(kilometers+" is equal to "+convert+" miles");
        
        System.out.println("Enter your input in miles");
        
        // to kilometer conversion
        int miles = ref.nextInt();
        float convert2 = miles*1.60f;
        System.out.println(miles+"miles is equal to "+convert2+" kilometers");
     
        
        // question number 3
         System.out.println("Enter your name");
         Scanner ref2=new Scanner(System.in);
         String name = ref2.nextLine();
         System.out.println("Namaste ,"+name);
        
        // question number 4
        
        // for getting square of a number = (a)^2= a*a
        
        
        // for caculating square root
        
        int number = ref.nextInt();
        double var3 = Math.sqrt(number); //for getting square root
        // for type casting double to integer
        int var2 = (int)var3;
        System.out.println("The square of "+number+" is "+number*number);
        System.out.println("The square root of "+number+" is "+var2);
        
        
        // question 5 : Cube and cuberoot finding
        
        int number2 = ref.nextInt();
        double var4 = Math.cbrt(number2); //for getting cube root
        // for type casting double to integer
        int var6 = (int)var4;
        System.out.println("The cube of "+number2+" is "+number2*number2*number2);
        System.out.println("The cube root of "+number2+" is "+var6);
        
        

        // question 6 : equation solver 9X^2+8Y^3+10
        Scanner ref3=new Scanner(System.in);
        System.out.println("Enter the value of X ");
        int x=ref3.nextInt();
        System.out.println("Enter the value of Y ");
        int y=ref3.nextInt();
        int result = 9*x*x+8*y*y*y+10;
        System.out.println("The solution of equation is "+result);
        
        
        
        // question number 7: Pythagoras therom excersice
        
        /*
        (Hypo)^2 = (B)^2 + (H)^2
        
        base = 4
        height = 3
        (hypo)^2 = (base)^2 + (height)^2 
        hypo = 16+9=25=5
        */
        
        Scanner ref4=new Scanner(System.in);
        System.out.println("Enter the height of the triangle ");
        int height = ref4.nextInt();
        System.out.println("Enter the base of the triangle ");
        int base = ref4.nextInt();
        
        double hypotenuse = Math.sqrt(height*height+base*base);
        int convert3 = (int)hypotenuse;
        System.out.println("The hypotenuse is of "+convert3+" unit ");
        
        // question number 8 : problem sum
        /*
        breadth of the field = a
        length of the field = 2*a
        */
        
        Scanner ref5 = new Scanner(System.in);
        System.out.print("Enter the breadth in meters ");
        int breadth = ref5.nextInt();
        int length = breadth*2;
        
        // perimter of the rectangle is 2(L+B)
        int perimeter = 2*length+2*breadth;
        System.out.println("The perimeter of rectangle having "+length+" as length and breadth of "+breadth+" is "+perimeter);
        
        // area of the rectangle is L*B
        int area = length*breadth;
        System.out.println("The area of rectangle having "+length+" as length and breadth of "+breadth+" is "+area);
        
    }
    
}
