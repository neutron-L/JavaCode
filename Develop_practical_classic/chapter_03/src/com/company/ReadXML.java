package com.company;

import org.jdom2.input.SAXBuilder;
import org.jdom2.*;

import java.io.IOException;
import java.util.List;

public class ReadXML {
    public static void main(String[] args) throws JDOMException, IOException {
        SAXBuilder builder = new SAXBuilder();
        Document read_doc = builder.build("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\" +
                "src\\xml\\output.xml");

        Element stu = read_doc.getRootElement();
        List<Element> list = stu.getChildren("linkman");

        assert list != null;
        for (Element e : list) {
            String name = e.getChildText("name");
            String id = e.getChild("name").getAttribute("id").getValue();
            String email = e.getChildText("email");
            System.out.println("-------------people-------------");
            System.out.println("name: " + name + ", number: " + id);
            System.out.println("Email: " + email);
            System.out.println("---------------------------------");
            System.out.println();
        }
    }

}