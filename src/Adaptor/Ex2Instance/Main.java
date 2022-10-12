package Adaptor.Ex2Instance;

import Adaptor.Ex2Instance.Print;
import Adaptor.Ex2Instance.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
