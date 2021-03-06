package template_method.example;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/05 15:11:00
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
