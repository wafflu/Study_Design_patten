package p8_Abstract_Factory.divfactory;

import p8_Abstract_Factory.factory.Factory;
import p8_Abstract_Factory.factory.Link;
import p8_Abstract_Factory.factory.Page;
import p8_Abstract_Factory.factory.Tray;

public class DivFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
