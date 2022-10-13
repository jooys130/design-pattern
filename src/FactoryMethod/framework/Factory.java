package FactoryMethod.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /*
        접근제어자 protected
        : 동일 패키지의 클래스 또는 해당 클래스를 상속 받은 다른 패키지의 클레스에서만 접근 가능
     */
    protected abstract Product createProduct(String owner); // 추상메서드를 통한 인스턴스 생성
    protected abstract void registerProduct(Product product);
}
