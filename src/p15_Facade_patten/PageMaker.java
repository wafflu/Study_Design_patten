package p15_Facade_patten;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try{
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username+"s web page");
            writer.paragraph("Welcom to "+username+"'s web Page!");
            writer.paragraph("환영");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename+" is created for "+mailaddr+" ("+username+")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
