package abstract_factory.exercise.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Kanject
 */
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
