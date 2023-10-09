package strategy_pattern;

public class StrategyPatternMain {
    public static void strategyPatternMainStatic(){

        // 両プレイヤーの最初の手を入力する
        final int seed1 = 0;
        final int seed2 = 1;

        Player player1 = new Player("太郎", new WinningStrategy(seed1));
        Player player2 = new Player("花子", new ProbStrategy(seed2));

        for(int i = 0; i < 10; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if(nextHand1.isStrongerThan(nextHand2)){
                System.out.println("winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("even...");
                player1.even();
                player2.even();
            }

            System.out.println("【 Total Result 】");
            System.out.println("Player1: " + player1);
            System.out.println("Player2: " + player2);
        }
    }
}
