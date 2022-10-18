package Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String filename; // 작성할 파일명
    private PrintWriter writer; // 파일에 기술할 PrinitWriter

    public void makeTitle(String title) {
        filename = "/DesignPattern/src/Builder/" + title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter 생성
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        writer.println("<ul>");

        for(int i = 0; i < items.length; ++i) {
            writer.println("<li>" + items[i] + "</li>");
        }

        writer.println("</ul>");
    }

    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
