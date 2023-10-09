package strategy_pattern;

public enum Hand {
    ROCK("グー", 0),
    SCISSORS("チョキ", 1),
    PAPER("パー", 2);

    private final String name;
    private final int handValue;

    private static Hand[] hands = {ROCK, SCISSORS, PAPER};

    private Hand(final String name, final int handValue){
        this.name = name;
        this.handValue = handValue;
    }

    public static Hand getHand(final int handValue){
        return hands[handValue];
    }

    public boolean isStrongerThan(final Hand hand){
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(final Hand hand){
        return fight(hand) == -1;
    }

    private int fight(final Hand hand){
        if(this == hand){
            return 0;
        } else if (this.handValue + 1 % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return this.name;
    }
}
