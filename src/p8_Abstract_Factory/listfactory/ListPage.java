package p8_Abstract_Factory.listfactory;

import p8_Abstract_Factory.factory.Item;
import p8_Abstract_Factory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author){
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(title);
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>"+title+"</h1>\n");
        sb.append("<ul>\n");
        for(Item item : content){
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</body></html>\n");
        return sb.toString();
    }


}
