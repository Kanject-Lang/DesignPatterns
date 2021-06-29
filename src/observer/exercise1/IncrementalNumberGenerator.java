package observer.exercise1;

import java.util.Random;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int increment;
    private int number;

    public IncrementalNumberGenerator(int start, int end, int increment) {
        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        number = start;
        while (number < end) {
            number += increment;
            notifyObservers();
        }
    }
}
