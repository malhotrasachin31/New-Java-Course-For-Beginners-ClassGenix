package schoolreportcardcalculator;


/*

Analogy of this program/excersice

step 1 = Print "enter your name" (Done)
step 2 = User input of your name (Done)
Step 3 = Print "Enter your roll number" (Done)
step 4 = User input Roll number (Done)
step 5 = Print "Enter the marks of five subjscts" (Done)
step 6 = input the 5 values as marks (please not enter your subject marks above 100) (Done)
step 7 = print the message "thanks for your input... your marks and percentage is processing" (Done)


*/

// importing of scanner class in java
import java.util.Scanner;

public class SchoolReportCardCalculator {

    public static void main(String[] args) {
        
        // Scanner class object
        Scanner ref=new Scanner(System.in);
        
        // printing "Enter your name"
        System.out.println("Enter your Name");
        
        //String value input
        String Name=ref.nextLine();
        
        // printing the name
        //System.out.println("Your name is "+Name);
        
        //print "Enter your roll number"
        System.out.println("Enter your roll number");
        
        // user input of roll number
        int rollnumber = ref.nextInt();
        
        // printing the "Enter 5 marks "
        System.out.println("Enter the marks of 5 subjects");
        
        int english = ref.nextInt();
        int hindi = ref.nextInt();
        int maths = ref.nextInt();
        int science = ref.nextInt();
        int Java = ref.nextInt();
        
        // total marks will be 500 as one subject is of 100 marks (5*100=500)
        int totalmarks2 = 500;
        
        System.out.println("Thanks For Your Input... your result is being processing\n");
        
        // for getting total marks
        int totalmarks = english+hindi+maths+science+Java;
        
        //printing 
        System.out.println("Your input is recieved and please wait for the output .....");
        
        //printing total marks...
        System.out.println("Your Total Marks are "+totalmarks+" out of "+totalmarks2);
        
        // for calculating percentage
        /*
        for eg. lets say 390 out of 500
        
        390/500*100 = 390/5 = percentage
        
        */
        
        float percentage = totalmarks/5;
        
        // for printing final percentage
        System.out.println("Your Percentage is "+percentage);
    }
    
}
