package template_pattern;

public class StringDisplay extends AbstractDisplay{

    private final String str;
    private final String borderStr;

    public StringDisplay(String str, int width){
        this.str = str;
        this.borderStr = printBorder(width);
    }

    @Override
    public void open() {
        System.out.println(this.borderStr);
    }

    @Override
    public void print() {
        System.out.println(this.str);
    }

    @Override
    public void close() {
        System.out.println(this.borderStr);
    }

    private String printBorder(int width){
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for (int i = 0; i < width; i++) sb.append("=");
        sb.append("+");
        return sb.toString();
    }
}
