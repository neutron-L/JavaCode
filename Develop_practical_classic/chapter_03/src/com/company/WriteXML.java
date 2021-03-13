package com.company;


import org.jdom2.*;
import org.jdom2.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.File;


public class WriteXML {
    public static void writeXML() {
        Element addresslist = new Element("addresslist");
        Element linkman = new Element("linkman");
        Element name = new Element("name");
        Element email = new Element("email");
        Attribute id= new Attribute("id","ll");
        Document doc = new Document(addresslist);
        name.setText("lilin");
        email.setText("lilin@qq.com");
        name.setAttribute(id);
        linkman.addContent(name);
        linkman.addContent(email);
        addresslist.addContent(linkman);
        XMLOutputter out = new XMLOutputter();
        out.setFormat(out.getFormat().setEncoding("GBK"));
        try {
            out.output(doc, new FileOutputStream("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\output.xml"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
