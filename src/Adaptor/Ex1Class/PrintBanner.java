package Adaptor.Ex1Class;

import Adaptor.Ex1Class.Banner;
import Adaptor.Ex1Class.Print;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
