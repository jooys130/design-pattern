package FactoryMethod;

import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        IDCardFactory var1 = new IDCardFactory();
        Product var2 = var1.create("홍길동");
        Product var3 = var1.create("이순신");
        Product var4 = var1.create("강감찬");
        var2.use();
        var3.use();
        var4.use();
    }
}
