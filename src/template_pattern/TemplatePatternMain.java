package template_pattern;

public class TemplatePatternMain {
    public static void templatePatternMainStatic(){
        AbstractDisplay charDisplay = new CharDisplay('+');
        AbstractDisplay stringDisplay = new StringDisplay("foo", 6);
        charDisplay.display();
        stringDisplay.display();
    }
}
