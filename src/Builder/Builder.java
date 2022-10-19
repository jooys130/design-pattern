package Builder;

/*
    (7-1) Builder 클래스를 interface로 변경한다면?
        Builder 클래스: abstract class -> interface
        TexBuilder, HTMLBulder 클래스: extends -> implements
 */

public abstract class Builder {
    // abstract class -> interface
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
