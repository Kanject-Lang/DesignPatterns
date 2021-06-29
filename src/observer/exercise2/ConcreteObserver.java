package observer.exercise2;

public class ConcreteObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        int num = numberGenerator.getNumber();
        System.out.println("ConcreteObserver: " + "Binary -> " + Integer.toBinaryString(num) + ", Octal -> " + Integer.toOctalString(num) + ", Hex -> " + Integer.toHexString(num));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
