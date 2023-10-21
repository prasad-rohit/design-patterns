package strategy;

public class projectilestrategy implements slayingstrategy{
    @Override
    public void execute(){
        System.out.println("Dragon slayed by projectile");
    }
}
