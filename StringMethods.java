
package string.methods;

public class StringMethods {

    public static void main(String[] args) {
        
        /*
        Strings operations are as folows
        
        1 length of string nikalna
        2 upper case conversion
        3 lower case conversion
        4 trim of the string
        5 substring(int a) in string
        6 substring(int a, int b)
        7 replace character in the string
        8 starts with 
        9 ends with
        10 CharAt function in string
        11 indexOf method
        12 lastIndexOf 
        13 equal
        14 ignoreequalcase
        
        
        */
        
        // first method of the string
        // string.length()  length nikalne ke lie
        
        /*
              W e l c o m e t o C l  a  s  s  G  e  n  i  x
              0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
        */
        
        String Name = new String("Welcome to ClassGenix");  // string syntax
        int length = Name.length(); //  length of string will be 21
        System.out.println("The length of the string is :"+length);
        
        // to lowercase and to upper case
        
        // WELCOME TO CLASSGENIX
        // welcome to classgenix
        
        System.out.println(Name.toUpperCase());   // uppper case banane ke lie
        System.out.println(Name.toLowerCase());   // lower case banane ke lie
        
        
        String Name2 = "    ClassGenix    ";  // first and last 4 spaces
        System.out.println(Name2.length());
        System.out.println(Name2);
        System.out.println(Name2.trim()+"is a eduactional channel");
        
        // ClassGenixis a educational channel
     
        // substring methods in java 
        
        String ClassGenix = "Java Course for beginners";
        
        System.out.println(ClassGenix.substring(5));
        // print = Course for beginners
        System.out.println(ClassGenix.substring(5,9));
        // print = Cour
        
        // replace character in a string
        System.out.println(ClassGenix.replace("e","E"));
        
        // starts with and ends with ""
        
        System.out.println(ClassGenix.startsWith("Java"));
        System.out.println(ClassGenix.endsWith("beginners"));
        
        // 1 2 3 4 5 6  length
        // S A C H I N  string
        // 0 1 2 3 4 5  index= length-1
        
        System.out.println(ClassGenix.indexOf("e"));
        System.out.println(ClassGenix.lastIndexOf("a"));
        
        
        // equals and equalignorecase
        String sachin="sachin";
        String SACHIN="SACHIN";
        System.out.println(sachin.equals(SACHIN));   // it is case sensitive
        System.out.println(sachin.equalsIgnoreCase(SACHIN));  // it is not CS
        
    }
    
}
