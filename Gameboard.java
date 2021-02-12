import java.util.Scanner;

public class Gameboard {
     

    public static int calculateDays(int totalPlayers) {
        int daysLeft = 4; 
        if (totalPlayers < 4) {
            daysLeft = 3;
        }
        System.out.println("You will play the game for  " + daysLeft + " days");
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


public class Role{

    private String title;
    private boolean roleFilled;
    private boolean onCard;
    private int rankRequired;

    public Role(boolean title, boolean onCard, int rankRequired ){
        this.title = title;
        this.onCard = onCard;
        this.rankRequired = rankRequired;
    }

    public boolean isFilled(){
        return roleFilled;
    }
    
    public boolean isOnCard(){
        return onCard;
    } 
}

public class Player{

    private int playerNumber;
    private int rank;
    private int dollars;
    private int credits;
    private boolean workStatus;
    private int timesRehearsed = 0;
    private Role role;


    public Player(int playerNumber, int dollars, int credits, int rank ){
        this.playerNumber = playerNumber;
    }

    public Player(boolean workStatus, Role role){
        this.workStatus = workStatus;
        this.role = role;
    }

    public int setRank(int rank ) {this.rank = rank; }
    public int setDollars(int dollars) {this.dollars = dollars;}
    public int setCredits( int credits) {this.credits = credits;}


    public int getPlayerNumber() {return playerNumber; }
    public int getRank() {return rank;}
    public int getDollars() {return dollars;}
    public int getCredits() {return credits;}
    public int getWorkStatus(){ return workStatus;}
    public int getTimesRehearsed(){ return timesRehearsed;}


   
    public int rollDie(){
        Random rand = new Random(); 
        int roll = rand.nextInt(6) + 1;
        return roll + getTimesRehearsed();
    }

    public Role setRole(Role role){
        this.role = role;
    }

    public rehearse(){
        timesRehearsed += 1;
    }

    public act (Scene scene, Role role){
        rollDie();
    }

    public updatePlayerEarnings( int scenepayout){
        setDollars(this.dollars += scenepayout);
    }



}


public class Scene{

    private int shotsLeft;
    private Role[] availableRoles; 

    Scene(Role[] availableRoles, int shotsLeft ){
        this.availableRoles = availableRoles;
        this.shotsLeft = shotsLeft;
    }


    public void shootScene(int shotsLeft){
        shotsLeft -= 1;
    }

    public castRole(Role role, Player player){
        player.setRole(role);
    }

}





