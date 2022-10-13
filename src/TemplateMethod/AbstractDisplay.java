package TemplateMethod;

/*
    AbstractDisplay 역할에 인터페이스를 사용할 수 없다
    : 추상클래스에서는 일부 메서드(display 메서드)를 구현할 수 있지만,
      인터페이스는 모든 메서드가 추상 메서드로 해야한다.
 */
public abstract class AbstractDisplay {
    public AbstractDisplay(){
    }

    // 하위 클래스에 구현을 맡기는 추상 메소드 open, print, close
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(){ // 추상 클래스에서 구현되고 있는 메소드 display
        /*
            final 선언을 통해 하위 클래스에서 오버라이드를 금지한다
            : 하위 클래스를 만드려면 display 메서드를 오버라이드하지 말고 기능을 확장해라
         */
        open(); // this.open()

        for(int i = 0; i < 5; ++i){
            print(); // this.print()
        }

        close(); // this.close()
    }
}
