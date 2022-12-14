package AbstractFactory.listfactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + this.title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + this.title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = this.content.iterator();

        while(it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + this.author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
