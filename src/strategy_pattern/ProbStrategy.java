package strategy_pattern;

import java.util.Random;

public class ProbStrategy implements Strategy{
    private final Random random;
    private int prevHandValue = 0;
    private int currenthandValue = 0;
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    public ProbStrategy(final int seed){
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currenthandValue));
        int handValue = 0;
        if(bet < history[currenthandValue][0]){
            handValue = 0;
        }else if(bet < history[currenthandValue][0] + history[currenthandValue][1]){
            handValue = 1;
        }else{
            handValue = 2;
        }
        prevHandValue = currenthandValue;
        currenthandValue = handValue;
        return Hand.getHand(handValue);
    }

    @Override
    public void study(final boolean win) {
        if(win){
            history[prevHandValue][currenthandValue]++;
        }else{
            history[prevHandValue][(currenthandValue+ 1) % 3]++;
            history[prevHandValue][(currenthandValue+ 2) % 3]++;

        }
    }

    private int getSum(final int handValue){
        int sum = 0;
        for(int i = 0; i < 3; i++) sum += history[handValue][i];
        return sum;
    }
}
