import java.util.Scanner;

public class Deadwood {
     
    public static int calculateDays(int totalPlayers) {
        int daysLeft = 4; 
        if (totalPlayers < 4) {
            daysLeft = 3;
        }
        return daysLeft;
    }

    public static int calculateStartCredits(int totalPlayers) {
        int startCredits = 0;
        if (totalPlayers == 5) {
            startCredits = 2;
        }
        if (totalPlayers == 6) {
            startCredits = 4;
        }
        return startCredits;
    }
   

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Building your Game......");
        System.out.println("How many players will be playing this game? Enter a number from 2-8 ");

        int totalPlayers = myObj.nextInt(); // Read user input
        System.out.println("Setting up board for " + totalPlayers + " players"); // Output user input

       int days = Board.calculateDays(totalPlayers);
       int startCredits =  Board.calculateStartCredits(totalPlayers);
       System.out.println("You will play the game for  " + days + " days");

       System.out.println("Each player starts with " + startCredits + " credits");
 
    }
    
}


public class Board extends Deadwood{


    private int numPlayers;
    private Player playerNumber;
    private int scenesLeft;

    public Board(Player playerNumber, int scenesLeft){
        this.playerNumber = playerNumber;
        this.scenesLeft = scenesLeft;
    }
    
    public Board(int numPlayers){
        this.numPlayers = numPlayers;
    }

}





