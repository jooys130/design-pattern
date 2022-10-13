package TemplateMethod;

public abstract class AbstractDisplay {
    public AbstractDisplay(){
    }

    // 하위 클래스에 구현을 맡기는 추상 메소드 open, print, close
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(){ // 추상 클래스에서 구현되고 있는 메소드 display
        open(); // this.open()

        for(int i = 0; i < 5; ++i){
            print(); // this.print()
        }

        close(); // this.close()
    }
}
