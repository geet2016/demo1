package com.example.demo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;

//import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;


@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) throws IOException, SAXException {
		SpringApplication.run(Demo1Application.class, args);
	/*	for(int i= 0;i<50;i++)
		{
			ThreadEx t1= new ThreadEx();
			t1.start();
		}*/
/*		
		ThreadEx t2= new ThreadEx();
		ThreadEx t3= new ThreadEx();
		ThreadEx t4= new ThreadEx();
		ThreadEx t5= new ThreadEx();
		ThreadEx t6= new ThreadEx();
		t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();*/
		/*
		File dir = new File("C:/Users/Gchoudhari/Desktop/eeee");
		FilePerm fp =new FilePerm();
		//fp.fileperm(dir);
*/	/*

*/
/*		try {
		    Document document;
		 
		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 
		    File xml = new File("C:\\temp\\person.xml");
		    File xsl = new File("C:\\temp\\person.xsl");
		 
		    DocumentBuilder builder;
			
				builder = factory.newDocumentBuilder();
			
     			document = builder.parse(xml);
		
		 
		    // Use a Transformer for output
		    TransformerFactory transformerFactory = TransformerFactory.newInstance();
		    StreamSource style = new StreamSource(xsl);
		    Transformer transformer;
			
				transformer = transformerFactory.newTransformer(style);
			
		    DOMSource source = new DOMSource(document);
		    StreamResult result = new StreamResult(System.out);
		    
				transformer.transform(source, result);
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*String title = StringUtils.substringBetween("<property name=\"hibernate.connection.datasource\">java:jboss/jdbc/SNE-SWClusterDatasource</property>",
				"<property name=\"hibernate.connection.datasource\">", "</property>");
		System.out.println("title ->" + title);*/
		
		
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		/*Date parsedDate = ISODateTimeFormat.dateTimeParser()
		        .parseDateTime("2021-10-07T22:00:00+02:00").toDate();
        System.out.println(parsedDate.getTimezoneOffset());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(parsedDate);*/
	/*	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ");
		ZonedDateTime dt = ZonedDateTime.parse("2016-04-21T00:00:00+05:00", formatter);
		ZoneId zone = dt.getZone();
		  System.out.println(zone);*/
/*		  org.joda.time.format.DateTimeFormatter df = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
	        DateTime nDt = df.parseDateTime("2021-10-07T22:00:00+02:00");
	        org.joda.time.format.DateTimeFormatter dateFormatterWithoutMillis = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
	        System.out.println(dateFormatterWithoutMillis.print(nDt) + " " + nDt.getZone());
		     
	        ZonedDateTime zone = ZonedDateTime.parse("2021-10-07T22:00:00");  
	        System.out.println(">>>>"+zone.getZone()); 
	        System.out.println(">>>>"+zone.getOffset()); 
	        try {
			XMLGregorianCalendar x=DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		 System.out.println(x);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	  	
		
		
	/*	
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("C:/Users/Gchoudhari/Desktop/amsFil.xml"));
			//Normalize the XML Structure; It's just too important !!
			document.getDocumentElement().normalize();
			
			//Here comes the root node
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());
			//Get all employees
			NodeList nList = document.getElementsByTagName("AMS");//Content
			System.out.println("============================");
			for (int i = 0; i < nList.getLength(); i++)
			{
				  System.out.println(nList.item(i).getParentNode()); 
				  System.out.println(nList.item(i).getParentNode().getNextSibling().getAttributes()); 
				  System.out.println(nList.item(i).getNodeName()); 
				 
				  if(nList.item(i).getParentNode().getNextSibling().getAttributes() != null)
				  {
					  System.out.println( nList.item(i).getParentNode().getNextSibling().getAttributes()
					  .getNamedItem("Asset_Class").getNodeName());
				  }
				NamedNodeMap node = nList.item(i).getAttributes();
				System.out.println(node.getNamedItem("Asset_Class").getNodeName());
				System.out.println(node.getNamedItem("Asset_Class").getNodeValue());
				//if(node.getNamedItem("Asset_Class").getNodeValue().equals("purchase_option"))
				
					//NodeList childNodes = nList.item(i).getParentNode().getChildNodes();
	
					for(int j = 0; j< childNodes.getLength(); j++)
					{
						  NamedNodeMap nodeMap = childNodes.item(j).getAttributes();
						  if(nodeMap != null )
						  {
							  Node childnode = nodeMap.getNamedItem("License_Value");
						        if(childnode != null)
						        {
						            System.out.println(childnode.getTextContent()); 
						        }
						  }
						System.out.println(childNodes.item(j).getParentNode());
						System.out.println(childNodes.item(j).getFirstChild());
						System.out.println(childNodes.item(j).getLastChild());
						System.out.println(childNodes.item(j).getNextSibling());
					}
				
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	/*	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true); // never forget this!
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse("C:/Users/Gchoudhari/Desktop/amsFil.xml");
			// Create XPath
        	XPathFactory xpathfactory = XPathFactory.newInstance();
			XPath xpath = xpathfactory.newXPath();
			   XPathExpression expr = xpath.compile("//Asset/Metadata/AMS[@Asset_Class]");
		        Object result = expr.evaluate(doc, XPathConstants.NODESET);
		        NodeList nodes = (NodeList) result;
		        for (int i = 0; i < nodes.getLength(); i++) {
		            System.out.println(nodes.item(i).getNodeValue());
		        }
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        String platform = "TVUHD";
		String def = "NONE";
		if(StringUtils.right(platform,3).startsWith("U"))
		{
			platform = StringUtils.right(platform,3);
		}
		else{
			platform = StringUtils.right(platform,2);
		}
        ArrayList<String> list = new ArrayList<String>();
        list.add("SD");
        list.add("HD");
        list.add(" UHD  ");
        
        list.replaceAll(String::trim);
        
        if(list.contains(platform)){
        	def = platform;
        }
       // System.out.print(def);
        String def1 = "TVUHD";
        String ans = StringUtils.right(def1,3);
        System.out.println(ans.startsWith("U"));
        System.out.println(list);
	}
	/*public static boolean isNumeric(String string) {
	    // Checks if the provided string
	    // is a numeric by applying a regular
	    // expression on it.
	    String regex = "[0-9]+[\\.]?[0-9]*";
	    return Pattern.matches(regex, string);
	}*/
	
  /* private static List<String> getPropertiesList(InputStream file)
    throws UnsupportedEncodingException, IOException
{
BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(file,"UTF-8"));

String accumulator = bufferedReader.readLine();
List<String> accumulatorList = new ArrayList<String>();

try {
    while (accumulator != null) {
        accumulatorList.add(accumulator);
        accumulator = bufferedReader.readLine();
    }
    //any thrown exception will be captured by the outer method
}finally{
    bufferedReader.close();
}

return accumulatorList;
}*/
}
