package abstract_factory.exercise.tablefactory;

import abstract_factory.exercise.factory.Link;

/**
 * @description: TODO
 * @author: Kanject
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
