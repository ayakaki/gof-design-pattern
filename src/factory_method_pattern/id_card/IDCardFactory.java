package factory_method_pattern.id_card;

import factory_method_pattern.framework.Factory;
import factory_method_pattern.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product.getOwner() + "を登録しました。");
    }
}
