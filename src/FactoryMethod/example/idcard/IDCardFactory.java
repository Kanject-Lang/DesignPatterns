package FactoryMethod.example.idcard;

import FactoryMethod.example.framework.Factory;
import FactoryMethod.example.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:12:17
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
