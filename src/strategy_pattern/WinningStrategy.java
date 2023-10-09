package strategy_pattern;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private final Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(final int seed){
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!this.won){
            // 0, 1, 2 からランダムな整数を代入する
            this.prevHand = Hand.getHand(random.nextInt(3));
        }
        return this.prevHand;
    }

    @Override
    public void study(final boolean win) {
        this.won = win;
    }
}
