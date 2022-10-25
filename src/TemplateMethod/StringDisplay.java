package TemplateMethod;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    // 오버라이드 open, print, close
    public void open() {
        this.printLine();
    }

    public void print() {
        System.out.println("|" + this.string + "|");
    }

    public void close() {
        this.printLine();
    }

    private void printLine() { // private로 이 클래스에서만 사용
        System.out.print("+");

        for(int i = 0; i < this.width; ++i) {
            System.out.print("-");
        }

        System.out.println("+");
    }

}
