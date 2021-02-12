public class Dice{

    private int rollResults;
    private int practiceChips;

    public Dice(int rollResult, int practiceChips){
        this.rollResults = rollResult;
        this.practiceChips = practiceChips;
    }

    public int rollDice(){
        Random rand = new Random();      
        int roll = rand.nextInt(6) + 1;
        return roll;
    }

}