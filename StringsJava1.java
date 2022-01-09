
package stringsjava.pkg1;

public class StringsJava1 {

    public static void main(String[] args) {
       
        /*
        String in java
        
        String is basically a sequence of characters
        
        Strings cannot be changed because they are immutable
        they can be copied from one string to other for operations
        
        "C L A S S G E N I X"
        0 1 2 3 4 5 6 7 8 9
        
        */
        
        // first way of creating string
        String Name = "Welcome to my channel";  // Syntax of a string
        // String = Java Class
        // Name = Variable Name of a string
        // "Welcome to my channel" = String literal
        
        // second way of creating string
        String name = new String("Hello World"); // syntax of the string
        // String = Java Class
        // Name = Variable Name of a string
        // "Welcome to my channel" = String literal
        // new = new keyword which helps in making new object of a string
        
        // four ways to print a string in java
        
        // first
        System.out.println(Name); // it is changing to new line
        
        // second 
        System.out.print(Name);  // it is not changing to new line
        
        // third
        System.out.printf(Name);  // it is not changing to new line
        
        // fourth
        System.out.format(Name);  // it is not changing to new line
        
        // format specifier in java stringm= '%d' , '%f' , '%s' and '%c'
        
        /*
        %d for decimal
        %f for float
        %c for character
        %s for string
        */
        
        String NAME = "Prabhjot Kaur";
        int marks = 98;
        String Subject = "English";
        float percentage = 98;
        System.out.printf("\nThe girl name is %s who scored %d in %s ",NAME,marks,Subject);
        System.out.printf("She got %.1f in B.Tech 2021 ",percentage);
        
    }
    
}
