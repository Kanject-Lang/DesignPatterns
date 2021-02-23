package factory_method.exercise.idcard;

import factory_method.exercise.framework.Product;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:11:57
 */
public class IDCard extends Product {
    private String owner;
    private int serial;

    public IDCard(String owner, int serial) {
        System.out.println("制作" + owner + "的ID卡， 编号[" + serial + "]。");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡， 编号[" + serial + "]。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
