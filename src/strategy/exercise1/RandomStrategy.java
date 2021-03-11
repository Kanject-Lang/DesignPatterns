package strategy.exercise1;

import java.util.Random;

public class RandomStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand preHand;

    public RandomStrategy() {
        this.random = new Random();
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
