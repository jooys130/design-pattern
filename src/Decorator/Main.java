package Decorator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        StringDisplay stringDisplay = new StringDisplay("Hello, world.");
        SideBorder sideBorder = new SideBorder(stringDisplay, '#');
        FullBorder fullBorder = new FullBorder(sideBorder);
        stringDisplay.show();
        sideBorder.show();
        fullBorder.show();
        SideBorder var4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("안녕하세요.")), '*'))), '/');
        var4.show();
    }
}
