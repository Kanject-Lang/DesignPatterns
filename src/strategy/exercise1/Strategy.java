package strategy.exercise1;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
