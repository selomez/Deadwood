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