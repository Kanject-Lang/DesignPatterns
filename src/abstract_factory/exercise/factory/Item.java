package abstract_factory.exercise.factory;

/**
 * @description: TODO
 * @author: Kanject
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
