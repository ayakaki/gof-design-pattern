package factory_method_pattern.id_card;

import factory_method_pattern.framework.Product;

public class IDCard extends Product {
    private final String owner;


    public IDCard(String owner){
        this.owner = owner;
        System.out.println(this.owner + "のIDカードを作成します。");
    }

    @Override
    public void use() {
        System.out.println(this.owner + "のIDカードを使用します。");
    }

    @Override
    public String getOwner(){
        return this.owner;
    }

}
