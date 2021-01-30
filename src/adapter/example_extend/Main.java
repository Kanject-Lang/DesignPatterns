package adapter.example_extend;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello, adapter!");
        print.printWeak();
        print.printStrong();
    }
}
