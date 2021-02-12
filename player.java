
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