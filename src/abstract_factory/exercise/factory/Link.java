package abstract_factory.exercise.factory;

/**
 * @description: TODO
 * @author: Kanject
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
