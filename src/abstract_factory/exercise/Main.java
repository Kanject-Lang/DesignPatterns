package abstract_factory.exercise;

import abstract_factory.exercise.factory.Factory;
import abstract_factory.exercise.factory.Link;
import abstract_factory.exercise.factory.Page;
import abstract_factory.exercise.factory.Tray;
import abstract_factory.exercise.listfactory.ListFactory;
import abstract_factory.exercise.tablefactory.TableFactory;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
//        Factory factory = new ListFactory();
//        Factory factory = new TableFactory();

        Page page = factory.createYahooPage();
        page.output();
    }
}
