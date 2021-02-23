package template_method.example;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/05 15:36:34
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay ad1 = new CharDisplay('H');
        AbstractDisplay ad2 = new StringDisplay("Hello, world!");
        AbstractDisplay ad3 = new StringDisplay("你好，世界！");
        ad1.display();
        ad2.display();
        ad3.display();
    }
}
