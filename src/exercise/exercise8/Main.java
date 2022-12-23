package exercise.exercise8;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
        // create a document
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        // create a node root
        Element rootElement = doc.createElement("Users");
        doc.appendChild(rootElement);

        //create element user1
        Element user1 = doc.createElement("user");
        rootElement.appendChild(user1);

        //create a name tag
        Element name1 = doc.createElement("name");
        name1.appendChild(doc.createTextNode("Long"));
        user1.appendChild(name1);
        //create a email tag
        Element email1 = doc.createElement("email");
        email1.appendChild(doc.createTextNode("Longtest@yoloemail.com"));
        user1.appendChild(email1);
        //create a username
        Element userName1 = doc.createElement("username");
        userName1.appendChild(doc.createTextNode("long.t"));
        user1.appendChild(userName1);
        //create a role
        Element role1 = doc.createElement("role");
        role1.appendChild(doc.createTextNode("Admin"));
        user1.appendChild(role1);

        //create element user2
        Element user2 = doc.createElement("user");
        rootElement.appendChild(user2);

        //create a name tag
        Element name2 = doc.createElement("name");
        name2.appendChild(doc.createTextNode("Long"));
        user2.appendChild(name2);
        //create a email tag
        Element email2 = doc.createElement("email");
        email2.appendChild(doc.createTextNode("Longtest@yoloemail.com"));
        user2.appendChild(email2);
        //create a username
        Element userName2 = doc.createElement("username");
        userName2.appendChild(doc.createTextNode("long.t"));
        user2.appendChild(userName2);
        //create a role
        Element role2 = doc.createElement("role");
        role2.appendChild(doc.createTextNode("Admin"));
        user2.appendChild(role2);

        //write DOC into XML file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(
                new File("C:\\Users\\lonbui\\Documents\\listUser.xml"));
        transformer.transform(source,result);
        // print console
        StreamResult consoleResult = new StreamResult(System.out);
        transformer.transform(source,consoleResult);

        FileWriter myWriter = new FileWriter("C:\\Users\\lonbui\\Desktop\\filename.txt");
        myWriter.write("Create xml successfully! You are good to go!");
        myWriter.close();
        System.out.println();
        System.out.println("Create a text.txt successfully!!!");
    }
}
