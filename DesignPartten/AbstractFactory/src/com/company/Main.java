package com.company;

import factory.*;
import listfactory.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Factory factory = Factory.getFactory("listfactory.ListFactory");

        Link people = factory.createLink("People Newspaper", "http://www/people.com.cn/");
        Link gmw = factory.createLink("Guangming Newspaper", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
        Link jp_yahho = factory.createLink("Yahoo, Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("newspaper");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahho);

        Tray traysearch = factory.createTray("search engine");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "lilin");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
