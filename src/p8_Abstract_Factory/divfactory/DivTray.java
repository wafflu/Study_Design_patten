package p8_Abstract_Factory.divfactory;

import p8_Abstract_Factory.factory.Item;
import p8_Abstract_Factory.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption){
        super(caption);
    }

    @Override
    public String makeHTML(){
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>"+caption+"</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for(Item item:tray){
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
