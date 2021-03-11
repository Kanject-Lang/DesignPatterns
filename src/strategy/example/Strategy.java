package strategy.example;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
