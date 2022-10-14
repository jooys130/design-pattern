package FactoryMethod.idcard;
import FactoryMethod.framework.*;

public class IDCard extends Product{
    private String owner;

    /*
        아무런 접근 제어자(ex. public, protected, private)가 붙어있지 않다
        -> 동일한 패키지 내의 클래스 내에서만 사용 가능하므로 idcard 패키지 외부에서 인스턴스를 생성할 수 없다
           즉, IDCardFactory를 경유해야한다
     */
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return this.owner;
    }
}
