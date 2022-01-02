
package precedenceandassociativity;

public class PrecedenceAndAssociativity {

    public static void main(String[] args) {
        
        int variable = 23/1+90/9*2;
         
        
        /*
        precendence of * and / and % operator is higher than + - operator
        so thats why associativity is decided as left to right
        
        associativity is defined as the way of excecution either it is left to
        right or it will be right to left
        
        23/1+90/9*2
        left to right excecution
        
        =23+90/9*2
        =23+10*2
        =23+20
        =43
        
        */
        
        int a = 3*2+45/5-2+10%5;
        /*
            Associativity is left to right so the exceution will be held
            from left to right
        
          3*2+45/5-2+10%5
          6+45/5-2+10%5
          6+9-2+10%5
          6+9-2+0
          15-2
          13
            
        */
        
        int b = 3+3+5-2*9/3;
        /*
            3+3+5-2*9/3
            11-2*9/3
            11-2*3
            11-6
            5
                
        */
        //System.out.println(b);
        
        // quick quiz
        
        /*
         how will you write 
            v-u/2
        */
        int v=5;
        int u=2;
        
        int result=v-u/2;
        int result2=(v-u)/2;
        /*
         first expression
            5-2/2
            5-1
            4
        
        second expression
            (5-2)/2
            3/2
            1
        */
                        
        
        /*
        
        expression third
        
        b*b-4*a*c/2
        
        
        
        */
        
        int b2=2;
        int a2=2;
        int c2=2;
        
        int result3=b2*b2-4*a2*c2/2;
        int result4=(b2*b2-(4*a2*c2))/2;
        
        /*
            first expression
            2*2-4*2*2/2
            4-8*1
            -4
        
            second expression
        
            (b2*b2-(4*a2*c2))/2
            (4-(4*2*2))/2
            (4-16)/2
            -12/2
            -6
        */
        System.out.println(result3);
        System.out.println(result4);

        
    }
    
}
