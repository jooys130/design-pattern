package AbstractFactory.listfactory;

import AbstractFactory.factory.Link;

public class ListLink extends Link {
    /*
        생성자 선언 이유: Java에서 생성자가 상속되지 않기 때문
        생성자 역할: 객체변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제한다
     */
    public ListLink(String caption, String url){
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
