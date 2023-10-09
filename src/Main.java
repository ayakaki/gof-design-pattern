import _common.TitleBorder;
import adapter_pattern.AdapterPatternMain;
import bridge_pattern.BridgePatternMain;

import static _common.TitleBorder.showTitleBorder;
import static adapter_pattern.AdapterPatternMain.adapterPatternMainStatic;
import static bridge_pattern.BridgePatternMain.bridgePatternMainStatic;
import static builder_pattern.BuilderPatternMain.builderPatternMainStatic;
import static factory_method_pattern.FactoryMethodPatternMain.factoryMethodPatternMainStatic;
import static iterator_pattern.IteratorPatternMain.iteratorPatternMainStatic;
import static prototype_pattern.PrototypePatternMain.prototypePatternMainStatic;
import static strategy_pattern.StrategyPatternMain.strategyPatternMainStatic;
import static template_pattern.TemplatePatternMain.templatePatternMainStatic;

public class Main {
    public static void main(String[] args) {
        showTitleBorder("Iteratorパターン");
        iteratorPatternMainStatic();
        showTitleBorder("Adapterパターン");
        adapterPatternMainStatic();
        showTitleBorder("Templateパターン");
        templatePatternMainStatic();
        showTitleBorder("FactoryMethodパターン");
        factoryMethodPatternMainStatic();
        showTitleBorder("Prototypeパターン");
        prototypePatternMainStatic();
        showTitleBorder("Builderパターン");
        builderPatternMainStatic();
        showTitleBorder("Bridgeパターン");
        bridgePatternMainStatic();
        showTitleBorder("Strategyパターン");
        strategyPatternMainStatic();
    }
}