package adapter_pattern;

public class MyAdapter extends MyTarget{

    private MyAdaptee myAdaptee;

    public MyAdapter(String str){
        this.myAdaptee = new MyAdaptee(str);
    }

    @Override
    public void printWithPlus() {
        myAdaptee.showWithPlus();
    }

    @Override
    public void printWithMinus() {
        this.myAdaptee.showWithMinus();
    }
}
