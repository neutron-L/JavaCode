package factory;

import listfactory.*;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
    public Page createYahooPage() {
        Link yahooLink = this.createLink("Yahoo", "http://www.yahoo.com/");
        Page yahooPage = this.createPage("Yahoo", "Yahoo");
        yahooPage.add(yahooLink);

        return yahooPage;
    }
}

