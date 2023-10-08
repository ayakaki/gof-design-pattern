package prototype_pattern;

import prototype_pattern.framework.Manager;
import prototype_pattern.framework.Product;

public class PrototypePatternMain {
    public static void prototypePatternMainStatic(){
        Manager manager = new Manager();
        UnderlinePen underHyphenPen = new UnderlinePen('-');
        MessageBox asteriskBox = new MessageBox('*');
        MessageBox slashBox = new MessageBox('/');

        manager.register("underHyphenPen", underHyphenPen);
        manager.register("asteriskBox", asteriskBox);
        manager.register("slashBox", slashBox);

        Product p1 = manager.create("underHyphenPen");
        p1.use("Good Morning!!");

        Product p2 = manager.create("asteriskBox");
        p2.use("Good Afternoon!!");

        Product p3 = manager.create("slashBox");
        p3.use("Good Evening!!");
    }
}
