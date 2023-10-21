package strategy;

public class Main {
    public static void main(String[] args){
        var dragonSlayer = new slayer(new MelleStrategy());
        
        dragonSlayer.execute();
    }
}
