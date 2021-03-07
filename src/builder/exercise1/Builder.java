package builder.exercise1;

/**
 * @description: TODO
 * @author: Kanject
 */
public interface Builder {
    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    void close();
}
