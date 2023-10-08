package prototype_pattern;

import prototype_pattern.framework.Product;

public class UnderlinePen implements Product {
    private char decochar;

    public UnderlinePen(char decochar){
        this.decochar = decochar;
    }

    @Override
    public void use(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) sb.append(decochar);
        String decoRow = sb.toString();

        System.out.println(str);
        System.out.println(decoRow);
    }

    @Override
    public Product createCopy() {
        Product product = null;
        try{
            product = (Product) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
