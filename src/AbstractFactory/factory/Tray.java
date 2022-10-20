package AbstractFactory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    /*
        protected 필드 사용하고 있음
        private 장점: Tray 하위 클래스(구체적인 부품)가 tray 필드이 구현에 의존한 코드가 아니다
                단점: 적절한 엑세스용 메소드를 새롭게 작성해야한다 ** 이렇게 하는 편이 안전한 프로그램이 된다 **
     */
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
