package p7_Builder_patten;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("text 아니면 html 둘중 하나 적으시오");
        String sel = sc.nextLine();

        if(sel.equals("text")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String res = textBuilder.getTextResult();
            System.out.println(res);
        } else if(sel.equals("html")) {
            HtmlBuulder htmlBuilder = new HtmlBuulder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("HTML파일 "+filename+"이 작성");
        } else {
            System.exit(0);
        }

    }
}
