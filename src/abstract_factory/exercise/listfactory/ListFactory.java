package abstract_factory.exercise.listfactory;

import abstract_factory.exercise.factory.Factory;
import abstract_factory.exercise.factory.Link;
import abstract_factory.exercise.factory.Page;
import abstract_factory.exercise.factory.Tray;

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
