package adapter_pattern;

// 実績があるため、変更を加えることを避けたいクラス
public class MyAdaptee {

    private String str;
    public MyAdaptee(String str){
        this.str = str;
    }

    public void showWithPlus(){
        System.out.println("+ " + this.str + " +");
    }

    public void showWithMinus(){
        System.out.println("- " + this.str + " -");
    }
}
