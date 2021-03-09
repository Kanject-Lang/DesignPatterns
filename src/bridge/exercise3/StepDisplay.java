package bridge.exercise3;

public class StepDisplay extends Display {

    public StepDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void stepDisplay(int times) {
        for (int i = 0; i < times; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();
            }
            close();
        }
    }
}
