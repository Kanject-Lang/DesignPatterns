package factory_method.example.idcard;

import factory_method.example.framework.Product;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:11:57
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }
    public String getOwner() {
        return owner;
    }
}
