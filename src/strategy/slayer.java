package strategy;

public class slayer {
    private slayingstrategy strat;

    public slayer(slayingstrategy strat){
        this.strat = strat;
    }
    
    public void changestrategy(slayingstrategy strat){
        this.strat = strat;
    }
    
    public void execute(){
        strat.execute();
    }
}
