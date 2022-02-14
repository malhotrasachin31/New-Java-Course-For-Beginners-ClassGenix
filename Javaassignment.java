
package javaassignment;

public class Javaassignment {

    public static void main(String[] args) {
       
        // question number : 1
        
        int expression = 2*4/2-8/4+2-11*4;
        /*
        precdence of '/ and *' > '+ and -'
        Associativity is Left to right
        
        2*4/2-8/4+2-11*4
        8/2-8/4+2-11*4
        4-2+2-44
        4-44
        -40
        */
        System.out.println(expression);
        
        // question number 2:
        
        String Name = "Hello world";
        /*
        H E L L O _ W O R L D
        0 1 2 3 4 5 6 7 8 9 10
        
        length = 11
        
        'a' = 97
        'b' = 98
        
        
        'e' = 101
        */
        char ch1 = Name.charAt(1); // 'e'
        int value = 10; 
        int value2 = ch1+value; // integer = char + integer = adding value = 111
        char ch2 = (char)value2;
        
        // a b c d e f g h i j k l m n o p
        // 10 -- 'o' == 111
        System.out.println(ch2);
        
        // question number 3:
        
        /*int d = 5;
        int e = d+1; // 6
        int f =  2+e; //2+6 ==8 i take value of is 'g' === 2
        */
        
        int e = 6;
        int f = 8;
        /*
        6 = (2)^2 + (2)^1 =  100 + 10 = 0110
        8 = (2)^3 = 1000
        
        0110
        1000
        ----
        0000 == '0'
        */
        System.out.println(e&f);
        
        
        // question 4th:
        
        int a = 4;
        int b = 2*a;
        /*
        8 = (2)^3 = 1000
        10 = (2)^3+(2)^1 = 1000+10 = 1010
        
        1000
        1010
        ----
        1000 = "8"
        */
        System.out.println(b&10);
        
        // question number 8:
        
        int bit = 1&0|1&0|1|1&0;
        /*
        precdence = &>|
        Associativity = L to R
        
        1&0|1&0|1|1&0
        0|0|1|0
        0|1|0
        1
        */
        System.out.println(bit);
        
        
        // question number 9:
        
        String Emp = "Hello sir/ma'am \n \t\t I am glad to inform you that i have joined a new company an i am resigning from yours \nThanks and regards\nSachin Malhotra";
        System.out.println(Emp);
    }
    
}
