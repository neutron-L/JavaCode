package com.company;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        WriteXML.writeXML();
    }

    public static void readXML() {
        // write your code here
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document doc = null;
        try {
            doc = (Document) builder.parse("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\dom_demo_02.xml");
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

        assert doc != null;
        NodeList nl = doc.getElementsByTagName("name");
        System.out.println("name: " + nl.item(0).getFirstChild().getNodeValue());
    }

    public static void createXML() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }

        Document doc;
        assert builder != null;
        doc = builder.newDocument();

        Element addresslist = doc.createElement("addresslist");
        Element linkman = doc.createElement("linkman");
        Element name = doc.createElement("name");
        Element email = doc.createElement("email");
        name.appendChild(doc.createTextNode("lilin"));
        email.appendChild(doc.createTextNode("lilin@qq.com"));
        linkman.appendChild(name);
        linkman.appendChild(email);
        addresslist.appendChild(linkman);
        doc.appendChild(addresslist);

        TransformerFactory  tf = TransformerFactory.newInstance();
        Transformer t = null;

        try {
            t = tf.newTransformer();
        } catch (TransformerConfigurationException e){
            e.printStackTrace();
        }

        t.setOutputProperty(OutputKeys.ENCODING, "GBK");
        DOMSource source = new DOMSource(doc);      //输出文档
        StreamResult result = new StreamResult(new
                File("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\output.xml"));
        try {
            t.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void testSAX() throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\sax_demo.xml",
                new MySAX());
    }
}
