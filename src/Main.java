import _common.TitleBorder;
import adapter_pattern.AdapterPatternMain;

import static _common.TitleBorder.showTitleBorder;
import static adapter_pattern.AdapterPatternMain.AdapterPatternMainStatic;
import static iterator_pattern.IteratorPatternMain.IteratorPatternMainStatic;

public class Main {
    public static void main(String[] args) {
        showTitleBorder("Iteratorパターン");
        IteratorPatternMainStatic(); // Iteratorパターン
        showTitleBorder("Adapterパターン");
        AdapterPatternMainStatic(); // Adapterパターン
    }
}