package p8_Abstract_Factory;

import p8_Abstract_Factory.factory.Factory;
import p8_Abstract_Factory.factory.Link;
import p8_Abstract_Factory.factory.Page;
import p8_Abstract_Factory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        String filename = "ListFactory.html";
//        String classname = "p8_Abstract_Factory.divfactory.DivFactory";
        String classname = "p8_Abstract_Factory.listfactory.ListFactory";

        Factory factory = Factory.getFactory(classname);

        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://example.com/blog1");
        Link blog3 = factory.createLink("Blog 3", "https://example.com/blog1");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link news1 = factory.createLink("News 1", "https://example.com/news1");
        Link news2 = factory.createLink("News 2", "https://example.com/news2");
        Tray news3 = factory.createTray("News 3");
        news3.add(factory.createLink("News 3 (US)", "https://example.com/news3us"));
        news3.add(factory.createLink("News 3 (Korea)", "https://example.com/news3kr"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        //Page
        Page page = factory.createPage("Blog and News", "Youngjin.com");
        page.add(blogTray);
        page.add(newsTray);
        page.output(filename);
    }
}
