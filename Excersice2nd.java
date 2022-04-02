
package excersice2nd;

import java.util.Random;
import java.util.Scanner;

public class Excersice2nd {

    
    public static void main(String[] args) {
       // steps included in stone paper scissor game
        /*
        1 generate random numbers [done]
        2 user generated numbers
        3 compare those numbers
        
        three numbers = [0,1,2]
        
        stone = 0
        paper = 1
        scissor = 2
        
        */
        
        
        Random random=new Random();
        int computer=random.nextInt(3);
        
        
        System.out.println("Welcome to the Game");
        System.out.println("Choose any one option here");
        System.out.println("Choose 0 for stone");
        System.out.println("Choose 1 for paper");
        System.out.println("Choose 2 for scissors");
        
        Scanner ref=new Scanner(System.in);
        int human=ref.nextInt();
        
        // logic for winning and loosing the game
        
        // logic for first case
        if(computer==0 && human==1){
            System.out.println("You choose Paper and computer chooses the Stone");
            System.out.println("Congratulations!...Human Won the Game");
        }
        else if(computer==0 && human==2){
            System.out.println("You choose Scissor and computer chooses the Stone");
            System.out.println("Sorry better luck next time!...Computer Won the Game");
        }
        
        // logic for second case
        
        else if(computer==1 && human==0){
            System.out.println("You choose Stone and computer chooses the Paper");
            System.out.println("Sorry better luck next time!...Computer Won the Game");
        }
        else if(computer==1 && human==2){
            System.out.println("You choose Scissors and computer chooses the Paper");
            System.out.println("Congratulations!...Human Won the Game");
        }
        
        // logic for third case
        
        else if(computer==2 && human==0){
            System.out.println("You choose stone and computer chooses the Scissor");
            System.out.println("Congratulations!...Human Won the Game");
        }
        else if(computer==2 && human==1){
             System.out.println("You choose paper and computer chooses the Scissor");
             System.out.println("Sorry better luck next time!...Computer Won the Game");
        }
        
        // logic for draw 
        
        else if(computer==human){
            // human==2 , computer==2
            System.out.println("You both choose the same type so the game is drawn....");
            System.out.println("Please play again.... for better results");
        }
        else{
            System.out.println("Sorry invalid input...");
        }
    }
        
    }
    
}
