package Builder;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "가 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
         */

        /*
            (7-3) ConcreteBuilder 역할을 하는 클래스 생성
         */
        FrameBuilder framebuilder = new FrameBuilder();
        Director director = new Director(framebuilder);
        director.construct();
        JFrame frame = framebuilder.getResult();
        frame.setVisible(true);
    }

    public static void usage() {
        System.out.println("Usage: java Main plain 일반 텍스트로 문서작성");
        System.out.println("Usage: java Main html  HTML 파일로 문서작성");
    }
}
