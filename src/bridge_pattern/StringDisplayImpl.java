package bridge_pattern;

import template_pattern.StringDisplay;

public class StringDisplayImpl extends DisplayImpl{
    private final String str;
    private final int width;

    public StringDisplayImpl(final String str){
        this.str = str;
        this.width = str.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println(str);
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) sb.append("+");
        System.out.println(sb.toString());
    }
}
