package scannerclassinjava;

// how to do user input in java using scanner class

/*

step 1 = import the scanner class (done)
step 2 = make the scanner class object (done)
step 3 = call the variable from ref variable of scanner class(done)


*/

// import java.util.*; for importing all the classes of util package

import java.util.Scanner;

public class ScannerClassInJava {

    public static void main(String[] args) {
       
       Scanner ref = new Scanner(System.in); 
       
       System.out.println("Please enter your Age");
       byte age = ref.nextByte();
       byte age2=ref.nextByte();
       System.out.println("Your firts Age is "+age+" and your second age is "+age2);
       
    }
    
}
