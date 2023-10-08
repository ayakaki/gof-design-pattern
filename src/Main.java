import _common.TitleBorder;
import adapter_pattern.AdapterPatternMain;

import static _common.TitleBorder.showTitleBorder;
import static adapter_pattern.AdapterPatternMain.AdapterPatternMainStatic;
import static builder_pattern.BuilderPatternMain.BuilderPatternMainStatic;
import static factory_method_pattern.FactoryMethodPatternMain.FactoryMethodPatternMainStatic;
import static iterator_pattern.IteratorPatternMain.IteratorPatternMainStatic;
import static prototype_pattern.PrototypePatternMain.prototypePatternMainStatic;
import static template_pattern.TemplatePatternMain.TemplatePatternMainStatic;

public class Main {
    public static void main(String[] args) {
        showTitleBorder("Iteratorパターン");
        IteratorPatternMainStatic();
        showTitleBorder("Adapterパターン");
        AdapterPatternMainStatic();
        showTitleBorder("Templateパターン");
        TemplatePatternMainStatic();
        showTitleBorder("FactoryMethodパターン");
        FactoryMethodPatternMainStatic();
        showTitleBorder("Prototypeパターン");
        prototypePatternMainStatic();
        showTitleBorder("Builderパターン");
        BuilderPatternMainStatic();
    }
}