package abstract_factory.exercise.tablefactory;

import abstract_factory.exercise.factory.Factory;
import abstract_factory.exercise.factory.Link;
import abstract_factory.exercise.factory.Page;
import abstract_factory.exercise.factory.Tray;

/**
 * @description: TODO
 * @author: Kanject
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
