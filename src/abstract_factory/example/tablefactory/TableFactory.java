package abstract_factory.example.tablefactory;

import abstract_factory.example.factory.Factory;
import abstract_factory.example.factory.Link;
import abstract_factory.example.factory.Page;
import abstract_factory.example.factory.Tray;

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
