package prototype_pattern;

import prototype_pattern.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    @Override
    public void use(String str){
        int decolen = 1 + str.length() + 1;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < decolen; i++) sb.append(decochar);
        String decoRow = sb.toString();

        System.out.println(decoRow);
        System.out.println(decochar + str + decochar);
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
