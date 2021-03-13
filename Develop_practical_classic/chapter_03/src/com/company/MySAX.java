package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAX extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("<?xml version=\"1.0\" encoding=\"GBK\"?>");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("\nDocument read end...");
    }

    @Override
    public void startElement(String uri, String localName,
                             String name, Attributes attributes)
            throws SAXException {
        System.out.print("<");
        System.out.print(name);

        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print("" + attributes.getQName(i) + "=\""
                        + attributes.getValue(i) + "\"");
            }
        }

        System.out.print(">");
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        System.out.print(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri,
                           String localName, String name)
            throws SAXException {
        System.out.print("<" + name + ">");
    }
}


