package abstract_factory.example.factory;

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
