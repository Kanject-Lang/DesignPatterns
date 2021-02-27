package singleton.exercise2;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Triple triple0 = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);

        if (triple0 == triple1) {
            System.out.println("triple0与triple1是相同实例");
        } else {
            System.out.println("triple0与triple1不是相同实例");
        }

        if (triple1 == triple2) {
            System.out.println("triple1与triple2是相同实例");
        } else {
            System.out.println("triple1与triple2不是相同实例");
        }

        if (triple0 == triple2) {
            System.out.println("triple0与triple2是相同实例");
        } else {
            System.out.println("triple0与triple2不是相同实例");
        }

        Triple triple0_ = Triple.getInstance(0);
        if (triple0 == triple0_) {
            System.out.println("triple0与triple0_是相同实例");
        } else {
            System.out.println("triple0与triple0_不是相同实例");
        }

        System.out.println("End.");
    }
}
