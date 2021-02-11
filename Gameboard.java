import java.util.Scanner;

public class Gameboard {
     

    public static int calculateDays(int totalPlayers) {
        int daysLeft = 4; 
        if (totalPlayers < 4) {
            daysLeft = 3;
        }
        System.out.println("You will play the game for  " + daysLeft + "days");
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
        System.out.println("Each player starts with " + startCredits + " credits");
        return startCredits;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Building your Game......");
        System.out.println("How many players will be playing this game? Enter a number from 2-8 ");

        int totalPlayers = myObj.nextInt(); // Read user input
        System.out.println("Setting up board for " + totalPlayers + " players"); // Output user input

        calculateDays(totalPlayers);
        calculateStartCredits(totalPlayers);
        
    }
    
}

public class Dice{

    int rollResults;
    int practiceChips;

    Dice(int rollResult, int practiceChips){
        this.rollResults = rollResult;
        this.practiceChips = practiceChips;
    }

    public int rollDice(){
        Random rand = new Random();
        
        int roll = rand.nextInt(6) + 1;
        return roll;
    }


}




    






