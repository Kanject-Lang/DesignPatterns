package abstract_factory.exercise.listfactory;

import abstract_factory.exercise.factory.Link;

/**
 * @description: TODO
 * @author: Kanject
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
