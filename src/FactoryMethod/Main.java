package FactoryMethod;

import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
    }
}
