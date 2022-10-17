package Prototype;

import Prototype.framework.Product;

public class ConcreteProduct implements Product {
    public void use(String s) {

    }
    @Override
    public Product createClone() {
        Product p = null;
        try {
            /*
                clone 메소드
                : Java 언어 사양에 규정되어 있고, 자기자신의 복제를 생성하는 메소드
                clone 메소드로 java.lang.Cloneable 인터페이스를 구현하고 있는 클래스가 복사 가능
             */
            p = (Product) clone();
        } catch (CloneNotSupportedException e){ // Cloneable을 구현하고 있으므로 실행은 x
            e.printStackTrace();
        }
        return p;
    }
}
