package adapter.example_entrust;

import adapter.example_extend.Print;
import adapter.example_extend.PrintBanner;

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
