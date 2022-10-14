package Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    /*
        생성자 - private
        : Singleton 클래스 외부에서 생성자의 호출을 금지한다
        ㄴ 싱글턴 패턴의 의의: 실수해도 인스턴스가 1개만 생성된다
        ㄴ new를 이용하여 생성할 수 없다
    */
    private Singleton(){
        System.out.println("인스턴스를 생성했습니다");
    }

    /*
        static 메소드
        : 메모리 할당을 한번 해서 공유한다, 객체 생성 없이 클래스를 통해 메서드를 호출 할 수 있다
     */
    public static Singleton getInstance(){
        return singleton;
    }
}
