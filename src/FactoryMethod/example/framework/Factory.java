package FactoryMethod.example.framework;

/**
 * TODO
 *
 * @author guangjie.liang
 * @date 2021/02/09 16:00:31
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
