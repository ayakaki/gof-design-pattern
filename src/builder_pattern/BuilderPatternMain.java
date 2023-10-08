package builder_pattern;

public class BuilderPatternMain {
    public static void BuilderPatternMainStatic(){
        TextBuilder tb = new TextBuilder();
        Director director = new Director(tb);
        director.construct();
        String rst = tb.getResult();
        System.out.println(rst);
    }
}
