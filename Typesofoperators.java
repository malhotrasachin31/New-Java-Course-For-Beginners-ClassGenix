
package typesofoperators;
/*

types of operators in java

*/
public class Typesofoperators {

    public static void main(String[] args) {
            
        /*
        Arithmetic Operators in java
        
        first =  '+'
        Second = '-'
        Third =  '*'
        Fourth = '/'
        Fifth =  '%'
        Sixth =   Increment Operator = '++'
        Seventh = Decrement Operator = '--'
        
        */
        
        // Additional Operator
        int varA = 34+45;
        System.out.println(varA);
        
        // Subtractional Operator
        int varS = 75-45;
        System.out.println(varS);
        
        // Multiplication Operator
        int varM = 34*4;
        System.out.println(varM);
        
        // Division Operator
        int varD = 75/5;
        System.out.println(varD);
        
        // modulo operator in java
        
        int a = 12%6;
        int b = 22%5;
        System.out.println(b);
        
        
        // increment operator in java
        
        // pre increment operator in java
        int c = 22;
        ++c;
        System.out.println(c);
        
        // post increment operator in java
        int d = 22;
        d++;
        System.out.println(d);
        
        // pre decrement operator in java
        int cd = 22;
        --cd;
        System.out.println(cd);
        
        // post increment operator in java
        int dd = 22;
        dd--;
        System.out.println(dd);
        
        /*
        
        Assignment Operators in Java
        
        The operator which assigns value to a variable is called Assignment Operator
        
        Assignment operator => "="
        AdditionEqualto => "+="
        SubtractionEqualto => "-="
        DivisonEqualto => "/="
        MultiplicationEqualto => "*="
        ModuloEqualto => "%="
        
        */
        
        int AE ;
        AE = 12;
        System.out.println(AE);
        AE += 13;
        System.out.println(AE);
        AE -=3;
        System.out.println(AE);
        AE *= 4;
        System.out.println(AE);
        AE %= 50;
        System.out.println(AE);
        
        
        /*
        
        Comparison Operator in java
        
        Comparison Operator => "=="
        GreaterThanEqualTo => ">="
        LessThanEqualTo => "<="
        
        always return awnser in true or false
        */
        
        System.out.println(4==4); // true
        System.out.println(4==3); // false
        System.out.println(4>=4); // true
        System.out.println(4<=4); // true
        
        
        /*
        
        Logical Operators in Java
        
        AND operator/operation = "&&"
        OR operator/operation  = "||"
        
        */
        
        System.out.println(4==4 && 89==6); // = false
        System.out.println(4==4 || 89==6); // = true
        
        
        /*
        
        Bitwise Operator 
        
        Bin    value
        00  =  0
        01  =  1
        
        10  =  2
        11  =  3
        -----
        10  =  2
        11  =  3
        
        */
        
        System.out.println(2&3);
        System.out.println(2|3);
    }
    
}
