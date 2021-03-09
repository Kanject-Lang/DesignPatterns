package bridge.exercise1;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay() {
        Random random = new Random();
        int count = random.nextInt(10);
        open();
        for (int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}
