
package resultantdatatypeandidop;

public class ResultantDatatypeandIDOp {

    public static void main(String[] args) {
        
        /*
        Resultant of the datatypes in java
        
        byte   B
        short  S
        long   L
        integer I
        float F
        double D
        character CH
        
        */
        
        // addition of byte and short
        byte B = 127;
        short S = 3290;
        System.out.println(B+S);
        
        // addition of short and integer
        int I = 3;
        System.out.println(I+S);
        
        // character + integer
        // 'a' = 97 ASCII code
        // 'A' = 65 ASCII code
        
        char CH = 'a';
        char CH2 = 'A';
        
        System.out.println(CH+I); // 97+3=100
        System.out.println(CH2+I); // 65+3=68
        
        // addition of float and integer
        
        float F = 3.14F;
        System.out.println(F+I); // float = 3.14 and Integer = 3 Answer = 6.14
        
        // double and float addition
        double D = 3.14;
        System.out.println(D+F);
        
        
        /*
         Byte , Short = Integer
         Byte , long = Integer
         Byte , integer = integer
         
         Float , byte = float
         Float , short or long or integer = Float
        
         double , byte or short or long or integer or float = double
        
         char , short or byte or integer or long = integer
        
        */
        
        /*
        Increment operator types
        
        => Post Increment  first use then (+1)
        => Pre Increment   first (+1) then use
        
        */
        
        int Age = 1;  // age variable ke andar humne 1 dala
        System.out.println(Age++);   // PostIncrement 
        // pehle use karunga mai age = 1
        // print hoga pehle 1   print first = 1
        // ab mai age ki value aik badaunga = 1+1 = 2
        // age = 2
        System.out.println(Age);
        // print 2nd = 2
        
        
        System.out.println(++Age);
        // age variable pehle +1 hoga uske baad use hoga
        // age = 2
        // age = 2+1 = 3
        // print = 3
        System.out.println(Age);
        // print 3
        
        // now our age is 3
        
        System.out.println(Age--);  // pehle use karunga uske baad -1 karunga
        // print 3
        // 3-1=2
        // age = 2
        System.out.println(Age);  
        // print the age = 2
        
        System.out.println(--Age);  
        // pehle mai -1 karunga uske baad use karunga
        // 2-1 = print = 1
        System.out.println(Age);
        // print 1
    }
    
}
