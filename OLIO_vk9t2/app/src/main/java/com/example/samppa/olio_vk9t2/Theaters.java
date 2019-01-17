package com.example.samppa.olio_vk9t2;

import android.view.View;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Theaters {
    Theater theater = new Theater();
    public void readXML () {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();


            String urlString = "https://www.finnkino.fi/xml/TheatreAreas/";

            Document document = builder.parse(urlString);
            document.getDocumentElement().normalize();
            System.out.println(document);

            NodeList nodeList = document.getDocumentElement().getElementsByTagName("TheatreArea");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    theater.id = element.getElementsByTagName("ID").item(0).getTextContent();
                    theater.area = element.getElementsByTagName("Name").item(0).getTextContent();
                }
            }







        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }
}
