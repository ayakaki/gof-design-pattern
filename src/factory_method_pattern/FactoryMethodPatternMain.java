package factory_method_pattern;

import factory_method_pattern.framework.Factory;
import factory_method_pattern.framework.Product;
import factory_method_pattern.id_card.IDCardFactory;

public class FactoryMethodPatternMain {
    public static void factoryMethodPatternMainStatic(){
        Factory iDCardFactory =  new IDCardFactory();
        Product p1 = iDCardFactory.create("太郎");
        Product p2 = iDCardFactory.create("花子");
        Product p3 = iDCardFactory.create("隼人");
        p1.use();
        p2.use();
        p3.use();
    }
}
