import _common.TitleBorder;
import adapter_pattern.AdapterPatternMain;

import static _common.TitleBorder.showTitleBorder;
import static adapter_pattern.AdapterPatternMain.AdapterPatternMainStatic;
import static iterator_pattern.IteratorPatternMain.IteratorPatternMainStatic;
import static template_pattern.TemplatePatternMain.TemplatePatternMainStatic;

public class Main {
    public static void main(String[] args) {
        showTitleBorder("Iteratorパターン");
        IteratorPatternMainStatic();
        showTitleBorder("Adapterパターン");
        AdapterPatternMainStatic();
        showTitleBorder("Templateパターン");
        TemplatePatternMainStatic();
    }
}