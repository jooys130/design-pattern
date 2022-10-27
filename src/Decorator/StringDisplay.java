package Decorator;

public class StringDisplay extends Display{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public int getColumns() {
        return this.string.getBytes().length;
    }

    public int getRows() {
        return 1;
    }

    public String getRowText(int row) {
        return row == 0 ? this.string : null;
    }
}
