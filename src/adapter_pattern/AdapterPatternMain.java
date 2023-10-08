package adapter_pattern;

public class AdapterPatternMain {
    public static void adapterPatternMainStatic(){
        // ここでは MyAdaptee に存在するメソッドのみを利用することを強調するために MyTarget 型として扱う
        MyTarget myAdapter = new MyAdapter("テストです");
        myAdapter.printWithPlus();
        myAdapter.printWithMinus();
    }
}
