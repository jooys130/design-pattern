package TemplateMethod;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char var1) {
        this.ch = var1;
    }

    // 오버라이드 open, print, close
    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
