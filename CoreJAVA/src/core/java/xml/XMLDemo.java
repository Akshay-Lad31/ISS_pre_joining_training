package core.java.xml;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDemo {
	
	public class Employee{
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		
		public int getId() {
			return id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getEmail() {
			return email;
		}
		
		
		public Employee(	int id,
							String firstName,
							String lastName,
							String email) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	}
	
	public void readXML(String filepath) throws ParserConfigurationException, TransformerException {
		
		int id;
		String firstName = null;
		String lastName = null;
		String email = null;
		
		// Instantiate the Factory
     	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

     	try {
	          // parse XML file
	          DocumentBuilder db = dbf.newDocumentBuilder();

	          Document doc = db.parse(new File(filepath));

	          doc.getDocumentElement().normalize();

	          System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
	          System.out.println("------");

	          // get <staff>
	          NodeList list = doc.getElementsByTagName("Employee");

	          for (int temp = 0; temp < list.getLength(); temp++) {

	              Node node = list.item(temp);

	              if (node.getNodeType() == Node.ELEMENT_NODE) {

	                  Element employee = (Element) node;

	                  // get staff's attribute
	                  id = Integer.parseInt(employee.getAttribute("id"));

	                  // get text
	                  NodeList nameList = employee.getElementsByTagName("Name");
	                  for(int i=0; i < nameList.getLength(); i++) {
	                	  Element nameElement = (Element) nameList.item(i);
	                	  firstName = nameElement.getElementsByTagName("FirstName").item(0).getTextContent();
	                	  lastName = nameElement.getElementsByTagName("LastName").item(0).getTextContent();
	                	  
	                  }
	                  email = employee.getElementsByTagName("Email").item(0).getTextContent();

	                  System.out.println("Employee ID: " + id);
	                  System.out.println("Employee Name: " + firstName + " " + lastName);
	                  System.out.println("Employee Email: " + email);
	              }
	          }

	      } catch (Exception e) {
	          e.printStackTrace();
	      }	
	}
	/*
	TASK: 	To create doc. with structure:
	[
		Employee[id: 2345,
				Name[
					FirstName: Akshay
					LastName: Lad
				],
				Email: demo@gmail.com,
		]
	] 
	*/
	
	/*
	 * 
	 */
	public Document createXMLDoc( Employee emp ) throws ParserConfigurationException {
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		// root elements
		Document doc = docBuilder.newDocument();
		Element employee = doc.createElement("Employee");
		doc.appendChild(employee);
		employee.setAttribute("id", Integer.toString(emp.getId()));
		
		Element name = doc.createElement("Name");
		employee.appendChild(name);
		  
		Element firstName = doc.createElement("FirstName");
		firstName.setTextContent(emp.getFirstName());
		name.appendChild(firstName);
		
		Element lastName = doc.createElement("LastName");
		lastName.setTextContent(emp.getLastName());
		name.appendChild(lastName);
		
		Element email = doc.createElement("Email");
		email.setTextContent(emp.getEmail());
		employee.appendChild(email);
		
		return doc;
		
	}
	
	public void writeXML(Transformer transformer,Document doc, String filepath) throws TransformerException {
		try (FileOutputStream file = new FileOutputStream(filepath)) {
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);
		} 
		catch (IOException e) {
		       e.printStackTrace();
		   }
	}

	public static void main(String[] args) throws TransformerConfigurationException {
		// TODO Auto-generated method stub
		XMLDemo demo = new XMLDemo();
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    
	    String fileLocation = "C:\\Users\\Akshay Lad\\JAVA\\CoreJAVA\\src\\core\\java\\xml\\test.xml";
	    
	    Employee myEmployee = demo.new Employee(1, "Akshay", "Lad", "demo@gamil.com");
	    try{
	    	Document employeeDoc = demo.createXMLDoc(myEmployee);
	    	demo.writeXML(transformer, employeeDoc, fileLocation);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    try {
			demo.readXML(fileLocation);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
