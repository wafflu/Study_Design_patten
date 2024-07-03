package p8_Abstract_Factory.listfactory;

import p8_Abstract_Factory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url){
        super(caption, url);
    }

    @Override
    public String makeHTML(){
        return "<li><a href=\""+url+"\">"+caption+"</a></li>\n";
    }
}
