package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import com.example.demo.view.MyHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

@SpringBootApplication
public class SpringbootApiApplication {

	public static void main(String[] args) {
		try {

            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
            InputSource input = new InputSource("C:/Users/jmn/Documents/xmls/modelo.xml");
            MyHandler myHandler = new MyHandler();
            parser.parse(input, myHandler);
            System.out.println(myHandler.getValorTotal());
            System.out.println(myHandler.getValorTotal().length());

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
		SpringApplication.run(SpringbootApiApplication.class, args);
	}

}
