package Adaptor.Ex1Class;

public class Main {
    public static void main(String[] args) {
        /*
        PrintBanner 클래스의 인스턴스는 Print 형의 변수에 대입
        ㄴ why? PrintBanner 클래스의 메소드가 아닌 Print 인터페이스의 메소드를 이용하고 있다 (*프로그램의 의도*)
         */
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
