package factory_method.exercise;

import factory_method.exercise.framework.Factory;
import factory_method.exercise.framework.Product;
import factory_method.exercise.idcard.IDCardFactory;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:22:31
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory)factory).getDatabase());
    }
}
