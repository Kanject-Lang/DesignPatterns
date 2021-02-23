package factory_method.exercise.idcard;

import factory_method.exercise.framework.Factory;
import factory_method.exercise.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:12:17
 */
public class IDCardFactory extends Factory {
    private Map<Integer, String> database = new HashMap<>();
    private int serial = 100000;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, ++serial);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        database.put(idCard.getSerial(), idCard.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
