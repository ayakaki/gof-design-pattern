package strategy_pattern;

public class Player {
    private final String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(final String name, final Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose(){
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even(){
        gameCount++;
    }

    @Override
    public String toString(){
        return "[" + this.name + ":" + this.gameCount +" games, " + this.winCount +" win, "+ this.loseCount +" lose" + "]";
    }
}
