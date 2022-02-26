
package switchcasepracticeset;

import java.util.Scanner;

public class Switchcasepracticeset {

    public static void main(String[] args) {
       // we are making a calculator in switch case
       
       /*
       intruction:
       enter two numbers
       select the operation
       result 
       */
       
       System.out.println("please enter two numbers");
       Scanner ref=new Scanner(System.in);
       int var1=ref.nextInt();
       int var2=ref.nextInt();
       int var3;
       
       System.out.println("Enter '+' for addition ");
       System.out.println("Enter '-' for subtraction ");
       System.out.println("Enter '*' for multiplication ");
       System.out.println("Enter '/' for division");
       
       Scanner ref2=new Scanner(System.in);
       char ch=ref2.next().charAt(0);
       switch(ch){
           case '+':{
              var3=var1+var2;
              System.out.println(var1+" + "+var2+" = "+var3);
              break;
           }
           case '-':{
               var3=var1-var2;
              System.out.println(var1+" - "+var2+" = "+var3);
              break;
           }
           case '*':{
               var3=var1*var2;
              System.out.println(var1+" * "+var2+" = "+var3);
              break;
           }
           case '/':{
               var3=var1/var2;
              System.out.println(var1+" / "+var2+" = "+var3);
              break;
           }
           default:{
               System.out.println("Invalid input");
               break;
           }
       }
       
       // question Second:
       
       System.out.println("Enter the following number to implement followings");
       System.out.println("Enter 1 for area of rectangle");
       System.out.println("Enter 2 for area of circle");
       System.out.println("Enter 3 for perimeter of a cirlce");
       System.out.println("Enter 4 for volume of cube");
       System.out.println("In default you got perimeter of a rectangle");
       
       Scanner ref6=new Scanner(System.in);
       int a=ref6.nextInt();
       int length;
       int breadth;
       double result;
       int r;
       Scanner ref7=new Scanner(System.in);
       switch(a){
           case 1:{
               
               System.out.println("Enter the length of the rectangle");
               length=ref7.nextInt();
               System.out.println("Enter the breadth of the rectangle");
               breadth=ref7.nextInt();
               result=(length*breadth);
               System.out.println("The area of the rectangle is "+result);
               break;
           }
           case 2:{
               System.out.println("Enter the radius of the circle");
               r=ref7.nextInt();
               result=3.14*r*r;
               System.out.println("The area of the circle is "+result);
               break;
           }
           case 3:{
               System.out.println("Enter the radius of the circle");
               r=ref7.nextInt();
               result=2*3.14*r;
               System.out.println("The perimeter of the circle is "+result);
               break;
           }
           case 4:{
               System.out.println("Enter the side of the cube");
               int side=ref7.nextInt();
               result=side*side*side;
               System.out.println("The volume of the cube is "+result);
               break;
           }
           default:{
               System.out.println("Invalid input");
               break;
           }
       }
       
       // question third:
       
       /*
       instruction:
       enter any day
       you have to make cases according to your plan of week
       implement that
       */
       
       System.out.println("Enter any Day");
       Scanner ref3=new Scanner(System.in);
       String day=ref3.next();
       String day2=day.toLowerCase();
      
       switch(day2){
           case "sunday":{
               System.out.println("Movie dekhne jaunga");
               System.out.println("Cricket khelne jaunga");
               break;
           }
           case "monday":{
               System.out.println("Office jaunge");
               System.out.println("Kaam karunga");
               System.out.println("Ghar aaunga");
               System.out.println("Khana khaunga");
               System.out.println("so jaunga");
               break;
           }
           case "tuesday":{
               System.out.println("Office jaunge");
               System.out.println("Kaam karunga");
               System.out.println("Ghar aaunga");
               System.out.println("Khana khaunga");
               System.out.println("so jaunga");
           }
           case "wednesday":{
                System.out.println("Office jaunge");
               System.out.println("Kaam karunga");
               System.out.println("Ghar aaunga");
               System.out.println("Khana khaunga");
               System.out.println("so jaunga");
               break;
           }
           case "thursday":{
                System.out.println("Office jaunge");
               System.out.println("Kaam karunga");
               System.out.println("Ghar aaunga");
               System.out.println("Khana khaunga");
               System.out.println("so jaunga");
           }
           case "friday":{
               System.out.println("Office jaunge");
               System.out.println("Kaam karunga");
               System.out.println("Ghar aaunga");
               System.out.println("Khana khaunga");
               System.out.println("so jaunga");
               break;
           }
           case "saturday":{
               System.out.println("Party karunga");
               System.out.println("pizza khaunga");
               break;
           }
           default:{
               System.out.println("Invalid input....");
               break;
           }
       }
       
       // question fourth:
       
       /*
       show the list of the items
       ->  press c for Coffee
       ->  press t for Tea
       ->  press s for Soup
       ->  pres  d for Cold Drinks
       
       c
       
       press a for cappachino
       press b for latte
       press c for frapachino
       
       
       t
       
       press a for green tea
       press b for black tea
       press c for adrak tea
       */
       
       
       System.out.println("<<<<Welcome to Cafe Coffee day>>>>");
       System.out.println("Press the following keys to get you something good");
       System.out.println("press 'c' for coffee");
       System.out.println("press 't' for tea");
       System.out.println("press 's' for soup");
       System.out.println("press 'd' for drinks");
       
       Scanner ref4=new Scanner(System.in);
       char ch4=ref4.next().charAt(0);
       switch(ch4){
           case 'c':{
               System.out.println("Press 'a' for cappachino");
               System.out.println("Press 'b' for frappachino");
               System.out.println("Press 'c' for latte");
               Scanner ref5=new Scanner(System.in);
               char ch2=ref5.next().charAt(0);
               switch(ch2){
                   case 'a':{
                       System.out.println("Here is your cappachino");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'b':{
                       System.out.println("Here is your frapachino");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'c':{
                       System.out.println("Here is your latte");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
               }
               break;
           }
           case 't':{
               System.out.println("Press 'a' for black tea");
               System.out.println("Press 'b' for green tea");
               System.out.println("Press 'c' for ice tea");
               Scanner ref5=new Scanner(System.in);
               char ch2=ref5.next().charAt(0);
               switch(ch2){
                   case 'a':{
                       System.out.println("Here is your black tea");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'b':{
                       System.out.println("Here is your green tea");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'c':{
                       System.out.println("Here is your ice tea");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
               }
               break;
           }
           case 's':{
               System.out.println("Press 'a' for veg soup");
               System.out.println("Press 'b' for tomato soup");
               System.out.println("Press 'c' for chicken soup");
               Scanner ref5=new Scanner(System.in);
               char ch2=ref5.next().charAt(0);
               switch(ch2){
                   case 'a':{
                       System.out.println("Here is your veg soup");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'b':{
                       System.out.println("Here is your tomato soup");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'c':{
                       System.out.println("Here is your chicken soup");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
               }
               break;
           }
           case 'd':{
               System.out.println("Press 'a' for black cola");
               System.out.println("Press 'b' for green cola");
               System.out.println("Press 'c' for ice due");
               Scanner ref5=new Scanner(System.in);
               char ch2=ref5.next().charAt(0);
               switch(ch2){
                   case 'a':{
                       System.out.println("Here is your black cola");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'b':{
                       System.out.println("Here is your green cola");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
                   case 'c':{
                       System.out.println("Here is your ice due");
                       System.out.println("Enjoy your meal....");
                       break;
                   }
               }
           }
           default:{
               System.out.println("INvalid input");
           }
       }
       
    }
    
}
