package abstract_factory.example.listfactory;

import abstract_factory.example.factory.Factory;
import abstract_factory.example.factory.Link;
import abstract_factory.example.factory.Page;
import abstract_factory.example.factory.Tray;

/**
 * @description: TODO
 * @author: Kanject
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
