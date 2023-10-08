package bridge_pattern;

public class BridgePatternMain {
    public static void bridgePatternMainStatic(){
        Display d1 = new Display(new StringDisplayImpl("Display Display"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Display CountDisplay"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("CountDisplay CountDisplay"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
